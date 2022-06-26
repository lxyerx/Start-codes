	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		System.out.println("Kelime Giriniz");
		String kelime = klavye.nextLine();
		int sayac = 1;

		for (int i = 1; i < kelime.length(); i++) {
			if (kelime.charAt(i) == ' ') {
				sayac++;
			}
		}
		System.out.println(sayac);

	}
