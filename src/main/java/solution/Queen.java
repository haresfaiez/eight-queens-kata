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
	// After next: Remove the conditional
	if (result.isInDiagonalConflitWith(existing)) {
	    result = result.verticalIncrement(0);
	}
	return result.row;
    }

    private boolean isInDiagonalConflitWith(Queen aTarget) {
	// Next: Clean this
	Boolean result = false;
	for (int i = 1; i < 9; i++) {
	    Boolean isRowi = (1 + i == this.row) && (1 + i == this.column)
		          && (1 == aTarget.row) && (1 == aTarget.column); 
	
	    result = result || (isRowi);
	}
	return result;
    }

    public Queen verticalIncrement(Integer resultColumn) {
	Integer resultRow;

	if (8 == this.row) resultRow = 1;
	else               resultRow = this.row + 1;

	return new Queen(resultRow, resultColumn);
    }

    public Queen next() {
	return new Queen(this.row + 2, this.column + 1);
    }

    @Override
    public boolean equals(Object anOther) {
	return ((Queen) anOther).column.equals(this.column)
	    && ((Queen) anOther).row.equals(this.row);
    }

    @Override
    public String toString() {
	return String.format("Queen(%s, %s)", this.row, this.column);
    }

    public static Queen at(Integer aRow, Integer aColumn) {
	return new Queen(aRow, aColumn);
    }
}
