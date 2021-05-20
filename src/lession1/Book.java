package lession1;

public class Book extends Document{
    private int page;
    private  String nameAuthor;
    public Book(){

    }

    public Book( String numOfRelease, String publishingHouse, int page, String nameAuthor) {
        super(numOfRelease, publishingHouse);
        this.page = page;
        this.nameAuthor = nameAuthor;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "page=" + page +
                ", nameAuthor='" + nameAuthor +" "+
                "numOfRelease="+getNumOfRelease()+" "+
                "publishingHouse="+getPublishingHouse()+" "+
                "id="+getId()+
                '\'' +
                '}';
    }
}
