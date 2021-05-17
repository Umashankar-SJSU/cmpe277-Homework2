package com.sjsu.android.news.model;

import com.squareup.moshi.Json;

import java.util.List;

public class Headlines {

    @Json(name = "status")
    private String status;

    @Json(name = "totalResults")
    private String totalResults;

    @Json(name = "articles")
    private List<Articles> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public List<Articles> getArticles() {
        return articles;
    }

    public void setArticles(List<Articles> articles) {
        this.articles = articles;
    }
}
