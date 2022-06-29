	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		int toplam = 0;
		System.out.print("Baslangic degeri giriniz: ");
		int baslangic = klavye.nextInt();

		System.out.print("Bitis degerini giriniz: ");
		int bitis = klavye.nextInt();

		System.out.print("Artis degerini giriniz: ");
		int artis = klavye.nextInt();

		for (int i = baslangic; i <= bitis; i += artis) {
			toplam += i;
		}
		System.out.println(toplam);
