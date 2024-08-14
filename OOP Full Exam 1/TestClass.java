public class TestClass{
    public static void main(){
        new TestClass().sayHello(); 
     } //1
    public static void sayHello(){ 
        System.out.println("Static Hello World"); 
    }; 

    public void sayHello() {
        System.out.println("Hello World"); 
    }; //3
}