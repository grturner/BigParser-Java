package com.intellibus.bigparser.services;

import com.intellibus.bigparser.model.*;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers("Content-Type: application/json")
public interface GridClient {
    @RequestLine("GET /grid/{gridId}/query_metadata")
    QueryMetaData getMetaData(@Param("gridId") String gridId);

    @RequestLine("POST /grid/{gridId}/search")
    QueryResult searchGrid(@Param("gridId") String gridId, QueryObject queryObject);

    @RequestLine("POST /grid/{gridId}/search_count")
    QueryResult searchCount(@Param("gridId") String gridId, QueryObject queryObject);

    @RequestLine("POST /grid/{gridId}/search_keywords_count")
    SearchKeywordsResult searchKeywordsCount(@Param("gridId") String gridId, QueryObject queryObject);

    @RequestLine("POST /grid/{gridId}/distinct")
    DistinctResponse distinct(@Param("gridId") String gridId, DistinctQueryObject queryObject);
}
