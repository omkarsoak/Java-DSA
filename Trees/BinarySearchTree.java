import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.ArrayList;

public class BinarySearchTree
{
    static class Node
    {
        int data;
        Node left;
        Node right;
        public Node(int data) 
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static void InOrder(Node root)
    {
        if(root==null) return;

        InOrder(root.left);
        System.out.printf("%d ",root.data);
        InOrder(root.right);
    }

    static void PreOrder(Node root)
    {
        if(root==null) return;

        System.out.printf("%d ",root.data);
        PreOrder(root.left);
        PreOrder(root.right);
    }

    static void PostOrder(Node root)
    {
        if(root==null) return;

        PostOrder(root.left);
        PostOrder(root.right);
        System.out.printf("%d ",root.data);
    }

    static boolean Search(Node root,int key)
    {
        if(root==null) return false;
        
        else if(root.data==key) return true;
        
        else if(key > root.data) return Search(root.right,key);
        
        else return Search(root.left,key);
    }

    static boolean SearchIterative(Node root,int key)
    {
        while(root!=null)
        {
            if(key > root.data) root = root.right;
            
            else if(key < root.data) root = root.left;
            
            else return true;   //key = root.data (element found)
        }
        return false;
    }

    static Node insert(Node root,int key)
    {
        Node newNode = new Node(key);
        if(root==null)
        {
            return newNode;
        }
        else if(key > root.data)
        {
            root.right = insert(root.right, key);
        }
        else if(key < root.data)
        {
            root.left = insert(root.left,key);
        }
        return root;
    }

    static Node InorderSuccessor(Node root)
    {
        root = root.right;
        while(root.left!=null)
        {
            root = root.left;
        }
        return root;
    }

    static Node Delete(Node root,int key)
    {
        if(root==null)   //base case (tree empty)
        {
            return null;
        }

        //searching the node to be deleted
        if(key>root.data)
        {
            root.right = Delete(root.right, key);
        }
        else if(key<root.data)
        {
            root.left = Delete(root.left, key);
        }
        
        else  //key to be deleted is found
        {
            //Case 1 & 2: node with no child(leaf node) or with only 1 child
            if(root.left==null)
            {
                Node temp = root.right;
                return temp;
            }
            else if(root.right==null)
            {
                Node temp = root.left;
                return temp;
            }
            //Case 3: node with 2 children
            Node temp = InorderSuccessor(root);
            root.data = temp.data;
            root.right = Delete(root.right, temp.data);
        }
        return root;

    }


    static int CountNodes(Node root)
    {
        if(root==null) return 0;

        int leftNodes = CountNodes(root.left);
        int rightNodes = CountNodes(root.right);

        return 1 + leftNodes + rightNodes;
    }

    static void InOrderIterative(Node root)
    {
        if(root==null) return;

        Stack<Node> s1 = new Stack<Node>();
        Node curr = root;

        while(curr!=null || s1.isEmpty()!=true)
        {
            while(curr!=null)
            {
                s1.push(curr);
                curr = curr.left;
            }
            curr = s1.pop();
            System.out.printf("%d ",curr.data);

            curr = curr.right;
        }
    }

    static void LevelOrder(Node root)
    {
        Queue<Node> q1 = new LinkedList<>();
        Node curr = root;
        q1.add(curr);
        while(q1.isEmpty()!=true)
        {
            curr = q1.poll();
            System.out.printf("%d ",curr.data);
            if(curr.left!=null) q1.add(curr.left);
            if(curr.right!=null) q1.add(curr.right);
        }
        return;
    }

    //return root to node path
    static boolean getPath(Node root,int key,ArrayList<Integer> path)
    {
        if(root==null) return false;

        path.add(root.data);

        if(root.data==key) return true;

        if(getPath(root.left, key, path)==true || getPath(root.right, key, path)==true)
        {
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }


    public static void main(String[] args) 
    {
        Node root = new Node(8);
        root = insert(root, 10);
        root = insert(root, 3);
        root = insert(root, 1);
        root = insert(root, 4);
        root = insert(root, 6);

        InOrder(root);
        System.out.println("");

        //System.out.println(CountNodes(root));
        //InOrderIterative(root);
        //LevelOrder(root);

        ArrayList<Integer> path = new ArrayList<>();
        getPath(root, 6, path);
        System.out.println(path.toString());

    }
}