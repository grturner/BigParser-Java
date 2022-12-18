package com.intellibus.bigparser.model;

import lombok.Data;

@Data
public class ColumnSort {
    private String columnName;
    private String columnIndex;
    private SortType sortDirection;

}
