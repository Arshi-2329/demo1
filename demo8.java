
class A{
public void funA1(){
System.out.println("FunA1 called from classA");
}
public void funA2(){
System.out.println("FunA2 called from class A");
}
}
class B
{
public static void main(String args[]){
A ob=new A();
ob.funA1();
ob.funA2();
}
}