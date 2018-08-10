package com.rups.java.Comparator;

import java.util.Comparator;

public class YearComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2) {
		// TODO Auto-generated method stub
		if (m1.getYear() < m2.getYear()) {
			return -1;
		} else if (m1.getYear() > m2.getYear()) {
			return 1;
		} else {
			return 0;
		}

	}

}
