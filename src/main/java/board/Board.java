package board;

import solution.Queen;

public abstract class Board<SolutionType> {

  abstract public Object rowForColumn(Object aColumn);
  abstract public Board with(SolutionType aSolution);
  abstract public void dumpTo(StringBuffer compound);

  public static Board empty() {
    return new EmptyBoard();
  }

  public static Board chess() {
    return new PopulatedBoard();
  }
}
