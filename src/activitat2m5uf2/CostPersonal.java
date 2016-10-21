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
    public static float CostDelPersonal(Treballador treballadors[]) {
		float costFinal = 0;
		Treballador treballador;
		
		for (int i = 0; i < treballadors.length; i++) {
			
			if (treballadors[i].getTipusTreballador() == Treballador.DIRECTOR || \
			treballadors[i].getTipusTreballador() == Treballador.SUBDIRECTOR) {
				costFinal = costFinal + treballadors[i].getNomina();
			} else {
				costFinal = costFinal + treballador.getNomina() + \
					(treballador.getHoresExtres() * 20);
			}
		}
		return costFinal;
	}