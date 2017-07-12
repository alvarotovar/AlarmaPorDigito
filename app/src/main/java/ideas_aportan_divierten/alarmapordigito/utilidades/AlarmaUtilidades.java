package ideas_aportan_divierten.alarmapordigito.utilidades;


import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import ideas_aportan_divierten.alarmapordigito.dto.AlarmaDTO;
import ideas_aportan_divierten.alarmapordigito.dto.AlarmaPlacaDTO;

import ideas_aportan_divierten.alarmapordigito.dto.NotificacionDTO;
import ideas_aportan_divierten.alarmapordigito.dto.RangoDTO;


/**
 * Created by aatm on 6/21/17.
 */

public class AlarmaUtilidades {

    public static NotificacionDTO calculaProximaNotificacion(AlarmaDTO alarmaDTO){
        switch (alarmaDTO.getTipo_alarma()){
            case PP_DIA_PLACA:
                return CalculaProgramacionAlarmaBasadaPlaca((AlarmaPlacaDTO) alarmaDTO)
                break;
        }
    }


    /**
     * Busco el ultimo rango de la restricción, solo se compara la hora y los minutos
     * @return
     */
    public static Date obtieneUltimaFechaDeRangos(List<RangoDTO> rangos){
        RangoDTO max = Collections.max(rangos, new Comparator<RangoDTO>() {
            @Override
            public int compare(RangoDTO rangoDTO, RangoDTO t1) {
                return new DateUtils().comparaFechaAYFechaB_HorasMinutos(rangoDTO.getFechaFin(), t1.getFechaFin());
            }
        });
        return max.getFechaFin();
    }


    /**
     * Busco el ultimo rango de la restricción, solo se compara la hora y los minutos
     * @return
     */
    public static Date obtienePrimeraFechaDeRangos(List<RangoDTO> rangos){
        RangoDTO max = Collections.min(rangos, new Comparator<RangoDTO>() {
            @Override
            public int compare(RangoDTO rangoDTO, RangoDTO t1) {
                return new DateUtils().comparaFechaAYFechaB_HorasMinutos(rangoDTO.getFechaInicio(), t1.getFechaInicio());
            }
        });
        return max.getFechaFin();
    }

    private static NotificacionDTO calculaProximaProgramacionAlarmaBasadaPlaca(AlarmaPlacaDTO aplacaDTO){

        Date ahora = aplacaDTO.buscaProximoDiaAlarma(new Date());
        Date ultimoRangoDelDia = AlarmaUtilidades.obtieneUltimaFechaDeRangos(aplacaDTO.getRangos());
        if(ahora.before(ultimoRangoDelDia)){

        }else{
            Date date = AlarmaUtilidades.obtienePrimeraFechaDeRangos(aplacaDTO.getRangos());
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(ahora);
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }

    }
}
