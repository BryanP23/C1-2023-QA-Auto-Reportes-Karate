package com.sofkau.utils;

public enum ReqresResources {
    DUMMYJSON_BASE_URL("https://dummyjson.com/"),
    DUMMYJSON_PUT_RESOURCE("users/");

    private final String value;

    ReqresResources(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
