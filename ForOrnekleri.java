public static void main(String[] args) {

		System.out.print("Uzunluk Giriniz: ");

		Scanner klavye = new Scanner(System.in);

		int Uzunluk = klavye.nextInt();

		for (int i = 0; i < Uzunluk; i++) {
			System.out.print("*");
		}

		System.out.println();

		for (int i = 0; i < Uzunluk / 2 - 1; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("*");
				for (int k = 0; k < Uzunluk / 2 - 1; k++) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = 0; i < Uzunluk; i++) {
			System.out.print("*");
		}

		System.out.println();

		for (int i = 0; i < Uzunluk / 2 - 1; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("*");
				for (int k = 0; k < Uzunluk / 2 - 1; k++) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = 0; i < Uzunluk; i++) {
			System.out.print("*");
		}
		System.out.println();

	}
