import java.util.*;
import java.io.*;

public class equalibilityArray {
	
	int solution(int A[])
	{
		long sum=0;
		int eqb_Index=0;
		long left_sum=0;
		long right_sum=0;
		int N = A.length;
		
		for (int i = 0; i<N;i++)
		{
			sum += A[i];
		}

		long temp_sum= sum;
		
		for(int i = 0 ; i<N; i++)
		{
			temp_sum = temp_sum - A[i];
			
			
			
			if(i == 0)
			{
				left_sum = 0;
				right_sum = sum-A[i];
			}
			else if(i == N-1)
			{
				left_sum = sum - A[i];
				right_sum = 0;
			}
			else
			{
				left_sum += A[i-1];
				right_sum = temp_sum;
			}
			
			if(left_sum == right_sum)
			{
				return i;
			}
		
		}
		return -1;
	}
	public static void main(String[] argv){
		
	System.out.println("hello world");
	}

}
