import java.util.Vector;

public class FibonacciSeq {

	public static int solution(int N) {
		int least_six;
		int head_num = 0;
		int tail_num = 1;

		// long[] F = new long[N+1];
		

		Vector<Long> F = new Vector<Long>();

		F.add(new Long(0));
		F.add(new Long(1));
		
		if(N<=1)
		{
			return N;
		}
		
		for (int i = 2; i <= N; i++) {
			F.add(new Long(F.get(i - 1) + F.get(i - 2)));
		}

		String value = (new Long(F.get(N) % 1000000)).toString();
		least_six = Integer.parseInt(value);
		//System.out.println(F.get(N));
		//System.out.println(least_six);
		
		return least_six;
	}

	public static int solution2(int N) {
		int least_six = 0;
		int head_num = 0;
		int tail_num = 1;
		long[] F = new long[N + 1];
		F[0] = 0;
		F[1] = 1;
		for (int i = 2; i <= N; i++) {
			F[i] = F[i - 1] + F[i - 2];
		}
		least_six = (int) F[N] % 1000000;
		
		System.out.println(F[N]);
		
		return least_six;
	}
	
	public static int solution3(int N)
	{
		int least_six = 0;
		
		Vector<Integer> F = new Vector<Integer>();
		
		F.add(0);
		F.add(1);
		
		if(N<=1)
		{
			return N;
		}
		
		for(int i=2;i<=N;i++)
		{
			F.add((F.get(i-1)%1000000)+(F.get(i-2)%1000000));
		}
		
		least_six = F.get(N);
		System.out.println(least_six);
		return least_six;
	}

	public static void main(String[] argc) {
		FibonacciSeq.solution3(90);
	}

}
