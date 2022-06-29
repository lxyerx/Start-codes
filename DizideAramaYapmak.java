
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		System.out.print("Aranacak sayiyi giriniz: ");
		int ara = klavye.nextInt();

		int[] dizi = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int temp = -1;
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] == ara) {
				temp = i;
				break;
			}
		}
		if (temp != -1) {
			System.out.println("Aranilan eleman bulundu indis numarasi: " + (temp+1));
		} else {
			System.out.println("Aranilan eleman bulunamadi");
		}
	}
