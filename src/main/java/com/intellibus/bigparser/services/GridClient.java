package com.intellibus.bigparser.services;

import com.intellibus.bigparser.model.QueryMetaData;
import com.intellibus.bigparser.model.QueryObject;
import com.intellibus.bigparser.model.QueryResult;
import com.intellibus.bigparser.model.SearchKeywordsResult;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface GridClient {
    @RequestLine("GET /grid/{gridId}/query_metadata")
    QueryMetaData getMetaData(@Param("gridId") String gridId);

    @RequestLine("POST /grid/{gridId}/search")
    @Headers("Content-Type: application/json")
    QueryResult searchGrid(@Param("gridId") String gridId, QueryObject queryObject);

    @RequestLine("POST /grid/{gridId}/search_count")
    @Headers("Content-Type: application/json")
    QueryResult searchCount(@Param("gridId") String gridId, QueryObject queryObject);

    @RequestLine("POST /grid/{gridId}/search_keywords_count")
    @Headers("Content-Type: application/json")
    SearchKeywordsResult searchKeywordsCount(@Param("gridId") String gridId, QueryObject queryObject);
}
