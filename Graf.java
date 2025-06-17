import java.util.*;

public class Graf {
    private Map<String, List<String>> adjList;
    private Map<String, Integer> inDegree;

    public Graf() {
        adjList = new HashMap<>();
        inDegree = new HashMap<>();
    }

    public void tambahKota(String kota) {
        adjList.put(kota, new ArrayList<>());
        inDegree.put(kota, 0);
    }

    public void tambahEdge(String awal, String tujuan) {
        adjList.get(awal).add(tujuan);
        inDegree.put(tujuan, inDegree.get(tujuan) + 1);
    }

    public List<String> topologicalSort() {
        List<String> sortedList = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        for (String kota : inDegree.keySet()) {
            if (inDegree.get(kota) == 0) {
                queue.offer(kota);
            }
        }

        while (!queue.isEmpty()) {
            String kota = queue.poll();
            sortedList.add(kota);

            for (String neigbor : adjList.get(kota)) {
                inDegree.put(neigbor, inDegree.get(neigbor) - 1);
                if (inDegree.get(neigbor) == 0) {
                    queue.offer(neigbor);
                }
            }
        }

        if (sortedList.size() != adjList.size()) {
            return null;
        }

        return sortedList;
    }
    
}