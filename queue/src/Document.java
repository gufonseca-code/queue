public class Document {
    String name;
    int numPages;

    public Document(String name, int numPages) {
        this.name = name;
        this.numPages = numPages;
    }
    
    public String getName() {
        return name;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

}
