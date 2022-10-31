import java.util.*;

public class TopologicalSort {

    /*I didn't notice until I ran out of time that you wanted us
     to implement using the edge removal method.
     */

//    static int[] inDegree



    public static void topologicalSortHelper(int vertex, boolean[] visited, Stack<Integer> stack, Graph graph){
        visited[vertex] = true;
        Integer i;

        for(Integer integer: graph.getVertex(vertex)){
            i = integer;
            if(!visited[i])
                topologicalSortHelper(i, visited, stack, graph);
        }
        stack.push(vertex);
    }

    public static Stack<Integer> topologicalSort(Graph graph){

        Stack<Integer> result = new Stack<>();
        boolean[] visited = new boolean[graph.getLength()];
        for (int i = 0; i < graph.getLength(); i++){
            visited[i] = false;
        }

        for(int i = 0; i < graph.getLength(); i++)
            if(!visited[i])
                topologicalSortHelper(i, visited, result, graph);

        return result;
    }

//    public static Queue<Integer> topologicalSort(Graph graph) {
//        inDegreeEqualsZero(graph);
//        Queue<Integer> zeros = new LinkedList<>();
//        Queue<Integer> topo = new LinkedList<>();
//
//        for(int i = 0; i < inDegrees.length; i++){
//            if(inDegrees[i] == 0) {
//                if (!zeros.contains(i)){
//                    zeros.add(i);
//                }
//            }
//        }
//
//
//        while(!zeros.isEmpty()){
//            int vertex = zeros.remove();
//            ArrayList<Integer> currentVertexList = graph.getVertex(vertex);
//            if(!topo.contains(vertex)) {
//                topo.add(vertex);
//
//                for (Integer integer : currentVertexList) {
//                    inDegrees[integer]--;
//                    if (inDegrees[integer] == 0)
//                        zeros.add(integer);
//                }
//                currentVertexList.removeAll(currentVertexList);
//            }
//        }
//        return topo;
//    }



//    public static int[] inDegreeEqualsZero(Graph graph){
//        inDegrees = new int[graph.getLength()];
//
//        for(int i = 0; i < graph.getLength(); i++) {
//            ArrayList<Integer> list = graph.getVertex(i);
//
//            for (Integer integer : list)
//                inDegrees[integer]++;
//        }
//        System.out.println("Vertex\tIn");
//        for (int k = 0; k < graph.getLength(); k++) {
//            System.out.println(k + "\t" + inDegrees[k]);
//        }
//        return inDegrees;
//    }



}
