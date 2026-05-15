package test;

import java.util.ArrayList;

public class ArrayLis {

	public static void main(String[] args) {
		//It is an re-sizable array from java.util package
		//ArrayList methods

		
		
		ArrayList<String> arrList = new ArrayList<>();
		
		//add() - add at end of an arraylist 
		arrList.add("yellow");
		arrList.add("red");
		System.out.println("add: "+ arrList);
		
		//add() - add the specific index
		arrList.add(1,"blue");
		System.out.println("add index: "+arrList);
		
		//get() - access an element, fetch values using index
		String value = arrList.get(2);
		System.out.println("get element: "+ value);
		
		//set() - update element, replace an element with new element
		arrList.set(1, "brown");
		System.out.println("set: "+ arrList);
		
		//remove() - deletes an element
		arrList.remove(2);
		System.out.println("delete: "+arrList);
		
		//remove by value
		arrList.remove("brown");
		System.out.println("remove by value: "+ arrList);
		
		//size() - get number of elements
		System.out.println("Size of array: "+arrList.size());
		
		//contains() - returns true or false, by checking the element in list
		System.out.println(arrList.contains("red"));
		
		//clear() - remove everything from an list
		arrList.clear();
		System.out.println("clear: "+arrList);
		
	}

}
