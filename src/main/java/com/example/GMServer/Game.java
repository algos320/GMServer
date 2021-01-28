package com.example.GMServer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Game {
    @SerializedName("steam_id")
    @Expose
    private String steam_id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("headerImage")
    @Expose
    private String headerImage;
    @SerializedName("price")
    @Expose
    private String price;

    public String getSteam_id() {
        return steam_id;
    }

    public void setSteam_id(String steam_id) {
        this.steam_id = steam_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeaderImage() {
        return headerImage;
    }

    public void setHeaderImage(String headerImage) {
        this.headerImage = headerImage;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
