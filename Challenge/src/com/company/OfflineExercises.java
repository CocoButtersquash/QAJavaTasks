package com.company;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original,
	// there are two chars.

	// doubleChar("The") → "TThhee"
	// doubleChar("AAbb") → "AAAAbbbb"
	// doubleChar("Hi-There") → "HHii--TThheerree"

	public String doubleChar(String input) {
		char[] doubles = input.toCharArray();
		String output = "";
		for(char i: doubles){
			output = output + i + i;


		}


		return output;
	}
	//
	// A sandwich is two pieces of bread with something in between. Return the
	// string that is between the first and last appearance of "bread" in the
	// given string, or return the empty string "" if there are not two pieces
	// of bread.

	// getSandwich("breadjambread") → "jam"
	// getSandwich("xxbreadjambreadyy") → "jam"
	// getSandwich("xxbreadyy") → ""

	public String getSandwich(String input) {
		String er = "";
		String[] r;
		r = input.split("bread");
		for(String i: r){
			er += i;
		}






			return er;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false

	public boolean evenlySpaced(int a, int b, int c) {

		int big = 0, small = 0, med = 0;
		if (a > b && a > c) {
			big = a;
			if (b > c) {
				 med = b;
				small = c;
			} else {
				 med = c;
				 small = b;

			}
		} else if (b > a && b > c) {
			big = b;
			if (a > c) {
				med = a;
				small = c;

			} else {
				med = c;
				small = a;

			}
		} else if (c > a && c > b) {
			big = c;
			if (a > b) {
				med = a;
				small = b;

			} else {
				med = b;
				small = a;
			}
		}

		if ((big - med) == (med - small)) {

			return true;
		} else {
			return false;
		}
	}

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String input, int a) {
		String output = "";
		output = input.substring(0,a) + input.subSequence(input.length() -
				a,input.length());
		return output;
	}

	// Given a string, return true if it ends in "ly".

	// endsLy("oddly") → true
	// endsLy("y") → false
	// endsLy("oddy") → false

	public boolean endsly(String input) {
		try {
			if (input.charAt(input.length() - 2) == 'l' && input.charAt(input.length() - 1) == 'y') {
				return true;
			} else {
				return false;

			}
		} catch (Exception e) {
			return false;
		}

	}

	// Given a string, return recursively a "cleaned" string where adjacent
	// chars that are the same have been reduced to a single char. So "yyzzza"
	// yields "yza".

	// stringClean("yyzzza") → "yza"
	// stringClean("abbbcdd") → "abcd"
	// stringClean("Hello") → "Helo"
	public String stringClean(String input) {

		char[] toBeCleaned = input.toCharArray();
		List<String > next = new ArrayList<>();
		String actual = "";

		for(int i = 0; i < input.length(); i++){
			if(!next.contains(Character.toString(toBeCleaned[i]))){
			next.add(Character.toString(toBeCleaned[i]));
			}
		}
		for(String i: next){

			actual += i;
		}
		return actual;
	}

	// The fibonacci sequence is a famous bit of mathematics, and it happens to
	// have a recursive definition. The first two values in the sequence are 0
	// and 1 (essentially 2 base cases). Each subsequent value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the nth
	// fibonacci number, with n=0 representing the start of the sequence.

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 1

	public int fibonacci(int input) {
		return -1;
	}

	// We have a number of bunnies and each bunny has two big floppy ears. We
	// want to compute the total number of ears across all the bunnies
	// recursively (without loops or multiplication).
	//
	// bunnyEars(0) → 0
	// bunnyEars(1) → 2
	// bunnyEars(2) → 4

	public int bunnyEars(int input) {
		bunnyEars(input - 1);
		return input * 2;
	}

}
