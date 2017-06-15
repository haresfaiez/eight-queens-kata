package board;

public class EmptyBoard extends Board {

  @Override
  public Object rowForColumn(Object aColumn) {
    return 1;
  }

  @Override
  public Board put(Object aQueen) {
    Board result = new PopulatedBoard();
    return result.put(aQueen);
  }

  @Override
  public void dumpTo(StringBuffer compound) {
    compound.append("");
  }
}
