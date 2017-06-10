package board;

public class SingletonBoard extends Board {
  Object size;

  public SingletonBoard(Object aSize) {
    this.size = aSize;
  }

  @Override
  public void dumbTo(StringBuffer compound) {
    super.dumbTo(compound);
    compound.append("[1, 1]");
  }
  public static Board count(Object squareCount) {
    return new SingletonBoard(squareCount);
  }
}
