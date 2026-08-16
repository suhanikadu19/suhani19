 class A{
    static{
        System.out.println("Third");
    }
 }
 class B extends A{
    static{
        System.out.println("Second");
    }
 }
 class C extends B{
    static{
        System.out.println("First");

    }

 }
 public class Main_5{
    public static void main(String[] args){
        C c = new C();
    }
 }
    

