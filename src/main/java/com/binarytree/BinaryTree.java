package com.binarytree;

class TreeNode {
	int data;
	TreeNode right;
	TreeNode left;

	public TreeNode(int data) {
		this.data = data;
		this.right = null;
		this.left = null;
	}
}

public class BinaryTree {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(100);
		TreeNode node_l = new TreeNode(101);
		TreeNode node_r = new TreeNode(102);
		TreeNode node_l_l = new TreeNode(103);
		TreeNode node_l_r = new TreeNode(104);
		TreeNode node_r_l = new TreeNode(105);
		TreeNode node_r_r = new TreeNode(106);

		root.left = node_l;
		root.right = node_r;
		node_l.left = node_l_l;
		node_l.right = node_l_r;
		node_r.left = node_r_l;
		node_r.right = node_r_r;

		display(root);

	}

	public static void display(TreeNode root) {
		if (root == null) {
			return;
		}
		int leftinput = root.left != null ? root.left.data : 0;
		int rightinput = root.right != null ? root.right.data : 0;
		System.out.print("left --> " + leftinput);
		System.out.print(" : " + root.data + " : ");
		System.out.println(rightinput + " <--- right ");

		display(root.left);
		display(root.right);

	}
}
