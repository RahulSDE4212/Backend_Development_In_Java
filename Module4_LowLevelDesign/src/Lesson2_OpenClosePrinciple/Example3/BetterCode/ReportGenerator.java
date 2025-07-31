package Lesson2_OpenClosePrinciple.Example3.BetterCode;

import java.util.List;

public class ReportGenerator {
    public void sendReport(List<ReportType> reportTypeList) {
        for(ReportType reportType : reportTypeList) {
            reportType.send();
        }
    }
}
