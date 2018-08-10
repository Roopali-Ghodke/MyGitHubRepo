package com.rups.java.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Movie> arrayList = new ArrayList<>();
		arrayList.add(new Movie("Titanic", 1995, 9.0));
		arrayList.add(new Movie("BatMan", 2000, 8.3));
		arrayList.add(new Movie("X-Men", 2012, 7.0));
		arrayList.add(new Movie("KingKong", 2014, 8.0));
		arrayList.add(new Movie("XYZ", 1960, 5.0));
		
		System.out.println("Sorting Based on Movie Name -");
		MovieNameComparator movieNameComparator = new MovieNameComparator();
		Collections.sort(arrayList, movieNameComparator);
		for(Movie movie : arrayList){
			
			System.out.print("Movie Name - " + movie.getMovieName());
			System.out.print(", Year - " + movie.getYear());
			System.out.print(", Rating - " + movie.getRating());
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Sorting Based on year -");
		YearComparator yearComparator = new YearComparator();
		Collections.sort(arrayList, yearComparator);
		for(Movie movie : arrayList){
			
			System.out.print("Movie Name - " + movie.getMovieName());
			System.out.print(", Year - " + movie.getYear());
			System.out.print(", Rating - " + movie.getRating());
			System.out.println();
		}
		System.out.println();
		System.out.println("Sorting Based on Rating -");
		RatingComparator ratingComparator = new RatingComparator();
		Collections.sort(arrayList, ratingComparator);
		for(Movie movie : arrayList){
			
			System.out.print("Movie Name - " + movie.getMovieName());
			System.out.print(", Year - " + movie.getYear());
			System.out.print(", Rating - " + movie.getRating());
			System.out.println();
		}
		
	}

}
