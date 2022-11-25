package by.tc.task01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Oven extends Appliance{
	private int power_consumption;
    private int weight;
    private int capacity;
    private int depth;
    private int height;
    private int width;
    private int cost;

    public Oven(List<String> params) {
        this.power_consumption = Integer.parseInt(params.get(0));
        this.weight = Integer.parseInt(params.get(1));
        this.capacity = Integer.parseInt(params.get(2));
        this.depth = Integer.parseInt(params.get(3));
        this.height = Integer.parseInt(params.get(4));
        this.width = Integer.parseInt(params.get(5));
    }
}
