package com.codegym.model;

import javax.persistence.*;

@Entity
@Table (name = "review")
public class Review {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String authorName;
    private int score;
    private String feedback;

    public Review() {
    }

    public Review(int id, String authorName, int score, String feedback) {
        this.id = id;
        this.authorName = authorName;
        this.score = score;
        this.feedback = feedback;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
