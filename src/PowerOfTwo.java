
public class PowerOfTwo {

	public static void main(String[] args) {
		System.out.println(IsPowerOfTwo(2));
		System.out.println(IsPowerOfTwo(3));
		System.out.println(IsPowerOfTwo(8));
		System.out.println(IsPowerOfTwo(536870912)); //2^29
	}
	
	
	/**
	 * Function determines if a signed integer is a power of two up to 2^30
	 * @param number, a given integer to test
	 * @return the boolean state of IsPowerOfTwo
	 */
	public static boolean IsPowerOfTwo(int aNum){
		return aNum != 0 && (1073741824 % aNum == 0);
	}
}
