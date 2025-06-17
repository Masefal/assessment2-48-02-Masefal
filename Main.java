import java.util.List;

public class Main {
    public static void main(String[] args) {    
        Graf itenerary = new Graf();

        itenerary.tambahKota("Paris");
        itenerary.tambahKota("Brussel");
        itenerary.tambahKota("Zurich");
        itenerary.tambahKota("Amsterdam");
        itenerary.tambahKota("Vienna");
        itenerary.tambahKota("Prague");
        itenerary.tambahKota("Hamburg");
        itenerary.tambahKota("Warsaw");
        itenerary.tambahKota("Budapest");
        itenerary.tambahEdge("Paris","Brussel");
        itenerary.tambahEdge("Paris","Zurich");
        itenerary.tambahEdge("Brussel","Amsterdam");
        itenerary.tambahEdge("Brussel","Zurich");
        itenerary.tambahEdge("Zurich","Vienna");
        itenerary.tambahEdge("Zurich","Prague");
        itenerary.tambahEdge("Amsterdam","Hamburg");
        itenerary.tambahEdge("Amsterdam","Prague");
        itenerary.tambahEdge("Prague","Hamburg");
        itenerary.tambahEdge("Prague","Vienna");
        itenerary.tambahEdge("Prague","Warsaw");
        itenerary.tambahEdge("Vienna","Budapest");
        itenerary.tambahEdge("Hamburg","Warsaw");
        itenerary.tambahEdge("Budapest","Warsaw");

        List<String> sortedList = itenerary.topologicalSort();

        if (sortedList != null) {
            System.out.println("Urutan itenerary " + sortedList);
        } else {
            System.out.println("error");
        }
    }
}