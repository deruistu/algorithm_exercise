import java.util.HashSet;


public class pawnJump {
	
	public int solution(int[] A)
	{
		int jump_next = 0;
		HashSet<Integer> jump_index = new HashSet<Integer>();
		int jump_count=0;
		
		//jump_index.add(A[0]);
		
		while(jump_next< A.length)
		{
			jump_count++;
			
			jump_next = A[jump_next] + jump_next;
			
			if(jump_next<0)
			{
				return -1;
			}
			
			int jump_num = jump_next;
			
			if(!jump_index.contains(jump_num))
			{
				jump_index.add(jump_num);
			}
			else
			{
				return -1;
			}
		}
		return jump_count;
	}

}
