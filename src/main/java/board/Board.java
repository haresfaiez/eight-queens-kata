package board;

public abstract class Board {
  abstract public void dumpTo(StringBuffer compound);

  abstract public Object rowForColumn(Object aColumn);
  abstract public Board put(Object aQueen);

  public static Board empty() {
    return new EmptyBoard();
  }

  public static Board chess() {
    return new PopulatedBoard();
  }
}
