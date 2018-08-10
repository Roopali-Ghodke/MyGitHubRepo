package com.rups.java.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class MovieComparable {

	public static void main(String[] args) {
		
		ArrayList<Movie> list = new ArrayList<>();
		list.add(new Movie("Bat-Man", 8.3, 2000));
		list.add(new Movie("Super-Man", 8.4, 2006));
		list.add(new Movie("Iron-Man", 9.3, 2003));
		list.add(new Movie("Ant-Man", 8.0, 1990));
		list.add(new Movie("Spider-Man", 7.3, 2015));
		list.add(new Movie("Wonder Women", 9.9, 2017));
		
		Collections.sort(list);
		
		System.out.println("After applying Comparable for sorting - ");
		
		for(Movie m : list){
			System.out.println("Movie Name - " + m.movieName + ", Rating - " + m.rating + ", Year - " + m.year);
		}
	}

}
