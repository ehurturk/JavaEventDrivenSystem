package hurturk.emir;

import hurturk.emir.Events.EventManager;
import hurturk.emir.Events.GreetPlayer;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        EventManager.getInstance().registerListener(new GreetPlayer());

        game.mainLoop();

        

    }
}
