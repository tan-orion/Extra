package work17052021;

public class ManageOfficer {
    private Officer[] listOfficer;
    int size =0;
    public ManageOfficer(){

    }
    public ManageOfficer(Officer[]listOfficer){
        this.listOfficer=new Officer[20];
        this.size=0;
    }

    public Officer[] getListOfficer() {
        return listOfficer;
    }
    public void addOfficer(Officer officer){
        this.listOfficer[size]=officer;
        size++;

    }
    public void displayOfficer(){
        for(int i=0;i<size;i++){
            System.out.println(listOfficer[i].toString());
        }

    }
    public int findOfficer(String name){
        for (int i =0;i<size;i++){
            if(name.equals(listOfficer[i].getName())){
                return i;
            }
        }
        return -1;
    }

}
