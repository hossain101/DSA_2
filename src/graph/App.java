package graph;

public class App {

    public static void main(String[] args){
        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");

        myGraph.addEdge("A","B");
        myGraph.addEdge("A","C");
        myGraph.addEdge("B","C");
        myGraph.addEdge("B","D");
        myGraph.addEdge("A","D");
        myGraph.addEdge("C","D");


        myGraph.printGraph();

        System.out.println("After removing ");

       // myGraph.removeEdge("A","B");

        myGraph.removeVertex("D");


        myGraph.printGraph();
    }
}
