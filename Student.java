package student;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
private ArrayList<Integer> listOfMarks=new ArrayList<Integer>();
String name;
public void getListOfMarks() {
	for (int mark:listOfMarks)
	System.out.println(mark);
}



public Student(int[] listOfMarks, String name) {
	super();
	for(int mark:listOfMarks)
	this.listOfMarks.add(mark);
	this.name = name;//
	
}



public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
      int noOfMarks()
      {int sum = 0;
	    for(int mark:listOfMarks)
	    	sum=sum+mark;
	    return sum;
      }
      int getMaxMark() {
    	  
    	  return Collections.max(listOfMarks);
      }
      int getMinMark() {
    	  
    	  return Collections.min(listOfMarks);
      }
    	  int avgMaxMark() {
    		  int sum = 0;
    		    for(int mark:listOfMarks)
    		    	sum=sum+mark;
    		    sum=sum/listOfMarks.size();
    		    return sum;
    	  }
    	  public void addNewMark(int mark) {
    		 listOfMarks.add(mark);  
    	  }
        		  
public String toString() {
	return name + listOfMarks;
}
//helloguys
//vinay pushed
}
//ihihi