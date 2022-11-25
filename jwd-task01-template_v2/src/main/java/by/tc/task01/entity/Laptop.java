package by.tc.task01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Laptop extends Appliance {
    private int battery_capacity;
    private String os;
    private int memory_rom;
    private int system_memory;
    private double cpu;
    private int display_inches;
    private int cost;

    public Laptop(List<String> params) {
        this.battery_capacity = Integer.parseInt(params.get(0));
        this.os = params.get(1);
        this.memory_rom = Integer.parseInt(params.get(2));
        this.system_memory = Integer.parseInt(params.get(3));
        this.cpu = Double.parseDouble(params.get(4));
        this.display_inches = Integer.parseInt(params.get(5));
        this.cost = Integer.parseInt(params.get(6));
    }
}
