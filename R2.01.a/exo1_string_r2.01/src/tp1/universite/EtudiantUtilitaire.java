package tp1.universite;

import java.util.Scanner;

/**
 * La classe EtudiantUtilitaire permet d'utiliser des fonctions utiles pour intéragir avec les étudiants.
 */
public class EtudiantUtilitaire {

    /**
     * La fonction capitalize() prend un paramètre "chaine" de type String et retourne une chaine de caractère.
     *  Permet de mettre une majuscule en début de mots/phrase, mais le reste sera en minuscule.
     */
    public static String capitalize(String chaine) {
        //  Question prof !! Sur ----> capitalize(chaine);
        chaine = chaine.substring(0,1).toUpperCase() + chaine.substring(1).toLowerCase();
        return chaine;
    }
    /**
     * La fonction affiche() prend un paramètre "student" un Objet, et ne retourne rien
     * Il prend donc en compte son login, nom, prénom, adresse.
     *  Permet d'afficher le login, nom, prénom, adresse d'un étudiant.
     */
    public static void affiche(Etudiant student){

        if (student.existAdresse()){

            System.out.println("\n ------------------------ " + " \n login : " + student.getLogin() + "\n Nom complet : " + student.getNomComplet() +
                    "\n Mail : " + student.getMail() + "\n Adresse : " + student.getAdresse());
            if (student.getCompteur() <= 0){

                System.out.println(" Moyenne : aucune");

            } else {
                System.out.println(" Moyenne : " + student.getMoyenne());
                System.out.printf(" " + Math.round(student.getCompteur()) + " Notes : ");
                ParcourNote(student);
            }
        } else {

            System.out.println("\n ------------------------ " + " \n login : " + student.getLogin() + "\n Nom complet : " + student.getNomComplet() +
                    "\n Mail : " + student.getMail() + "\n Adresse : aucune");

            if (student.getCompteur() <= 0){

                System.out.println(" Moyenne : aucune");

            } else {
                System.out.println(" Moyenne : " + student.getMoyenne());
                System.out.printf(" " + Math.round(student.getCompteur()) + " Notes : ");
                ParcourNote(student);
            }

        }

       /* if (student.existAdresse() || student.getCompteur() > 0){ // Appel la fonction existAdresse() pour vérifier l'adresse d'un étudiant.
            System.out.println("------------------------ \n" + "login : " + student.getLogin() + "\n Nom complet : " + student.getNomComplet() +
                    "\n Mail : " + student.getMail() + "\n Adresse : " + student.getAdresse() + " \n Moyenne:" + student.getMoyenne());
        } else if (student.getCompteur() <=0){
            System.out.println("------------------------ \n" + "login : " + student.getLogin() + "\n Nom complet : " + student.getNomComplet() +
                    "\n Mail : " + student.getMail() + "\n Adresse : aucune" + " \n Moyenne: Aucune moyenne");
        }*/

    }
    /**
     * La fonction ParcourNote() prend un paramètre "student" un Objet, et ne retourne rien.
     *  Permet de parcourir la table contenant les notes.
     */
    public static void ParcourNote(Etudiant student){
        for (int i = 0; i < student.getCompteur(); i++){
            System.out.printf(" " + (student.getNotes()[i]));
        }
    }

}
