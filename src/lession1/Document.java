package lession1;

public class Document {
    private int id;
    private String numOfRelease;
    private String publishingHouse;

    public Document() {
    }

    public Document( String numOfRelease, String publishingHouse) {

        this.numOfRelease = numOfRelease;
        this.publishingHouse = publishingHouse;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumOfRelease() {
        return numOfRelease;
    }

    public void setNumOfRelease(String numOfRelease) {
        this.numOfRelease = numOfRelease;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", numOfRelease='" + numOfRelease + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
    }
}
