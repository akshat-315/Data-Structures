package Graph.Traversals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public static List<Integer> bfsTraversal(int n, List<List<Integer>> adj){
        List<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[n+1];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            bfs.add(node);
            for(Integer it : adj.get(node)){
                if(visited[it] == false){
                    visited[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
}
