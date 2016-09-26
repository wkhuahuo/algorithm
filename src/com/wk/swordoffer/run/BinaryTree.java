package com.wk.swordoffer.run;

public class BinaryTree {
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
//		pre = {1,2,4,7,3,5,6,8};
//		in =  {4,7,2,1,5,3,8,6};
		if(pre==null || in == null ||pre.length==0||in.length==0){
			return null;
		}
		TreeNode treeNode= new TreeNode(pre[0]);
		int preLeft=0;
		int preRight=in.length-1;
		int inRoot=0;
		
		
		treeNode = reConstructBinaryTreeCore(inRoot,preLeft,preRight,pre,in);
		
		
		return treeNode;
	        
	}
	private int findRoot(int [] in,int [] pre,int index){
		int inRoot=index+1;
		for(int iIn=0; iIn < in.length; iIn++){
			if(pre[index]==in[iIn]){
				inRoot = iIn;
				break;
			}
		}
		return inRoot;
	}
	
	private TreeNode reConstructBinaryTreeCore(int inRoot,int preLeft,int preRight,int[] pre, int[] in){
		
		TreeNode tmpNode = new TreeNode(in[inRoot]);
		inRoot = findRoot(in, pre,inRoot);
		tmpNode.left = reConstructBinaryTreeCore(inRoot,preLeft,preRight,pre,in);
		tmpNode.right = reConstructBinaryTreeCore(inRoot,preLeft,preRight,pre,in);
		
		
		return tmpNode;
		
	}
}
