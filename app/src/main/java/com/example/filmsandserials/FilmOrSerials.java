package com.example.filmsandserials;

public class FilmOrSerials {
    private int id;
    private String title;
    private String type;
    private int duration;
    private String note;

    public FilmOrSerials() {
    }

    public FilmOrSerials(int id, String title, String type, int duration, String note) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.duration = duration;
        this.note = note;
    }

    // геттеры
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public int getDuration() {
        return duration;
    }

    public String getNote() {
        return note;
    }

    // сеттеры
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
