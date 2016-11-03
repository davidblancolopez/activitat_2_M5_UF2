package activitat2m5uf2;

import java.util.ArrayList;
import java.util.Collection;

public class CostPersonal {
/**
 * Este metodo recorre el array de trabajadores y va comprobando uno a uno si 
 * ese trabajador es director o subdirector o es un trabajador normal, en funcion 
 * de la condición que cumpla se calculara costFinal. Si es director o subdirector
 * será costFinal + la nomina, si es trabajador normal será costFinal + la nomina + horesExtres.
 * @param treballadors
 * @return 
 */
    
    private static float costFinal = 0;
    private static final int preuHoresExtra = 20;
    
    public static float calculSouTreballador(Treballador treballadors[]) {
                
		
		Treballador treballador = null;
		
		for (int i = 0; i < treballadors.length; i++) {
                        treballador = treballadors[i];
			int tipusTreballador = tipusTreballador(treballador);
                        costFinal = costFinal(treballador, tipusTreballador);
		}
		return costFinal;
    }
    
    /**
     * Este metodo devuelve el tipo de trabajador que es con un INT si es director 
     * o subdirectori será 1 si es empleado normal es 2.
     * @param treballador
     * @return 
     */
    public static int tipusTreballador(Treballador treballador){
        int tipus;
        if (treballador.getTipusTreballador() == Treballador.DIRECTOR || 
            treballador.getTipusTreballador() == Treballador.SUBDIRECTOR) {
            tipus = treballador.DIRECTOR;
        }else{
            tipus = treballador.NORMAL;
        }
        
        return tipus;
    }
    
    
    
 
    
    public static float costFinal(Treballador treballador, int num){

        if (num == treballador.DIRECTOR || num == treballador.SUBDIRECTOR) {
            costFinal = costFinal + treballador.getNomina();
        }else{
            costFinal = costFinal + treballador.getNomina() + (treballador.getHoresExtres() * preuHoresExtra);
        }
    return costFinal;
    }
}