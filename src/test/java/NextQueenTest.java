import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import board.*;
import solution.Queen;

public class NextQueenTest {

  @Test
  public void theSecondQueenIsInTheThirdRow() {
    PopulatedBoard aSolution = new PopulatedBoard();
    assertEquals(Queen.at(3, 2), aSolution.after(Queen.at(1, 1)));
  }

  @Test
  public void theFirstQueenIsInTheTopLeft() {
    PopulatedBoard aSolution = new PopulatedBoard();
    assertEquals(Queen.at(1, 1), aSolution.after());
  }

  @Test
  public void equalQueensHaveTheSamePositionOnTheBoard() {
    assertEquals(Queen.at(1, 1), Queen.at(1, 1));
  }
}
