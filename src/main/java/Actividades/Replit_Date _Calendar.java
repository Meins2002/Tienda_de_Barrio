package Actividades;

import java.util.Calendar;
import java.util.Date;

class Replit_Date_Calendar {
  // public static void main(String[] args) {

        //Completa los pasos 1 - 5 para aprender a manejar las fechas en Java.
    /*
      1. Modifica el siguiente código para que la variable birthDate tenga los datos exactos           de tu fecha de nacimiento
    */

    /*    Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, Calendar.MARCH);
        calendar.set(Calendar.DAY_OF_MONTH, 04);
        calendar.set(Calendar.YEAR, 1995);
        calendar.set(Calendar.HOUR_OF_DAY, 12);
        calendar.set(Calendar.MINUTE, 1);
        calendar.set(Calendar.SECOND, 2);
        calendar.set(Calendar.MILLISECOND, 70);
        Date birthDate = calendar.getTime();
        System.out.println("LA FECHA DE CUMPLEAÑOS ES :" + birthDate);

    /*
      2. quita los comentarios de las líneas 20, 21 y 22 para restar 365 días a tu fecha de
       nacimiento para ver que día de la semana era hace 1 año
    */
      /*  calendar.add(Calendar.DAY_OF_YEAR, -365);
        Date oneYearBeforeBirthdate = calendar.getTime();
        System.out.println("AÑO ANTERIOR: " + oneYearBeforeBirthdate);

    /*
      3. quita los comentarios de las líneas 27, 28 y 29 para sumar 365 días a tu fecha de
       nacimiento para ver que día de la semana fué después 1 año
    */
      /*  calendar.add(Calendar.DAY_OF_YEAR, 2 * 365);
        Date oneYearAffterBirthdate = calendar.getTime();
        System.out.println("DESPUES DE UN AÑO: " + oneYearAffterBirthdate);

    /*
      4. Crea una segunda instancia de la clase Calendar y asignale la fecha de nacimiento de alguien
       de tu familia.
      5. Calcula los días, meses, horas de diferencia entre tu nacimiento y el de tu familiar
    */

        /*Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendario.set(Calendar.DAY_OF_MONTH, 10);
        calendario.set(Calendar.YEAR, 2014);
        calendario.set(Calendar.HOUR_OF_DAY, 9);
        calendario.set(Calendar.MINUTE, 9);
        calendario.set(Calendar.SECOND,9);
        calendario.set(Calendar.MILLISECOND, 90);
        Date cumpleaños = calendario.getTime();
        System.out.println("El cumpleaños es: " + cumpleaños);

        System.out.println("*****************");
        System.out.println("*  Diferencias  *");
        System.out.println("*****************");

        long diferenciaMilisegundos = calendario.getTimeInMillis() - calendar.getTimeInMillis();

        long diferenciaHoras = diferenciaMilisegundos / (60 * 60 * 1000);

        long diferenciaDias = diferenciaMilisegundos / (24 * 60 * 60 * 1000);

        int diferenciaMeses = (calendario.get(Calendar.YEAR) - calendar.get(Calendar.YEAR))* 12
                + calendario.get(Calendar.MONTH) - calendar.get(Calendar.MONTH);
        int diferenciaAños = calendario.get(Calendar.YEAR) - calendar.get(Calendar.YEAR);

        System.out.println("Diferencia en Horas: " + diferenciaHoras + " horas" + '\n' +
                "Diferencia en días: " + diferenciaDias + " días" + '\n' +
                "Diferencia en meses: " + diferenciaMeses + " meses" + '\n' +
                "Diferencia en años: " + diferenciaAños + " años");

    }*/
}