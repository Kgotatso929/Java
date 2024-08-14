public class Constructor3 {
        public Constructor3(){
            this();
            System.out.println("Running no-args constructor");
    }
    
    public Constructor3(String name){
   	    System.out.println("Running name arg constructor: Name = "+name);
    }
}
