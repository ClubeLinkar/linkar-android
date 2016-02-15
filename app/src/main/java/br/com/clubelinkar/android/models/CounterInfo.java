package br.com.clubelinkar.android.models;

/**
 * Created by Tushar Saha on 12/14/15.
 * Audacity IT Solutions Ltd.
 */
public class CounterInfo {

    private String number;
    private String text;

    public CounterInfo(String number, String text) {
        this.number = number;
        this.text = text;
    }

    public String getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }
}
