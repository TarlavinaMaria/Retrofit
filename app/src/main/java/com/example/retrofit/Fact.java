package com.example.retrofit;

// Класс Fact - модель для хранения данных о факте
public class Fact {
    private String id; // Уникальный идентификатор
    private String text; // Текст
    private String source; // Источник
    private String source_url; // Ссылка на источник
    private String language; // Язык, либо английский или немецкий
    private String permalink; // Постоянная ссылка

    // Геттеры и сеттеры
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource_url() {
        return source_url;
    }

    public void setSource_url(String source_url) {
        this.source_url = source_url;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }
}
