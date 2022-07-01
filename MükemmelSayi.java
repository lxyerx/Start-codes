	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.println("Sayi Giriniz");
		int sayi = klavye.nextInt();
		int toplam = 0;
		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam += i;
			}
		}
		if (sayi == toplam) {
			System.out.println("Mukemmel sayi");
		} else {
			System.out.println("Mukemmel degil");
		}
	} 
	// alttaki ise 10000 e kadar olan mükemmel sayilari yazdirir

	public static void main(String[] args) {

		for (int n = 2; n <= 10000; n++) {
			int toplam = 0;
			for (int j = 1; j < n; j++) {
				if (n % j == 0) {
					toplam += j;
				}
			}

			if (toplam % n == 0) {
				System.out.println(n);
			}
		}

	}
