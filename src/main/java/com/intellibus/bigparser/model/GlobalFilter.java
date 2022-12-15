package com.intellibus.bigparser.model;

import lombok.Data;

import java.util.Optional;

@Data
public class GlobalFilter {
    private Optional<GlobalFilterOperator> operator;
    private String keyword;
}
