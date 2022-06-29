	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		System.out.print("Ters cevrilecek sayiyi giriniz: ");
		int sayi = klavye.nextInt();

		while (sayi != 0) {
			System.out.println(sayi % 10);
			sayi /= 10;
		}

	}
