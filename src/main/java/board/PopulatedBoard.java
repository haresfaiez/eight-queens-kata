package board;
import queen.Solution;

public class PopulatedBoard extends Board {

  public Object after() {
    return new Solution(1, 1);
  }

  public Object after(Solution theLast) {
    return theLast.next();
  }

  @Override
  public void dumpTo(StringBuffer compound) {
    super.dumpTo(compound);
    compound.append("[1, 1]");
  }

  public static Board chess() {
    return new PopulatedBoard();
  }
}
