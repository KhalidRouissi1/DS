package TP3;

import java.util.Scanner;

public class TestCompte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Compt[] Compts = new Compt[10];
        int n =2;
        Personne p1 = new Personne("AA","SS","NYC");
        Compts[0]  = new Compt(p1);
        for(int i=1;i<n;i++)
        {

            System.out.println("Nom:");
            String nom = input.nextLine();
            System.out.println("Prenom:");
            String prenom  = input.nextLine();
            System.out.println("Address:");
            String address  = input.nextLine();
            System.out.println("Solde:");
            double solde  = input.nextDouble();
            System.out.println("DecouvertMax:");
            double decouvertMax  = input.nextDouble();
            System.out.println("Debut Max:");
            double DebutMax  = input.nextDouble();
            Personne p =new Personne(nom,prenom,address) ;

            Compts[i] =new Compt(solde,decouvertMax,DebutMax,p);
        }
        input.close();

        for(int i=0;i<n;i++)
        {

            System.out.println(Compts[i].toString());
        }


        Compt.Virement(Compts[0],Compts[1],1000);

        Compt ComptMaxSolde = Compts[0];
        for(int i=1;i<n;i++)
        {
            if(ComptMaxSolde.getSolde() < Compts[i].getSolde())
            {
                ComptMaxSolde = Compts[i];
            }

        }
        System.out.println("The Richest one on the bank is"+ ComptMaxSolde.getName()+" "+ComptMaxSolde.getLastName());

    }
}