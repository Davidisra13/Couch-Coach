package com.example.myapplication.ui.MoviePeople;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class MoviePeopleObj {
    protected int personID;
    protected String name;
    protected String position;
    protected String featuredMovies;

    public MoviePeopleObj(int personID, String name, String position, String featuredMovies) {
        this.personID = personID;
        this.name = name;
        this.position = position;
        this.featuredMovies = featuredMovies;
    }

    public void setpersonID(int personID) {
        this.personID = personID;
    }

    public int getpersonID() {
        return this.personID;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return this.name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getposition() {
        return this.position;
    }

    public void setfeaturedMovies(String featuredMovies) {
        this.featuredMovies = featuredMovies;
    }

    public String getfeaturedMovies() {
        return this.featuredMovies;
    }
}
