package lession1;

public class Newpaper extends Document {
    private int dayIssue;
    public  Newpaper(){

    }

    public Newpaper(String numOfRelease, String publishingHouse, int dayIssue) {
        super( numOfRelease, publishingHouse);
        this.dayIssue = dayIssue;
    }

    public int getDayIssue() {
        return dayIssue;
    }

    public void setDayIssue(int dayIssue) {
        this.dayIssue = dayIssue;
    }
    public String toString(){
        return "Book{" +
                "NXB: '"+ getPublishingHouse()+'\'' +
                "Number: '"+ getNumOfRelease()+'\'' +
                "DayIssue: '" + getDayIssue() + '\'' +
                ", ID=" + getId()+
                '}';
    }
}
