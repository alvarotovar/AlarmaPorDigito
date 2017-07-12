package ideas_aportan_divierten.alarmapordigito.dto;

import java.util.Date;

/**
 * Created by aatm on 6/21/17.
 */

public class RangoDTO {

    private Date fechaInicio;
    private Date fechaFin;

    public RangoDTO() {

    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
