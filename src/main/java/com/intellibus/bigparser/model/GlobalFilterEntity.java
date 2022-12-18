package com.intellibus.bigparser.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GlobalFilterEntity {
    private GlobalFilterOperator operator;
    private String keyword;
}
