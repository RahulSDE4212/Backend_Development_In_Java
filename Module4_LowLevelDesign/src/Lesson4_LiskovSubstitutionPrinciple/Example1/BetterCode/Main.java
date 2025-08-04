package Lesson4_LiskovSubstitutionPrinciple.Example1.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<InternationalPaymentCompatibleCreditCard> cards = new ArrayList<>();
        for(InternationalPaymentCompatibleCreditCard card : cards) {
            card.internationalPayment();
        }
    }
}