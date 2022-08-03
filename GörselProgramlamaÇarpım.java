import javax.swing.JOptionPane;


public static void main(String[] args) {
		
		String sayi = JOptionPane.showInputDialog("Birinci sayiyi giriniz");
		int sayi3 = Integer.valueOf(sayi);

		String sayi2 = JOptionPane.showInputDialog("İkinci sayiyi giriniz");
		int sayi4 = Integer.valueOf(sayi2);

		JOptionPane.showMessageDialog(null, sayi3 * sayi4);
    
  }
