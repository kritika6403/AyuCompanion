package com.kritika.ayucompanion.models;

public class YogaRvModel {
    int image;
    String name;
    public YogaRvModel(int image,String name){
        this.name=name;
        this.image=image;
    }
    public int getImage(){return image;}
    public String getName() {
        return name;
    }
}
