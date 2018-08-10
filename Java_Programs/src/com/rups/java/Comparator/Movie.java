package com.rups.java.Comparator;

public class Movie {

	private String movieName;
	private int year;
	private double rating;

	public Movie(String movieName, int year, double rating) {
		super();
		this.movieName = movieName;
		this.year = year;
		this.rating = rating;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

}
