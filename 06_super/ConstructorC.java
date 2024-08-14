public class ConstructorC extends ConstructorB{
    public ConstructorC(String name){
   	 super(name,"Smith");
   	 System.out.println("Class C:"+name);
    }  

    public ConstructorC() {
        this("Kgotatso, Petlele") // Pass default name to the parameterized constructor.
    }
}
