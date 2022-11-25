package by.tc.task01.dao.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 *
 */
public class FileApplianceDAOImpl implements ApplianceDAO {

    /**
     * @param criteria
     * @return list of found appliances by given criteria
     * @throws DAOException
     */
    @Override
    public List<Appliance> find(Criteria criteria) throws DAOException {
        FileReader reader;
        List<Appliance> appliances = new ArrayList<Appliance>();

        try {
            File file = new File("C:\\Users\\olgab\\Downloads\\Telegram Desktop\\jwd-task01-template_v2\\jwd-task01-template_v2\\src\\main\\resources\\appliances.xml");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();

            String applianceName = criteria.getGroupSearchName();

            NodeList nodeList = doc.getElementsByTagName(applianceName.toLowerCase());

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) node;
                    Class<?> applianceClass = Class.forName("by.tc.task01.entity." + applianceName);
                    Field[] fields = applianceClass.getDeclaredFields();
                    List<String> fieldValues = new ArrayList<String>();

                    for (Field field : fields) {
                        fieldValues.add(eElement.getElementsByTagName(field.getName()).item(0).getTextContent());
                    }
                    Constructor<?> constructor = applianceClass.getConstructor(List.class);
                    Object newInstance = constructor.newInstance(fieldValues);
                    Appliance newApp = (Appliance) newInstance;

                    Map<String, Object> criteriaMap = criteria.getCriteria();
                    if (criteriaMap.isEmpty()) {
                        appliances.add(newApp);
                    } else {
                        boolean isAdded = true;
                        for (Map.Entry<String, Object> entry : criteriaMap.entrySet()) {
                            Field field = applianceClass.getDeclaredField(entry.getKey().toLowerCase());
                            field.setAccessible(true);
                            Object o = field.get(newApp);
                            isAdded = o.equals(entry.getValue()) && isAdded;
                        }
                        if (isAdded) appliances.add(newApp);
                    }
                }
            }
            return appliances;
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}