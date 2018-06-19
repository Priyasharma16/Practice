class Box
 {
int length;
int breadth;
Box(int l,int b)
 {
length =l;
breadth= b;
}
Box()
 {
length =0;
breadth=0;
}
Box(int side)
 {
length=side;
breadth=side;
}
int area()
 {
return length*breadth;
 }
}
class ConstructorDemo
 {
public static void main(String[] args)
 {
Box obj1=new Box(4,5);
Box obj2=new Box(4,4);
Box obj3=new Box();
Box obj4=new Box(5);
System.out.println("Area="+obj1.area());
System.out.println("Area="+obj2.area());
System.out.println("Area="+obj3.area());
System.out.println("Area="+obj4.area());
  }
}