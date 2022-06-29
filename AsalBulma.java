	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		System.out.print("Sayiyi giriniz: ");
		int sayi = klavye.nextInt();
		int sayac = 0;

		for (int i = 2; i <= sayi; i++) {
			if (sayi % i == 0)
				sayac++;
		}

		if (sayac == 1) {
			System.out.println("Asal sayidir ");
		} else {
			System.out.println("Asal degildir");
		}

	}
