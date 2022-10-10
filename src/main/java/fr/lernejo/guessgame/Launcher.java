package fr.lernejo.guessgame;

import java.security.SecureRandom;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.security.SecureRandom;

public class Launcher {
    private static final Logger logger = LoggerFactory.getLogger("launcher");
    public static void main(String[] args) {
        Simulation simulation;
        HumanPlayer humanPlayer = new HumanPlayer();
            simulation = new Simulation(humanPlayer);
            SecureRandom random = new SecureRandom();
            long randomNumber = random.nextInt(100);
            simulation.initialize(randomNumber);
            simulation.loopUntilPlayerSucceed(Long.MAX_VALUE);

    }

}
