package board;

public class EmptyBoard extends Board {

  @Override
  public void dumbTo(StringBuffer compound) {
    compound.append("");
  }
}
