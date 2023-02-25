package tp1;

import tp1.universite.Etudiant;
import tp1.universite.EtudiantUtilitaire;

import java.util.Scanner;
/**
 * La classe TestString est un main qui éxecute des actions pour l'exercice 1
 * ATTENTION des contraintes sur la notion d’étudiant :
 * Vous devez créer des objets de type "Etudiant" pour intéragir avec les différentes méthodes
 *
 */
public class TestString {

    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in); // init d'un scanner "entree"
        String maChaine;

        System.out.println("entrer une chaine de mot : "); // demande
        maChaine = entree.nextLine(); // prend ce qu'utilisateur entre
        System.out.println(maChaine); // l'affiche

        //  1
        System.out.println("nombre caractère de maChaine : " + maChaine.length());
        //  2
        System.out.println("maChaine en majuscule : " + maChaine.toUpperCase());

        //  3
        String maChaine_2;
        System.out.println("entrer une autre chaine de mot : ");
        maChaine_2 = entree.nextLine();
        if (maChaine.equalsIgnoreCase(maChaine_2)){
            System.out.println("Les 2 chaines sont identiques");
        }else{
            System.out.println("Les 2 chaines ne sont pas identiques");
        }

        //  4

        //char value1 = entree.nextLine().toCharArray()[0];
        //boolean check1 = Character.isLowerCase(Integer.parseInt(maChaine));

        int uppCase = 0; // Variable qui vérifie si maChaine est en minuscule
        /*for (int i=0; i < maChaine.length(); i++){  // Boucle parcourant toutes les lettres de maChaine
            char value1 = maChaine.charAt(i);
            boolean check = Character.isLowerCase(value1);
            if (!check){
                uppCase++; // si majuscule trouvé ajouter 1
            }
        }*/

        if (uppCase == 0){ // si aucune majuscule print
            System.out.println("maChaine est en minuscule");
        } else {
            System.out.println("maChaine n'est pas qu'en minuscule"); // Sinon
        }


        if (maChaine.equals(maChaine.toLowerCase())){
            System.out.println("maChaine est en minuscule");
        }else {
            System.out.println("maChaine n'est pas qu'en minuscule"); // Sinon
        }

        //  5

        System.out.println("5. La chaîne de caractères maChaine en majuscule sans les 'blancs' en début\n" +
                "et fin de chaîne : " + maChaine.toUpperCase().replaceAll("\\s+",""));

    //    System.out.println("" + maChaine.toUpperCase().trim());
        //  6

       /* boolean palindrome = true;
        int n = maChaine.length();

        for( int i = 0; i < n/2; i++ ){
            if (maChaine.charAt(i) != maChaine.charAt(n-i-1)) {
                palindrome = false;
            }
        }

        if (palindrome == false) {
            System.out.println("6. maChaine n'est pas un palindrome");
        } else{
            System.out.println("6. maChaine est un palindrome");
        }*/


        StringBuilder maChaineBuilder = new StringBuilder(maChaine);
        if (maChaine.equals(maChaineBuilder.reverse().toString())) { // to String compare l'inverse du mot au mot de la chaine
            System.out.println("6. maChaine est un palindrome");
        }else {
            System.out.println("6. maChaine n'est pas un palindrome");
        }

    }
}
