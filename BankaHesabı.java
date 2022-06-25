public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.println("0- Cikis  1- Para Yatirma  2- Para cekme");

		int anahtar = klavye.nextInt();
		int bakiye = 1000;

		switch (anahtar) {
		case 0: {
			System.out.println("Basariyla Cikis Yapildi");
			break;
		}
		case 1: {
			System.out.print("Ne kadar yatirmak istiyorsunuz: ");
			System.out.println("Guncel Bakiyeniz " + bakiye);

			int yenibakiye = klavye.nextInt();
			yenibakiye += bakiye;
			System.out.println("Yeni Bakiyeniz: " + yenibakiye);
			break;
		}
		case 2: {

			System.out.print("Ne kadar çekmek istiyorsunuz: ");
			System.out.println("Güncel bakiyeniz: " + bakiye);

			int cekilenpara = klavye.nextInt();

			if (cekilenpara > bakiye || cekilenpara <= 0) {
				System.out.println("Yetersiz bakiye");
			}

			else {
				bakiye -= cekilenpara;
				System.out.println("Basariyla para cekildi kalan bakiye: " + bakiye);
			}

			break;

		}

		default:
			System.out.print("Hatali");
			break;

		}
}

	
