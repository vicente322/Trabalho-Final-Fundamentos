
/**
*Classe utilizando Orientacao a Objeto
*/

public class Anotacao{

      private int minuto, hora, dia, mes, ano;
      private String ave;

      /**
      *Constroi o objeto Anotacao2
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

      public String getAve(){
            return this.ave;
      }

      public int getMinuto(){
          return this.minuto;
      }

      public int getHora(){
          return this.hora;
      }

      public int getDia(){
          return this.dia;
      }

      public int getMes(){
          return this.mes;
      }

      public int getAno(){
          return this.ano;
      }

}
