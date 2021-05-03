package gün4ödev;

public class GameSell {
	
	
	public void sell(User user) {
		
		System.out.println("Oyunu Satýn aldý : " + user.getFirstName()+" "+user.getLastName());
		
	}
	

	
	public void sell(User user, Kampanya kampanya) {
		
		System.out.println("Oyunu kampanyalý Satýn aldý : " + user.getFirstName()+" "+user.getLastName() 
													+ " " + kampanya.getKampanyaAdi() );
		
	}

}
