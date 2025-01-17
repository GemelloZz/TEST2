package Test2;

public class Catalogo {
    private long codiceISBN;
    private String titolo;
    private int year;
    private int numberOfPage;


    public Catalogo(long codiceISBN, String titolo, int year, int numberOfPage) {
        this.codiceISBN = codiceISBN;
        this.titolo = titolo;
        this.year = year;
        this.numberOfPage = numberOfPage;
    }


    public static void catalogo() {
        System.out.println("Questo è un metodo statico per Catalogo");
    }

    public long getCodiceISBN() {
        return codiceISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getYear() {
        return year;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }
    @Override
    public String toString() {
        return "Codice ISBN: " + codiceISBN +
                ", Titolo: " + titolo +
                ", Anno: " + year +
                ", Numero di pagine: " + numberOfPage;
    }
}