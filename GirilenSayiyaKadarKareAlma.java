	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		int baslangic = klavye.nextInt();
		int toplam = 0;

		for (int i = 1; i <= baslangic; i++) {
			toplam += i * i;
		}
		System.out.println(toplam);

	}
}
