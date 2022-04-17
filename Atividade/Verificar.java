public class Verificar {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa(1.75, 57);
		Pessoa pessoa2 = new Pessoa(1.55, 67);
		Pessoa pessoa3 = new Pessoa(1.90, 150);
		
		System.out.printf("IMC do paciente 1: %.2f", pessoa1.calcularIMC());
		System.out.println();
		System.out.printf("IMC do paciente 2: %.2f", pessoa2.calcularIMC());
		System.out.println();
		System.out.printf("IMC do paciente 3: %.2f", pessoa3.calcularIMC());
		System.out.println();
		System.out.println();
		
		System.out.println("Diagnóstico do paciente 1: " + pessoa1.menssagem());
		System.out.println("Diagnóstico do paciente 2: " + pessoa2.menssagem());
		System.out.println("Diagnóstico do paciente 3: " + pessoa3.menssagem());
	}

}