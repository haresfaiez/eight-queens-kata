package board;
import solution.Queen;

public class PopulatedBoard extends Board {

  @Override
  public Object rowForColumn(Object aColumn) {
    return 2;
  }

  @Override
  public Board with(Object aQueen) {
    return new PopulatedBoard();
  }

  public Object after() {
    return Queen.at(1, 1);
  }

  public Object after(Queen theLast) {
    return theLast.next();
  }

  @Override
  public void dumpTo(StringBuffer compound) {
    compound.append("[1, 1]");
  }
}
