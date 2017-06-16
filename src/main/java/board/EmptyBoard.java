package board;

import solution.Queen;

public class EmptyBoard extends Board<Queen> {

  @Override
  public Object rowForColumn(Object aColumn) {
    return 1;
  }

  @Override
  public Board with(Queen aSolution) {
    Board result = new PopulatedBoard();
    return result.with(aSolution);
  }

  @Override
  public void dumpTo(StringBuffer compound) {
    compound.append("");
  }
}
