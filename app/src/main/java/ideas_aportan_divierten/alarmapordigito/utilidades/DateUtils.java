package ideas_aportan_divierten.alarmapordigito.utilidades;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by aatm on 27/06/2017.
 */

public class DateUtils {

    public  short comparaFechaAYFechaB_HorasMinutos(Date fechaA, Date fechaB){
        ComparaValoresFecha comparadorFecha = new ComparaValoresFecha(Calendar.HOUR_OF_DAY, fechaA, fechaB);
        short resultado = comparadorFecha.comparar();
        if(resultado == 0){
            comparadorFecha.setOperador(Calendar.MINUTE);
            return comparadorFecha.comparar();
        }else{
            return resultado;
        }
    }

    public class ComparaValoresFecha {
        private int operador;
        private Calendar cal1;
        private Calendar cal2;

        public int getOperador() {
            return operador;
        }

        public void setOperador(int operador) {
            this.operador = operador;
        }

        public ComparaValoresFecha(int operador, Date fechaA, Date fechaB) {
            this.operador = operador;
            cal1 = Calendar.getInstance();
            cal1.setTime(fechaA);
            cal2 = Calendar.getInstance();
            cal2.setTime(fechaB);
        }

        private short comparar() {
            int valor1 = cal1.get(operador);

            int valor2 = cal2.get(operador);

            if(valor1 > valor2){
                return 1;
            }else if(valor1 == valor2){
                return 0;
            }else{
                return -1;
            }
        }
    }


}
