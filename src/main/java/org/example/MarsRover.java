package org.example;

import java.util.Arrays;
import java.util.Objects;

public class MarsRover {
    private String direction;

    MarsRover() {
        this.direction = "N";
    }

    String[] directions = {"N", "E", "S", "W"};



    public String showStatus() {
        return "0:0:" + this.direction;
    }

    public void turnLeft() {
        System.out.println(direction);
        int index = (Arrays.asList(directions).indexOf(direction) - 1 + directions.length) % directions.length;
        direction = directions[index];
        System.out.println(direction);
    }

    public String executeCommand(String command) {
        if ("L".equals(command)) {
            turnLeft();
        }
        return showStatus();
    }
}
