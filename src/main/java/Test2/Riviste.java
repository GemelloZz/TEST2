package Test2;

import java.time.LocalDate;

public class Riviste extends Catalogo {
    private LocalDate periodicità;


    public Riviste(long codiceISBN, String titolo, int year, int numberOfPage, LocalDate periodicità) {
        super(codiceISBN, titolo, year, numberOfPage);
        this.periodicità = periodicità;
    }


    public LocalDate getPeriodicità() {
        return periodicità;
    }


    public void setPeriodicità(LocalDate periodicità) {
        this.periodicità = periodicità;
    }
    @Override
    public String toString(){
        return super.toString() + "Periodicità: " + periodicità;
    }


}