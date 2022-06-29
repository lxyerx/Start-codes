	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		System.out.print("Dikdortgenin uzunlugu giriniz: ");
		double uzunluk = klavye.nextDouble();

		System.out.print("Dikdortgenin genisligini giriniz:  ");
		double genislik = klavye.nextDouble();

		double cevre = 2 * (uzunluk + genislik);
		double alan = uzunluk * genislik;

		System.out.printf("Cevre = %.2f \n", cevre);
		System.out.printf("Alan = %.2f", alan);

	}
