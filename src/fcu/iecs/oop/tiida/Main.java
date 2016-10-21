package fcu.iecs.oop.tiida;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		NissanTiida a  = new NissanTiida();
		Scanner scanner  = new Scanner(System.in);
		int x=scanner.nextInt();
		int y=0;
		for (y=0;y<x;y++){
			System.out.printf("第%d次呼叫\n",y+1);
			a.tiida();
		}
	}

}
