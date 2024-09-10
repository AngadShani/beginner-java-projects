import java.util.ArrayList;

import java.util.Collections;
 // Compiler version JDK 11.0.2

class ArrayLists {
  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    
    //add elements
    
    list1.add(2);
    list1.add(3);
    list1.add(4);
    System.out.println(list1);
    
    //get elements
    
    int element = list1.get(1);
    System.out.println(element);
    
    // add element in between
    
    list1.add(1, 4);
    System.out.println(list1);
    
    //set element
    list1.set(0, 5);
    System.out.println(list1);
    
    //delete element
    list1.remove(3);
    System.out.println(list1);
    
    int size = list1.size();
    System.out.println(size);
    //loops
    
    for(int i=0; i<list1.size(); i++) {
      System.out.print(list1.get(i));
    }
    System.out.println();
    //sorting
    
    Collections.sort(list1);
    System.out.println(list1);
  }
}