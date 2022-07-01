	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.print("Satir sayisini giriniz: ");
		int satir = klavye.nextInt();
		System.out.print("Sutun sayisini giriniz: ");
		int sutun = klavye.nextInt();
		int[][] matris1 = new int[satir][sutun];
		int[][] matris2 = new int[satir][sutun];
		int[][] toplam = new int[satir][sutun];
		int sayac = 1;

		System.out.println("ilk matrisin elemanlarini giriniz ");
		for (int i = 0; i < satir; i++) {
			for (int j = 0; j < sutun; j++) {
				System.out.print(sayac + "- Elemani giriniz: ");
				matris1[i][j] = klavye.nextInt();
				sayac++;
			}
		}
		sayac = sayac - sayac + (+1);
		System.out.println("ikinci matrisin elemanlarini giriniz ");
		for (int i = 0; i < satir; i++) {
			for (int j = 0; j < sutun; j++) {
				System.out.print(sayac + "- Elemani giriniz: ");
				matris2[i][j] = klavye.nextInt();
				sayac++;
				toplam[i][j] = matris1[i][j] + matris2[i][j];
			}
		}

		System.out.println("Matrislerin toplam: ");
		for (int i = 0; i < satir; i++) {
			for (int j = 0; j < sutun; j++) {
				// System.out.print(toplam[i][j] + "\t"); böyle de yazdırılabilir keyif meselesi
				System.out.println(matris1[i][j] + "+" + matris2[i][j] + "=" + toplam[i][j]);
			}
		}

	}
