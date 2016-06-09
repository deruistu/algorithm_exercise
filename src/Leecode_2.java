public class Leecode_2 {
	public int judgeOverlap(int A, int B, int C, int D)
	{
		if(A<C&&B>C)
		{
			if(D<=B)
			{
				return 1;
			}
			return 2;
		}
		else if (A>=C&&A<D)
		{
			if(B<=D)
			{
				return 3;
			}
			return 4;	
		}else{
			return 0;
		}
	}
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    	//judge whether there is a overlap area.
    	int containX;
    	int containY;
    	int overlapArea=0;
    	int occupiedArea=0;
    	containX=judgeOverlap(A,C,E,G);
    	containY=judgeOverlap(B,D,F,H);
    	if(containX!=0&&containY!=0) // there is overlap area
    	{
    		if(containX==1&&F<=B)
    		{
    			if(H<=D)
    			{
    				overlapArea=(G-E)*(H-B);
    				occupiedArea=(C-A)*(D-B)+(G-E)*(H-F)-overlapArea;
    				return occupiedArea;
    			}
    			else{
    				overlapArea=(G-E)*(D-B);
    				occupiedArea=(C-A)*(D-B)+(G-E)*(H-F)-overlapArea;
    				return occupiedArea;
    			}
    		}
    		else if(containX==1&&F>B){
    			if(H<=D)
    			{
    				occupiedArea=(C-A)*(D-B); //contained
    				return occupiedArea;
    			}
    			else{
    				overlapArea=(G-E)*(D-F);
    				occupiedArea=(C-A)*(D-B)+(G-E)*(H-F)-overlapArea;
    				return occupiedArea;
    			}
    		}
    		else if(containX==2&&F<=B)
    		{
    			if(H<=D)
    			{
    				overlapArea=(C-E)*(H-B);
    				occupiedArea=(C-A)*(D-B)+(G-E)*(H-F)-overlapArea;
    				return occupiedArea;
    			}
    			else{
    				overlapArea=(C-E)*(D-B);
    				occupiedArea=(C-A)*(D-B)+(G-E)*(H-F)-overlapArea;
    				return occupiedArea;
    			}
    		}
    		else if(containX==2&&F>B)
    		{
    			if(H<=D)
    			{
    				overlapArea=(C-E)*(H-F);
    				occupiedArea=(C-A)*(D-B)+(G-E)*(H-F)-overlapArea;
    				return occupiedArea;
    			}
    			else
    			{
    				overlapArea=(C-E)*(D-F);
    				occupiedArea=(C-A)*(D-B)+(G-E)*(H-F)-overlapArea;
    				return occupiedArea;
    			}
    		}
    		else if(containX==3&&B<=F)
    		{
    			if(D<=H)
    			{
    				overlapArea=(C-A)*(D-F);
    				occupiedArea=(C-A)*(D-B)+(G-E)*(H-F)-overlapArea;
    				return occupiedArea;
    			}
    			else{
    				overlapArea=(C-A)*(H-F);
    				occupiedArea=(C-A)*(D-B)+(G-E)*(H-F)-overlapArea;
    				return occupiedArea;
    			}
    		}
    		else if(containX==3&&B>F)
    		{
    			if(D<=H)
    			{
    				occupiedArea=(G-E)*(H-F);
    				return occupiedArea;
    			}
    			else
    			{
    				overlapArea=(C-A)*(H-B);
    				occupiedArea=(C-A)*(D-B)+(G-E)*(H-F)-overlapArea;
    				return occupiedArea;
    			}
    		}
    		else if(containX==4&&F<B)
    		{
    			if(H<=D)
    			{
    				overlapArea=(G-A)*(H-B);
    				occupiedArea=(C-A)*(D-B)+(G-E)*(H-F)-overlapArea;
    				return occupiedArea;
    			}
    			else
    			{
    				overlapArea=(G-A)*(D-B);
    				occupiedArea=(C-A)*(D-B)+(G-E)*(H-F)-overlapArea;
    				return occupiedArea;
    			}
    		}
    		else if(containX==4&&F>=B)
    		{
    			if(H<=D)
    			{
    				overlapArea=(G-A)*(H-F);
    				occupiedArea=(C-A)*(D-B)+(G-E)*(H-F)-overlapArea;
    				return occupiedArea;
    			}
    			else{
    				overlapArea=(G-A)*(D-F);
    				occupiedArea=(C-A)*(D-B)+(G-E)*(H-F)-overlapArea;
    				return occupiedArea;
    			}
    		}
    		else{
    			return -1;
    		}
    	}else //there is not overlap area
    	{
    		occupiedArea=(G-E)*(H-F)+(C-A)*(D-B);
    		return occupiedArea;
    	}
    }
}