package br.com.clubelinkar.android.models;

/**
 * Created by Tushar Saha on 12/4/15.
 * Audacity IT Solutions Ltd.
 */
public class Methodology {
    private String title, body;
    private String imageId;

    public Methodology(String imageId, String title, String body) {
        this.title = title;
        this.body = body;
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getImageId() {
        return imageId;
    }
}
