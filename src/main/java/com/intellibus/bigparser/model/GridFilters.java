package com.intellibus.bigparser.model;

import lombok.Data;

@Data
public class GridFilters {
    private boolean isRecent;
    private boolean isFavorite;
    private String lastVisitedDateTime;
    private String lastFavoriteDateTime;
    private String deletedDateTime;
    private String deletedBy;
}
