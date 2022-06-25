public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		float sayi = klavye.nextFloat();

		if (sayi - (int) sayi == 0) {
			System.out.println("Tam Sayi");
		} else {
			System.out.println("Tam Sayi degildir");
		}
	}
