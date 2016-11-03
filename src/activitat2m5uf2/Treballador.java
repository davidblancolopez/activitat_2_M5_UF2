
package activitat2m5uf2;


public class Treballador {

    public static int DIRECTOR = 0;
    public static int SUBDIRECTOR = 1;
    public static int NORMAL = 2;
    private int tipusTreballador;
    private int nomina;
    private int horesExtra;

    public Treballador(int trabajador, int i, int i0) {
        this.tipusTreballador = trabajador;
        this.nomina = i;
        this.horesExtra = i0; 
    }

    int getTipusTreballador() {
        return tipusTreballador;
    }

    float getNomina() {
        return nomina;
    }

    int getHoresExtres() {
        return horesExtra;
    }
    

   

    
    

    


}
