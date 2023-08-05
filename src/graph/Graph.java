package graph;

import java.util.*;


public class Graph {
    private  HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public boolean addVertex(String vertex){
        if(adjList.get(vertex)==null) {
            adjList.put(vertex, new ArrayList<>());
            return true;
        }
            return false;
    }

    public void printGraph(){

        //You can directly print the hashmap by putting the hashmap into the sout
       // System.out.println(adjList);

        //This approach puts each key-value pair in a new line.
        for (Map.Entry<String, ArrayList<String>> entry : adjList.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }



}
