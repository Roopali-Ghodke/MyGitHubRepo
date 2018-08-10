package com.rups.java.Comparable;

public class Movie implements Comparable<Movie> {

	public String movieName;
	public double rating;
	public int year;

	public Movie(String movieName, double rating, int year) {
		super();
		this.movieName = movieName;
		this.rating = rating;
		this.year = year;
	}

	public String getMovieName() {
		return movieName;
	}

	public double getRating() {
		return rating;
	}

	public int getYear() {
		return year;
	}

	@Override
	public int compareTo(Movie m) {
		return this.year - m.year;
	}

}
