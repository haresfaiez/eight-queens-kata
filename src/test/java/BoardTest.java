import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import board.*;

public class BoardTest {
  @Test
  public void emptyBoardWritesNothing() {
      Board aBoard = new EmptyBoard();

      StringBuffer actual = new StringBuffer();
      aBoard.dumbTo(actual);

      assertEquals("", actual.toString());
  }

  @Test
  public void singletonBoardWritesOneQueen() {
      Board aBoard = new SingletonBoard();

      StringBuffer actual = new StringBuffer();
      aBoard.dumbTo(actual);

      assertEquals("[1, 1]", actual.toString());
  }
}
