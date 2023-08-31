import java.util.LinkedList;
import java.util.Queue;

public class numberofIslands 
{
    // Function to find the number of islands.
    static class pair
    {
        int i;
        int j;
        pair(int i,int j)
        {
            this.i = i;
            this.j = j;
        }
    }
    static void BFS(char[][] grid,int i,int j,int[][] visited)
    {
        Queue<pair> q1 = new LinkedList<pair>();
        pair start = new pair(i,j);
        visited[i][j] = 1;
        q1.add(start);
        while(q1.isEmpty()!=true)
        {
            pair curr = q1.poll();
            int row = curr.i;
            int col = curr.j;
            
            for(int m=row-1;m<=row+1;m++)
            {
                for(int n=col-1;n<=col+1;n++)
                {
                    if(m>=0 && m<grid.length && n>=0 && n<grid[0].length 
                    && grid[m][n]=='1' && visited[m][n]==0 )
                    {
                        visited[m][n] = 1;
                        q1.add(new pair(m,n));
                    }
                }
            }
        }
    }
    
    public int numIslands(char[][] grid) 
    {
        int totalrows = grid.length;
        int totalcols = grid[0].length;
        int[][] visited = new int[totalrows][totalcols];
        int islands = 0;
        
        for(int i=0;i<visited.length;i++)
        {
            for(int j=0;j<visited[0].length;j++)
            {
                visited[i][j] = 0;
            }
        }
        
        for(int i=0;i<totalrows;i++)
        {
            for(int j=0;j<totalcols;j++)
            {
                if(visited[i][j]==0 && grid[i][j]=='1')
                {
                    BFS(grid,i,j,visited);
                    islands++;
                }
            }
        }
        return islands;
    }
    
}
