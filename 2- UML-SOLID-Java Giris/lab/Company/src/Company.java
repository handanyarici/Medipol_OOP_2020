import java.util.Scanner;

/**
 * Created by TCHYARICI on 02/18/2020
 */
public class Company {
	public static void main(String[] args){
		System.out.println("Kar miktarini giriniz");
		Scanner kar = new Scanner(System.in);
		int karMiktari = kar.nextInt();

		System.out.println("Zarar miktarini giriniz");
		Scanner zarar = new Scanner(System.in);
		int zararMiktari = zarar.nextInt();

		if(karMiktari > zararMiktari){
			System.out.println("Kar yaptiniz:" + (karMiktari-zararMiktari));
		}else{
			System.out.println("Zarar yaptiniz:" + (zararMiktari-karMiktari));
		}

	}
}
