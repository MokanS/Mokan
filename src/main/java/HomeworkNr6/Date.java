package HomeworkNr6;

public class Date {
    private Integer day;
    private Integer month;
    private Integer year;

    public Date(Integer day, Integer month, Integer year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {

        if (month > 0 && month <= 12){
            this.month = month;
        } else {
            System.out.println("Valid month");
        }


    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
       if(year >0 ){
        this.year = year;
       } else {
           System.out.println("Valid year");
       }

    }

    public String displayDate(){
        return day+"/"+month+"/"+year;
    }

    public static void main(String[] args) {
       Date first = new Date(11, 2, 2002);
       String displayDate = first.displayDate();
        System.out.println(displayDate);
    }
}

