//Non weighted graph
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;

public class adjacencylist
{
    //for undirected graph
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> adj)
    {
        for(int i=0;i<adj.size();i++)
        {
            System.out.printf("%d: ",i);
            for(int j=0;j<adj.get(i).size();j++)
            {
                System.out.printf("%d, ",adj.get(i).get(j));
            }
            System.out.printf("\n");
        }
    }

    static ArrayList<Integer> BFS(ArrayList<ArrayList<Integer>> adj,int start,int n)
    {
        Queue<Integer> q1 = new LinkedList<Integer>();
        int visited[] = new int[n];
        ArrayList<Integer> bfs = new ArrayList<Integer>();

        visited[start] = 1;
        q1.add(start);

        while(q1.isEmpty()!=true)
        {
            Integer curr = q1.poll();
            bfs.add(curr);
            for(Integer adjacent : adj.get(curr))
            {
                if(visited[adjacent]!=1)
                {
                    q1.add(adjacent);
                    visited[adjacent] = 1;
                }
            }
        }

        return bfs;
    }

    static ArrayList<Integer> DFS(ArrayList<ArrayList<Integer>> adj,int start,int n)
    {
        Stack<Integer> s1 = new Stack<Integer>();
        int visited[] = new int[n];
        ArrayList<Integer> dfs = new ArrayList<Integer>();
        

        visited[start] = 1;
        s1.push(start);

        while(s1.isEmpty()!=true)
        {
            Integer curr = s1.pop();
            dfs.add(curr);
            for(Integer adjacent : adj.get(curr))
            {
                if(visited[adjacent]!=1)
                {
                    s1.push(adjacent);
                    visited[adjacent] = 1;
                }
            }
        }
        return dfs;
    }

    static class Pair
    {
        int node;
        int distance;
        public Pair(int node,int distance)
        {
            this.node = node;
            this.distance = distance;
        }
    }
    static class Node
    {
        int node;
        int weight;
        public Node(int node,int weight)
        {
            this.node = node;
            this.weight = weight;
        }
    }

    static int[] Djikstras(int V, ArrayList<ArrayList<Node>> adj,int start)
    {
        PriorityQueue<Pair> pq = new PriorityQueue<>(0, (a,b)->(a.distance-b.distance));
        int[] distanceTo = new int[V];
        Arrays.fill(distanceTo,Integer.MAX_VALUE);

        distanceTo[start] = 0;
        pq.add(new Pair(start,0)); 
        while(pq.isEmpty()!=true)
        {
            Pair top = pq.poll();
            int curr = top.node;
            int dist = top.distance;

            for(Node adjacentNode : adj.get(curr))
            {
                int adjacent = adjacentNode.node;
                int wt = adjacentNode.weight;
                if(dist+wt < distanceTo[adjacent])
                {
                    distanceTo[adjacent] = dist+wt;
                    pq.add(new Pair(adjacent, distanceTo[adjacent]));
                }
            }
        }
        return distanceTo;
    }
    
    public static void main(String[] args) 
    {
        // Creating a graph with 9 vertices
        int n = 9;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(n);
        for (int i = 0; i < n; i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,0,3);
        addEdge(adj,1,2);
        addEdge(adj,2,3);
        addEdge(adj,3,7);
        addEdge(adj,2,4);
        addEdge(adj,3,5);
        addEdge(adj,4,5);
        addEdge(adj,4,8);
        addEdge(adj,4,6);
        addEdge(adj,5,6);

        printGraph(adj);

        ArrayList<Integer> bfs = new ArrayList<>();
        bfs = BFS(adj, 0, n);
        System.out.println(bfs.toString());

        ArrayList<Integer> dfs = new ArrayList<>();
        dfs = DFS(adj, 0, n);
        System.out.println(dfs.toString());

        int[] visited = new int[10];
        for(int i=0;i<10;i++)
        {
            visited[i] = 0;
        }
        System.out.println(Arrays.toString(visited));
        
        

    }
}