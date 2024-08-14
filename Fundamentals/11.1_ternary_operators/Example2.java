public class Exampl2{
	public static void main(String[]args){
		getStatus(200);
	}

	public  String getStatus(int statusCode){
		return (statusCode == 200) ? "OK" : "Error";
	}
}