package com.intellibus.bigparser.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Optional;

@Data
public class Query {
    //TODO: Global Filters & Selected Columns Names, sendRowIds, pagination are tested and working
    // additional testing of Column Filter, filter joins,
    private Optional<GlobalFilter> globalFilter;
    private Optional<ColumnFilters> columnFilters;
    private Optional<JoinOperator> globalColumnFilterJoinOperator;
    //TODO: Validation on selectColumnNames.
    private Optional<ArrayList<String>> selectColumnNames;
    private Optional<Pagination> pagination;
    private Optional<Boolean> sendRowIdsInResponse;

    // Disables Setter for showColumnNamesInResponse to force QueryResult to always have Column Names
    @Setter(AccessLevel.NONE)
    private Boolean showColumnNamesInResponse = true;
}
