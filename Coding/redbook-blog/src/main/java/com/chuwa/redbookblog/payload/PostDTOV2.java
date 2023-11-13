package com.chuwa.redbookblog.payload;

public class PostDTOV2 {
    private Long id;
    private String title;

    //we don't need this anymore.
    //private LocalDateTime createdDateTime;

    public PostDTOV2() {
    }

    public PostDTOV2(Long id, String title) {
        this.id = id;
        this.title = title;
    }
    public PostDTOV2(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}