package fcu.iecs.oop.tiida;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		NissanTiida a  = new NissanTiida();
		Scanner scanner  = new Scanner(System.in);
		int x=scanner.nextInt();
		a.tiida(x);
		
	}

}
