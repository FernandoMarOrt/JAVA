package LocalDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 *
 * @author alvaro
 */
public class Movida {

    public static void main(String[] args) {

        // CREACION DE UNA FECHA CON LA DE HOY  LOCALDATE
        LocalDate fechaHoy = LocalDate.now();
        // MOSTRAR POR SEPARADO
        System.out.println("Año " + fechaHoy.getYear());
        System.out.println("Mes " + fechaHoy.getMonthValue());
        Month mesActual = fechaHoy.getMonth();
        System.out.println("Month " + mesActual);

        // FECHAS CONCRETAS
        LocalDate fecha = LocalDate.of(2000, 11, 10);
        LocalDate fecha2 = LocalDate.of(2022, Month.NOVEMBER, 10);

        System.out.println("Fecha " + fecha);

        // COMPROBAR Q SON IGUALES CON EQUALS
        if (fecha.equals(fecha2)) {

            System.out.println("Son iguales");
        } else {

            System.out.println("No son iguales");

        }

        // VER SI LA FECHA ES ANTERIOR O POSTERIOR A OTRA
        if (fecha.isBefore(fecha2)) {
            System.out.println("La fecha es anterior a fecha2");
        }
        if (fecha.isAfter(fecha2)) {
            System.out.println("La fecha es posterior a fecha2");
        }

        // CLASE Q GUARDA MES Y DIA     MONTHDAY
        MonthDay nocheVieja = MonthDay.of(12, 31);

        // CLASE Q GUARDA AÑO Y MES     YEARMONTH
        YearMonth añoMes = YearMonth.of(2023, 2);

        
        // OPERACIONES CON FECHAS
        
        // SUMAR DIAS AL ACTUAL
        System.out.println("hoy" + fechaHoy);
        System.out.println("Despues de 100 dias " + fechaHoy.plusDays(100));
        System.out.println("hoy " + fechaHoy);

        
        // SUMAR MESES
        LocalDate sumarMeses = fechaHoy.plusMonths(13);
        System.out.println("Despues de 13 meses " + sumarMeses);

        
        //SUMAR SIGLOS
        LocalDate dosSigloDespues = sumarMeses.plus(2, ChronoUnit.CENTURIES);
        System.out.println("2 SIGLOS DESPUES " + dosSigloDespues);

        
        // VER DIFERECIA DE DIAS DE DOS FECHAS
        // Te coge el dia de antes en la fecha2 es decir si la fecha es dia 31 te coge el 30
        long diferenciaDias = ChronoUnit.DAYS.between(fecha, fecha2);
        System.out.println(diferenciaDias);

        
        // VER DIFERENCIA DE AÑOS
        long years = ChronoUnit.YEARS.between(fecha, fecha2);
        System.out.println(years);

        
        // T O F SI EL AÑO ES BISIESTO
        boolean esBisiesto = fechaHoy.isLeapYear();
        System.out.println(esBisiesto);
        
        
        System.out.println("\n#################################################\n");
        
        // VER DIAS DE UN MES
        System.out.println("Dias del mes actual " + fechaHoy.lengthOfMonth());

        //Dia de hoy
        Locale configLocal = Locale.getDefault();
        System.out.println("Fecha hoy dia "
                + fechaHoy.getDayOfWeek().getDisplayName(TextStyle.FULL, configLocal));

        //Version acortada
        Locale configLocal2 = Locale.getDefault();
        System.out.println("Fecha hoy dia "
                + fechaHoy.getDayOfWeek().getDisplayName(TextStyle.SHORT, configLocal2));

        //Primera letra del dia
        Locale configLocal3 = Locale.getDefault();
        System.out.println("Fecha hoy dia "
                + fechaHoy.getDayOfWeek().getDisplayName(TextStyle.NARROW, configLocal3));

        //A chino
        Locale configLocal4 = Locale.getDefault();
        System.out.println("Fecha hoy mes "
                + mesActual.getDisplayName(TextStyle.FULL, Locale.CHINA));

        
        // DAR FORMATO A LA FECHA
        DateTimeFormatter formatoFechas = DateTimeFormatter.ofPattern("dd/MM/yyy");

        String fechaFormateada = fechaHoy.format(formatoFechas);

        System.out.println(fechaFormateada);

    }
}
