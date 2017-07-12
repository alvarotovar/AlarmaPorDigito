package ideas_aportan_divierten.alarmapordigito.dto;

import java.util.Date;
import java.util.List;


/**
 * DTO para transportar la información base de una alarma
 * Created by aatm on 6/22/17.
 */

public class AlarmaDTO {

    private String nombre;
    private List<RangoDTO> rangos;
    private TIPO_ALARMA tipo_alarma = TIPO_ALARMA.NORMAL;


    public enum TIPO_ALARMA {
        NORMAL,
        PP_DIA_PLACA;
    }

    public AlarmaDTO() {
    }

    public AlarmaDTO(String nombre, List<RangoDTO> rangos) {
        this.nombre = nombre;
        this.rangos = rangos;

    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRangos(List<RangoDTO> rangos) {
        this.rangos = rangos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<RangoDTO> getRangos() {
        return rangos;
    }

    public TIPO_ALARMA getTipo_alarma() {
        return tipo_alarma;
    }

    public void setTipo_alarma(TIPO_ALARMA tipo_alarma) {
        this.tipo_alarma = tipo_alarma;
    }


}
