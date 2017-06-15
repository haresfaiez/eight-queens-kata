package queen;

public class Solution {

  Integer row;
  Integer column;

  public Solution(Integer aColumn, Integer aRow) {
    this.row    = aRow;
    this.column = aColumn;
  }

  public Solution next() {
    return new Solution(this.row + 2, this.column + 1);
  }

  @Override
  public boolean equals(Object anOther) {
    return ((Solution) anOther).column.equals(this.column)
        && ((Solution) anOther).row.equals(this.row);
  }

  public static Solution at(Integer aColumn, Integer aRow) {
    return new Solution(aColumn, aRow);
  }
}
