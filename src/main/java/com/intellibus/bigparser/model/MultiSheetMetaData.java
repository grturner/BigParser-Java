package com.intellibus.bigparser.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;

@Data
public class MultiSheetMetaData {
    private ArrayList<HashMap<Integer, String>> grids;
}
