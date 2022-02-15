package HomeWork7;


public class Task1 {
    public static void main(String[] args) {
//        testGraph();
//        testDfs();
//        testBfs();
        testFindShortWay();
    }

    private static void testFindShortWay() {

        Graph graph = new GraphImpl(10);

        graph.addVertex("Moscow");
        graph.addVertex("Tula");
        graph.addVertex("Ryazan");
        graph.addVertex("Kaluga");
        graph.addVertex("Lipetsk");
        graph.addVertex("Tambow");
        graph.addVertex("Orel");
        graph.addVertex("Saratov");
        graph.addVertex("Kursk");
        graph.addVertex("Voronezh");

        graph.addEdge("Moscow", "Tula", 12);
        graph.addEdge("Moscow", "Ryazan", 32);
        graph.addEdge("Moscow", "Kaluga", 44);
        graph.addEdge("Tula", "Lipetsk", 20);
        graph.addEdge("Ryazan", "Tambow", 100);
        graph.addEdge("Kaluga", "Orel", 15);
        graph.addEdge("Lipetsk", "Voronezh", 922);
        graph.addEdge("Tambow", "Saratov", 101);
        graph.addEdge("Orel", "Kursk", 421);
        graph.addEdge("Saratov", "Voronezh", 10);
        graph.addEdge("Kursk", "Voronezh", 150);

        System.out.println("Size of graph is " + graph.getSize());

//        System.out.println(graph.findShortWay());
        graph.display();
        graph.findShortWay("Moscow", "Voronezh");
    }

//    private static void testGraph() {
//
//        Graph graph = new GraphImpl(7);
//
//        graph.addVertex("A");
//        graph.addVertex("B");
//        graph.addVertex("C");
//        graph.addVertex("D");
//
//        graph.addEdge("A", "B", "C");
//        graph.addEdge("B", "C", "D");
//        graph.addEdge("C", "A", "B", "D");
//        graph.addEdge("D", "B", "C");
//
//        System.out.println("Size of graph is ");
//        System.out.println("Size of graph is " + graph.getSize());
//        graph.display();
//    }

//    private static void testDfs() {
//        Graph graph = new GraphImpl(7);
//        graph.addVertex("A");
//        graph.addVertex("B");
//        graph.addVertex("C");
//        graph.addVertex("D");
//        graph.addVertex("E");
//        graph.addVertex("F");
//        graph.addVertex("G");
//
//        graph.addEdge("A", "B", "C", "D");
//        graph.addEdge("B", "E");
//        graph.addEdge("D", "F");
//        graph.addEdge("F", "G");
//
//        graph.dfs("A");
//    }

//    private static void testBfs() {
//        Graph graph = new GraphImpl(8);
//        graph.addVertex("A");
//        graph.addVertex("B");
//        graph.addVertex("C");
//        graph.addVertex("D");
//        graph.addVertex("E");
//        graph.addVertex("F");
//        graph.addVertex("G");
//        graph.addVertex("H");
//
//        graph.addEdge("A", "B", "C", "D");
//        graph.addEdge("B", "E");
//        graph.addEdge("E", "H");
//        graph.addEdge("C", "F");
//        graph.addEdge("D", "G");
//
//        graph.bfs("A");
//    }
}