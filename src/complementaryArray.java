
class dataType
{
	private int P;
	private int Q;
	
	public int getP() {
		return P;
	}
	public void setP(int p) {
		P = p;
	}
	public int getQ() {
		return Q;
	}
	public void setQ(int q) {
		Q = q;
	}
	
}
public class complementaryArray {

	public static int solution(int K, int[] A )
	{
 		int num_complementary=0;
		
		if(A.length<2)
		{
			return 0;
		}
		
		
		for(int i = 0; i<A.length; i++)
		{
			for(int j = i; j<A.length; j++)
			{
				if(A[i]+A[j] == K)
				{
					num_complementary ++;
					if(i!=j)
					{
						num_complementary ++;
					}
				}
			}
		}
		
		return num_complementary;
		
	}
	
	public static void main(String[] argv)
	{
		int[] B = {1, 2147483645, 2, 2147483647, -2, -4, 5, 1, 2147483647};
		int out = complementaryArray.solution(2147483647, B);
		System.out.println(out);
	}
	

}
