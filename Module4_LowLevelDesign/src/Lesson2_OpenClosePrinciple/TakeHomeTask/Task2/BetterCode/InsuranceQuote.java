package Lesson2_OpenClosePrinciple.TakeHomeTask.Task2.BetterCode;

// ✅ Class: InsuranceQuote
// 📌 Responsibility: Holds insurance quote data only
// 🔄 SRP (Single Responsibility Principle) followed
class InsuranceQuote {
    private String quoteDetails;

    public InsuranceQuote(String quoteDetails) {
        this.quoteDetails = quoteDetails;
    }

    public String getQuoteDetails() {
        return quoteDetails;
    }

    @Override
    public String toString() {
        return "InsuranceQuote{" +
                "quoteDetails='" + quoteDetails + '\'' +
                '}';
    }
}
