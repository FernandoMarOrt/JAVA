
package com.mycompany.ejemplosfechas;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;


public class EjemplosFechas {

    public static void main(String[] args) {
        
        //Clase que guarda fechas
        LocalDate fechaHoy = LocalDate.now();
        System.out.println("Año " + fechaHoy.getYear());
        System.out.println("Mes " + fechaHoy.getMonthValue());
        Month mesActual = fechaHoy.getMonth();
        System.out.println("Month " + mesActual );
        
        
        //Fechas concretas
        LocalDate fecha = LocalDate.of(2000, 11, 10);
        LocalDate fecha2 = LocalDate.of(2022, Month.NOVEMBER, 10);
        
        
        System.out.println("Fecha " + fecha);
        
        
        //Son iguales
        if (fecha.equals(fecha2)) {
            
            System.out.println("Son iguales");
        } else {
            
            System.out.println("No son iguales");
            
        }
        
        
        //Anterior y posterior
        
        
        if (fecha.isBefore(fecha2)) {
            
            System.out.println("La fecha es anterior a fecha2");
        }
        
        if (fecha.isAfter(fecha2)) {
            
            System.out.println("La fecha es posterior a fecha2");
        }
        
        
        //Clase para guardar mes y dia (NO EL AÑO)
        
        MonthDay nocheVieja = MonthDay.of(12, 31);
        
        //Clase para guardar año y mes (NO EL DIA)
        
        YearMonth añoMes = YearMonth.of(2023, 2);
        
        //Operaciones con fechas
        
        //Sumar dias al actual
        System.out.println("hoy" + fechaHoy);
        System.out.println("Despues de 100 dias " + fechaHoy.plusDays(100));
        System.out.println("hoy " + fechaHoy);
        
        //Para sumar meses
        
        LocalDate sumarMeses = fechaHoy.plusMonths(13);
        
        System.out.println("Despues de 13 meses " + sumarMeses);
        
        //SUMAR SIGLOS
        
        LocalDate dosSigloDespues = sumarMeses.plus(2, ChronoUnit.CENTURIES);
        System.out.println("2 SIGLOS DESPUES " + dosSigloDespues);
        
        
        //La diferencia de dias que hay entre 2 fechas
        //Te coge el dia de antes en la fecha2 es decir si la fecha es dia 31 te coge el 30
        
        long diferenciaDias = ChronoUnit.DAYS.between(fecha, fecha2);
        
        System.out.println(diferenciaDias);
        
        long years = ChronoUnit.YEARS.between(fecha, fecha2);
        
        System.out.println(years);
        
        
        //Devuelve true o false si la fecha es bisiesta o no
        
        boolean esBisiesto = fechaHoy.isLeapYear();
        
        
        System.out.println("Dias del mes actual " + fechaHoy.lengthOfMonth());
        
        
        //Dia de hoy
        Locale configLocal = Locale.getDefault();
        System.out.println("Fecha hoy dia " +
                fechaHoy.getDayOfWeek().getDisplayName(TextStyle.FULL, configLocal));
        
        //Version acortada
         Locale configLocal2 = Locale.getDefault();
        System.out.println("Fecha hoy dia " +
                fechaHoy.getDayOfWeek().getDisplayName(TextStyle.SHORT, configLocal));
        
        
        //Primera letra del dia
         Locale configLocal3 = Locale.getDefault();
        System.out.println("Fecha hoy dia " +
                fechaHoy.getDayOfWeek().getDisplayName(TextStyle.NARROW, configLocal));
        
        //A chino
         Locale configLocal4 = Locale.getDefault();
        System.out.println("Fecha hoy mes " +
                mesActual.getDisplayName(TextStyle.FULL, Locale.CHINA));
        
        
        DateTimeFormatter formatoFechas = DateTimeFormatter.ofPattern("dd/MM/yyy");
        
        String fechaFormateada = fechaHoy.format(formatoFechas);
        
        System.out.println(fechaFormateada);
        
    }
}
