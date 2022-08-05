	public static void tekmi(int y) {
		
		if (y % 2 == 0) {
			JOptionPane.showMessageDialog(null,"Cevabınız Cift : " + y);
		}
		else {
			JOptionPane.showMessageDialog(null,"Cevabınız Tek : " + y);

		}
		
	}

	public static void main(String[] args) {

		String x = JOptionPane.showInputDialog(null,"Sayi Gir");
						
		Integer yeniX = Integer.valueOf(x);
			
		tekmi(yeniX);
		
		

	}
