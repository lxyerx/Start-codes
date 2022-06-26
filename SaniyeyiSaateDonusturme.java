	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.print("Dönüştürülecek saniyeyi giriniz: ");

		int saniye = klavye.nextInt();

		int dakika = saniye / 60;
		int saat = dakika / 60;

		dakika = dakika % 60;
		saniye = saniye % 60;

		System.out.printf("%02d:%02d:%02d", saat, dakika, saniye);

	}
