    public static void main(String[] args) {

		Random rsayi = new Random();
		Scanner klavyeScanner = new Scanner(System.in);
		int random = rsayi.nextInt(3);

		System.out.println("Tahmin etmeyi deneyin. 0-Tas | 1- Kagit | 2- Makas");

		int tahmin = klavyeScanner.nextInt();

		if (tahmin >= 3 || tahmin < 0) {
			System.out.println("hatali Secim");

		}
		if (tahmin == 0) {
			if (random == 0) {
				System.out.println("Berabere." + random);
			}
			if (random == 1) {
				System.out.println("Kaybettin" + random);
			}
			if (random == 2) {
				System.out.println("Kazandin" + random);
			}
		}

		else if (tahmin == 1) {
			if (random == 0) {
				System.out.println("Kaybettin." + "Tas");
			}
			if (random == 1) {
				System.out.println("Berabere " + "kagit");
			}
			if (random == 2) {
				System.out.println("Kaybettin " + " Makas");
			}
		} else if (tahmin == 2) {
			if (random == 2) {
				System.out.println("Berabere. " + "Makas");
			}
			if (random == 0) {
				System.out.println("Kaybettin " + "Tas");
			}
			if (random == 1) {
				System.out.println("Kazandin " + "Kagit");
			}
		}

	}


