package com.umc.NewTine.dto.response;

import com.umc.NewTine.domain.News;

public class NewsRecentResponse {

    private long id;
    private String title;
    private String pressName;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPressName() {
        return pressName;
    }


    public NewsRecentResponse(News news) {
        this.id = news.getId();
        this.title = news.getTitle();
        this.pressName = news.getPress().getName();

    }

    public NewsRecentResponse(long id, String title, String pressName) {
        this.id = id;
        this.title = title;
        this.pressName = pressName;
    }
}