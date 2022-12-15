package com.intellibus.bigparser.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.Optional;

@Data
public class Distinct<T> {
    //TODO: keyof GridDataModel
    private Optional<ArrayList<T>> columnNames;
}
