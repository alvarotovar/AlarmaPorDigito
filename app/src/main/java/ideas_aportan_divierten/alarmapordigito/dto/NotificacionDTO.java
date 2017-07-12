package ideas_aportan_divierten.alarmapordigito.dto;

import java.util.Date;

/**
 * Created by aatm on 6/21/17.
 */

public class NotificacionDTO {

    private Date fecha;
    private boolean antesAlarma;

    public enum TIPO_ALERTA{

        ANTES, DURANTE, DESPUES, NO_HAY_MAS_HOY
    }

    public NotificacionDTO() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isAntesAlarma() {
        return antesAlarma;
    }

    public void setAntesAlarma(boolean antesAlarma) {
        this.antesAlarma = antesAlarma;
    }
}
