import java.util.Scanner;
public class Finally {

	public static void main(String[] args) {
		Scanner masukan =new Scanner (System.in);
		int angka;
		System.out.print("Masukan Angka :" );
		try {
			angka = masukan.nextInt();
			System.out.println("Anda  memasukan angka " +angka);
			
		}catch (Exception e) {
			System.out.println("Anda tidak memasukan angka ");
			
		}finally {
			System.out.println("Program selesai.");
		}

	}

}
