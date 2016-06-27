protected SelectedDenseDoubleMatrix3D(double[] elements, int[] sliceOffsets, int[] rowOffsets, int[] columnOffsets,
                                        int offset) {
    // be sure parameters are valid, we do not check...
    int slices = sliceOffsets.length;
    int rows = rowOffsets.length;
    int columns = columnOffsets.length;
    setUp(slices, rows, columns);

    this.elements = elements;

    this.sliceOffsets = sliceOffsets;
    this.rowOffsets = rowOffsets;
    this.columnOffsets = columnOffsets;

    this.offset = offset;

    this.isNoView = false;
  }

protected SelectedDenseDoubleMatrix3D(double[] elements, int[] sliceOffsets, int[] rowOffsets, int[] columnOffsets,
                                        int offset) {
    // be sure parameters are valid, we do not check...
    int slices = sliceOffsets.length;
    int rows = rowOffsets.length;
    int columns = columnOffsets.length;
    setUp(slices, rows, columns);

    this.elements = elements;

    this.sliceOffsets = sliceOffsets;
    this.rowOffsets = rowOffsets;
    this.columnOffsets = columnOffsets;

    this.offset = offset;

    this.isNoView = false;
  }
