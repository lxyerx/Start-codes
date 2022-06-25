	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		
		System.out.print("Ucgenin Uzunlu�unu Girin: ");
		float uzunluk = klavye.nextFloat();
		
		System.out.print("Ucgenin Yuksekligini Girin: ");
		float yukseklik = klavye.nextFloat();
	
		float carpim = (uzunluk * yukseklik) /2;
		System.out.println(carpim);
		
	}
}
