package com.strategy.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class GenricMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Method mt=new Method();
		List<Integer> ls=new ArrayList<>();
		List<Float> ls1=new ArrayList<Float>();
		mt.print(ls, ls1);
		

	}

}
