import java.util.Scanner;

/**Fontana App
*
* @author Felipe Rodrigues
* @author Gabriel Grossi
* @author Gabriele Colares
* @author Luiza Giovana
* @author Vicente Hofmeister
* @version 2022-06-20
*/


public class FontanaApp{


    /**
     * Procura a ave pelo nome e retorna os dados associados a ela
     */

    public static void searchName(Scanner sc, Ave[] a){

        String research = sc.next();
        String[] result = new String[a.length];
        int resultCheck = 0; //Gambiarra pra conferir se nenhum resultado foi encontrado

        for (int i = 0; i < a.length; i++){
            if (a[i] != null && (a[i].getName()).contains(research)){
                System.out.println("\n" + a[i].getName() + "\n" + a[i].getScienceName() + "\n" + a[i].getColor() + "\n" + a[i].getHabitat());
                resultCheck++;
            }
            else if (i == 9 && resultCheck == 0){
                System.out.println("\nNenhuma ave encontrada");
            }
        }
    }

    /*
     * Procura a ave pelo nome cientifico e retorna dados associados a ela
     */

    public static void searchScienceName(Scanner sc, Ave[] a){

        String research = sc.next();
        String[] result = new String[a.length];
        int resultCheck = 0;

        for (int i = 0; i < a.length; i++){
            if (a[i] != null && (a[i].getScienceName()).contains(research)){
                System.out.println("\n" + a[i].getScienceName() + "\n" + a[i].getName() + "\n" + a[i].getColor() + "\n" + a[i].getHabitat());
                resultCheck++;
            }
            else if (i == 9 && resultCheck == 0){
                System.out.println("\nNenhuma ave encontrada");
            }
        }
    }

    /*
     * Procura a ave pela cor e retorna dados associados a ela
     */

    public static void searchColor(Scanner sc, Ave[] a){

        String research = sc.next();
        String[] result = new String[a.length];
        int resultCheck = 0;

        for (int i = 0; i < a.length; i++){
            if (a[i] != null && (a[i].getColor()).contains(research)){
                System.out.println("\n" + a[i].getColor() + "\n" + a[i].getName() + "\n" + a[i].getScienceName() + "\n" + a[i].getHabitat());
                resultCheck++;
            }
            else if (i == 9 && resultCheck == 0){
                System.out.println("\nNenhuma ave encontrada");
            }
        }
    }

    /*
     * Procura a ave pelo habitat e retorna dados associados a ela
     */

    public static void searchHabitat(Scanner sc, Ave[] a){

        String research = sc.next();
        String[] result = new String[a.length];
        int resultCheck = 0;

        for (int i = 0; i < a.length; i++){
            if (a[i] != null && (a[i].getHabitat()).contains(research)){
                System.out.println("\n" + a[i].getHabitat() + "\n" + a[i].getName() + "\n" + a[i].getScienceName() + "\n" + a[i].getColor());
                resultCheck++;
            }
            else if (i == 9 && resultCheck == 0){
                System.out.println("\nNenhuma ave encontrada");
            }
        }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        Ave[] aves = new Ave[10];
        Anotacao[] caderno = new Anotacao[10];

        int contadorAnotacoes = 0;

        aves[0] = new Ave("pica-pau-branco ", "Melanerpes candidus", "branco", "campo com arores, arbustos ou arvoretas");
    	aves[1] = new Ave("noivinha-coroada", "Xolmis coronatus", "branco", "campo com arores, arbustos ou arvoretas" );
    	aves[2] = new Ave("cardeal", "Paroaria coronata", "branco", "campo com arores, arbustos ou arvoretas" );
    	aves[3] = new Ave("tijerila", "Xenopsaris albinucha", "branco", "campo com arores, arbustos ou arvoretas");
    	aves[4] = new Ave("grauna", "Gnorinopsar chopi", "preto", "campo seco baixo");
    	aves[5] = new Ave("cardeal-do-banhado", "Amblyramphus holosericeus", "preto", "banhado com espelho d'agua");
    	aves[6] = new Ave("sargento", "Agelasticus thilius,", "preto", "banhado com espelho d'agua" );
    	aves[7] = new Ave("tiziu", "Volatinia jacarina", "preto", "campo com arores, arbustos ou arvoretas" );
    	aves[8] = new Ave("batuíra-de-papo-ferruginio", "Oreopholus ruficollis", "cinza", "campo seco baixo");
    	aves[9] = new Ave("pomba-do-orvalho", "Patagioenas maculosa", "cinza", "campo com arores, arbustos ou arvoretas");
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
                System.out.println("\t1 - Pesquisar pelo nome da ave");
                System.out.println("\t2 - Pesquisar pelo nome científico da ave");
                System.out.println("\t3 - Pesquisar pela cor da ave");
                System.out.println("\t4 - Pesquisar pelo habitat da ave");
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
                    searchName(sc, aves);
                    break;

                    case 2:
                    System.out.println("\n\t NOME CIENTIFICO DA AVE");
                    searchScienceName(sc, aves);
                    break;

                    case 3:
                    System.out.println("\n\t COR DA AVE");
                    searchColor(sc, aves);
                    break;

                    case 4:
                    System.out.println("\n\t HABITAT DA AVE");
                    searchHabitat(sc, aves);
                    break;

                }
                break;

                case 2:
                System.out.println("\n\t     ANOTAÇÕES");
                System.out.println("\t     =========");
                System.out.println("\t1 - Nova anotação");
                System.out.println("\t2 - Checar anotações");
                System.out.println("\t0 - Voltar");

                op = sc.nextInt();

                //Garante que resposta vai ser um dos números das opções
                while(op != 1 && op != 2 && op != 0){
                    System.out.println("Opção invalida");
                    op = sc.nextInt();
                }

                switch(op){

                    case 1:
                    if(contadorAnotacoes >= 10) {
                        System.out.println("Não é possível adicionar mais anotações");
                    }
                    else{
                        String[] data;
                        String[] horario;
                        int minuto, hora, dia, mes, ano;
                        String ave;

                        System.out.println("Informe a data (dd/mm/aaaa)");
                        data = sc.next().split("/");
                        dia = Integer.parseInt(data[0]);
                        mes = Integer.parseInt(data[1]);
                        ano = Integer.parseInt(data[2]);

                        System.out.println("Informe o horario (hh:mm)");
                        horario = sc.next().split(":");
                        hora = Integer.parseInt(horario[0]);
                        minuto = Integer.parseInt(horario[1]);


                        System.out.println("Informe a ave avistada");
                        ave = sc.next();

                        caderno[contadorAnotacoes] = new Anotacao(minuto, hora, dia, mes, ano, ave);

                        /*
                        System.out.println(caderno[contadorAnotacoes].getDia() + "/" + caderno[0].getMes() + "/" + caderno[0].getAno());
                        System.out.println(caderno[0].getHora() + ":" + caderno[0].getMinuto());
                        System.out.println(caderno[0].getAve());
                        */

                        contadorAnotacoes++;
                    }
                    break;

                    case 2:
                    System.out.println("\n\t     ANOTAÇÕES");
                    System.out.println("\t     =========");
                    System.out.println("\t1 - Chegar por número da anotação");
                    System.out.println("\t2 - Checar por mês");
                    System.out.println("\t0 - Voltar");
                    op = sc.nextInt();

                    //Garante que resposta vai ser um dos números das opções
                    while(op != 1 && op != 2 && op != 0){
                        System.out.println("Opção invalida");
                        op = sc.nextInt();
                    }

                    switch(op){

                        case 1:
                        System.out.println("Insira o número da anotação desejada");
                        int nAnotacao = sc.nextInt();

                        while (nAnotacao > contadorAnotacoes){
                            System.out.println("Número maior que o número atual de anotações");
                            nAnotacao = sc.nextInt();
                        }

                        System.out.println("\n\nAnotação " + nAnotacao);
                        System.out.println("Ave: " + caderno[nAnotacao - 1].getAve());
                        System.out.printf("Data: %d/%d/%d\n", caderno[nAnotacao - 1].getDia(), caderno[nAnotacao - 1].getMes(), caderno[nAnotacao - 1].getAno());
                        System.out.printf("Horario: %d:%2d", caderno[nAnotacao - 1].getHora(), caderno[nAnotacao - 1].getMinuto());

                            
                        case 2:
                        System.out.println("Insira o mês da anotação desejada:");

                        public static void searchMes(Scanner sc, int me){

                        int mesResearch = sc.nextInt();
                         String[] result = new String[me.length];
                        int resultCheck = 0;

                        for (i=0; i < me.length; i++){
                            if (mesResearch == caderno[i].me && != null){
                        System.out.println("\n\nAnotações no mês " + mesResearch);
                        System.out.println("Ave: " + caderno[mes].getAve());
                        System.out.printf("Data: %d/%d/%d\n", caderno[nAnotacao - 1].getDia(), caderno[nAnotacao - 1].getMes(), caderno[nAnotacao - 1].getAno());
                        System.out.printf("Horario: %d:%2d", caderno[nAnotacao - 1].getHora(), caderno[nAnotacao - 1].getMinuto()); 
                        resultCheck++;
                   }
                        else if (i == 9 && resultCheck == 0){
                        System.out.println("\nNenhuma ave encontrada");
               }
            }
        }
    
                    }

                }

            }

        }

    }

}
