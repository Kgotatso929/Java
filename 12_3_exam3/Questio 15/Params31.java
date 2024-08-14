public class Params31{
	public static void main(String [] args){
		Printer printer = new createPrinter("Peter");

		printer.print();

	}

	private static Printer createPrinter(final String name){
		return new Printer(){
			@Override
			public void print(){
				System.out.println("Hello: " + name.toString());
			}
		};
	}
}