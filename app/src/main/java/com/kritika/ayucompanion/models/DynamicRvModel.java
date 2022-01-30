package com.kritika.ayucompanion.models;

public class DynamicRvModel {
    int image;
    String name;
    public DynamicRvModel(int image,String name){
        this.name=name;
        this.image=image;
    }
    public int getImage(){return image;}
    public String getName() {
        return name;
    }
}
