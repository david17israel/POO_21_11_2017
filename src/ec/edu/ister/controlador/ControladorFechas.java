
package ec.edu.ister.controlador;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ControladorFechas {
    public static synchronized int diferenciaFechas(Date fechaInicial, Date fechaFinal){
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        String fechaInicioString = df.format(fechaInicial);
        long milisegundosinicial = fechaInicial.getTime();
        long milisegundosfinal = fechaFinal.getTime();
        long diferencia = milisegundosfinal - milisegundosinicial;
        double dias = Math.floor(diferencia/(1000*60*60*24));//flor redondea el numero
        
        try {
            fechaInicial=df.parse(fechaInicioString);
        } catch (Exception e) {
        }
        
        String fechaFinalString = df.format(fechaFinal);
        try {
            fechaFinal=df.parse(fechaFinalString);
        } catch (Exception e) {
        }
        return (int)dias;
    }
}
