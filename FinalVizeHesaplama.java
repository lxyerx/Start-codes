	public static void main(String[] args) {
		
	Scanner klavye = new Scanner(System.in);
	System.out.println("Vize Sinavini Giriniz.");
	double Vize = klavye.nextInt();
	System.out.println("Final sinavini Giriniz.");
	double Final = klavye.nextInt();
	double Ortalama = (Vize * 0.2) + (Final * 0.8);

	if(Ortalama >= 60) {
		System.out.println("Tebrikler Gectiniz " + Ortalama);
	}
	else {
		System.out.println("Kaldin " + Ortalama);
	}
}
