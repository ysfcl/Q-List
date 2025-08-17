package q5_clone;

import javax.swing.JOptionPane;

class Kisi implements Cloneable{
	
	String ad;
	int yas;
	Adres adres;
	
	Kisi(String ad,Adres adres,int yas){
		this.ad=ad;
		this.adres=adres;
		this.yas=yas;
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Kisi kopya=(Kisi)super.clone();
		kopya.adres=(Adres)adres.clone();	//derin kopyalama
		return kopya;
	}
	
	void goster() {
		System.out.println("Ad:"+ad+"Adres:"+adres.sehir+"Yas:"+yas);
	}
	
}

class Adres implements Cloneable{
	String sehir;
	
	Adres(){}
	
	Adres(String sehir){
		this.sehir=sehir;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	@Override
	public String toString() {
		return sehir;
	}
	
}


public class Test {
	public static void main(String[] args) {
		String ad;
		String yasStr;
		String sehir;
		int yas;
		
		ad=JOptionPane.showInputDialog("Ad gir:");
		yasStr=JOptionPane.showInputDialog("Yas gir:");
		sehir=JOptionPane.showInputDialog("Sehir gir:");
		
		yas=Integer.parseInt(yasStr);
		
		try {
		
		Adres a=new Adres(sehir);
			
		Kisi k1=new Kisi(ad,a,yas);
		Kisi k2=(Kisi)k1.clone();
		
		System.out.println(k1);
		System.out.println(k2);
		
		
		}catch(Exception e) {
			System.out.println("Hata:"+e.getMessage());
		}
	
	
	}
}
