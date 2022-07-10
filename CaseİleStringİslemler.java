	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.err.println("1. Cikis yapar - 2. A'dan Z ye yazdırma - 3. Z'den A'ya yazdirma -");
		System.err.println("4. isminizi alt alta yazdirma - 5.isminizin uzunlugu kadar yazdirma");

		do {
			int secim = klavye.nextInt();

			if (secim == 1) {
				System.err.println("Cikis yapiliyor");
				break;
			}

			switch (secim) {
			case 2: {
				System.err.println("A'dan Z'ye Yazdirma");
				for (char b = 'A'; b <= 'Z'; b++) {
					System.out.printf("%2c ", b);
				}
				System.out.println("\n");
				break;

			}

			case 3: {
				System.err.println("Z'den A'ya Yazdirma");
				for (char k = 'Z'; k >= 'A'; k--) {
					System.out.printf("%2c ", k);

				}
				System.out.println("\n");
				break;

			}

			case 4: {
				System.err.println("isminizin harflerini tek tek alt alta yazdirma");
				System.out.print("isim giriniz: ");
				String isim = klavye.next();
				for (int k = 0; k < isim.length(); k++) {
					System.out.println(isim.charAt(k));
				}
				break;
			}
			case 5: {
				System.err.println("isminizin uzunlugu kadar yazdirma");
				System.out.println("isim giriniz: ");
				String isim = klavye.next();
				for (int q = 0; q < isim.length(); q++) {
					char yeni = isim.charAt(q);
					System.out.println(isim);
				}
				break;

			}

			default:
				System.out.println("Boyle bir secenek yoktur");
			}

		} while (true);

	}
