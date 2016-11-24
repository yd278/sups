package Q9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Anchor on 2016/11/24.
 */

public class HiLo {

    private Game mGame;

    public HiLo(Game game) {
        mGame = game;
    }

    public void play() throws IOException {
        String response = "";
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (!response.equals("q")) {
            response = in.readLine();
            if (response.startsWith("g")) {
                if (mGame == null) System.out.println("Please set difficulty and max guesses");
                else {
                    int guess = Integer.parseInt(response.substring(2, response.length()));
                    if (!mGame.response(guess)) {
                        System.out.println("Please set difficulty and max guesses");
                        mGame = null;
                    }
                }
            } else if (response.startsWith("s")) {
                String[] mArgs = response.split(" ");
                mGame = new Game(Integer.parseInt(mArgs[1]), Integer.parseInt(mArgs[2]));
            }

        }
    }

    public static void main(String args[]) {
        try {
            Game g = null;
            HiLo hl = new HiLo(g);
            hl.play();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
