
public class PowerOfThree {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(PowerOfThree(-3));
		System.out.println(PowerOfThree(4));
		System.out.println(PowerOfThree(-243));
		System.out.println(PowerOfThree(729));
		
	}
	//Uses primitive signed integers.  Signed integer max value is 214783647 or 3^19 - 1
	public static boolean PowerOfThree(int n) //takes an signed int 3^19-1
	{
		//
		return n != 0 && 1162261467 % n == 0; //3^19  % n 
	}
}
