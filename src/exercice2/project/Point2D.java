/**
 * @author N'ZO LAGOU
 * 
 * Exercice 2 : Implémenter Les Classes Points
Instructions
Ce problème nécessite que vous soumettiez seulement deux classes :

Point2D.java,

et Point3D.java.

N'incluez PAS la public static void main()méthode dans toutes ces classes.

Implémentez toutes les classes à l'aide du langage de programmation
 Java à partir du diagramme de classes UML donné.
 */

package exercice2.project;

public class Point2D {
 //Attribut selon le uml
	
	private float x = 0.0f;
	private float y = 0.0f;
	
	// constructeur san paramettre
	public Point2D() {
		super();
		// TODO Auto-generated constructor stub
	}
	// constructeur avec paramettre

	public Point2D(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	  public float getX() {
	        return this.x;
	    }
	    
	    public void setX(float x) {
	        this.x = x;
	    }
	    
	    public float getY() {
	        return this.y;
	    }
	    
	    public void setY(float y) {
	        this.y = y;
	    }
	    
	    public void setXY(float x, float y) {
	        this.setX(x);
	        this.setY(y);
	    }
	
	// pour un array de la tab uml
	    
	    public float[] getXY() {
	        float[] tabFloat = new float[2];
	        tabFloat[0] = this.x;
	        tabFloat[1] = this.y;
	        return tabFloat;
	    }
// generer un override
	    
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
	    
	    
}
