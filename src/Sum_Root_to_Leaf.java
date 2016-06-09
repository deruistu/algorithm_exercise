import java.util.Vector;



public class Sum_Root_to_Leaf {
	

    public static Vector<Integer> paths = new Vector<Integer>();
    public static int count = 0;
    
    public static void postOrder(TreeNode node, String path)
	{
		if(node!=null)
		{
		    count++;
			path += node.val;
			if(node.left == null && node.right == null)
			{
			    paths.add(Integer.parseInt(path));
			    
				//System.out.println(path);
			}
			
			postOrder(node.left,path);
			postOrder(node.right,path);
		}
	}
    
    public int sumNumbers(TreeNode root) {
        if(root==null)
        {
            return 0;
        }

        String path="";
        int sum = 0;
        postOrder(root,path);
        
        for(int onepath : paths)
        {
            sum +=onepath;
        }
        
        return sum;
    }
    
    public static void main(String[] argv)
    {
    	TreeNode start_root = new TreeNode(0);
    	start_root.left = new TreeNode(1);
    	start_root.left.left = start_root.left.right = null;
    	start_root.right = new TreeNode(3);
    	start_root.right.left = start_root.right.right = null;
    	int result = new Sum_Root_to_Leaf().sumNumbers(start_root);
    	System.out.println(result);
    }
}
