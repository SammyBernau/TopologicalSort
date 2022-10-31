import java.util.ArrayList;

class Graph {

    private final ArrayList<ArrayList<Integer>> adjacentList;
    private final int l;


    Graph(int length) {
        l = length;
        adjacentList = new ArrayList<ArrayList<Integer>>(length);

        for(int i = 0; i < length; i++){
            adjacentList.add(new ArrayList<Integer>());
        }
    }

    ArrayList<Integer> getVertex(int vertex){
        return adjacentList.get(vertex);
    }


    int getLength(){
        return l;
    }

    void addEdge(int vertexA, int vertexB){
        adjacentList.get(vertexA).add(vertexB);
    }



}
