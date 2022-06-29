public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		int[] dizi1 = new int[5];
		float ortalama = 0F;
		
		for (int i = 0; i < dizi1.length; i++) {
			dizi1[i] = klavye.nextInt();
		}

		for(int j = 0; j < dizi1.length; j++) {
			ortalama += dizi1[j]; 
		}
		ortalama /= 5.0;
		System.out.println(ortalama);

	}
