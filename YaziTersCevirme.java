	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		System.out.print("Cevrilecek yaziyi giriniz: ");
		String yazi = klavye.nextLine();
		String ters = "";

		for (int i = yazi.length() - 1; 0 <= i; i--) {
			ters += yazi.charAt(i);
		}
		System.out.println(ters);
	}
