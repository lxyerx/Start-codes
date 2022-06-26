	public static void main(String[] args) {
  
		int sayac = 0;
		Scanner klavye = new Scanner(System.in);
		int[] sayi = new int[6];
		for (int i = 0; i < sayi.length; i++) {
			sayi[i] = klavye.nextInt();
		}

		for (int j = 0; j < sayi.length; j++) {
			if (sayi[j] % 2 == 0) {
				sayac++;
			}
		}
		System.out.print("Cift sayısı " + sayac);
	}
