package entity;

import java.util.Date;
import java.util.List;
public class ATM {
    private static final Bank bank = new Bank();
    public static Card createCard(
            String name,
            Date dateOfBirth,
            String numberId,
            Integer nominal,
            String pin,
            Card.Type type
    ){
        if (bank.checkIfNumberIdExist(numberId)){
            System.out.println("Nomor Kartu Tidak Dapat Digunakan");
            return null;
        }
        else {
            Owner owner = new Owner(name, dateOfBirth);
            Card card = new Card(owner,numberId, nominal, pin, type);
            bank.addCard(card);
            return card;
        }
    }
    public static void deactivateCard(String numberId){
        bank.deactivateCard(numberId);
    }
    public static void reactivateCard(String numberId){
        bank.reactivateCard(numberId);
    }
    public static void printCardDetail(String numberId){
        Card card = bank.getCardDetails(numberId);
        System.out.println(card.getDetail());
    }
    public static void withdraw(String numberId,String pin, Integer nominal){
        Integer uang = bank.withdraw(numberId,pin, nominal);
        System.out.println("Anda Mendapat Uang Sejumlah: "+uang);
    }
    public static void printAllActiveCard(){
        List<Card> cards = bank.getActiveCards();
        System.out.printf("Active Card List: %s, with the total of %s Card(s)%n",cards, cards.size());
    }
}
