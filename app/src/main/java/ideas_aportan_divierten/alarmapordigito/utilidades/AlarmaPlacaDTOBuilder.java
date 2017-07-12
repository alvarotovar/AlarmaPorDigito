package ideas_aportan_divierten.alarmapordigito.utilidades;

import java.util.Date;
import java.util.List;

import ideas_aportan_divierten.alarmapordigito.dto.AlarmaPlacaDTO;
import ideas_aportan_divierten.alarmapordigito.dto.RangoDTO;

/**
 * Created by aatm on 30/06/2017.
 */

public class AlarmaPlacaDTOBuilder {

    private AlarmaPlacaDTO alarmaPlacaDTO;

    public AlarmaPlacaDTOBuilder() {
        alarmaPlacaDTO = new AlarmaPlacaDTO();
    }

    public AlarmaPlacaDTOBuilder setNombre(String nombre){
        alarmaPlacaDTO.setNombre(nombre);
        return this;
    }

     public AlarmaPlacaDTOBuilder setRangos(List<RangoDTO> rangos){
         alarmaPlacaDTO.setRangos(rangos);


     }
    public AlarmaPlacaDTO build(){
        return alarmaPlacaDTO;
    }
}
