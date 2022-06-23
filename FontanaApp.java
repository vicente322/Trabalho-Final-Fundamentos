import java.util.Scanner;

/**Fontana App
*
*@author Felipe Rodrigues
*@author Gabriel Grossi
*@author Gabriele Colares
*@author Luiza Giovana
*@author Vicente Hofmeister
*@version 2022-06-20
*/


public class FontanaApp{

      public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            Ave ave1 = new Ave("passarinho", "Passarus diminutus", "azul", "campo");
            int op = 0;

            //para execução do código se digitar 9 no menu
            while (op != 9){

                  System.out.println("\n\n\n\n\n\n\t        MENU");
                  System.out.println("\t        ====");
                  System.out.println("\t1 - Conferir catálogo");
                  System.out.println("\t2 - Usar anotações");
                  System.out.println("\t9 - sair");
                  op = sc.nextInt();

                  //Garante que resposta vai ser um dos números das opções
                  while (op != 1 && op != 2 && op != 3 && op != 4 && op != 9){
                        System.out.println("Opção invalida");
                        op = sc.nextInt();
                  }

                  switch(op){
                        case 1:
                              System.out.println("\n\t     CATALOGO");
                              System.out.println("\t     ========");
                              System.out.println("\t1 - Nome da ave");
                              System.out.println("\t2 - Nome científico da ave");
                              System.out.println("\t3 - Cor da ave");
                              System.out.println("\t4 - Habitat da ave");
                              System.out.println("\t0 - Voltar");
                              op = sc.nextInt();

                              //Garante que resposta vai ser um dos números das opções
                              while(op != 1 && op != 2 && op != 3 && op != 4 && op != 0){
                                    System.out.println("Opção invalida");
                                    op = sc.nextInt();
                              }

                              switch(op){
                                    case 1:
                                          System.out.println("\n\t NOME DA AVE");
                                          System.out.println("\t " + ave1.getName());
                                          break;

                                    case 2:
                                          System.out.println("\n\t NOME CIENTIFICO DA AVE");
                                          System.out.println("\t " + ave1.getScienceName());
                                          break;

                                    case 3:
                                          System.out.println("\n\t COR DA AVE");
                                          System.out.println("\t " + ave1.getColor());
                                          break;

                                    case 4:
                                          System.out.println("\n\t HABITAT DA AVE");
                                          System.out.println("\t " + ave1.getHabitat());
                                          break;

                                    case 0:
                                          break;
                              }
                        break;

                        case 2:
                              System.out.println("\n\t     ANOTAÇÕES");
                              System.out.println("\t     =========");
                              System.out.println("\t1 - Nova anotação");
                              System.out.println("\t2 - Checar anotações");

                  }

            }

      }

}
