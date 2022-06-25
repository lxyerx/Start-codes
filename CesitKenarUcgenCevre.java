	 public static void main(String[] args) {
		
    
    System.out.println("�e�it Kenar �cgenin �evresini bulan programa ho�geldiniz.");
		
		Scanner klavye = new Scanner(System.in);

		System.out.print(" 1. Kosesini giriniz: ");
		int x = klavye.nextInt();
		System.out.print("Ucgenin 2. Kosesini giriniz: ");
		int y = klavye.nextInt();
		System.out.print("Ucgenin 3. Kosesini giriniz: ");
		int c = klavye.nextInt();
		
		int toplam = c + y + x;
		
		System.out.println("Girdiginiz ucgenin alani: "+toplam);
    }
    
