
package ec.edu.ister.modelo;

import java.util.Date;
import java.sql.*;

public interface Edad {
    public String calcularEdad();
    public Date sumarFechasDias(Date fch, int dias);  
    //public String diferenciaEntreFechas();
    
}
