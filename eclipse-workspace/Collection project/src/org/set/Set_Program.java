package org.set;

import java.util.*;

public class Set_Program {
	public static void main(String[] args) {
		
		//List = 10,20,30,90,10,10,40,50
		
		List<Integer> con_list=new ArrayList<Integer> ();
		con_list.add(10);
		con_list.add(20);
		con_list.add(30);
		con_list.add(90);
		con_list.add(10);
		con_list.add(10);
		con_list.add(40);
		con_list.add(50);
		
		System.out.println("List= "+con_list);
		
		Set<Integer> con_set=new LinkedHashSet<Integer>();
		
		con_set.addAll(con_list);
		
		System.out.println("Set= "+con_set);
		
		
		
		
		
		
		
		
		
		
	}

}
