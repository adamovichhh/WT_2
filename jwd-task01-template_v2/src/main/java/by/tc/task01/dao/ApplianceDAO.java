package by.tc.task01.dao;

import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public interface ApplianceDAO {

	/**
	 * @param criteria
	 * @return
	 * @throws DAOException
	 */
	List<Appliance> find(Criteria criteria) throws DAOException;
	
}
