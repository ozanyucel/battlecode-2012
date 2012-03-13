package gamegosplayer;

import battlecode.common.RobotController;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RobotPlayer {

    public static void run(RobotController myRC) {
        while (true) {
            try {
                while (myRC.isMovementActive()) {
                    myRC.yield();
                }

                if (myRC.canMove(myRC.getDirection())) {
                    myRC.moveForward();
                } else {
                    myRC.setDirection(myRC.getDirection().rotateRight());
                }
                myRC.yield();
            } catch (Exception e) {
                Logger.getLogger(RobotPlayer.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
}
