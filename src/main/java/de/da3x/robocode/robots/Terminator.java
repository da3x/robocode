package de.da3x.robocode.robots;

import java.awt.Color;

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

        this.setColors(Color.RED, Color.BLACK, Color.RED);

        // Wir wollen grundsätzlich immer in Bewegung bleiben. Wir bauen aber einen gewissen Zufall
        // ein, der uns hin und wieder ein wenig dreht – damit wir nicht zu berechenbar sind.
        while (true) {

            if (Math.random() < 0.1) this.setTurnRight(90);
            if (Math.random() > 0.9) this.setTurnLeft(90);

            this.setAhead(500);
            this.turnGunRight(360);
            this.execute();
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        // Je näher der Gegner unserer Kanone ist, desto mehr Energie stecken wir in den Schuss!
        // Allerdings schießen wir nur, wenn der Gegner nah genug ist. Alles andere wäre Verschwendung.
        this.fire(200 / event.getDistance());
    }

    @Override
    public void onHitWall(HitWallEvent event) {
        // Wenn wir eine Wand treffen drehen wir uns einfach mal um 90 bis 180 Grad weg.
        this.turnLeft(Math.random() * 90 + 90);
    }
}
