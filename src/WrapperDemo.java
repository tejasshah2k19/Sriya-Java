
public class WrapperDemo {
	public static void main(String[] args) {

		// 1)
		int a = 100;
		Integer i = Integer.valueOf(a); // primitive a is converted and store into
		// non primitive i
		int k = i.intValue();// extracting int value or converting non primitive i
		// into primitive k

		// from java 5 we don't need to do above stuff ,
		// we have autoboxing

		int y = 90;
		Integer x = y;
		int z = x;
	}
}

//wrapper class is used to convert primitive into non primitive and 
//non primitive into primitive. 

//we have eight wrapper class in java 

//byte : Byte 
//short : Short 
//char: Character 
//int : Integer 
//long : Long 
//float : Float 
//double : Double 
//boolean : Boolean 