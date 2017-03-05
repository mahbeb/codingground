public class Tugas10{
	public static void main(String[] args){
		Biodata10 b = new Biodata10();

		b.setNama("Fathul Mahbub");
		b.setUmur(22);
		b.setAlamat("Jepara");

		String namaPrint = b.getNama();
		int umurPrint = b.getUmur();
		String alamatPrint = b.getAlamat();

		System.out.println("Nama : " + namaPrint + "\nAlamat : " + alamatPrint + "\nUmur : " + umurPrint);
	}
}