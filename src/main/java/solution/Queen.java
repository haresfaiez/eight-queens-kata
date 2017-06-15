package solution;

public class Queen {

  Integer row;
  Integer column;

  public Queen(Integer aColumn, Integer aRow) {
    this.row    = aRow;
    this.column = aColumn;
  }

  public Queen next() {
    return new Queen(this.row + 2, this.column + 1);
  }

  @Override
  public boolean equals(Object anOther) {
    return ((Queen) anOther).column.equals(this.column)
        && ((Queen) anOther).row.equals(this.row);
  }

  public static Queen at(Integer aColumn, Integer aRow) {
    return new Queen(aColumn, aRow);
  }
}
