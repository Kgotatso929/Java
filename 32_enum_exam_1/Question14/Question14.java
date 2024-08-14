public enum Switch{
	ON,
	OFF;
}

if(s == Switch.OFF){
	System.out.println("It is off!");
}

if(s.equals(Switch.OFF)){
	System.out.println("It is off!");
}

switch(s){
case OFF: System.out.println("it is off");
	break;
}