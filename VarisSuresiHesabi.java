public static void main(String[] args) {

	Scanner klavye = new Scanner(System.in);

	System.out.print("Yol mesafesini giriniz: ");
	int yol = klavye.nextInt();

	System.out.print("Gitmek istediginiz sureyi giriniz : ");
	int sure = klavye.nextInt();

        System.out.println("Gitmeniz gereken ortalama hız = " + (yol / sure) + "km/s dir.");
 }

