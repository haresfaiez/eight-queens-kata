package board;

public class SingletonBoard extends Board {

  @Override
  public void dumbTo(StringBuffer compound) {
    compound.append("[1, 1]");
  }
}
