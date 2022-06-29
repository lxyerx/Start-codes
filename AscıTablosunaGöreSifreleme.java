	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		String ters = "";

		System.out.print("Kelime Giriniz: ");
		String kelime = klavye.nextLine();

		for (int i = 0; i < kelime.length(); i++) {
			ters += (char) (((int) kelime.charAt(i)) + 15);
		}
		System.out.println("Sifreli Kelime: " + ters);
	}
