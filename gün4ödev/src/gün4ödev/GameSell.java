package g�n4�dev;

public class GameSell {
	
	
	public void sell(User user) {
		
		System.out.println("Oyunu Sat�n ald� : " + user.getFirstName()+" "+user.getLastName());
		
	}
	

	
	public void sell(User user, Kampanya kampanya) {
		
		System.out.println("Oyunu kampanyal� Sat�n ald� : " + user.getFirstName()+" "+user.getLastName() 
													+ " " + kampanya.getKampanyaAdi() );
		
	}

}
