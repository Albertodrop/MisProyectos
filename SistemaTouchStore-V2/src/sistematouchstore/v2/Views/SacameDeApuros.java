/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematouchstore.v2.Views;



/**
 *
 * @author ALBERTO
 */
public class SacameDeApuros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SacameDeApuros a = new SacameDeApuros();
        System.out.println("Valores para 25");
        System.out.println("x           +y              -y");
        a.sqrtGeneral(25);
        System.out.println("Valores para 24");
         System.out.println("x           +y              -y");
        a.sqrtGeneral(24);
        System.out.println("Valores para 21");
         System.out.println("x           +y              -y");
        a.sqrtGeneral(21);
        System.out.println("Valores para 16");
         System.out.println("x           +y              -y");
        a.sqrtGeneral(16);
        System.out.println("Valores para 9");
         System.out.println("x           +y              -y");
        a.sqrtGeneral(9);
        System.out.println("Valores para 0");
         System.out.println("x           +y              -y");
        a.sqrtGeneral(0);
        

    }
      public void sqrtGeneral(int valorz){
          double res;
          double max = Math.sqrt(valorz);
          double min = max*(-1);
           for (double i = min; i <= max; i++) {
            res = Math.sqrt((valorz) - (i) * (i));
            String a = String.valueOf(String.format("%.4f", res));
            String b = String.valueOf(String.format("%.4f",i));
            System.out.println(b+"          "+a+"               -"+a);
        }
      }

}
