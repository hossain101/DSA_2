package graph;

public class App {

    public static void main(String[] args){
        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");

        myGraph.printGraph();
    }
}
