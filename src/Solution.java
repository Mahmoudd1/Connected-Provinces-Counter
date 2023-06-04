import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int findCircleNum(int[][] isConnected) {
        HashMap<Integer, List<Integer>>graph=new HashMap<>();
        int n=isConnected.length;
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                if( isConnected[i][j]==1)
                {
                    if (!graph.containsKey(i))
                    {
                        graph.put(i,new ArrayList<>());
                    }
                    graph.get(i).add(j);
                    if (!graph.containsKey(j))
                    {
                        graph.put(j,new ArrayList<>());
                    }
                    graph.get(j).add(i);
                }

            }
        }
        boolean visited[]=new boolean[n];
        int count=0;
        for (int i=0;i<n;i++)
        {
            if (!visited[i])
            {
                visited[i]=true;
                count ++;
                dfs(i,visited,graph);
            }
        }
        return count;
    }
    void dfs(int i,boolean[]visited,HashMap<Integer,List<Integer>>graph)
    {
        if (!graph.containsKey(i))
            return;
        for (int temp:graph.get(i))
        {
            if (!visited[temp])
            {
                visited[temp]=true;
                dfs(temp,visited,graph);
            }
        }
    }
}
