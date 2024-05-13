import entity.ATM;
import entity.Card;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
    public class Main {
        public static void main(String[] args) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy",
                    Locale.ENGLISH);
            String dateInString = "7-Jun-2013";
            Date date;
            try {
                date = formatter.parse(dateInString);
            } catch (Exception e) {
                date = new Date();
            }
            Card card1 = ATM.createCard(
                    "Husein",
                    date,
                    "111111",
                    1000000,
                    "12345",
                    Card.Type.DEBIT
            );
            Card card2 = ATM.createCard(
                    "Hambali",
                    new Date(),
                    "111111",
                    1000000,
                    "12345",
                    Card.Type.DEBIT
            );
            ATM.withdraw(card1.getNumberId(), "12345", 10000);
            ATM.printAllActiveCard();
            ATM.deactivateCard(card1.getNumberId());
            ATM.printAllActiveCard();
            ATM.reactivateCard(card1.getNumberId());
            ATM.printAllActiveCard();
            ATM.printCardDetail(card1.getNumberId());
        }
    }
