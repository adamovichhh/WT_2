package by.tc.task01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Refrigerator extends Appliance{
	private int power_consumption;
    private int weight;
    private int freezer_capacity;
    private int overall_capacity;
    private int height;
    private int width;
    private int cost;

    public Refrigerator(List<String> params) {
        this.power_consumption = Integer.parseInt(params.get(0));
        this.weight = Integer.parseInt(params.get(1));
        this.freezer_capacity = Integer.parseInt(params.get(2));
        this.overall_capacity = Integer.parseInt(params.get(3));
        this.height = Integer.parseInt(params.get(4));
        this.width = Integer.parseInt(params.get(5));
        this.cost = Integer.parseInt(params.get(6));
    }
}
