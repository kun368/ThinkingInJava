package chapter7.T15;

import chapter7.T15.pkg.Student;

/**
 * Created by kun36 on 2016/12/22.
 */
public class Main extends Student {

    public void mainTalk() {
        talk(); //invoke.
    }

    public static void main(String[] args) {
        new Main().mainTalk();
    }
}
