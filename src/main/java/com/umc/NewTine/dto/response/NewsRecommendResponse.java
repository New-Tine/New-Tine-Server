package com.umc.NewTine.dto.response;

import com.umc.NewTine.domain.News;

public class NewsRecommendResponse {

    private long id;
    private String title;
    private String pressName;

    public NewsRecommendResponse(News news) {
        this.id = news.getId();
        this.title = news.getTitle();
        this.pressName = news.getPress().getName();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPressName() {
        return pressName;
    }
}
