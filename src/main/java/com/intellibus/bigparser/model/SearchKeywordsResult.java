package com.intellibus.bigparser.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class SearchKeywordsResult {
    private ArrayList<Integer> globalFilterCount;
    private ArrayList<Integer> columnFilterCount;
}
