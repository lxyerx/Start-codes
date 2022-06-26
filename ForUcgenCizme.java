	public static void main(String[] args) {

		int bosluk = 0;
		for (int i = 0; i <= 7; i++) {
			for (int j = 10; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= bosluk; k++) {
				System.out.print("*");
			}
			System.out.println();
			bosluk += 2;

		}
	}
