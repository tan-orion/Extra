package work17052021;

public class Engineer extends Officer{
    private String marjor;

    public Engineer(String name, int age, String gender, String address, String marjor) {
        super(name, age, gender, address);
        this.marjor = marjor;
    }

    public String getMarjor() {
        return marjor;
    }

    public void setMarjor(String marjor) {
        this.marjor = marjor;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "marjor='" + marjor +
                "name="+this.getName()+
                "gender="+this.getGender()+
                "age="+this.getAge()+
                "adress="+this.getAddress()+
                '\'' +
                '}';
    }
}
