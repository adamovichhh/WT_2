package by.tc.task01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TabletPC extends Appliance{
	private int batter_capacity;
    private int display_inches;
    private int memory_rom;
    private int flash_memory_capacity;
    private String color;
    private int cost;

    public TabletPC(List<String> params) {
        this.batter_capacity = Integer.parseInt(params.get(0));
        this.display_inches = Integer.parseInt(params.get(1));
        this.memory_rom = Integer.parseInt(params.get(2));
        this.flash_memory_capacity = Integer.parseInt(params.get(3));
        this.color = params.get(4);
        this.cost = Integer.parseInt(params.get(5));
    }
}
