package com.intellibus.bigparser.model;

import lombok.Data;

@Data
public class DistinctQueryObject extends QueryObject {
    private Query query;
    private Distinct distinct;
}
