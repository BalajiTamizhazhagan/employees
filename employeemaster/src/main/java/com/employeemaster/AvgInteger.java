package com.employeemaster;

import java.util.Arrays;
import java.util.List;

public class AvgInteger {

	public static void main(String[] args) {
		double ldblAvgValue=0;
		List<Integer> li=Arrays.asList(100,150,80,2000,5000,101);
		ldblAvgValue=li.stream().mapToInt(n->n).summaryStatistics().getAverage();
		System.out.println("Average of "+ li + " is "+ ldblAvgValue);
	}

}
