package Q9;

/**
 * Created by Anchor on 2016/11/24.
 */
public class Game {
    private int mDifficulty;
    private int mTarget;
    private int numOfGuess = 0;
    private int mMaxNumOfGuess = 0;
    public Game(int difficulty, int maxNum){
        mDifficulty = difficulty;
        java.util.Random r = new java.util.Random();
        mTarget = r.nextInt() % mDifficulty + 1;
        mMaxNumOfGuess = maxNum;
    }
    public boolean response(int guess) {
        numOfGuess++;
        if (guess > mTarget) {
            if (numOfGuess == mMaxNumOfGuess) {
                System.out.println("Game Over!");
                return false;
            }
            System.out.println("go lower");
        } else if (guess < mTarget) {
            if (numOfGuess == mMaxNumOfGuess) {
                System.out.println("Game Over!");
                return false ;
            }
            System.out.println("go higher");
        } else
        {
            System.out.println("correct");
            return false;
        }
        return true;
    }
}
