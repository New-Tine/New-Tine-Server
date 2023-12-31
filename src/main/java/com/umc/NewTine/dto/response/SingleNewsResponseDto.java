package com.umc.NewTine.dto.response;

import lombok.*;

import java.util.List;


@Data
@ToString
@Getter
@Setter
@Builder
public class SingleNewsResponseDto {
    private String title;
    private String content;
    private String createdAt;
    private String pressName;
    private String pressImage;
    private int pressSubscriber;
    private boolean subscribed;
    private boolean scrapped;
    private String category;
    private List<String> successMission;
    private String newsImg;
    private Long newsId;

    public SingleNewsResponseDto(String title, String content, String createdAt, String pressName,
                                 String pressImage, int pressSubscriber, boolean subscribed, boolean scrapped, String category,
                                 List<String> successMission, String newsImg, Long newsId) {
        this.title=title;
        this.content=content;
        this.createdAt=createdAt;
        this.pressName=pressName;
        this.pressImage=pressImage;
        this.pressSubscriber=pressSubscriber;
        this.subscribed=subscribed;
        this.scrapped=scrapped;
        this.category=category;
        this.successMission = successMission;
        this.newsImg = newsImg;
        this.newsId = newsId;
    }
}
