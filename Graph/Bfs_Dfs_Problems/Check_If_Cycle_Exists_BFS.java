package Graph.Bfs_Dfs_Problems;

import java.util.*;

class pair{
    int first;
    int second;
    public pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}

public class Check_If_Cycle_Exists_BFS {

    boolean bfs(int node,List<List<Integer>> adj,boolean vis[],int v){
        Queue<pair> q = new LinkedList<>();
        vis[node] = true;

        q.add(new pair(node,-1));

        while(!q.isEmpty()){
            int n = q.peek().first;
            int p = q.peek().second;
            q.poll();

            for(int i:adj.get(n)){
                if(!vis[i]){
                    vis[i] = true;
                    q.add(new pair(i,n));
                }
                else if(p!=i)
                    return true;
            }
        }
        return false;
    }

    boolean detectCycle(int V, List<List<Integer>> adj){
        boolean vis[] = new boolean[V];
        for(int i = 0;i<V;i++){
            if(!vis[i]){
                if(bfs(i,adj,vis,V))
                    return true;
            }
        }
        return false;
    }

}
