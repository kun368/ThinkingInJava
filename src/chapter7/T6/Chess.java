package chapter7.T6;

/**
 * Created by kun36 on 2016/12/21.
 */
class Game {
    Game(int i) {
        System.out.println("Game()");
    }
}
class BoardGame extends Game {
    protected BoardGame(int i) {
        super(i);
        System.out.println("BoardGame()");
    }
}

public class Chess extends BoardGame {

    Chess() {
        super(11);
        System.out.println("Chess()");
    }

    public static void main(String[] args) {
        new Chess();
    }
}
