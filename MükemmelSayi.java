	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.println("Sayi Giriniz");
		int sayi = klavye.nextInt();
		int toplam = 0;
		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam += +i;
			}
		}
		if (sayi == toplam) {
			System.out.println("Mukemmel sayi");
		} else {
			System.out.println("Mukemmel degil");
		}
	}
