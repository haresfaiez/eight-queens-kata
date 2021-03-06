package board;

import solution.Queen;

public class PopulatedBoard extends Board<Queen> {

  Queen content;

  @Override
  public Object rowForColumn(Integer aColumn) {
    Queen result = this.content.verticalIncrement(aColumn);
    return result.freeDiagonal(this.content);
  }

  @Override
  public Board with(Queen aQueen) {
    PopulatedBoard result = new PopulatedBoard();
    result.content = aQueen;
    return result;
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
