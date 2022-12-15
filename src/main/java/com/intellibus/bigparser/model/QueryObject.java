package com.intellibus.bigparser.model;

import lombok.Data;

@Data
public class QueryObject<T> {
    private Query<T> query;
}
