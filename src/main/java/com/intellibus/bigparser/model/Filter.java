package com.intellibus.bigparser.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.Optional;

@Data
public class Filter<T> {
    private ArrayList<T> filters;
    private Optional<JoinOperator> joinOperator;
}
