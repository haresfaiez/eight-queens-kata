import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import board.*;
import solution.Queen;

public class NextQueenRowTest {

  @Test
  public void twoQueensInTheSameRowAreNotAllowed() {
    Board actual = Board.empty().put(Queen.at(1, 1));

    assertNotEquals(1, actual.rowForColumn(1));
  }

  @Test
  public void emptyBoardAcceptsTheFirstRow() {
    Board anEmpty = Board.empty();

    assertEquals(1, anEmpty.rowForColumn(1));
  }
}
