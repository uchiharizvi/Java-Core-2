package datastructures.graphs.dfs;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private int V;//Number of vertices
    private LinkedList<Integer> adj[];//Array  of lists fo Adjacency List Representation

    // Constructor
    @SuppressWarnings("unchecked")
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // A function used by DFS
    void dfsUtil(int v, boolean visited[]) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.println(v + " ");
        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) dfsUtil(n, visited);
        }
    }

    //The function to do DFS traversal It uses recursive DFSUtil()
    void dfs(int v) {
        //Mark all the vertices as not visited(set as false by default in java)
        boolean visited[] = new boolean[V];
        // Call the recursive helper function to print DFS traversal
        dfsUtil(v, visited);
    }

    void dfs() {
        //Mark all the vertices as not visited(set as false by default in java)
        boolean visited[] = new boolean[V];
        // Call the recursive helper function to print DFS traversal
        for (int i = 0; i < V; ++i)
            if (visited[i] == false)
                dfsUtil(i, visited);
    }
}
