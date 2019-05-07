package q6;

public class CardTest {

	public static void main(String[] args) {
		Card c1 = new Card();
		System.out.println(c1.getCardNum());
		
		
		CardCompany company = CardCompany.getInstance();
		
		Card myCard = company.createCard();
		Card yourCard = company.createCard();
		
		System.out.println(myCard);
		System.out.println(yourCard);
		
		System.out.println(myCard.getCardNum());
		System.out.println(yourCard.getCardNum());
		

	}

}
