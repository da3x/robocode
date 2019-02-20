package de.da3x.robocode.robots;

import robocode.AdvancedRobot;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;

/**
 * Das soll meine Kampfmachine werden...
 *
 * @author Daniel Bleisteiner
 * @since 20.02.2019
 */
public class Terminator extends AdvancedRobot {

    @Override
    public void run() {
        while (true) {

            // Zuerst mal wollen wir stur geradeaus laufen...
            this.setAhead(500);
            // Außerdem soll sich unsere Kanone permanent drehen und scannen...
            this.turnGunRight(360);

            // Die soeben vorbereiteten Aktionen führen wir nun aus!
            this.execute();
            while (this.getDistanceRemaining() > 0 && this.getTurnRemaining() > 0) {
                this.execute();
            }
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        // Je näher der Gegner unserer Kanone ist, desto mehr Energie stecken wir in den Schuss!
        this.fire(200 / event.getDistance());
    }

    @Override
    public void onHitWall(HitWallEvent event) {
        // Wenn wir eine Wand treffen drehen wir uns einfach mal um 90 Grad und machen weiter.
        this.setTurnLeft(90);
    }
}
