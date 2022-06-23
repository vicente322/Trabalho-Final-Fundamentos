import java.util.Scanner;

/**
*
* @author Felipe Rodrigues
* @author Gabriel Grossi
* @author Gabriele Colares
* @author Luiza Giovana
* @author Vicente Hofmeister
* @version 2022-06-20
*
*   b) [1 pt] classe Anotação contendo ao menos data e ave identificada.
*
*   O ornitólogo tem interesse em avistar as aves em seu ambiente natural,
*   por isso anota onde a ave foi vista e quando foi vista. Com esses dados,
*   planeja atividades com outros ornitólogos que desejam observar essa ave.
*
*
*
*/

class Anotacao{

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int dia,mes;
        String data_mes;
        String data_final;
        String ave;

        data_mes = (""); // para evitar erro de inicializacao;

        System.out.println("Favor informar o numero do mes: ");
        mes = sc.nextInt();
        System.out.println("Favor informar o numero do dia: ");
        dia = sc.nextInt();
        System.out.println("Favor informar a ave identificada: ");
        ave = sc.next();

        switch (mes){
            case 1:
            data_mes = ("Janeiro");
            if (dia >= 1 && dia <= 31){
                  dia = dia;
            }
            break;

            case 2:
            data_mes = ("Fevereiro");
            if (dia >= 1 && dia <= 28){
                dia = dia;
            }
            break;

            case 3:
            data_mes = ("Marco");
            if (dia >= 1 && dia <= 31){
                dia = dia;
            }
            break;

            case 4:
            data_mes = ("Abril");
            if (dia >=1 && dia <= 30){
                dia = dia;
            }
            break;

            case 5:
            data_mes = ("Maio");
            if (dia >= 1 && dia <= 31){
                dia = dia;
            }
            break;

            case 6:
            data_mes = ("Junho");
            if (dia >= 1 && dia <= 30){
                dia = dia;
            }
            break;

            case 7:
            data_mes = ("Julho");
            if (dia >= 1 && dia <= 31){
                dia = dia;
            }
            break;

            case 8:
            data_mes = ("Agosto");
            if (dia >= 1 && dia <= 31){
                dia = dia;
            }
            break;

            case 9:
            data_mes = ("Setembro");
            if (dia >= 1 && dia <= 31){
                dia = dia;
            }
            break;

            case 10:
            data_mes = ("Outubro");
            if (dia >= 1 && dia <= 31){
                dia = dia;
            }
            break;

            case 11:
            data_mes = ("Novembro");
            if (dia >= 1 && dia <= 31){
                dia = dia;
            }
            break;

            case 12:
            data_mes = ("Dezembro");
            if (dia >= 1 && dia <= 31){
                dia = dia;
            }
            break;

            default:
                System.out.println("Data invalida");
        }

        System.out.println(data_mes);
        System.out.println(dia);
        System.out.println(ave);

        sc.close();

        }
    }
