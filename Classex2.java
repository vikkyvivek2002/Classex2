class Classex2
{ 
int x;
void Fun1() 
{
System.out.println("This is method");
}
void Fun2(int k) 
{ x=k;
System.out.println(k);
System.out.println(x);
}
public static void main(String[] args)
{ Classex2 obj=new Classex2();
obj.x=10;
System.out.println(obj.x);
obj.Fun1();
obj.Fun2(500);
}
}