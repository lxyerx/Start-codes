	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.print("Faktoriyelini İstediginiz Sayiyi Giriniz: ");
		int sayi = klavye.nextInt();
    
		int faktoriyel = 1;
		for (int i = 1; i <= sayi; i++) {
			faktoriyel = faktoriyel * i;
		}
		System.out.println(faktoriyel);

	}
