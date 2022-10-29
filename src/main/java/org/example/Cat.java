package org.example;

public class Cat {
    private String name;
    private int weight;
    private String link;
    private String picture;

    public Cat(String name, int weight, String link, String picture) {
        this.name = name;
        this.weight = weight;
        this.link = link;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getLink() {
        return link;
    }

    public String getPicture() {
        return picture;
    }
}
