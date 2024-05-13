package entity;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Bank {
    private final List<Card> cards = new ArrayList<>();

    protected void addCard(Card card) {
        this.cards.add(card);
    }

    protected void deactivateCard(String numberId) {
        Card card = this.searchCard(numberId);
        if (card != null) {
            card.setStatus(Card.Status.INACTIVE);
        } else {
            System.out.println("Card Does Not Exist");
        }
    }

    protected void reactivateCard(String numberId) {
        Card card = this.searchCard(numberId);
        if (card != null) {
            card.setStatus(Card.Status.ACTIVE);
        } else {
            System.out.println("Card Does Not Exist");
        }
    }

    public List<Card> getActiveCards() {
//Melakukan Filter List kartu yang aktif
        return this.cards.stream().filter(card -> card.getStatus() ==
                        Card.Status.ACTIVE)
                .collect(Collectors.toList());
    }

    public Boolean checkIfNumberIdExist(String numberId) {
        return this.searchCard(numberId) != null;
    }

    public Card getCardDetails(String numberId) {
        return this.searchCard(numberId);
    }

    public Integer withdraw(String numberId, String pin, Integer nominal) {
        Card card = this.searchCard(numberId);
        if (card != null) {
            if (card.validatePin(pin)) {
                return takeMoney(card, nominal);
            } else {
                System.out.println("Pin Doesn't Match");
                return 0;
            }
        } else {
            System.out.println("Card Not Found!");
            return 0;
        }
    }

    private Integer takeMoney(Card card, Integer nominal) {
        if (isAvailable(card.getNominal(), nominal)) {
            card.setNominal(card.getNominal() - nominal);
            System.out.println("Saldo Sekarang: " + card.getNominal());
            return nominal;
        } else {
            System.out.println("Saldo Tidak Mencukupi");
            return 0;
        }
    }

    private Boolean isAvailable(Integer source, Integer nominal) {
        return source >= nominal;
    }

    private Card searchCard(String numberId) {
        for (Card currentCard : this.cards) {
            if (currentCard.getNumberId().equals(numberId)) {
                return currentCard;
            }
        }
        return null;
    }
}