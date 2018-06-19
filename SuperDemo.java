class A
 {
A(String msg)
 {
System.out.println("I am parent's constructor"+msg);
 }
void display()
 {
System.out.println("I m display");
  }
}
class B extends A 
{
B()
 {
super("Hello");
System.out.println("I m child's constructor");
 }
void fun()
{
 System.out.println("I m fun");
 }
}
class SuperDemo 
 {
public static void main(String[] args)
 {
B obj= new B();
obj.fun();
obj.display();
 }
}