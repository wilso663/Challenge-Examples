
public class OneLineReverseStr 
{

	public static void main(String[] args) 
	{
		
		String str = "herpderp";
		System.out.println(reverseString(str));
		

	}
	public static String reverseString(String aStr)
	{
		return (aStr.length() == 0 || aStr.length() == 1) ? aStr: reverseString(aStr.substring(aStr.length()-1, aStr.length())) + reverseString(aStr.substring(0,aStr.length()-1));
	}
	
}
