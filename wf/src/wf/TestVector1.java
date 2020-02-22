package wf;

import java.util.*;      
class TestVector1{      
 public static void main(String args[]){      
  Vector<String> v=new Vector<String>();//creating vector  
  v.add("umesh");//method of Collection  
  v.addElement("irfan");//method of Vector  
  v.addElement("kumar");  
  v.addElement(null);    // allows null
  v.addElement("kumar");
  v.addElement("irfan");
  v.addElement("irfan");
  //traversing elements using Enumeration  
  Enumeration e=v.elements();  
  while(e.hasMoreElements()){  
   System.out.println(e.nextElement());  
  }  
 }      
}      