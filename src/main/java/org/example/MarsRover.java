package org.example;

public class MarsRover {
    private String direction;
    private int x;
    private int y;

    MarsRover() {
        this.direction = "N";
        this.x = 0;
        this.y = 0;
    }

    public String showStatus() {
        return String.format("%d:%d:%s", x, y, direction);
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

    private void moveForward() {
        y += 1;
    }

    public String executeCommand(String command) {
        if (command.equals("L")) {
            turnLeft();
        }
        if (command.equals("R")) {
            turnRight();
        }
        if (command.equals("M")) {
            moveForward();
        }
        return showStatus();
    }
}
