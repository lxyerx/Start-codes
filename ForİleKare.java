	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		int bosluk = 1;
		int sayac = 0;

		System.out.println("Yukseklik Giriniz: ");
		int yükseklik = klavye.nextInt();

		for (int i = 0; i <= yükseklik - 1; i++) {
			for (int j = 1; j <= bosluk; j++) {
				System.out.print(" "); // üst
				sayac++;
			}
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= yükseklik - 2; i++) {
			for (int t = 1; t <= bosluk; t++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 1; k++) {
				System.out.print("*");
			}
			for (int o = 0; o < yükseklik * 2 - 3; o++) {
				System.out.print(" ");
			}
			for (int p = 0; p < 1; p++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (int i = 0; i <= yükseklik - 1; i++) {
			for (int j = 1; j <= bosluk; j++) {
				System.out.print(" "); // en alt
			}
			System.out.print("*");
		}
		System.out.println();

	}
}
