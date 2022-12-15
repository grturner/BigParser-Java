package com.intellibus.bigparser.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Insert<T> {
    /**
     * TODO: Find equivalent to Partial or work around it
     *  export declare type Insert<GridDataModel> = {
     *    rows: Array<Partial<GridDataModel>>;
     *  };
     */
    private ArrayList<T> rows;
}
