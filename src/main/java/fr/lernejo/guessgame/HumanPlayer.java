package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.util.Scanner;
public class HumanPlayer implements Player {
    private final Logger logger = LoggerFactory.getLogger("Player");
    @Override
    public long askNextGuess() {
        System.out.println("donner votre choix");
        Scanner scan=new Scanner(System.in);
        return scan.nextLong();
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if (lowerOrGreater ) {
            System.out.println("plus petit");
        } else  {
            System.out.println("plus grand");

        }

    }
}
