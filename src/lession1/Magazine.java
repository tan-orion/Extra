package lession1;

public class Magazine extends Document {
    private int issueNumber;
    private int monthIssue;

    public Magazine() {
    }

    public Magazine( String numOfRelease, String publishingHouse, int issueNumber, int monthIssue) {
        super(numOfRelease, publishingHouse);
        this.issueNumber = issueNumber;
        this.monthIssue = monthIssue;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getMonthIssue() {
        return monthIssue;
    }

    public void setMonthIssue(int monthIssue) {
        this.monthIssue = monthIssue;
    }

    public String toString() {
        return "Book{" +
                "NXB: '" + getPublishingHouse() + '\'' +
                "Number: '" + getNumOfRelease() + '\'' +
                "IssueNumber: '" + getIssueNumber() + '\'' +
                ", MonthIssue: " + getMonthIssue() +
                ", ID=" + getId() +
                '}';

    }
}

