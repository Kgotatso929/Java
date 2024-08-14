public class Printer{
	public static void main(String [] args){
		Display display = new Monitor();
		// Some code
		long pixelCount = display.pixelCount();
	}
}

class Display(){
	public void display(){
		System.out.println("Display.display()");
	}
}

class Monitor extends Display {
	public long pixelCount(){
		return 1024 * 768;
	}
}

