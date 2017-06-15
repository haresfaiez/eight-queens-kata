package board;
import queen.Solution;

public class PopulatedBoard extends Board {

  @Override
  public Object rowForColumn(Object aColumn) {
    return 2;
  }

  @Override
  public Board put(Object aQueen) {
    return new PopulatedBoard();
  }

  public Object after() {
    return new Solution(1, 1);
  }

  public Object after(Solution theLast) {
    return theLast.next();
  }

  @Override
  public void dumpTo(StringBuffer compound) {
    compound.append("[1, 1]");
  }
}
