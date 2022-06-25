	public static void printarray(int[] p) { // 
		for (int k = 0; k < p.length; k++) { // dizi yazdirma fonksiyonu
			System.out.println(p[k]);
		}
	}

	public static void array(int[] j) {  // Foreach fonksiyon
		for (int v : j) {
			System.out.println(v);
		}
	}

	public static void main(String[] args) {

		int[] dizi1 = { 1, 2, 3, 4, 5 };   

		System.out.println(Arrays.toString(dizi1));  // Arrays.to String arrays sınıfının özelliği

	}
