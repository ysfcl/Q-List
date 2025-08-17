package q_gui;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.GridLayout;

class Pencere extends JFrame{
	
	JButton jb;
	JTextField jtf_ep;
	JLabel jlbl;
	JTextField jtf_yas;
	
	Pencere(){

		super("kayit formu");
		int en=400,boy=200;
		
		this.setSize(en,boy);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		
		this.setLayout(new GridLayout(4,2));
		
	
		jlbl=new JLabel("Yasinizi giriniz:");
		this.add(jlbl);
		
		jtf_yas=new JTextField(30);
		this.add(jtf_yas);
		
		jlbl=new JLabel("E-posta giriniz:");
		this.add(jlbl);
		
		jtf_ep=new JTextField(50);
		this.add(jtf_ep);
		
		jb=new JButton("Gonder");
		this.add(jb);

		jb.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {

				String yasStr;
				int yas;
				
				String e_posta;
				
				
				try {
				
				yasStr=jtf_yas.getText();
				yas=Integer.parseInt(yasStr);
					
				e_posta=jtf_ep.getText();	
				
				if(yas<18) {
					JOptionPane.showMessageDialog(null,"Yas 18'den kucuk olamaz!");
					
				}
				
				else 
				{
					JOptionPane.showMessageDialog(null,"Yas kaydedildi.");
				}
		
				
				if(e_posta==null||e_posta.trim().isEmpty()||!e_posta.contains("@")) {
					JOptionPane.showMessageDialog(null,"Gecersiz veya bos e-posta!");
					
				}
				
				else
				{
					JOptionPane.showMessageDialog(null,"E-posta kaydedildi.");
				}
				
				JOptionPane.showMessageDialog(null,"Yas:"+yas+"\nE-posta:"+e_posta);
				dispose();	//pencereyi kapatma komutu
				
			}catch(Exception ex) {
				System.out.println("Hata:"+ex.getMessage());
			}
				
		}
			
	});
		
		this.setVisible(true);
}

	
}


public class Test {
	public static void main(String[] args) {
		Pencere x=new Pencere();
	}
}
