package com.sunrise.auth.entity;

public class Function {
    private Long id;

    private String name;

    private Long parentId;

    private String url;

    private Integer serialNum;

    private Integer accordion;

    public Function(Long id, String name, Long parentId, String url, Integer serialNum, Integer accordion) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.url = url;
        this.serialNum = serialNum;
        this.accordion = accordion;
    }

    public Function() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Integer serialNum) {
        this.serialNum = serialNum;
    }

    public Integer getAccordion() {
        return accordion;
    }

    public void setAccordion(Integer accordion) {
        this.accordion = accordion;
    }
}