import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import board.*;

public class BoardTest {

  @Test
  public void emptyBoardWritesNothing() {
      Board aBoard = new EmptyBoard();

      StringBuffer actual = new StringBuffer();
      aBoard.dumpTo(actual);

      assertEquals("", actual.toString());
  }

  @Test
  public void chessBoardWritesTheFirstQueen() {
      Board aBoard = PopulatedBoard.chess();

      StringBuffer actual = new StringBuffer();
      aBoard.dumpTo(actual);

      assertEquals("[1, 1]", actual.toString());
  }
}
