package com.example.appband;

import android.widget.Toast;

import java.util.Date;

public class Band {

    private String name;
    private String music;
    private Date dateRelease;
    private String style;

    public Band()
    {

    }

    public Band(String name, String music, Date dateRelease, String style)
    {
        this.name = name;
        this.music = music;
        this.dateRelease = dateRelease;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) { this.music = music; }

    public Date getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(Date dateRelease) {
        this.dateRelease = dateRelease;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
