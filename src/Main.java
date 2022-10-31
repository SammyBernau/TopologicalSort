import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0,2);
        g.addEdge(0,1);
        g.addEdge(1,3);
        g.addEdge(2,3);


        printAdjacencyList(g);
        Stack<Integer> result = TopologicalSort.topologicalSort(g);
        printStack(result);

    }

    public static void printAdjacencyList(Graph graph) {
        System.out.println("Adjacency List of graph: ");
        for (int i = 0; i < graph.getLength(); i++){
            System.out.println("Vertex: " + i + "->"+ graph.getVertex(i));
        }
        System.out.println();
    }

    public static void printStack(Stack<Integer> stack){
        System.out.println("Topological Sort of graph: ");
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
        System.out.println();
    }



}
