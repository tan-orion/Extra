package lession1;

public class Manager {
private int code =0;
    public Document []listDocument;
    public int size = 0;
    public Manager(){
        this.listDocument= new Document[20];
    }

    public void addDocument(Document document){
       for(int i =0;i<size;i++){
           if(listDocument[i].getPublishingHouse().equals(document.getPublishingHouse())){
               listDocument[i].setNumOfRelease(listDocument[i].getNumOfRelease()+document.getNumOfRelease());
               return;
           }
       }
       document.setId(code);
       code++;
       listDocument[size]=document;
       size++;

    }
public  void displayManager(){
        for (int i =0;i<size;i++){
            System.out.println(listDocument[i].toString());
        }
}
public  int findManager(int id){
        for (int i =0;i<size;i++){
            if(listDocument[i].getId() == id){
                return  i;
            }
        }
        return  -1;
}
public  void deleteManager(int id){
        int element=findManager(id);
        for(int i=element;i<size;i++){
            listDocument[i]=listDocument[i+1];
        }
        size--;
        displayManager();

}

}
