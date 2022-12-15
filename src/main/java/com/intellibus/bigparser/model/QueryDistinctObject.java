package com.intellibus.bigparser.model;

import lombok.Data;

@Data
public class QueryDistinctObject<T> {
    private Query<T> query;
    private Distinct<T> distinct;
}
