	public static void main(String[] args) {

		System.out.print("Yükseklik Giriniz: ");

		int bosluk = 1;

		Scanner klavye = new Scanner(System.in);

		int yükseklik = klavye.nextInt();

		for (int i = 1; i <= yükseklik; i++) {
			for (int j = i; j <= yükseklik; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= bosluk; k++) {
				if (k % 2 == 0) {
					System.out.print(" ");
				} else {
					System.out.print(i);
				}
			}
			bosluk += 2;
			System.out.println();
		}
	}
