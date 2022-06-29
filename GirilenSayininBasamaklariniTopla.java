	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		
		System.out.print("Sayi giriniz: ");
		int sayi = klavye.nextInt();
		int toplam = 0;
		while (sayi != 0) {

			toplam += sayi % 10;
			sayi /= 10;

		}
		System.out.println(toplam);

	}
