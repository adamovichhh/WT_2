package by.tc.task01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VacuumCleaner extends Appliance{
	private int power_consumption;
    private String filter_type;
    private String bag_type;
    private String wand_type;
    private int motor_speed_regulation;
    private int cleaning_width;
    private int cost;

    public VacuumCleaner(List<String> params) {
        this.power_consumption = Integer.parseInt(params.get(0));
        this.filter_type = params.get(1);
        this.bag_type = params.get(2);
        this.wand_type = params.get(3);
        this.motor_speed_regulation = Integer.parseInt(params.get(4));
        this.cleaning_width = Integer.parseInt(params.get(5));
        this.cost = Integer.parseInt(params.get(6));
    }
}
