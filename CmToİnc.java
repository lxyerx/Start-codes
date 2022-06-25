public static void main(String[] args) {

		System.out.println("inc Uzunlugunu cm cinsine donusturen programa hosgeldiniz");
		System.out.print("Donustureceginiz inc uzunlugunu giriniz: ");
    
		Scanner klavye = new Scanner(System.in);
                double inc = klavye.nextDouble();
		
		double formul = 2.54;	
		
		double hesaplama = inc * formul;
		
		System.out.println("Donusturme islemi basarili: "+hesaplama);
		
		
	}


