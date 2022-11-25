package by.tc.task01.entity.criteria;

import java.util.List;

public final class SearchCriteria {

    public static enum Oven {
        POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH, COST
    }

    public static enum Laptop {
        BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHS, COST
    }

    public static enum Refrigerator {
        POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH, COST
    }

    public static enum VacuumCleaner {
        POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH, COST
    }

    public static enum TabletPC {
        BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR, COST
    }

    public static enum Speakers {
        POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH, COST
    }

    public static enum Kettle {
        POWER_CONSUMPTION, WATER_CAPACITY, COST
    }

    /*public List<String> getEnumByName(String name) {

    }*/
    private SearchCriteria() {
    }
}

