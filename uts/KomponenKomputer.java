import java.util.*;
public class KomponenKomputer{
	public static void main(String[] args) throw Exception {
		try {
			pilih();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void pilih() throw Exception {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Komponen Komputer yang tersedia [1-3] ");
		System.out.println("1.) Harddisk");
		System.out.println("1.) RAM");
		System.out.println("3.) Motherboard");
		System.out.print("Masukan Pilihan Anda : ");
		
		int n = input.nextInt();
		if (n==1){
			System.out.println("Anda memilih Harddisk");
		} else if (n==2){
			System.out.println("Anda memilih RAM");
		} else if (n==3){
			System.out.println("Anda memilih Motherboard");
		} else{
			throw new Exception("pilihan anda tidak ada !");
		}
	}
}