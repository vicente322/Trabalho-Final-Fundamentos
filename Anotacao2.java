
/**
*Classe utilizando Orientacao a Objeto
*/

public class Anotacao2{

      private int minuto, hora, dia, mes, ano;
      private String ave;

      /**
      *Constroi o objeto Anotacao2
      *
      */
      public Anotacao2(int min, int h, int d, int me, int a, String b){
            minuto = min;
            hora = h;
            dia = d;
            mes = me;
            ano = a;
            ave = b;
      }

      public String getAve(){
            return this.ave;
      }
}
