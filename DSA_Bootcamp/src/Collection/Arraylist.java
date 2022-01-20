package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
  public static void main(String []args) {
	  ArrayList<Integer> list =new ArrayList<Integer>(); /* 1.allocate the memory in non-contigious.
      2.it can create only object list it means it store only objects.
      3. array list does not having fixed size it means it is variable in size.*/
list.add(12);           // Adding the element in array list.
list.add(20);
System.out.println(list);
list.get(1);           // get the element form the array list . you required to specify the index which you want form array list.
System.out.println(list.get(1));
ArrayList<String> name=new ArrayList<String>();

name.add("Akash");
System.out.println(name);

list.add(1, 800);      //adding the element at any index in array list.
System.out.println(list);

list.set(1, 700);      // set the element at any index... you overwrite the existing value at that index.
System.out.println(list);

list.remove(2);        // delete the element at any index number..
System.out.println(list);

int size= list.size();  // calculate the size of array list which returns the integer value.
System.out.println(size);

for(int i=0;i<list.size();i++) {
System.out.println(list.get(i));  //loop used for checking the number of elements in the list.
}

Collections.sort(list);   // collections is a class having the sort method which sorting the array list elements in ascending order.
System.out.println(list);

  }
}
