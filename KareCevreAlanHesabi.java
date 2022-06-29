	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.print("Karenin bir kenar uzunluğunu giriniz: ");
		double uzunluk = klavye.nextDouble();

		double cevre = uzunluk * 4;
		double alan = uzunluk * uzunluk;

		System.out.println("Cevre = " + cevre);
		System.out.println("Alan = " + alan);

	}
