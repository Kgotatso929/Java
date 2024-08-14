public class A3 extends A2{
    public void m1(0){
        System.out.println("Yello");
    }
    public void m2(){
        System.out.println("Pink");
    }
    public void m3(){
        System.out.println("Red");
    }
    public static void main(String [] args){
        A2 tp = new A3();
        tp.m1();
        tp.m2();
        tp.m3();
    }
}