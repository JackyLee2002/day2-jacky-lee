package org.example;

public class MarsRover {
    private String direction;

    MarsRover() {
        this.direction = "N";
    }

    public String showStatus() {
        return "0:0:" + this.direction;
    }

//    use switch case to handle turn left
    public void turnLeft() {
         switch (direction) {
             case "N":
                direction = "W";
                 break;
            case "W":
                direction = "S";
                break;
            case "S":
                direction = "E";
                break;
            case "E":
                direction = "N";
             default:
                 break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "E":
                direction = "S";
                break;
            case "S":
                direction = "W";
                break;
            case "W":
                direction = "N";
                break;
            default:
                break;
        }
    }

    public String executeCommand(String command) {
        if (command.equals("L")) {
            turnLeft();
        }
        if (command.equals("R")) {
            turnRight();
        }
        return "0:0:" + direction;
    }
}
