import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i;
		int num_g = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a frase> ");
		String frase = sc.nextLine();
		System.out.print("Digite a letra> ");
		char letra = sc.next().charAt(0);
		sc.close();
		
		for (i=0; i < frase.length(); i++) {
			char ver = frase.charAt(i);
			letra = Character.toUpperCase(letra);
			ver = Character.toUpperCase(ver);
			if (letra == ver) {
				num_g = num_g +1;
			}
		}
			if (num_g != 0) {
			System.out.println("Possui a letra " + letra + "!");
			System.out.println("Número de vezes: " +num_g);
			} else {
				System.out.println("Não possui a letra " + letra);
			}

}
}