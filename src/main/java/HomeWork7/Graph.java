package HomeWork7;

public interface Graph {

    void addVertex(String label);

//    boolean addEdge(String startLabel, String secondLabel, String... others);
    boolean addEdge(String startLabel, String secondLabel, int distance);
//    boolean addEdge(String startLabel, String secondLabel);

    int getSize();

    int findShortWay(String start, String end);

    void display();

    /**
     * англ. Depth-first search, DFS
     */
    void dfs(String startLabel);

    /**
     * англ. breadth-first search, BFS
     */
    void bfs(String startLabel);

}