/*
 * Write a function that takes an unsigned integer and returns the 
 * number of ��1' bits it has (also known as the Hamming weight).

 * For example, the 32-bit integer ��11' has binary representation 
 * 00000000000000000000000000001011, so the function should return 3.
 */

public class NumberOfOneBits {

    public int hammingWeight(int n) {
        if (n == 0 || n == 1)
            return n;
        return 1 + hammingWeight(n - (int) Math.pow(2, (int) (Math.log(n) / Math.log(2))));
    }

}
