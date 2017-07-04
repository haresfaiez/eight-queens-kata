import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import solution.Queen;

public class QueenIncrementTest {

  @Test
  public void freeDiagonalDoesAlignWithTopLeftQueen() {
      Queen seven_x_seven = Queen.at(7, 7);
      assertEquals(8, seven_x_seven.freeDiagonal(Queen.at(1, 1)));
  }
    
  @Test
  public void incrementOfLastRowIsTheFirstRow() {
    assertEquals(Queen.at(1, 1), Queen.at(8, 1).verticalIncrement(1));
  }
}
