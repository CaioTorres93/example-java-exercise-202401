import java.util.Scanner;
public class leitor_de_temperatura {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int temperaturasTotais = 12;
        double somaTemperaturas = 0;

        for(int i = 1; i <= temperaturasTotais; i++){
            double temperatura;
            do{
                System.out.println("Digite a temperatura: "+i+ "(entre 4 e 10 graus celcius)");
                temperatura = input.nextDouble();
            }while(temperatura <4 || temperatura > 10);

            somaTemperaturas += temperatura;

        }

double media = somaTemperaturas/temperaturasTotais;
System.out.println("Media das temperaturas é: " + media + "C");

    }
}