package com.rups.java.Comparator;

import java.util.Comparator;

public class MovieNameComparator implements Comparator<Movie>{

	@Override
	public int compare(Movie m1, Movie m2) {
		// TODO Auto-generated method stub
		return m1.getMovieName().compareTo(m2.getMovieName());
	}

}
