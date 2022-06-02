package imc;
import javax.swing.JOptionPane;
 // tabela IMC https://pt.wikipedia.org/wiki/%C3%8Dndice_de_massa_corporal:
/**
 *
 * @author Fernanda Thomaz
 */

public class IMC {
 public static void main(String[] args) {
      String peso, altura;
      
        peso = JOptionPane.showInputDialog("Digite seu peso em Kg: ");
        float p = Float.parseFloat(peso);
        
        altura = JOptionPane.showInputDialog("Digite sua altura em cm: ");
        float a = Float.parseFloat(altura);
        
        float imc = p/(a*a);
        System.out.println("Seu imc = " +imc);
    
        if (imc <= 17) {
            System.out.println("Muito abaixo do seu peso");
        } else if ((imc >17) && (imc <=18.49)) {
            System.out.println("Abaixo do seu peso");
        } else if ((imc > 18.49) && (imc<=24.99)) {
            System.out.println("Peso normal");
        } else if ((imc > 24.99) && (imc <=29.99)) {
            System.out.println("Acima do seu peso");
        }else if ((imc > 29.99) && (imc <=34.99)) {
            System.out.println("Obesidade II (severa)");
        }else {
            System.out.println("Obesidade III (mórbida)");
    }
}

}
