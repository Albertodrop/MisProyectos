package sistematouchstore.v2.Modelo;

import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author ALBERTO
 */
public class Softmor {
    
    
    public Softmor(){
        
    }
    
    //Construting  variables information  abaout the company
    private final String NAMECOMPANY = "SOFTMOR&LAPTABCEL";
    private final String SYSTEMVERSION = "2.0.2";
    private final String DEVELOPER = "ALBERTO FABIAN";

    // Constructing  variabless for the date
    private String day, month,fechaActual;
    private int year, dayMonth;

    // Constructing  function  abaout information from the company
    public String getNAMECOMPANY() {
        return NAMECOMPANY;
    }

    public String getSYSTEMVERSION() {
        return SYSTEMVERSION;
    }

    public String getDEVELOPER() {
        return DEVELOPER;
    }
    
    
    
    
    
    
    
    
    // Constructing  the dates  
    Date date = new Date();
    Calendar calendar = Calendar.getInstance();
    
    public String getDay() {
        day = Integer.toString(calendar.get(Calendar.DAY_OF_WEEK));
        switch (day) {
            case "1":
                day = "Domingo";
                break;
            case "2":
                day = "Lunes";
                break;
            case "3":
                day = "Martes";
                break;
            case "4":
                day = "Miercoles";
                break;
            case "5":
                day = "Jueves";
                break;
            case "6":
                day = "Viernes";
                break;
            case "7":
                day = "Sabado";
                break;

        }
        return day;
    }

    public String getMonth() {
        switch (date.getMonth()) {
            case 0:
                month = "Enero";
                break;
            case 1:
                month = "Febrero";
                break;
            case 2:
                month = "Marzo";
                break;
            case 3:
                month = "Abril";
                break;
            case 4:
                month = "Mayo";
                break;
            case 5:
                month = "Junio";
                break;
            case 6:
                month = "Julio";
                break;
            case 7:
                month = "Agosto";
                break;
            case 8:
                month = "Septiembre";
                break;
            case 9:
                month = "Octubre";
                break;
            case 10:
                month = "Noviembre";
                break;
            case 11:
                month = "Diciembre";
                break;
        }
        return month;
    }

    public int getYear() {
        year = date.getYear();
        return year;
    }

    public int getDayMonth()
    {
        dayMonth = date.getDay();
        return dayMonth;
    }
    
    public String getFechaActual(){
        fechaActual = getDayMonth()+"/"+getMonth()+"/"+getYear();
        return fechaActual;
    }
    
    
}
