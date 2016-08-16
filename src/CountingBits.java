/**
 * Leetcode Problem 338
 * Given a non negative integer number num. For every numbers i in the range 0 <= i <= num calculate the number of 1's in their binary representation and return them as an array.
Example:
For num = 5 you should return [0,1,1,2,1,2].

Constraints:
    do it in linear time O(n) /possibly in a single pass?
    Space complexity should be O(n).
    Do it without using any builtin function like __builtin_popcount in c++ or in any other language.

 * @author wilso663
 *
 */
public class CountingBits 
{

	public static void main(String[] args)
	{
		int num = 5;
		int[] NumberArr = new int[num];
		NumberArr = countBits(num);
		for(int i = 0; i < num;i++)
			System.out.print(NumberArr[i] + " ");
	}
	//variable-precision SWAR algorithm
	public static int NumberOfSetBits(int i)
	{
		i = i - ((i >>> 1) & 0x55555555); //Shift bits right 1 bit, set all even bits to 0
	     i = (i & 0x33333333) + ((i >>> 2) & 0x33333333); //get bit count of lowest 4 bits
	     return (((i + (i >>> 4)) & 0x0F0F0F0F) * 0x01010101) >>> 24; //get bit count of each byte
	     															  //0x01010101 = (1 << 24) + (1 << 16) + (1 << 8) + 1: each byte
	     															  //highest byte contains sum of bit counts of all bytes
	     															  //>>> 24 : shift highest byte down to lowest
	}
	public static int[] countBits(int num) 
	{
        int[] nums = new int[num + 1];
        for(int i = 0; i < (num + 1); i++)
        	nums[i] = NumberOfSetBits(i);
        	
        return nums;
    }
}

