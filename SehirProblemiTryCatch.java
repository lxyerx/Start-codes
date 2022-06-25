	public static void main(String[] args) {

		System.out.println(
				"Sehirler arasindaki uzaklik mesafesini bulan.programa Hosgeldiniz ");
		Scanner klavye = new Scanner(System.in);

		try {
			int mesafeleri;

			System.out.print("�lk �ehri giriniz: ");
			int asehri = klavye.nextInt();

			System.out.print("�kinci �ehri giriniz: ");
			int bsehri = klavye.nextInt();

			if (asehri > bsehri) {
				mesafeleri = asehri - bsehri;
				System.out.printf("A Sehrinin - B Sehrine uzakl��� tam olarak %d", mesafeleri);
			} else if (asehri < bsehri) {
				mesafeleri = bsehri - asehri;
				System.out.printf("B Sehrinin - A Sehrine uzakl��� tam olarak %d", mesafeleri);
			} else {
				System.out.println("Girdiginiz �ehirler birbirine e�ittir.");
			}

		} catch (Exception e) {
			System.out.println("String bir de�er girdi�iniz i�in sonland�.");
		}

	}
