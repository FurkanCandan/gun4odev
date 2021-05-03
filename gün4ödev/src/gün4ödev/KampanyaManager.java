package gün4ödev;

public class KampanyaManager {
	
	public void add(Kampanya yeniKampanya) {
		
		System.out.println("Kampanya eklendi : " + yeniKampanya.getKampanyaAdi() + " => " + yeniKampanya.getKampanyaNot());
		
	}
	

	public void delete(Kampanya k) {
		
		System.out.println("Kampanya Silindi : " + k.getKampanyaAdi() + " => " + k.getKampanyaNot());
		
	}
	

	public void update(Kampanya k, String not) {
		
		k.setKampanyaNot(not);
		
		System.out.println("Kampanya Güncellendi : " + k.getKampanyaAdi() + " => " + k.getKampanyaNot());
		
	}

}
