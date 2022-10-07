	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		
		int[] dizi = new int[5];
		int[] yenidizi = new int[55];
		 
		for (int i=0; i<dizi.length; i++)
		{
			dizi[i] = klavye.nextInt();
			yenidizi[dizi[i]-1]++;
			
			if (yenidizi[dizi[i]-1] > 1)
				dizi[i]=0;
		}
		 
		for (int i=0; i < dizi.length; i++)
		{
			if (dizi[i] != 0)
				System.out.print(dizi[i]+" ");
		}
		
		

	}
