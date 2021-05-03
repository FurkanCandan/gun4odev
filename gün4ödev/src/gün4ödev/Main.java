package gün4ödev;

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
		kampanya.setKampanyaAdi("Yaz Kampanyası");
		kampanya.setKampanyaNot("%45 İndirim");
		
		KampanyaManager kampanyaManager = new KampanyaManager();
		kampanyaManager.add(kampanya);
		kampanyaManager.delete(kampanya);
		kampanyaManager.update(kampanya,"%24 İndirim");
		
		GameSell gameSell = new GameSell();
		gameSell.sell(user);
		gameSell.sell(user,kampanya);
		
		
	}

}
