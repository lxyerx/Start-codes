	public static void main(String[] args) {
		System.err.println("Sicaklik dönüştürücü.");

		Scanner klavyeScanner = new Scanner(System.in);

		System.out.print("Fahrenheit F giriniz: ");
		double f = klavyeScanner.nextDouble();

		double donusum = (f - 32) / 1.8;

		System.out.printf("%.1f", donusum);

	}
