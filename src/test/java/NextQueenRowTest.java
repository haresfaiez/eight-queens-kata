import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import board.*;
import solution.Queen;

public class NextQueenRowTest {

  @Test
  public void secondQueenIsNotDiagonallyAlignedToTheFirstOne() {
    Board actual = Board.empty().with(Queen.at(1, 1));

    assertNotEquals(2, actual.rowForColumn(2));
  }

  @Test
  public void twoQueensInTheSameRowAreNotAllowed() {
    Board actual = Board.empty().with(Queen.at(2, 1));

    assertNotEquals(2, actual.rowForColumn(2));
  }

  @Test
  public void secondQueenRowIsDifferentFromTheFirstOneRow() {
    Board actual = Board.empty().with(Queen.at(1, 1));

    assertNotEquals(1, actual.rowForColumn(2));
  }

  @Test
  public void emptyBoardAcceptsTheFirstRow() {
    Board anEmpty = Board.empty();

    assertEquals(1, anEmpty.rowForColumn(1));
  }
}
