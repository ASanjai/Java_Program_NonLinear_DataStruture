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
}
class AdjacencyList{
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.Add_Edge(0, 1);
        g.Add_Edge(1, 2);
        g.Add_Edge(2, 3);
        g.Add_Edge(3, 0);
        g.Display();
    }
}