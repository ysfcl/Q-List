package q2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String metin;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Lutfen bir metin giriniz:");
		metin=input.nextLine();
		
		input.nextLine();	//buffer temizleme
		
		metin=metin.trim().toLowerCase();
		
		String[] yeni_metin=metin.split(" ");
		int kelime=yeni_metin.length;
		
		StringBuilder sb=new StringBuilder(metin);
		
		sb.reverse();
		
		System.out.println(sb.toString());
		
		System.out.println(kelime+" tane kelimeden olusmaktadir.");
	}
}
