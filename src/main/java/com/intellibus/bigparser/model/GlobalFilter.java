package com.intellibus.bigparser.model;

import lombok.Data;

import java.util.ArrayList;

/**
 * Data Model for GlobalFilter for BigParser
 */

@Data
public class GlobalFilter {
    private ArrayList<GlobalFilterEntity> filters;
    private JoinOperator filtersJoinOperator;
}
