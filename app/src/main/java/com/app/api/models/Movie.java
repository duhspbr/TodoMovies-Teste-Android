package com.app.api.models;

import java.util.ArrayList;

public class Movie {
    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public Object getBelongs_to_collection() {
        return belongs_to_collection;
    }

    public void setBelongs_to_collection(Object belongs_to_collection) {
        this.belongs_to_collection = belongs_to_collection;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public ArrayList<Genre> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<Genre> genres) {
        this.genres = genres;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImdb_id() {
        return imdb_id;
    }

    public void setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Number getPopularity() {
        return popularity;
    }

    public void setPopularity(Number popularity) {
        this.popularity = popularity;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public ArrayList<Production_Companies> getProduction_companies() {
        return production_companies;
    }

    public void setProduction_companies(ArrayList<Production_Companies> production_companies) {
        this.production_companies = production_companies;
    }

    public ArrayList<Production_Countries> getProduction_countries() {
        return production_countries;
    }

    public void setProduction_countries(ArrayList<Production_Countries> production_countries) {
        this.production_countries = production_countries;
    }

    public ArrayList<Spoken_Languages> getSpoken_languages() {
        return spoken_languages;
    }

    public void setSpoken_languages(ArrayList<Spoken_Languages> spoken_languages) {
        this.spoken_languages = spoken_languages;
    }

    private boolean adult;
    private String backdrop_path;
    private Object belongs_to_collection;
    private int budget;
    private ArrayList<Genre> genres;
    private String homepage;
    private int id;
    private String imdb_id;
    private String original_language;
    private String original_title;
    private String overview;
    private Number popularity;
    private String poster_path;
    private ArrayList<Production_Companies> production_companies;
    private ArrayList<Production_Countries> production_countries;
    private ArrayList<Spoken_Languages> spoken_languages;
}
