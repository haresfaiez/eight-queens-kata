import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;

public class SessionTest {
  @Test
  public void nullBoard() {
    Session actual = new Session();
    assertEquals(Collections.emptyList(), actual.queens);
  }
}
