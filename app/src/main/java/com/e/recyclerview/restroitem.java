package com.e.recyclerview;

public class restroitem {
    private String name;
    private String price;
    private int image;

    public restroitem(String name, String price, int image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getPrice() {
        return price;
    }
}
