import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import board.*;
import queen.Solution;

public class NextQueenTest {

  @Test
  public void theSecondQueenIsInTheThirdRow() {
    PopulatedBoard aSolution = new PopulatedBoard();
    assertEquals(new Solution(3, 2), aSolution.after(new Solution(1, 1)));
  }

  @Test
  public void theFirstQueenIsInTheTopLeft() {
    PopulatedBoard aSolution = new PopulatedBoard();
    assertEquals(new Solution(1, 1), aSolution.after());
  }

  @Test
  public void equalQueensHaveTheSamePositionOnTheBoard() {
    assertEquals(new Solution(1, 1), new Solution(1, 1));
  }
}
