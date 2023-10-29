package DS2021;

import java.awt.font.TextHitInfo;
import java.util.Scanner;

public class Film {
    private String titre;
    private String realisateur;
    private String payesOrigin;
    private int duree;
    private int nbrDePlace;
    private int nbrEtudiant;

    public String getTitre() {
        return titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public String getPayesOrigin() {
        return payesOrigin;
    }
    public int getNbrEtudiant() {
        return nbrEtudiant;
    }


    public int getDuree() {
        return duree;
    }

    public int getNbrDePlace() {
        return nbrDePlace;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public void setPayesOrigin(String payesOrigin) {
        this.payesOrigin = payesOrigin;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setNbrDePlace(int nbrDePlace) {
        this.nbrDePlace = nbrDePlace;
    }
    public void setNbrEtudiant(int nbrEtudiant) {
        this.nbrEtudiant = nbrEtudiant;
    }


    public Film(String titre, String realisateur, String payesOrigin, int duree) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.payesOrigin = payesOrigin;
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "Insurrection de "+this.realisateur+" ("+this.payesOrigin+")"+" - "+this.duree+"min";
    }
    public float totalVenteBillets()
    {
        if(this.nbrEtudiant !=0)
        {
            return this.nbrDePlace-this.nbrEtudiant * 3 + this.nbrEtudiant *2;
        }

        else {
            System.out.println("Tapez le nombre des etudiant");
            Scanner inp = new Scanner(System.in);
            int nbrEtudiant  = inp.nextInt();
            while (nbrEtudiant> this.nbrDePlace)
            {
                System.out.println("Nbr des etudiants > Nbr des places tapez un autre fois");
                nbrEtudiant = inp.nextInt();
            }
            return nbrDePlace-nbrEtudiant * 3 + nbrEtudiant *2;
        }

    }

}
