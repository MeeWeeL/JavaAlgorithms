package HomeWork7;


import java.util.*;

public class GraphImpl implements Graph {

    private final List<Vertex> vertexList;
    private final int[][] adjMatrix;

    public GraphImpl(int maxVertexCount) {
        this.vertexList = new ArrayList<>(maxVertexCount);
        this.adjMatrix = new int[maxVertexCount][maxVertexCount];
        for (int i = 0; i < maxVertexCount; i++) {
            for (int j = 0; j < maxVertexCount; j++) {
                this.adjMatrix[i][j] = -1;
            }
        }
    }


    @Override
    public void addVertex(String label) {
        vertexList.add(new Vertex(label));
    }

    @Override
    public boolean addEdge(String startLabel, String secondLabel, int distance) {
        int startIndex = indexOf(startLabel);
        int endIndex = indexOf(secondLabel);

        if (startIndex == -1 || endIndex == -1) {
            return false;
        }

        adjMatrix[startIndex][endIndex] = distance; //!!!!!!!!!!!!

        return true;
    }

    private int indexOf(String label) {
        for (int i = 0; i < vertexList.size(); i++) {
            if (vertexList.get(i).getLabel().equals(label)) {
                return i;
            }
        }
        return -1;
    }

//    @Override
//    public boolean addEdge(String startLabel, String secondLabel, String... others) {
//        boolean result = addEdge(startLabel, secondLabel);
//
//        for (String other : others) {
//            result &= addEdge(startLabel, other);
//        }
//
//        return result;
//    }

    @Override
    public int getSize() {
        return vertexList.size();
    }

    @Override
    public int findShortWay(String start, String end) {
        findWays(start, end);
        return 0;
    }

    private void findWays(String start, String end) {
        int startIndex = indexOf(start);
        int endIndex = indexOf(end);
        if (startIndex == -1) {
            throw new IllegalArgumentException("Неверная вершина" + start);
        }
        if (endIndex == -1) {
            throw new IllegalArgumentException("Неверная вершина" + end);
        }

        Stack<Vertex> bestStack = new Stack<>();
        Stack<Integer> bestStackDist = new Stack<>();


        Stack<Vertex> stack = new Stack<>();
        Stack<Integer> stackDist = new Stack<>();
        Vertex vertex = vertexList.get(startIndex);
        Vertex newVertex = vertexList.get(startIndex);

        stack.push(vertex);
//        visitVertex(stack, vertex);
        while (!stack.isEmpty()) {
            vertex = stack.peek();
            newVertex = getNearUnvisitedVertex(stack.peek());



            if (newVertex != null) {

                stackDist.push(getDistance(vertex, newVertex));
                stack.push(newVertex);

                if (newVertex == vertexList.get(endIndex)) {
                    System.out.println(stack.toString());
                    System.out.println(stackDist.toString());
                    if (bestStack.isEmpty()) {
                            bestStackDist.addAll(stackDist);
                            bestStack.addAll(stack);
                    } else {
                        int newWay = 0;
                        for (Integer integer : stackDist) {
                            newWay += integer;
                        }
                        int oldWay = 0;
                        for (Integer integer : bestStackDist) {
                            oldWay += integer;
                        }
                        if (!(newWay > oldWay)) {
                            System.out.println("New best");
                            bestStack.clear();
                            bestStackDist.clear();
                            bestStackDist.addAll(stackDist);
                            bestStack.addAll(stack);
                        }
                    }
                    System.out.println("------------------------------------------------");
                }
//                visitVertex(stack, vertex);
            } else {
                stack.peek().setVisited(true);
                if (stack.peek() != vertexList.get(endIndex)) {
                    vertexList.get(endIndex).setVisited(false);
                }
                stack.pop();
                if (!stackDist.isEmpty()) {
                    stackDist.pop();
                }
            }
        }
        System.out.println("Best way");
        System.out.println(bestStack);
        System.out.println(bestStackDist);
        int bestWayDist = 0;
        for (Integer integer : bestStackDist) {
            bestWayDist += integer;
        }
        System.out.println(bestWayDist);

        System.out.println("Done");
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < getSize(); i++) {
            sb.append(vertexList.get(i));
            for (int j = 0; j < getSize(); j++) {
                if (adjMatrix[i][j] != -1) {
                    sb.append(" -> ").append(adjMatrix[i][j]).append(" -> ").append(vertexList.get(j));
                }
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    @Override
    public void dfs(String startLabel) {
        int startIndex = indexOf(startLabel);
        if (startIndex == -1) {
            throw new IllegalArgumentException("Неверная вершина" + startLabel);
        }

        Stack<Vertex> stack = new Stack<>();
        Stack<Integer> stackDistances = new Stack<>();
        Vertex oldVertex = null;
        Vertex vertex = vertexList.get(startIndex);

        visitVertex(stack, vertex);
        while (!stack.isEmpty()) {
            oldVertex = vertex;
            vertex = getNearUnvisitedVertex(stack.peek());
            if (vertex != null) {
                if (oldVertex != null)
                stackDistances.push(getDistance(oldVertex, vertex));
                visitVertex(stack, vertex);
            } else {
                stack.pop();
            }
        }
        System.out.println(stack.toString());
    }

    private int getDistance(Vertex first, Vertex second) {
        int firstId = indexOf(first.getLabel());
        int secondId = indexOf(second.getLabel());
        return adjMatrix[firstId][secondId];
    }
    private Vertex getNearUnvisitedVertex(Vertex vertex) {
        int currentIndex = vertexList.indexOf(vertex);
        for (int i = 0; i < getSize(); i++) {
            if (adjMatrix[currentIndex][i] != -1 && !vertexList.get(i).isVisited() ) {
                return vertexList.get(i);
            }
        }

        return null;
    }

    private void visitVertex(Stack<Vertex> stack, Vertex vertex) {
        System.out.print(vertex.getLabel() + " ");
        stack.push(vertex);
        vertex.setVisited(true);
    }

    private void visitVertex(Queue<Vertex> stack, Vertex vertex) {
        System.out.print(vertex.getLabel() + " ");
        stack.add(vertex);
        vertex.setVisited(true);
    }

    @Override
    public void bfs(String startLabel) {
        int startIndex = indexOf(startLabel);
        if (startIndex == -1) {
            throw new IllegalArgumentException("Неверная вершина" + startLabel);
        }

        Queue<Vertex> stack = new LinkedList<>();
        Vertex vertex = vertexList.get(startIndex);

        visitVertex(stack, vertex);
        while (!stack.isEmpty()) {
            vertex = getNearUnvisitedVertex(stack.peek());
            if (vertex != null) {
                visitVertex(stack, vertex);
            } else {
                stack.remove();
            }
        }
        System.out.println();
    }
}