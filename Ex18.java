package entrada_processamento_saída;

import java.util.Scanner;
public class Ex18 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double a , v0, t, vm, vk;
		
		System.out.printf("Informe a acelarção em metros por segundo: ");
		a = ler.nextDouble();
		
		System.out.printf("Informe a velocidade inicial em metros por segundo: ");
		v0 = ler.nextDouble();
		
		System.out.printf("Informe o tempo do percuso em segundos: ");
		t = ler.nextDouble();
		
		vm = v0 + (a * t);
		vk = vm * 3.6;
		
		if (vk <= 40) {
			System.out.printf("%.1f km/h---Veículo muito lento", vk);
		}else if (vk <= 60){
			System.out.printf("%.1f km/h---Veículo na velocidade permitida", vk);
		}else if (vk <= 80) {
			System.out.printf("%.1f km/h---Veículo na velocidade de cruzeiro", vk);
		}else if (vk <= 120) {
			System.out.printf("%.1f km/h---Veículo rápido", vk);
		}else {
			System.out.printf("%.1f km/h---Veículo muito rápido", vk);
		}
	}
}
