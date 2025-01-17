package Test2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Archivio {
    private List<Catalogo> elementi;


    public Archivio() {
        this.elementi = new ArrayList<>();
    }


    public void aggiungiElemento(Catalogo elemento) {
        for (Catalogo e : elementi) {
            if (e.getCodiceISBN() == elemento.getCodiceISBN()) {
                System.out.println("Elemento con ISBN " + elemento.getCodiceISBN() + " già presente nell'archivio!");
                return;
            }
        }
        elementi.add(elemento);
        System.out.println("Elemento aggiunto con successo: " + elemento);
    }


    public void visualizzaArchivio() {
        if (elementi.isEmpty()) {
            System.out.println("L'archivio è vuoto.");
        } else {
            System.out.println("Contenuto dell'archivio:");
            for (Catalogo e : elementi) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {

        Archivio archivio = new Archivio();


        Libri libro = new Libri(1234567890L, "Il Signore degli Anelli", 1954, 1216, "J.R.R. Tolkien","fantasy");


        Riviste rivista = new Riviste(9876543210L, "National Geographic", 2023, 100, LocalDate.of(2023, 9, 15));


        Catalogo catalogo = new Catalogo(1122334455L, "Catalogo di Arte Moderna", 2019, 200);


        archivio.aggiungiElemento(libro);
        archivio.aggiungiElemento(rivista);
        archivio.aggiungiElemento(catalogo);

        archivio.visualizzaArchivio();
    }
}