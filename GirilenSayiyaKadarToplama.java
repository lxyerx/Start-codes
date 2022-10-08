public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		int sayi = 1;
		int temp = 0;
		int sayac = 1;
		
		while(true) {
			
			if(sayi == 0) {
				break;
			}
			
			System.out.print(sayac++ + ". Sayiyi Giriniz: ");

			sayi = klavye.nextInt();
			
			temp += sayi;

		}
		
		System.out.println(temp);

	}
