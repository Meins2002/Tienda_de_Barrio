package Actividades;

public class Repl_Enums_Java {
              enum Month {
                JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
            }

            public static void main(String[] args) {
                // Definir un mes utilizando el enum
                Month monthOfYear = Month.APRIL;

                switch (monthOfYear) {
                    case JANUARY:
                    case FEBRUARY:
                    case MARCH:
                        System.out.println("Welcome to Q1");
                        break;
                    case APRIL:
                    case MAY:
                    case JUNE:
                        System.out.println("Welcome to Q2");
                        break;
                    case JULY:
                    case AUGUST:
                    case SEPTEMBER:
                        System.out.println("Welcome to Q3");
                        break;
                    case OCTOBER:
                    case NOVEMBER:
                    case DECEMBER:
                        System.out.println("Welcome to Q4");
                        break;
                }
            }
        }

       /* String january = "JANUARY";
        String february = "FEBRUARY";
        String march = "MARCH";
        String april = "APRIL";
        String may = "MAY";
        String june = "JUNE";
        String july = "JULY";
        String august = "AUGUST";
        String september = "SEPTEMBER";
        String october = "OCTOBER";
        String november = "NOVEMBER";
        String december = "DECEMBER";

        String monthOfYear = january;

        switch(monthOfYear){
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                System.out.println("Welcome to Q1");
                break;
            case "APRIL":
            case "MAY":
            case "JUNE":
                System.out.println("Welcome to Q2");
                break;
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                System.out.println("Welcome to Q3");
                break;
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                System.out.println("Welcome to Q4");
                break;
        }

    }
}*/
