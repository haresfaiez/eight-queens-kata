package board;

public abstract class Board {

  abstract public Object rowForColumn(Object aColumn);
  abstract public Board with(Object aQueen);
  abstract public void dumpTo(StringBuffer compound);

  public static Board empty() {
    return new EmptyBoard();
  }

  public static Board chess() {
    return new PopulatedBoard();
  }
}
