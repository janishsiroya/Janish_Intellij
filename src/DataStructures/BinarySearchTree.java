package DataStructures;

import SEARCHING.BinarySearch;

/**
 * Created by janish on 5/1/2017.
 */
class BSTNode
{
    int data;
    BSTNode left,right;
    public BSTNode(int newdata)
    {
        this.data = newdata;
        left = null;
        right = null;
    }
}
public class BinarySearchTree {
    BSTNode root;

    public void insert(int data)
    {
        BSTNode temp=new BSTNode(data);
        if(root == null){
            root = temp;
        }
        BSTNode current = root;
            if (current.data>data)
            {
                current.left = temp;
            }
            else
            {
                current.right = temp;
            }

    }

    public void display(){
        inOrder(root);
    }

    public void inOrder(BSTNode root)
    {
        if(root==null)
            return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public void preOrder(int data)
    {

    }
    public void postOrder(int data)
    {

    }

    public static void main(String args[])
    {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(25);
        bst.insert(35);
        bst.insert(20);
        bst.insert(86);
        bst.insert(34);
        bst.display();
    }
}
