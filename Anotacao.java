/** Anotacao
* @author Felipe Rodrigues
* @author Gabriel Grossi
* @author Gabriele Colares
* @author Luiza Giovana
* @author Vicente Hofmeister
* @version 2022-06-27 
 */




/**
*Classe utilizando Orientacao a Objeto
*/

public class Anotacao{

      private int minuto, hora, dia, mes, ano;
      private String ave;

      /**
      *Constroi o objeto Anotacao
      *
      */
      public Anotacao(int min, int h, int d, int me, int a, String b){
            minuto = min;
            hora = h;
            dia = d;
            mes = me;
            ano = a;
            ave = b;
      }

      /** 
      Buscar nome da ave do objeto
      @return o nome da ave
      */

      public String getAve(){
            return this.ave;
      }

      /**
      Buscar minuto do avistamento da ave do objeto
      @return minutos 
      */

      public int getMinuto(){
          return this.minuto;
      }

      /**
      Buscar hora do avistamento da ave do objeto
      @return o horário 
      */

      public int getHora(){
          return this.hora;
      }

      /**
      Buscar dia do avistamento da ave do objeto
      @return o dia
       */

      public int getDia(){
          return this.dia;
      }

      /**
      Buscar mes do avistamento da ave do objeto
      @return o mes 
      */

      public int getMes(){
          return this.mes;
      }

      /**
      Buscar o ano do avistamento da ave do objeto
      @return o ano
      */

      public int getAno(){
          return this.ano;
      }

}
