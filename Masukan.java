import java.util.Scanner;
class Masukan {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner masukan = new Scanner (System.in);
		String nama;
		
		System.out.println("Masukan nama Anda");
		try {
		        nama = masukan.next();
		
		        System.out.println("Selamat datang, " + nama);
		}catch(Exception e) {
			System.out.println("Anda tidak memasuka nama anda");
		}

	}

}
