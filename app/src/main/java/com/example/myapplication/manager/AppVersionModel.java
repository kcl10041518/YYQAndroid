package com.example.myapplication.manager;

import java.util.List;

public class AppVersionModel {


    /**
     * size : 14MB
     * functions : ["1.山\n2.2\n3.4"]
     * latestVersion : 6.0.4
     * must : -1
     * url : 123
     */

    private String size;
    private String latestVersion;
    private int must;
    private String url;
    private List<String> functions;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public int getMust() {
        return must;
    }

    public void setMust(int must) {
        this.must = must;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getFunctions() {
        return functions;
    }

    public void setFunctions(List<String> functions) {
        this.functions = functions;
    }
}
