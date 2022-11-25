package by.tc.task01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Speakers extends Appliance{
	private int cord_length;
    private String frequency_range;
    private int number_of_speakers;
    private int power_consumption;
    private int cost;

    public Speakers(List<String> params) {
        this.cord_length = Integer.parseInt(params.get(0));
        this.frequency_range = params.get(1);
        this.number_of_speakers = Integer.parseInt(params.get(2));
        this.power_consumption = Integer.parseInt(params.get(3));
        this.cost = Integer.parseInt(params.get(4));
    }
}
