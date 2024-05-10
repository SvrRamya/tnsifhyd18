//Java Hierarchical Inheritance Program Example –2


package com.si.inheritance;

class p
{
   public void methodA()
   {
     System.out.println("Super class method");
   }
}
class q extends p
{
   public void methodB()
   {
     System.out.println("Sub class Method B");
   }
}
class R extends p
{
   public void methodC()
   {
     System.out.println("Sub class Method C");
   }
   public static void main(String args[])
   {
     p obj1 = new p();
     q obj2 = new q();
     R obj3 = new R();
     obj1.methodA(); //calling super class method
     obj2.methodA(); //calling A method from subclass object
     obj3.methodA(); //calling A method from subclass object
  }
}
