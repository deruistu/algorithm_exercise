import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


class TreeNode {
 int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x;left=null;right=null;}
 }
 
public class Solution {
    public TreeNode invertTree(TreeNode root) {
    	if(root!=null){
          TreeNode tmp;
          tmp=root.left;
          root.left=root.right;
          root.right=tmp;

        invertTree(root.left);
    
    	invertTree(root.right);
    	
        return root;
    	}
    	return null;
    }
    public void printTree(TreeNode root){
    	if(root==null)
    		return;
    	System.out.println(root.val);
    	printTree(root.left);
    	printTree(root.right);
    }
  public TreeNode buildTree(TreeNode root)
  {
	  int num;
	  Scanner sc=new Scanner(System.in);
	  num =sc.nextInt();
	  root=new TreeNode(num);
	  Queue<TreeNode> queue = new LinkedList<TreeNode>();
	  queue.add(root);
	  TreeNode node;
	  int count=0;
	  while(true){
		  num=sc.nextInt();
		  if(num==-1||queue.size()==0){
			  System.out.println("Finished");
			  return null;
		  }
		  
		  node =queue.poll();
		  
		  if(node.left==null)
		  {
			  TreeNode tr=new TreeNode(num);
			  node.left=tr;
			  queue.add(tr);
		  }
		  if(node.right==null){
			  TreeNode tr=new TreeNode(num);
			  node.right=tr;
			  queue.add(tr);
		  }
	  }
  }
  public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
      int sum=0;
      int flag=0;
      if(E>=A&&E<=C&&F<=B&&H>=B) //intersection
      {
    	  if(H>=D&&G>=C)
    	  {
    		  sum=(D-B)*(C-E);
    		  flag=1;
    	  }else if(H>=D&&G<=C)
    	  {
    		  sum=(G-E)*(D-B);
    		  flag=1;
    	  }else if(H<=D&&G<=C){
    		  sum=(H-B)*(G-E);
    		  flag=1;
    	  }else if(H<=D&&G>=C){
    		  sum=(C-E)*(H-B);
    		  flag=1;
    	  }
      }else if(E>=A&&E<=C&&F>=B&&F<=D)
      {
    	  if(H>=D&&G>=C)
    	  {
    		  sum=(C-E)*(D-F);
    		  flag=1;
    	  }else if(H>=D&&G<=C){
    		  sum=(G-E)*(H-F);
    		  flag=1;
    	  }
      }else if(A>=E&A<=G&&B>=F&&B<=H)
      {
    	  if(C>=G&&D>=H){
    		  sum=(G-A)*(H-B);
    		  flag=1;
    	  }else if(D>=H){
    		  sum=(G-A)*(H-B);
    		  flag=1;
    	  }
      }else if(A>=E&&A<=G)
      {
    	  if(D>=F&&D<=H)
    	  {
    		  sum=(G-A)*(D-F);
    		  flag=1;
    	  }else if(D>=H&&C>=G){
    		  sum=(G-A)*(H-F);
    		  flag=1;
    	  }else if(D>=H)
    	  {
    		  sum=(C-A)*(H-F);
    		  flag=1;
    	  }
      }
      if(A>=E&&C<=G) //A is contained by B
      {
    	  sum=(C-A)*(D-B);
    	  flag=1;
      }
      if(E>=A&&G<=C) //B is contained by A
      {
    	  sum=(G-E)*(H-F);
    	  flag=1;
      }
      if(flag==0){ //separate
    	  return 0;
      }
	  return sum;
  }
    public static void main(String[] argv)
    {

    }
}