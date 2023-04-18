import java.io.Serializable;
import java.util.Scanner;

public class Puzzle implements Serializable {

    private Scanner infile;
    private String puzzleType;
    private String puzzleID;
    private String puzzleRoomID;
    private String problem;
    private String solution;
    private String hint;
    private String correctOutcome;
    private String failOutcome;
    private String attempts;
    private String solved;


    public Puzzle(String puzzleType, String puzzleID, String puzzleRoomID, String problem, String solution, String hint, String correctOutcome, String failOutcome, String attempts, String solved) {
        this.puzzleType = puzzleType;
        this.puzzleID = puzzleID;
        this.puzzleRoomID = puzzleRoomID;
        this.problem = problem;
        this.solution = solution;
        this.hint = hint;
        this.correctOutcome = correctOutcome;
        this.failOutcome = failOutcome;
        this.attempts = attempts;
        this.solved = solved;
    }

    public String getProblem() {
        return problem;
    }

    public String getHint() {
        return hint;
    }

    public String getCorrectOutcome() {
        return correctOutcome;
    }

    public String getFailOutcome() {
        return failOutcome;
    }

    public String getAttempts() {
        return attempts;
    }

    public boolean solve(String solution) {
        if (this.solution.equals(solution)) {
            System.out.println(correctOutcome);
            return true;
        }
        else
            System.out.println(failOutcome);
        return false;

    }
}

