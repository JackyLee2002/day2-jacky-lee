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

    public String executeCommand(String command) {
        if (command.equals("L")) {
            turnLeft();
        }
        return "0:0:" + direction;
    }
}
