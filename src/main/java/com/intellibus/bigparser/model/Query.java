package com.intellibus.bigparser.model;

import java.util.Optional;

public class Query<T> {
    private Optional<GlobalFilter> globalFilter;
    private Optional<ColumnFilter> columnFilter;
    private Optional<JoinOperator> globalColumnFilterJoinOperator;
    /**
     * TODO: Still need to figure out keyof equivalent in Java
     * Line 59 of types.ts
     */
    private Optional<T> selectColumnNames;
    private Optional<SortType<GridDataModel>> sort;
    private Optional<Pagination> pagination;
    private Optional<Boolean> sendRowIdsInResponse;
    private Optional<Boolean> showColumnNamesInResponse;
}
