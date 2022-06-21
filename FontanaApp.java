import java.util.Scanner;

/**Fontana App
*
*@author Felipe Rodrigues
*@author Gabriel Grossi
*@author Gabriele Colaris
*@author Luiza Giovana
*@author Vicente Hofmeister
*@version 2022-06-20
*/


public class FontanaApp{

      public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            //Ave ave1 = new Ave();
            //Anotacao caderno = new Anotacao();
            int userAnswer;

            System.out.printf("\nFontanaApp!!\n\n");
            System.out.printf("O que você deseja fazer?(1 ou 2)\n");

            userAnswer = sc.nextInt();

            while (userAnswer != 1 && userAnswer != 2){
                  System.out.printf("\nResposta inválida, tente novamente\n");
                  userAnswer = sc.nextInt();
            }

            if (userAnswer == 1){
                  System.out.printf("\nPesquisa!\n\n");
                  System.out.printf("Qual passaro você deseja pesquisar?\n");

                  //ave1.searchName(sc);
                  //ave1.showBird();
            }
            else if(userAnswer == 2){
                  System.out.printf("\nAnotação!\n\n");
                  System.out.printf("O que você viu?\n");

                  //caderno.newRegister();
            }


      }

}
