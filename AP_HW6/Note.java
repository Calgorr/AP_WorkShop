package com.company;

import java.io.Serializable;

public class Note implements Serializable {
    private String nameOfNote;
    private String contentOfNote;
    private String dateOfNote;

    public Note(String nameOfNote, String contentOfNote, String dateOfNote) {
        this.nameOfNote = nameOfNote;
        this.contentOfNote = contentOfNote;
        this.dateOfNote = dateOfNote;
    }

    public String getNameOfNote() {
        return nameOfNote;
    }

    public void setNameOfNote(String nameOfNote) {
        this.nameOfNote = nameOfNote;
    }

    public String getContentOfNote() {
        return contentOfNote;
    }

    public void setContentOfNote(String contentOfNote) {
        this.contentOfNote = contentOfNote;
    }

    public String getDateOfNote() {
        return dateOfNote;
    }

    public void setDateOfNote(String dateOfNote) {
        this.dateOfNote = dateOfNote;
    }
}
