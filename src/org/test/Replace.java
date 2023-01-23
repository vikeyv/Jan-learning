package org.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Replace {

	public static void main(String[] args) {
		int i = 1578;
		int rev=0;
		while(i>0)
		{
		int rem = i%10;
		rev=rev*10+rem;
		i=i/10;
		}
		System.out.println(rev);
	
		
		

	}

}
