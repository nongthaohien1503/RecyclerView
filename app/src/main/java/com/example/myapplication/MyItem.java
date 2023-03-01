package com.example.myapplication;

public class MyItem {
    private int imageResource;
    private String name;

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    public MyItem(int imageResource, String name, String description) {
        this.imageResource = imageResource;
        this.name = name;
        this.description = description;
    }
}
