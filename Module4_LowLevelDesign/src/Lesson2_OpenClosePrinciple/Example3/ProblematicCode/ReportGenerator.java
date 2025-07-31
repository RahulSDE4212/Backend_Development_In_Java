package Lesson2_OpenClosePrinciple.Example3.ProblematicCode;

public class ReportGenerator {
    public String generateReport(String reportType) {
        if(reportType.equals("PDF")) return "generating PDF report";
        else if(reportType.equals("Word")) return "Generating word report";
        else return "Report type not supported";
    }
}
