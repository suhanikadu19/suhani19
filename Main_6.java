 class A{
    public A(){
        System.out.println("Class A Construtor");
    }
    
} 
class B extends A{
    public B(){
        System.out.println("Class B constructor");
    }
}
class C extends B{
    public C(){
        System.out.println("Class C construtor");

    }
}
    public class Main_6{
        public static void main(String[] args){
            C c = new C();
        }
    }

