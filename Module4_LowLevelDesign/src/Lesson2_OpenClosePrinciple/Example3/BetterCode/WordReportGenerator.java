package Lesson2_OpenClosePrinciple.Example3.BetterCode;

public class WordReportGenerator implements ReportType{
    @Override
    public void send() {
        System.out.println("Generating Word report");
    }
}
