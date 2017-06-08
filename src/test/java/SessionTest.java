import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import board.SingletonBoard;

public class SessionTest {
  @Test
  public void singletonBoardHaveOneQueen() {
    Session aSession = new Session(new SingletonBoard());

    assertEquals("[1, 1]", aSession.eval());
  }
}
