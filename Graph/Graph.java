package Graph;

import java.util.LinkedList;
import java.util.Stack;

public class Graph {


    class Edge{
        int source;
        int destination;
        int weight;
        Edge(int source,int destination,int weight){
            this.source=source;
            this.weight=weight;
            this.destination=destination;
        }

    }

    private int vertices;
    private LinkedList<Edge> adjlist[];

    public Graph(int numvertices){
        vertices=numvertices;
        adjlist = new LinkedList[vertices];
        for (int i = 0; i <vertices ; i++) {
            adjlist[i]=new LinkedList<>();
        }

    }
    public void AddEdge(int s,int d,int w){
        Edge e = new Edge(s,d,w);
        adjlist[s].add(e);   //directed weighted graph
    }

    //iterative DFS
    public void DFS(){

        boolean visited[]= new boolean[vertices];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < vertices ; i++) {    //disconnected components inclusivity
            if(!visited[i])
            {   visited[i]=true;
                st.push(i);

                while(!st.isEmpty()){       //backtrack
                    int temp =st.pop();

                    System.out.println(temp);
                    for(int j =0 ;j<adjlist[temp].size();j++){ //exhausting the max depth
                        if(!visited[adjlist[temp].get(j).destination])
                        {
                            st.push(adjlist[temp].get(j).destination);
                            visited[adjlist[temp].get(j).destination]=true;
                        }
                    }
                }
            }
        }
    }



    public static void main(String[] args) {
        Graph g = new Graph(3);
        g.AddEdge(0,1,5);
        g.AddEdge(0,2,7);
        g.AddEdge(1,2,4);
        g.DFS();

    }

}
