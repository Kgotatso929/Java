public class Q5{
	public static void main(String [] args){
		long longValue = 100;
		byte b = (byte)(short)(int)longValue; //Narrowing
		System.out.println(b);

		byte byteValue = 100;
		long l = (long)(int)(short)byteValue;
		System.out.println(l);

		System.out.println(b + l);
	}
}