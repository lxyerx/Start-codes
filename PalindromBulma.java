	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		String ters = "";
		System.out.println("Kelime Giriniz");
		String kelime = klavye.nextLine();
		
		for(int i = kelime.length() - 1; i >= 0; i--) {
			ters = ters + kelime.charAt(i);
		}
		if(ters.equals(kelime)) {
			System.out.println("Girdigin kelime ayni");
		}
		else
			System.out.println("Kelimeler ayni degil");
		
		
	}
