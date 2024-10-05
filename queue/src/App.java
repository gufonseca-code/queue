import java.util.LinkedList;
import java.util.Queue;

public class App {

    static void printDocuments(Queue<Document> q) throws InterruptedException {
        for(Document d : q) {
            for(int i = d.getNumPages(); i > 0; i--) {
                System.out.println(d.getName());
                Thread.sleep(d.getNumPages() * 100);
            }
            
        }
    }

    public static void main(String[] args) throws Exception {
        String[] names = {"trabalho", "faculdade", "documentos", "matricula", "fotos"};
        Integer[] pages = {4, 3, 6, 11, 2};
        Queue<Document> documentsQueue = new LinkedList<>();


        for(int i = 0; i < names.length; i++) {
            documentsQueue.add(new Document(names[i], pages[i]));
        }
        
        printDocuments(documentsQueue);
    }
}
