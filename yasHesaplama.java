	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.print("Yili giriniz: ");
		int yil = klavye.nextInt();
		System.out.println("Dogum tarihinizi giriniz: ");
		int dogum = klavye.nextInt();

		System.out.println("Yasiniz => " + (yil - dogum));

	}
