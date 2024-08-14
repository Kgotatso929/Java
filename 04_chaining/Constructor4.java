public class Constructor4 {
        public Constructor4(){
              this("Your name");
              this("Your surname");
            System.out.println("Running no-args constructor");
    }
    
    public Constructor4(String name, String surname){
   	    System.out.println("Running name arg constructor: Name = " + name);
        System.out.println("Running surname arg constructor: Surname = " + surname);
    }
}
