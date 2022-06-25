	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Secim Yapinnz Toplama - Cikarma - Carpma - Bolme");
		int secim = klavye.nextInt(); 
		System.out.print("ilk sayiyi giriniz: ");
		int a = klavye.nextInt(); 
    
		System.out.print("ikinci sayiyi giriniz: ");
		int b = klavye.nextInt(); 
    
		System.out.print("Ucuncu sayiyi giriniz: ");
		int c = klavye.nextInt(); 
    
		System.out.print("Dorduncu sayiyi giriniz: ");
		int d = klavye.nextInt(); 
		if (secim == 1) {
			System.out.println("Sayilarin Toplam�: "+(a + b + c + d));
		}
		else if (secim == 2) {
			System.out.println("Sayilarin cikarimi: "+(a - b - c - d));
		}
		else if (secim == 3) {
			System.out.println("Sayilarin carpimi: "+(a * b * c * d));
		}
		else if (secim == 4) {
			System.out.println("Sayilarin bolumu: "+(a / b / c / d));
		}
		else {
			System.out.println("Boyle bir secim yok);
		}

	}
