package com.intellibus.bigparser.model;

import lombok.Data;

@Data
public class InsertObject<T> {
    private Insert<T> insert;
}
