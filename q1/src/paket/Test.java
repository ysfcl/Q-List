package paket;

import java.io.File;
import java.io.BufferedWriter;
import java.io.PrintWriter;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

class Kisi{
	int yas;
	String ad_soyad,e_posta;
	
	Kisi(){}
	
	Kisi(int yas,String ad_soyad,String e_posta){
		this.yas=yas;
		this.ad_soyad=ad_soyad;
		this.e_posta=e_posta;
	}
	
	void goster() {
		System.out.println("KISI OZELLIKLERI:\n\n");
		System.out.println("Ad-Soyad:"+ad_soyad+"Yas:"+yas+"E-posta:"+e_posta);
	}
}


public class Test {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in); 
		
		int yas;
		String ad_soyad,e_posta;
				
		try {
	
			File d=new File("C:\\DENEME:\\kullanici.txt");
			
			PrintWriter pw=new PrintWriter(d);
			
			System.out.println("Lutfen yas giriniz:");
			yas=input.nextInt();
			
			input.nextLine();
			
			if(yas<=18) {
				throw new Exception("Yas 18'den kucuk olamaz!"); 
			}
			
			System.out.println("Lutfen ad soyad giriniz:");
			ad_soyad=input.nextLine();
			
			if(ad_soyad.trim().isEmpty()) {
				throw new Exception("Ad soyad bos olamaz");
			}
			
			input.nextLine();
			
			System.out.println("Lutfen email giriniz:");
			e_posta=input.nextLine();
			
			if(e_posta.trim().isEmpty()) {
				throw new Exception("E-posta bos olamaz");
			}
			
			Kisi k=new Kisi(yas,ad_soyad,e_posta);
			k.goster();
			
			pw.println("KULLANICI OZELLIKLERI:\n\n"+"Ad-Soyad:"+ad_soyad+"\nYas:"+yas+"\nE-posta:"+e_posta);
			pw.close();
		
			BufferedReader br=new BufferedReader(new FileReader("C:\\DENEME\\kullanici.txt"));
			
			String satir;
			
			while((satir=br.readLine())!=null) {
				System.out.println(satir);
			}
			
			br.close();
		}catch(Exception e) {
	
			System.out.println("Hata:"+e.getMessage());
	
		}finally {
			System.out.println("Program sonlandiriliyor...");
			input.close();
			
		}
	
	}
}
