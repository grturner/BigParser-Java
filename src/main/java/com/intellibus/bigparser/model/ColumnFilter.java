package com.intellibus.bigparser.model;


import lombok.Data;

@Data
public class ColumnFilter {
    private String column;
    private ColumnFilterOperator operator;
    private String keyword;
}
