	public static void main(String[] args) {

		System.out.println(
				"Programa Hosgeldiniz Programin Amaci Girdiginiz sayiya kadar gelen sayilari toplamasidirr => 1+2+3+4+5");
		System.out.print("Uzunluk sayinizi giriniz: ");
		Scanner klave = new Scanner(System.in);
		float sayi = klave.nextFloat();
		int toplam = 0;
		for (int i = 0; i <= sayi; i++) {
			toplam = toplam + i;
		}

		System.out.println("Sayilarin Toplami: " + toplam);

	}

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		int sayac = 1; 
		int toplam = 0;
		while(sayac <= 10) {
			int sayi = klavye.nextInt();
			toplam += sayi;
			sayac++;
		}
		System.out.println("Sayilarin toplami " + toplam);	

	}

}
