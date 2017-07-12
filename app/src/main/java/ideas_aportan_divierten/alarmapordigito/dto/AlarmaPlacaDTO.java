package ideas_aportan_divierten.alarmapordigito.dto;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * DTO para la alarma que usa un digito de la placa
 * Created by aatm on 6/22/17.
 */

public class  AlarmaPlacaDTO  extends AlarmaDTO {
    private int digitoPlaca = -1;


    {
        setTipo_alarma(TIPO_ALARMA.PP_DIA_PLACA);
    }

    public AlarmaPlacaDTO() {

    }


    public AlarmaPlacaDTO(String nombre, List<RangoDTO> rangos, int digitoPlaca) {
        super(nombre, rangos);
        setDigitoPlaca(digitoPlaca);
    }


    /**
     * Busco dia de restricción, no se tiene en cuenta la hora
     * @param dia
     * @return
     */
    public Date buscaProximoDiaAlarma(Date dia) {
        boolean soyPar = (digitoPlaca % 2) == 0;

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dia);
        int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);

        //Valido si hoy hay restricción
        //Falta los dias festivos
        if(diaSemana == Calendar.SATURDAY || diaSemana == Calendar.SUNDAY){
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            return buscaProximoDiaAlarma(calendar.getTime());
        }

        //Valido si hoy tengo restricción
        int diaMes = calendar.get(Calendar.DAY_OF_MONTH);
        boolean hoyTengoRestriccion;
        boolean hoyPar = (diaMes % 2) == 0;
        hoyTengoRestriccion = ((hoyPar && soyPar) || (!hoyPar && !soyPar));
        if(hoyTengoRestriccion){
            return dia;
        }
        else{
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            return buscaProximoDiaAlarma(calendar.getTime());
        }
    }


    public int getDigitoPlaca() {
        return digitoPlaca;
    }

    public void setDigitoPlaca(int digitoPlaca) {
        this.digitoPlaca = digitoPlaca;
    }
}
