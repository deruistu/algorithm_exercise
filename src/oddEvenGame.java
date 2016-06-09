import java.util.Vector;


class gameData
{
	private int startIndex;
	private int endIndex;
	
	public gameData(int startIndex, int endIndex)
	{
		this.startIndex = startIndex;
		this.endIndex = endIndex;
	}
	
	public int getStartIndex() {
		return startIndex;
	}
	
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	
	public int getEndIndex() {
		return endIndex;
	}
	
	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}
}

public class oddEvenGame {
	
	public String solution(int[] A)
	{
		String result="";
		Vector<gameData> evenArray = new Vector<gameData>();
		Vector<gameData> oddArray = new Vector<gameData>();
		int startEven = -1;
		int endEven = -1;
		int startOdd = -1;
		int endOdd = -1;
		
		int lastEven = 0;
		int lastOdd = 0;
		
		int[] B = new int[A.length];
		
		B = A;
		for(int i = 0; i< A.length; i++)
		{
			if(A[i]==-1)
			{
				continue;
			}
			
			if(A[i]%2==0) //even
			{
				//judge whether we should store the number.
				if(lastOdd==1)
				{
					gameData oddValue = new gameData(startOdd, endOdd);
					oddArray.add(oddValue);
				}
				
				//process the even data.
				if(lastEven == 0)
				{
					lastEven = 1;
					startEven = i;
					endEven = i;
					
					lastOdd = 0;
				}
				else
				{
					endEven = i;
				}
				
				A[i] = -1;
			}
			else // odd
			{
				if(lastEven == 1)
				{
					gameData evenValue = new gameData(startEven, endEven);
					evenArray.add(evenValue);
				}
				
				//process odd data
				if(lastOdd == 0)
				{
					startOdd = i;
					endOdd = i;
					lastOdd = 1;
					
					lastEven = 0;
				}
				else
				{
					endOdd = i;
				}
			}
		}
		
		int even_num = 0; //how many even? 
		int odd_num = 0;  // how many odd?
		
		for(gameData tmp : evenArray)
		{
			even_num++;
		}
		
		for(gameData tmp : oddArray)
		{
			int num;
			
			num = (tmp.getEndIndex()-tmp.getStartIndex()) + 1;
			
			if(num%2 == 0)
			{
				even_num++;
			}
			else if(num>=2)
			{
				even_num++;
			}
		}
		
		if(even_num%2==0)
		{
			result="NO SOLUTION";
		}
		else
		{
			result=evenArray.get(0).getStartIndex()+","+evenArray.get(0).getEndIndex();
		}
		
		return result;
	}
	
	public static void main(String[] argv)
	{
		int[] A = new int[100000];
		
		for(int i =0; i < A.length; i++)
		{
			System.out.println(A[i]);
		}
	}
	

}
