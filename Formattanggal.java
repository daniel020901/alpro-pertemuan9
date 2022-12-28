import java.util.Date;
class Formattanggal {
	public static void main(String args[])
	{
		Date tanggal = new Date();
		System.out.printf("Cetak tanggal : %td %<tB %<tY" , tanggal);
	}

}
