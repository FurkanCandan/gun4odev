package g�n4�dev;

public class Main {

	public static void main(String[] args) {
		
		
		User user = new User();
		user.setId(1);
		user.setFirstName("furkan");
		user.setLastName("candan");
		user.setBirthday("11.10.2002");
		user.setIdentity("222222222");
		
		Edevlet edevlet = new Edevlet();
		edevlet.eDevlet(user);
		
		Kampanya kampanya = new Kampanya();
		kampanya.setId(1);
		kampanya.setKampanyaAdi("Yaz Kampanyas�");
		kampanya.setKampanyaNot("%45 �ndirim");
		
		KampanyaManager kampanyaManager = new KampanyaManager();
		kampanyaManager.add(kampanya);
		kampanyaManager.delete(kampanya);
		kampanyaManager.update(kampanya,"%24 �ndirim");
		
		GameSell gameSell = new GameSell();
		gameSell.sell(user);
		gameSell.sell(user,kampanya);
		
		
	}

}
