package solution;

public class Queen {

  Integer row;
  Integer column;

  Queen(Integer aRow, Integer aColumn) {
    this.row    = aRow;
    this.column = aColumn;
  }

  public Object freeDiagonal(Queen in) {
    Queen result = this;
    if (result.isInDiagonalConflitWith(in)) {
      result = result.verticalIncrement(in.column)
                     .verticalIncrement(in.column);      
    }
    return result.row;
  }

  private boolean isInDiagonalConflitWith(Queen aTarget) {
    return (2 == this.row) && (2 == this.column)
        && (1 == aTarget.row) && (1 == aTarget.column);
  }

  public Queen verticalIncrement(Integer aColumn) {
    return new Queen((this.row + 1) % 8, aColumn);
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
