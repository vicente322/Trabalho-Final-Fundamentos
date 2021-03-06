
/** Ave
*@author Felipe Rodrigues
*@author Gabriel Grossi
*@author Gabriele Colaris
*@author Luiza Giovana
*@author Vicente Hofmeister
*@version 2022-06-27
*/


public class Ave{

    private String name;
    private String scienceName;
    private String color;
    private String habitat;

    /**
     * Constroi o objeto Ave
     *
     */

    public Ave(String a, String b, String c, String d){
        name = a;
        scienceName = b;
        color = c;
        habitat = d;
    }

    /**
     * Busca o nome comum do passaro pesquisado
     * @return o nome comum
     */

    public String getName(){
        return this.name;
    }

    /**
     * Busca o nome cientifico da ave
     * @return o nome cientifico
     */

    public String getScienceName(){
        return this.scienceName;
    }

    /**
     * Busca a cor da ave
     * @return a cor
     */

    public String getColor(){
        return this.color;
    }

    /**
     * Busca o habitat da ave
     * @return o habitat
     */

    public String getHabitat(){
        return this.habitat;
    }

}
