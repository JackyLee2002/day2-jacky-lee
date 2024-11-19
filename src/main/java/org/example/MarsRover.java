package org.example;

public class MarsRover {
    private String direction;

    MarsRover() {
        this.direction = "N";
    }

    String[] directions = {"N", "E", "S", "W"};



    public String showStatus() {
        return "0:0:" + this.direction;
    }

    public String executeCommand(String command) {
        if(direction.equals("N")) {
            direction = "W";
            return "0:0:" +direction;
        }
        if (direction.equals("W")) {
            direction = "S";
            return "0:0:" + direction;
        }
        return "0:0:" + direction;
    }
}
