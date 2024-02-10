package Graph.Traversals;
import java.util.*;
public class DFS {

    public static void dfs(ArrayList<ArrayList<Integer>> adj, int i, boolean[] vis, ArrayList<Integer> temp){
        vis[i] = true;
        temp.add(i);
        for(int it : adj.get(i)){
            if(!vis[it]){
                dfs(adj, it, vis, temp);
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> depthFirstSearch(int v, int e, ArrayList<ArrayList<Integer>> edges) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0; i<v; i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0; i<e; i++){
            int a = edges.get(i).get(0);
            int b = edges.get(i).get(1);
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        boolean vis[] = new boolean[v];

        for(int i=0; i<v; i++){
            if(!vis[i]){
                ArrayList<Integer> temp = new ArrayList<>();
                dfs(adj, i, vis, temp);
                ans.add(temp);
            }
        }
        return ans;
    }

}
