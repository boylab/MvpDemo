package com.boylab.mvpdemo.bean;

public class Goods {

    private int image;
    private String name;
    private int star;

    public Goods(int image, String name, int star) {
        this.image = image;
        this.name = name;
        this.star = star;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "image=" + image +
                ", name='" + name + '\'' +
                ", star=" + star +
                '}';
    }
}
