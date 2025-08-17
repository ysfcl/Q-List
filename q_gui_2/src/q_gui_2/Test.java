package q_gui_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.*;


class Pencere extends JFrame{

	JTextField jtf;
	JLabel[] etiketler;
	JCheckBox[] jcb;
	JRadioButton[] jrb;
	JComboBox kombo;
	JButton jb;
	
	Pencere(){
		super("super omega mega zurna pencere");
		
		int en=400,boy=300;
		this.setSize(en,boy);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(new GridLayout(6,2));
		
		
		JLabel etiketler[]=new JLabel[4];	
		
		etiketler[0]=new JLabel("Ad-soyad:");
		this.add(etiketler[0]);
		
		jtf=new JTextField(50);
		this.add(jtf);
		
		etiketler[1]=new JLabel("Cinsiyet");
		this.add(etiketler[1]);
		
		this.jrb=new JRadioButton[2];
		ButtonGroup bg=new ButtonGroup();
		String[] cinsiyet= {"Erkek","Kadin"};
		
		for(int i=0;i<jrb.length;i++) {
			jrb[i]=new JRadioButton(cinsiyet[i]);
			this.add(jrb[i]);
		}
		
		bg.add(jrb[0]);
		bg.add(jrb[1]);
		
		
		
		etiketler[2]=new JLabel("Sehir;");
		this.add(etiketler[2]);

		String[] sehir= {"Ankara","Istanbul","Izmir","Bursa"};
		
		this.kombo=new JComboBox<>(sehir);
		this.add(kombo);
		
		
		String[] ilgi= {"Muzik","Spor"};
		
		etiketler[3]=new JLabel("Ilgi:");
		this.jcb=new JCheckBox[2];
		
		for(int i=0;i<jcb.length;i++) {
			jcb[i]=new JCheckBox(ilgi[i]);
			this.add(jcb[i]);
		}
		
		
		
		
		
		jb=new JButton("Gonder");
		this.add(jb);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String ad_soyad;
				String cins;
				String k_sehir;
				String k_ilgi;
				
				ad_soyad=jtf.getText();
				
				if(jrb[0].isSelected()) {
					cins="Erkek";
					JOptionPane.showMessageDialog(null,"Erkek secildi.");
				}
				
				else if(jrb[1].isSelected()){
					cins="Kadin";
					JOptionPane.showMessageDialog(null,"Kadin secildi.");
				}
				
				else {
					cins="Belirtilmedi";
					JOptionPane.showMessageDialog(null,"Belirtilmedi");
				}
				
				
				if(((String)kombo.getSelectedItem()).equals("Istanbul")) {
					k_sehir="Istanbul";
					JOptionPane.showMessageDialog(null,"Istanbul'da yasiyorsunuz.");
				}
				
				else if(((String)kombo.getSelectedItem()).equals("Ankara")) {
					k_sehir="Ankara";
					JOptionPane.showMessageDialog(null,"Ankara'da yasiyorsunuz.");
				}
				
				else if(((String)kombo.getSelectedItem()).equals("Izmir")) {
					k_sehir="Izmir";
					JOptionPane.showMessageDialog(null,"Izmir'de yasiyorsunuz.");	
				}
				
				else {
					k_sehir="Bursa";
					JOptionPane.showMessageDialog(null,"Bursa'da yasiyorsunuz.");
				}
				
				
				
				if(jcb[0].isSelected()&&jcb[1].isSelected()) {
					k_ilgi="Muzik ve Spor";
					JOptionPane.showMessageDialog(null,"Ilgi alaniniz muzik ve spor.");
				}
				
				else if(jcb[0].isSelected()) {
					k_ilgi="Muzik";
					JOptionPane.showMessageDialog(null,"Ilgi alaniniz muzik.");
				}

				else if(jcb[1].isSelected()){
					k_ilgi="Spor";
					JOptionPane.showMessageDialog(null,"Ilgi alaniniz spor.");
				}
				
				else {
					k_ilgi="Belirtilmedi";
				}
				JOptionPane.showMessageDialog(null,"Adiniz-Soyadiniz:"+ad_soyad+"\nCinsiyetiniz:"+cins+"\nYasadiginizi sehir:"+k_sehir+"\nIlgi:"+k_ilgi);
				dispose();
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
