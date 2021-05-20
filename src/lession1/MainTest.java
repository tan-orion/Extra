package lession1;

public class MainTest {
    public static void main(String[] args) {
        Manager manager=new Manager();
        Document book=new Book("100","Nhã Nam",100,"Tố Hữu");
        manager.addDocument(book);
        Document book1=new Book("100","AZ",100,"NB");
        Document book2=new Book("100","KĐ",100,"NA");
        manager.addDocument(book1);
        manager.addDocument(book2);
        manager.displayManager();
        //manager.deleteManager(1);
    }
}
