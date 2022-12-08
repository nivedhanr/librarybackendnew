package com.example.librarybackendspringboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="library")
public class Library {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String image;
    private String author;
    private String description;
    private String language;
    private String distributor;
    private String releasedyear;
    private String price;

    public Library() {
    }

    public Library(int id, String title, String image, String author, String description, String language, String distributor, String releasedyear, String price) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.author = author;
        this.description = description;
        this.language = language;
        this.distributor = distributor;
        this.releasedyear = releasedyear;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getReleasedyear() {
        return releasedyear;
    }

    public void setReleasedyear(String releasedyear) {
        this.releasedyear = releasedyear;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
