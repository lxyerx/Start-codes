
	public static void main(String[] args) {

		int[] dizi = {1,2,3,-62,4,5,6,88,7,22,8,9,10,66};
		
		int enBuyuk = dizi[0];
		int ikinciBuyuk = dizi[0];
		
		for(int i = 0; i < dizi.length; i++) {
			if(enBuyuk < dizi[i]) {
				
				ikinciBuyuk = enBuyuk;
				enBuyuk = dizi[i];
				
			}
			else if(dizi[i] > ikinciBuyuk) {
				ikinciBuyuk = dizi[i];
			}

		}
		System.out.println(ikinciBuyuk);

		System.out.println(enBuyuk);

	}
