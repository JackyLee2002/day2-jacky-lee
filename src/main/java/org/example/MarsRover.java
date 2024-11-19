package org.example;

public class MarsRover {
    private Orientation orientation;
    private int x;
    private int y;

    MarsRover() {
        this.orientation = new NorthOrientation();
        this.x = 0;
        this.y = 0;
    }

    public String showStatus() {
        return String.format("%d:%d:%s", x, y, orientation.getDirection());
    }

    private void moveForward() {
        switch (orientation.getDirection()) {
            case N:
                y++;
                break;
            case S:
                y--;
                break;
            case E:
                x++;
                break;
            case W:
                x--;
                break;
            default:
                break;
        }
    }

    public String executeCommand(String command) {
        if (command.equals("L")) {
            orientation = orientation.turnLeft();
        }
        if (command.equals("R")) {
            orientation = orientation.turnRight();
        }
        if (command.equals("M")) {
            moveForward();
        }
        return showStatus();
    }
}
