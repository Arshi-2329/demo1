class B
{
public static void main(){
System.out.println("Main method without argument called.");
}
public static void main(int X){
System.out.println("Main method with argument called"+X*2);
}
public static void main(String s){System.out.println("Welcome"+s);}
public static void main(String args[]){
System.out.println("Arshi is eating");
main();
main("sadhi");
main(20);
}
}



