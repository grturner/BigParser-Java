package com.intellibus.bigparser.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class DistinctResponse {
    private ArrayList<String> matchingValues;
}
