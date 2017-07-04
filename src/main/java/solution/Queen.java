package solution;

public class Queen {

  Integer row;
  Integer column;

  Queen(Integer aRow, Integer aColumn) {
    this.row    = aRow;
    this.column = aColumn;
  }

  public Object freeDiagonal(Queen existing) {
    Queen result = this;
    if (result.isInDiagonalConflitWith(existing)) {
	result = result.verticalIncrement(0);
    }
    return result.row;
  }

  private boolean isInDiagonalConflitWith(Queen aTarget) {
    return (2 == this.row) && (2 == this.column)
        && (1 == aTarget.row) && (1 == aTarget.column);
  }

  public Queen verticalIncrement(Integer resultColumn) {
    return new Queen((this.row + 1) % 8, resultColumn);
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
