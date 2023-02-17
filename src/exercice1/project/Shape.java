/**
 * @author N'ZO LAGOU
 * 
 * La classe Shapeest la classe de base de la XShapeclasse.

Vous devez modifier la getName()méthode de la classe dérivée,
 c'est-à-dire XShape, pour que le code renvoie ce qui suit :

Saisir

Derived Class Name

Shape circle = new XShape("Circle");
Sortir

Base Class Name, Derived Class Name
"Shape, Circle"
Le code partiellement terminé ne renvoie pas la sortie 
correcte, vous pouvez donc également le modifier pour le rendre correct.
 */


package exercice1.project;

public class Shape {
	
	// attribut 
	
	private String name;

	// constructor without parameter
	public Shape(String name) {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		
		return "shape, " ;
	}

	
	
	

}
