package com.intellibus.bigparser.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ColumnFilters {
    private ArrayList<ColumnFilter> columnFilters;
    private JoinOperator filterJoinOperator;
}
