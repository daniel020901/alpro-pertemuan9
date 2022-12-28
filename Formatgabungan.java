import java.util.Date;
class Formatgabungan {
	public static void main (String args[])
	{
		String teks = "Jumlah Mahasiswa :";
		int jml = 20;
		Date tgl = new Date();
		System.out.printf("Tampilkan %S %d dihari %tA", teks, jml,tgl);
	}

}
