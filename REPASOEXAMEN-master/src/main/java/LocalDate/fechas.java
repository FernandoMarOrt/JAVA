/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 *
 * @author Fer
 */
public class fechas {

    public static void main(String[] args) {
        
          

        //FECHA DE HOY
        LocalDate hoy = LocalDate.now();
        System.out.println("Hoy es " + hoy);
        
        LocalDate fecha = LocalDate.now();
        
        boolean esBisiesto = hoy.isLeapYear(); //TE DICE SI ESTE AÑO ES BISIESTO
        
        
        //FORMATEAR UNA FECHA 
        
        fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        
        
        LocalDate fechaHoy = LocalDate.now();
        System.out.println("Año " + fechaHoy.getYear()); //EL AÑO EN NUMERO
        
        System.out.println("Mes " + fechaHoy.getMonthValue()); //EL MES EN NUMERO
        
        Month mesActual = fechaHoy.getMonth();
        System.out.println("Month " + mesActual); //EL MES EN LETRA PERO EN INGLES
        
        
        LocalDate nacimientoJose = LocalDate.of(1999, 3, 8);

        LocalDate nacimientoRosa = LocalDate.of(1988, Month.APRIL, 13);
        
        System.out.println("Han nacido el mismo día? " + 
                nacimientoRosa.equals(nacimientoJose)); //COMPARAR FECHAS POR SI SON IGUALES
        
        
        // variable.isAfter
         if (nacimientoJose.isAfter(nacimientoRosa)){ //SI JOSE ES MAS VIEJO ES DECIR NACE DESPUES 
            System.out.println("Jose es más joven...o eso dice");
        }
        
        //COMPARAR UNA FECHA Y COGERLA
        LocalDate diaAnda = LocalDate.of(1976, Month.FEBRUARY, 28);
        
        MonthDay diaMesAndalucia = MonthDay.of(diaAnda.getMonth(), diaAnda.getDayOfMonth());
        MonthDay diaMesHoy = MonthDay.from(LocalDate.now());
        
        if (diaMesAndalucia.equals(diaMesHoy)){
            System.out.println("Hoy es el día de Andalucía");
            
        }
        
        
        //COMPROBAR CUANDO SE HA CADUCADO ALGO
        YearMonth caducidadTarjeta = YearMonth.of(2019, Month.MARCH); //CUANDO SE CADUCA UNA TARJETA
        System.out.println("Su tarjeta caduca en " + caducidadTarjeta); 
        
        YearMonth actual = YearMonth.from(LocalDate.now()); 
        
        if (caducidadTarjeta.isBefore(actual)){
            System.out.println("Su tarjeta ha caducado");
        }
     
        
        //SUMAR SEMANAS , DIAS , MESES   LO QUE QUIERAS
        LocalDate semanaSiguiente = hoy.plus(1, ChronoUnit.WEEKS);
        System.out.println("Dentro de una semana " + semanaSiguiente);
        
        
        
        // RESTAR 
        LocalDate haceUnSiglo = hoy.minus(1, ChronoUnit.CENTURIES);
        System.out.println("Hace un siglo " + haceUnSiglo);
        System.out.println("¿Qué día de la semana? " + haceUnSiglo.getDayOfWeek());
        
        /* DÍAS ENTRE FECHAS */
        
        long diferenciaDias = ChronoUnit.DAYS.between(haceUnSiglo, hoy);
        System.out.println("Días entre fechas " + diferenciaDias);
        
        LocalDate finalCurso = LocalDate.of(2019,Month.JUNE, 25);
        long diasHastaFinal = ChronoUnit.DAYS.between(hoy, finalCurso);
        System.out.println("Días para terminar " + diasHastaFinal);
        
        long semanasHastaFinal = ChronoUnit.WEEKS.between(hoy, finalCurso);
        System.out.println("Semanas hasta el final " + semanasHastaFinal);
        
        
        
        
        // La clase DateTimeFormatter formatea fechas y horas
        // para poder ser impresas en gran cantidad de formas
        // Más info en la API de Java
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd MM yyyy");
        String fechaString = hoy.format(formato);
        System.out.println("Fecha sin formato " + hoy);
        System.out.println("Fecha con formato " + fechaString);
        
        // Este objeto guarda fecha y hora
        LocalDateTime ya = LocalDateTime.now();
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        
        Locale configLocal4 = Locale.getDefault();
        System.out.println("Fecha hoy mes " +
                mesActual.getDisplayName(TextStyle.FULL, Locale.CHINA));

    }

}
