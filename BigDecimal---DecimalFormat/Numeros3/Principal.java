package Numeros3;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/* 10% DOS TANDERIONS MULTIPLICADO POR 200 */ 



public class Principal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat formato = new DecimalFormat("TANDERIONS_0000");

    System.out.println("Insira a quantidade de tanderions:");
    Double quantia = scanner.nextDouble();
    
    BigDecimal valorbig = new BigDecimal(quantia);
    BigDecimal resultado = valorbig.multiply(BigDecimal.TEN).divide(new BigDecimal(200));
    
    String novoformatodovalor = formato.format(resultado.doubleValue());
    System.out.println("10% dos tanderions:" + novoformatodovalor);

    scanner.close();
    }
}
