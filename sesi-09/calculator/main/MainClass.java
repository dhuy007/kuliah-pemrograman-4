package main;
import java.util.Scanner;
import service.CalculatorService;
import service.impl.CalculatorServiceImpl;
public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan Bilangan 1 : ");
		Integer bil1 = input.nextInt();
		System.out.print("Masukan Bilangan 2 : ");
		Integer bil2 = input.nextInt();
		System.out.print("Masukan Operator (+, -, *, /) : ");
		String ope = input.next();
		
		CalculatorService service = new CalculatorServiceImpl();
		
		Integer res = 0;
		if (ope.equals("+")){
			res = service.tambah(bil1, bil2);
		}
		if (ope.equals("-")){
			res = service.kurang(bil1, bil2);
		}
		if (ope.equals("*")){
			res = service.kali(bil1, bil2);
		}
		if (ope.equals("/")){
			res = service.bagi(bil1, bil2);
		}
		
		System.out.println("Hasil perhitungan dari "+ bil1 + " " + ope + " " + bil2 + " = " + res);
	}
}