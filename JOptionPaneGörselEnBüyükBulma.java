	public static void enbuyukbulma(int x, int y, int z) {
		
		int maks = 0;
		if (y >= x && y >= z) {
			maks = y;
			
		}
		else if (x > y && x > z) {
			maks = y;			
		}
		else {
			maks = z;
		}
		JOptionPane.showMessageDialog(null, "Girdiginiz en büyük sayi: " + maks);
	}

	public static void main(String[] args) {

		String NumberOne = JOptionPane.showInputDialog(null,"İlk Sayiyi Giriniz - X");
		
		String NumberTwo = JOptionPane.showInputDialog(null,"İkinci Sayiyi Giriniz - Y");

		String NumberThree = JOptionPane.showInputDialog(null,"Üçüncü Sayiyi Giriniz - Z");
		
		Integer x = Integer.valueOf(NumberOne);
		Integer y = Integer.valueOf(NumberTwo);
		Integer z = Integer.valueOf(NumberThree);

		enbuyukbulma(x, y , z);

	}
