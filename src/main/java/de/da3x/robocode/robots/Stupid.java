package de.da3x.robocode.robots;

import robocode.Robot;
import robocode.ScannedRobotEvent;

/**
 * Der allererste blöde stumpfsinnige Robot...
 *
 * @author Daniel Bleisteiner
 * @since 20.02.2019
 */
public class Stupid extends Robot {

    @Override
    public void run() {
        while (true) {
            this.ahead(100);
            this.turnGunRight(360);
            this.back(100);
            this.turnGunRight(360);
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        this.fire(1);
    }

}
