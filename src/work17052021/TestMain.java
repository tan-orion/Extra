package work17052021;

public class TestMain {
    public static void main(String[] args) {
        ManageOfficer manageOfficer=new ManageOfficer();
        Engineer engineer=new Engineer("A",10,"nam","HN","Teach");
        manageOfficer.addOfficer(engineer);
        manageOfficer.displayOfficer();
    }
}
