import java.util.*;
class Graph{
    LinkedList<Integer>[]adj;
     @SuppressWarnings("unchecked")
    public Graph(int node){
        this.adj = new LinkedList[node];
        for(int i =0;i<node;i++){
            this.adj[i] = new LinkedList<>();
        }
    }
    public void Add_Edge(int u,int v){
        this.adj[u].add(v);
        this.adj[v].add(u);
    }
    public void Display(){
    for(int i=0;i<4;i++){
        System.out.print(i);
        for(Integer edge :adj[i]){
            System.out.print(edge+" ");
        }
        System.out.println();
    }
    }
    public void Dfs(int s,int vertex){
        boolean[] visited =new boolean[vertex];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        while (!stack.isEmpty()) {
            int u = stack.pop();
            if(!visited[u]){
                visited[u] = true;
                System.out.println(u+"");
                for(int v : adj[u]){
                    if(!visited[v]){
                        stack.push(v);
                    }
                }
            }
            
        }
    }
}

public class DFS {
    public static void main(String[] args) {
       Graph g =new Graph(4);
       g.Add_Edge(0, 1);
       g.Add_Edge(1, 2);
       g.Add_Edge(2,3);
       g.Add_Edge(3, 0);
       g.Dfs(0,4);
    }
}
