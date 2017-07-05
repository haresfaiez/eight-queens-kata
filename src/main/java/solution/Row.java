package solution;

class Row {

    public static Integer STEP = 1;

    Integer index;

    Row(Integer anIndex) {
	this.index = anIndex;
    }

     Row increment() {
	Integer newIndex;

	if (8 == this.index) newIndex = STEP;
	else                 newIndex = this.index + STEP;

	return new Row(newIndex);
    }

    @Override
    public boolean equals(Object anOther) {
	return ((Row) anOther).index.equals(this.index);
    }
}
