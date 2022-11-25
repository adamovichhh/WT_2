package by.tc.task01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kettle extends Appliance {
    private int power_consumption;
    private int water_capacity;
    private int cost;

    public Kettle(List<String> params) {
        this.power_consumption = Integer.parseInt(params.get(0));
        this.water_capacity = Integer.parseInt(params.get(1));
        this.cost = Integer.parseInt(params.get(2));
    }
}
