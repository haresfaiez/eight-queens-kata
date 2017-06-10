import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import board.*;

public class BoardTest {
  @Test
  public void boardWithFourSqauresWritesOneQueen() {
    Board aBoard = SingletonBoard.count(2);

    StringBuffer actual = new StringBuffer();
    aBoard.dumbTo(actual);

    assertEquals("[1, 1]", actual.toString());
  }

  @Test
  public void emptyBoardWritesNothing() {
      Board aBoard = new EmptyBoard();

      StringBuffer actual = new StringBuffer();
      aBoard.dumbTo(actual);

      assertEquals("", actual.toString());
  }

  @Test
  public void singletonBoardWritesOneQueen() {
      Board aBoard = SingletonBoard.count(1);

      StringBuffer actual = new StringBuffer();
      aBoard.dumbTo(actual);

      assertEquals("[1, 1]", actual.toString());
  }
}
