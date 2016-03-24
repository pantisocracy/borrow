package com.borrow.entity;

public class Provider {
    private Integer id;

    private String providerName;

    private Integer type;

    private String outputApi;

    public Provider(Integer id, String providerName, Integer type, String outputApi) {
        this.id = id;
        this.providerName = providerName;
        this.type = type;
        this.outputApi = outputApi;
    }

    public Provider() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName == null ? null : providerName.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getOutputApi() {
        return outputApi;
    }

    public void setOutputApi(String outputApi) {
        this.outputApi = outputApi == null ? null : outputApi.trim();
    }
}