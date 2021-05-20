package work17052021;

public class Worker extends Officer{
    private int  lever;
    public  Worker(){

    }

    public Worker(String name, int age, String gender, String address, int lever) {
        super(name, age, gender, address);
        this.lever = lever;
    }

    public int getLever() {
        return lever;
    }

    public void setLever(int lever) {
        this.lever = lever;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "lever=" + lever+
                "name=" + this.getName()+
                        "age="+this.getAge()+
                "adress="+this.getAddress()+
                "gender="+this.getGender()+
                '}';
    }
}
