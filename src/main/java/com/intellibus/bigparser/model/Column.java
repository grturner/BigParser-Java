package com.intellibus.bigparser.model;

import lombok.Data;

@Data
public class Column {
    private String columnName;
    private String columnDesc;
    private DataType dataType;
    private int columnIndex;
    private boolean islinkedColumn;
    private boolean isPrimaryLink;
}
