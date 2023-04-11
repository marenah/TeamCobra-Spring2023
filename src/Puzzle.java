import java.io.Serializable;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Puzzle implements Serializable {

    private Scanner infile;
    private String puzzleID;
    private String puzzleRoomID;
    private String problem;
    private String solution;
    private String hint;
    private String attempts;
    private String correctOutcome;
    private String failOutcome;
}
