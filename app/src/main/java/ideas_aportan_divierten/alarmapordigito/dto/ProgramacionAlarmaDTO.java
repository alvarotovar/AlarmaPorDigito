package ideas_aportan_divierten.alarmapordigito.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by aatm on 6/21/17.
 */

public class ProgramacionAlarmaDTO implements Serializable{

    private List<Integer> minutosDeNotificacionesAntes;
    private List<Integer> minutosDeNotificacionesDurante;

    public ProgramacionAlarmaDTO() {
    }

    public List<Integer> getMinutosDeNotificacionesAntes() {
        return minutosDeNotificacionesAntes;
    }

    public void setMinutosDeNotificacionesAntes(List<Integer> minutosDeNotificacionesAntes) {
        this.minutosDeNotificacionesAntes = minutosDeNotificacionesAntes;
    }

    public List<Integer> getMinutosDeNotificacionesDurante() {
        return minutosDeNotificacionesDurante;
    }

    public void setMinutosDeNotificacionesDurante(List<Integer> minutosDeNotificacionesDurante) {
        this.minutosDeNotificacionesDurante = minutosDeNotificacionesDurante;
    }
}
