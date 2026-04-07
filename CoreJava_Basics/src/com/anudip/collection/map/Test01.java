package com.anudip.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Test01 {


	public static void main(String[] args) {

		//what is map
		//key and value data store

		//Map<key, value>   unique -> set  dupliacste -> list
		//HashMap
		//LinkedHashMap
		//TreeMap

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("name", "raja");
		hm.put("licen id", "ABAGG6786787");
		hm.put("Aadhar ID", "86788879909");
		System.out.println(hm);



		for(Entry<String, String> h :  hm.entrySet()) {

			System.out.println(h.getKey()+ "   "  +h.getValue());
		}



		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("name", "raja");
		lhm.put("licen id", "ABAGG6786787");
		lhm.put("Aadhar ID", "86788879909");
		System.out.println(lhm);


		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(5, "raja");
		tm.put(6, "ABAGG6786787");
		tm.put(1, "86788879909");
		System.out.println(tm);







		//Iterator and ListIterator
		//hasNext()
		//next()
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		ArrayList<String> list = new ArrayList<>();

		// Adding elements
		list.add("Raja");
		list.add("Amit");
		list.add("Neha");

		// Printing elements
		System.out.println(list);

		//for loop
		//for each loop
		
		System.out.println("-------------using ietrator------------");
		Iterator<String> iterator = list.iterator();

		while(iterator.hasNext()) {
			System.out.println(iterator.next());  //E -> generics
		}

		System.out.println("-------------using Listietrator------------");
		ListIterator<String> listIterator = list.listIterator();

		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());  //E -> generics
		}
		
		
		//iteratoor -> list set and map
		//ListIter -> list
		
		
		
	}
}
