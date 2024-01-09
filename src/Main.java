import beans.Veiculo;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Veiculo carro = new Veiculo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Modelo: ");
        carro.modelo = sc.nextLine();

        System.out.println("Digite a Marca: ");
        carro.marca = sc.nextLine();

        System.out.println("Digite a Cor: ");
        carro.cor = sc.nextLine();

        System.out.println("Digite a Distancia: ");
        carro.distancia = sc.nextDouble();

        System.out.println("Digite a quantidade de litros que gastou: ");
        carro.litro = sc.nextDouble();

        System.out.println("Modelo do Carro: " + carro.modelo + " \n"
                + "Marca do Carro:  "  + carro.marca + " \n" + "A Cor do Carro: " + carro.cor + " \n"
                + "Distancia Percorrida: " + carro.distancia + " \n" + "Quantidade de Litros Gasto: " + carro.litro);

     carro.consumoMedio();
        System.out.println("Consumo Médio de Combustivel : " + carro.consumoMedio());



    }
}