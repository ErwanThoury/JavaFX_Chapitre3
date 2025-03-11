package com.example.chapitrestaticsurcharge;

public class Personne {
        private String nom;
        private int anneeNais;
        private int salaire;
        private static String entreprise = "LeRebours";

        public Personne(String n, int a, int s) {
            this.nom=n;
            this.anneeNais=a;
            this.salaire=s;
        }
        public Personne(int a, int s) {
            this.nom="Théo Pardéfaut";
            this.anneeNais= a;
            this.salaire= s;
        }
        public Personne() {
            this.nom="Théo Pardéfaut";
            this.anneeNais= 0123;
            this.salaire= 456789;
        }
        public String getNom() {
            return this.nom;
        }
        public String getNom(String titre) {
            return this.nom + " " + titre;
        }
        public int getSalaire()
        {
            return salaire;
        }
        public void setSalaire(int nouveauSalaire)
        {
            if (nouveauSalaire < 0)
                setSalaire();
            else
                this.salaire = nouveauSalaire;
        }
        public void setSalaire()
        {
            this.salaire = 1250;
        }

        public static String getEntreprise()
        {
            return entreprise;
        }
}
