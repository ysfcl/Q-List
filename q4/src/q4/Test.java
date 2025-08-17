package q4;

import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		String yasStr;
		String e_posta;
		int yas;
		
		yasStr=JOptionPane.showInputDialog("Lutfen yasinizi giriniz:");
				
		yas=Integer.parseInt(yasStr);
		
		if(yas<18) {
			JOptionPane.showMessageDialog(null,"Yas 18'den kucuk olamaz!");
			System.exit(1);
		}
		
		else {
			JOptionPane.showMessageDialog(null,"Yas bilgisi tamam");
		}
		
		e_posta=JOptionPane.showInputDialog("E-posta adresini giriniz:");
		
		if(e_posta==null|| e_posta.trim().isEmpty()||!e_posta.contains("@")) {
			JOptionPane.showMessageDialog(null,"Gecersiz e posta girisi!");
		}
		else {
			JOptionPane.showMessageDialog(null,"Hos geldiniz!\n"+"Yasiniz:"+yas+"\nE-posta:"+e_posta);
		}
	}
}
