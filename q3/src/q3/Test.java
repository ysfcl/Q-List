package q3;

class Gorev implements Runnable{
	
	String metin;
	Gorev(){}
	
	Gorev(String metin){
		this.metin=metin;
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(metin+"{" +(i+1) +"}");
			
			try {
				Thread.sleep(1000);
				
			}catch(Exception e) {
				System.out.println("Hata: Thread interrupt edildi.");
			}
			
		}
	}
}

public class Test {
	public static void main(String[] args) {
		
		String s1="Merhaba";
		String s2="Dunya";
		
		Thread t1=new Thread(new Gorev(s1));
		
		Thread t2=new Thread(new Gorev(s2));
		
		t1.start();
		t2.start();
		
	}
}
