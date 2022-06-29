	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		int sonuc = 1;
		System.out.print("Taban giriniz: ");
		int taban = klavye.nextInt();

		System.out.print("Kuvvet giriniz: ");
		int kuvvet = klavye.nextInt();

		for (int i = 1; i <= kuvvet; i++) {
			sonuc *= taban;
		}
		System.out.println(sonuc);

	}
