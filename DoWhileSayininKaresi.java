	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		int sayi;
    System.out.println("Bir sayi giriniz (programdan cikmak icin 0 giriniz): ");
		do {
			sayi = klavye.nextInt();
			System.out.print("Sayinin karesi: => " + sayi * sayi);
			System.out.println();

		} while (sayi != 0);
		System.out.println("0 Girildigi icin cikildi");

	}
