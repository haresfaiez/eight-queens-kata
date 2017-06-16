package solution;

public class Queen {

  Integer row;
  Integer column;

  Queen(Integer aRow, Integer aColumn) {
    this.row    = aRow;
    this.column = aColumn;
  }

  public Integer verticalIncrement() {
    return (this.row + 1) % 8;
  }

  public Queen next() {
    return new Queen(this.row + 2, this.column + 1);
  }

  @Override
  public boolean equals(Object anOther) {
    return ((Queen) anOther).column.equals(this.column)
        && ((Queen) anOther).row.equals(this.row);
  }

  public static Queen at(Integer aRow, Integer aColumn) {
    return new Queen(aRow, aColumn);
  }
}
