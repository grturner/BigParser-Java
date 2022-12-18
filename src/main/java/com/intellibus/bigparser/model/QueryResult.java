package com.intellibus.bigparser.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;

@Data
public class QueryResult {
    private int totalRowCount;
    private ArrayList<HashMap<String, String>> rows;
}
