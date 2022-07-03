package reto1;

/**
 *
 * @author Cristian Quintero
 */
public class Solution{
    //ESTA CLASE NO TIENE MAIN
    
    
    public static int [] reporte(int [] compra){
        //EN ESTE ESPACIO PONER SU LÓGICA
        int [] salida = new int[3];
        int valor = 0;
        int barato = 0;
        int caro = 0;
        for (int i =0; i < compra.length; i++){
            valor += compra[i];
            if (compra[i] < barato || barato == 0) {
                barato = compra[i];
            }
            if (compra[i] > caro) {
                caro = compra[i];
            }
        }

        salida[0] = valor;
        salida[1] = barato;
        salida[2] = caro;
   
        return salida;
        
        
    }
}
