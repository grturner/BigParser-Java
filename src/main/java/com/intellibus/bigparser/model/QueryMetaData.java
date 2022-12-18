package com.intellibus.bigparser.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;

@Data
public class QueryMetaData {
    private String name;
    private String description;
    private ArrayList<Column> columns;
    private HashMap<String, SortType> sort;
    private ArrayList<ColumnSort> sortArray;
    private String fileId;
    private String fileExtention;
    private String fileSource;
    private String imageInfo;
    private String gridType;
    private String defaultSyncPref;
    private String saveType;
    private String lastExtSrcSyncDateTime;
    private String auditGridId;
    private String originalGridId;
    private String lastUpdatedTimeInBigParser;
    private String lastUpdatedBy;
    private String defaultSaveFilter;
    private GridFilters filters;
    private String tabDescription;
    private String tabName;
    private boolean showRowId;
    private String viewType;
    // TODO: Finish Implementing cardViewInfo as part of Data Model
    private boolean owner;
    private boolean auditGrid;
    private boolean multisheet;
}
