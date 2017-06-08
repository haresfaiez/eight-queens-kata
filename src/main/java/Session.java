import java.util.*;
import board.Board;

public class Session {
  Board board;

  Session(Board aBoard) {
    this.board = aBoard;
  }

  public Object eval() {
    StringBuffer result = new StringBuffer();
    this.board.dumbTo(result);
    return result.toString();
  }
}
