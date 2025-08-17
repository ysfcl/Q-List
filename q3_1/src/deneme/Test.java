package deneme;

class ParaKutusu implements Runnable{
	
	private int bakiye=0;
	private ParaKutusu kutu;
	
	ParaKutusu(){}
	
	ParaKutusu(int bakiye,ParaKutusu kutu){
		this.bakiye=bakiye;
		this.kutu=kutu;
	}
	
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			kutu.paraEkle();
		}
	}
	
	synchronized void paraEkle() {
		bakiye++;
	}
	
	int getBakiye() {
		return bakiye;
	}

	
}

public class Test {
	public static void main(String[] args) {
		int bakiye=0;
		ParaKutusu kutu=new ParaKutusu();
		
		Thread t1=new Thread(new ParaKutusu(bakiye,kutu));
		Thread t2=new Thread(new ParaKutusu(bakiye,kutu));
		
		
		t1.start();
		t2.start();
		
		try{
		
		t1.join();
		t2.join();
		
		}catch(Exception e) {
			System.out.println("Hata:"+e.getMessage());
		}
		
		System.out.println("Son bakiye:"+kutu.getBakiye());
		
	}
}
