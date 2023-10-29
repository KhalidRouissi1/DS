package DS2021;
public class Main {
    public static void main(String args[]) {
        Jcc jTrash = new Jcc(3, 2023);
        Film oussama = new Documentaire("Le dernier refuge", "Ousman", "Mali", 30,"La guerre civile");
        oussama.setNbrDePlace(30);
        oussama.setNbrEtudiant(9);
        jTrash.ajoutFilm(oussama);
        Film Jilani = new Film("Insurrection", "Jilani Saadi", "Tunisie", 105);
        Jilani.setNbrDePlace(45);
        Jilani.setNbrEtudiant(17);
        jTrash.ajoutFilm(Jilani);
        jTrash.listeFilmsJCC();    
        float totalSalesOussama = oussama.totalVenteBillets();
        float totalSalesJilani = Jilani.totalVenteBillets();
        System.out.println("Total Sales for jTrash: " + jTrash.totalVenteBilletsJCC());
    }
}
