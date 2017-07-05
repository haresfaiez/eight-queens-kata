package solution;

public class Queen {

    Row     row;
    Integer column;

    private Queen(Row aRow, Integer aColumn) {
	this.row    = aRow;
	this.column = aColumn;
    }

    public Object freeDiagonal(Queen existing) {
	Queen result = this;
	// After next: Remove the conditional
	if (result.isInDiagonalConflitWith(existing)) {
	    result = result.verticalIncrement(0);
	}
	return result.row.index;
    }

    private boolean isInDiagonalConflitWith(Queen aTarget) {
	// Next: Clean this
	Boolean result = false;
	for (int i = 1; i < 9; i++) {
	    Boolean isRowi = (1 + i == this.row.index) && (1 + i == this.column)
		          && (1 == aTarget.row.index) && (1 == aTarget.column);
	
	    result = result || (isRowi);
	}
	return result;
    }

    public Queen verticalIncrement(Integer resultColumn) {
	return new Queen(this.row.increment(), resultColumn);
    }

    public Queen next() {
	return new Queen(this.row.increment().increment(), this.column + 1);
    }

    @Override
    public boolean equals(Object anOther) {
	return ((Queen) anOther).column.equals(this.column)
	    && ((Queen) anOther).row.equals(this.row);
    }

    @Override
    public String toString() {
	return String.format("Queen(%s, %s)", this.row.index, this.column);
    }

    public static Queen at(Integer aRow, Integer aColumn) {
	return new Queen(new Row(aRow), aColumn);
    }
}
