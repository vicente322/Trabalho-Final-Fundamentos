
/**
*
*@author Felipe Rodrigues
*@author Gabriel Grossi
*@author Gabriele Colaris
*@author Luiza Giovana
*@author Vicente Hofmeister
*@version 2022-06-20
*/


public class Ave{
	private String name;
	private String scienceName;
	private String color;
	private String habitat;

	public Ave(String a, String b, String c, String d){
		name = a;
		scienceName = b;
		color = c;
		habitat = d;
	}

	public String getName(){
		return this.name;
	}

	public String getScienceName(){
		return this.scienceName;
	}

	public String getColor(){
		return this.color;
	}

	public String getHabitat(){
		return this.habitat;
	}

}
