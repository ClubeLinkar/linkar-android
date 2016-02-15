package br.com.clubelinkar.android.models;

/**
 * Created by Tushar Saha on 12/2/15.
 * Audacity IT Solutions Ltd.
 */
public class BasicInfo {
    private String title, body;
    private String image;

    public BasicInfo(String imageId, String title, String body) {
        this.title = title;
        this.body = body;
        this.image = imageId;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getImageId() {
        return image;
    }
}
