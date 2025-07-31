package Lesson2_OpenClosePrinciple.Example3.BetterCode;

public class PDFReportGenerator implements ReportType{
    @Override
    public void send() {
        System.out.println("Generating PDF Report!!!");
    }
}
