import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import board.PopulatedBoard;

public class SessionTest {
  @Test
  public void singletonBoardHaveOneQueen() {
    Session aSession = new Session(PopulatedBoard.chess());

    assertEquals("[1, 1]", aSession.eval());
  }
}
