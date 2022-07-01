public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		System.out.println("Satir sayisi Giriniz: NxN ");
		int n = klavye.nextInt();

		int[][] matris1 = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					matris1[i][j] = 1;
				} else {
					matris1[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("\t" + matris1[i][j]);
			}
			System.out.println();
		}

	}
