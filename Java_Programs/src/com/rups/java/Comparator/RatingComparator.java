package com.rups.java.Comparator;

import java.util.Comparator;

public class RatingComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2) {
		// TODO Auto-generated method stub
		if (m1.getRating() < m2.getRating()) {
			return -1;
		} else if (m1.getRating() > m2.getRating()) {
			return 1;
		} else {
			return 0;
		}

	}

}
