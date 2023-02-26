package tp1.universite;

import java.util.Scanner;

/**
 * La classe Etudiant est un constructeur qui représente la notion d'étudiant (login, nom, prénom
 et adresse).
 * ATTENTION des contraintes sur la notion d’étudiant :
 * – un étudiant doit toujours avoir un login en minuscule
 * – un étudiant doit toujours avoir un nom et un prénom avec
 * le premier caractère en majuscule et les autres en minuscule.
 *
 * Il y a des setters qui automatise les majuscule sur le nom / prénom.
 * Le login est automatiquement mit en minuscule.
 * Un setter peut être utiliser pour rentrer une adresse.
 *
 */
public class Etudiant {
    Scanner lecteur = new Scanner(System.in);

    private String login;
    private String nom;
    private String prenom;
    private String adresse;
    public String group;

    private double[] notes = new double[5];

    private int compteur = 0; // compteur pour compter chaque notes qu'il y a dans le tableau

    /**
     * Le constructeur Etudiant à comme paramètre :
     * @param nom Qui est le nom de l'etudiant
     * @param prenom Qui est le prénom de l'etudiant
     * @param login Qui est le login de l'etudiant
     */
    public Etudiant(String nom, String prenom, String login) {
        // plus besoin de this.[...] = [...] car on initialise en activer les setters en même temps.
        setPrenom(prenom);
        setNom(nom);
        setLogin(login);
        this.group = group;
        this.notes = notes;
        // L'ordre n'est pas si impactant avec cette initialisation mais à respecter.
    }

    /**
     * La méthode getLogin() ne prend pas de paramètre et retourne un Sring.
     *
     * @return le login de l'étudiant.
     */
    public String getLogin() {
        return login;
    }

    /**
     * La méthode getNom() ne prend pas de paramètre et retourne un Sring.
     *
     * @return le nom de l'étudiant.
     */
    public String getNom() {
        return nom;
    }

    /**
     * La méthode getPrenom() ne prend pas de paramètre et retourne un Sring.
     *
     * @return le prénom de l'étudiant.
     */
    public String getPrenom() {return prenom;}
    /**
     * La méthode getGroup() ne prend pas de paramètre et retourne un Sring.
     *
     * @return le groupe de l'étudiant.
     */
    public String getGroup(){return group;}

    /**
     * La méthode getCompteur() ne prend pas de paramètre et retourne un double.
     *
     * @return le compteur du nombre de notes qu'a un étudiant.
     */
    public double getCompteur(){
        return compteur;
    }

    public double[] getNotes(){
        return notes;
    }

    /**
     * La méthode getNomComplet() ne prend pas de paramètre et retourne un Sring.
     *
     * @return le nom + prénom d'un étudiant.
     */
    public String getNomComplet() {
        return prenom + " " + nom;
    }

    /**
     * La méthode getAdresse() ne prend pas de paramètre et retourne un Sring.
     *
     * @return l'adresse.
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * La méthode getMail() ne prend pas de paramètre et retourne un Sring.
     *
     * @return l'adresse avec le prénom + nom + l'université.
     */
    public String getMail() {
        return prenom + "." + nom + "@etu.univ-grenoble-alpes.fr";
    }
    /**
     * La méthode getMoyenne() ne prend pas de paramètre et retourne un double.
     *
     * @return la moyenne de [la somme des notes / par son nombre de notes].
     */
    public double getMoyenne() {return (sumNotes() / compteur);}

    /**
     * Vérifier l'existence d'un adresse pour l'étudiant,
     *
     * @return Vrai si l'étudiant à une adresse, Faux sinon.
     */
    public Boolean existAdresse() {
        // getadresse() pas obligé car on est dans le constructeur autant appeler la variable.
        if (adresse != null && !adresse.isEmpty()) // Si le variable adresse dif null et pas emty ("") print
        {
            return true;
        }// Vrai si adresse est non null ou si le la length[largeur] du mot => 1 soit au moins un caractère.
        else {
            return false;
        }
    }


    /**
     * La méthode setLogin() prend un paramètre "login" de type String et retourne le login de même type.
     * Met le login en minuscule.
     */
    public void setLogin(String login) {
        this.login = login.toLowerCase();
    }

    /**
     * La méthode setNom() prend un paramètre "nom" de type String et retourne le nom de même type.
     * Met une majuscule au premier caractère du nom, le reste en minuscule.
     */
    public void setNom(String nom) {
        this.nom = EtudiantUtilitaire.capitalize(nom);
    }

    /**
     * La méthode setPrenom() prend un paramètre "prenom" de type String et retourne le prénom de même type
     * Met une majuscule au premier caractère du prénom, le reste en minuscule.
     */
    public void setPrenom(String prenom) {
        this.prenom = EtudiantUtilitaire.capitalize(prenom);
    }

    /**
     * La méthode setAdresse() prend un paramètre "adresse" de type String et retourne le adresse de même type.
     * Permet d'ajouter une adresse à un étudiant.
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    /**
     * La fonction addNote() ne prend pas de paramètre et ne retourne rien.
     * Permet d'ajouter des notes dans la liste/table pour un élève.
     *
     */
    public void addNote() {
        //une méthode qui va ajouter une note au tableau de notes (5 maximum)

        String reponse;
        double autreNote;

        System.out.println("Voulez vous rentrer une note ? [oui ou non]");
        reponse = lecteur.nextLine();

        for (int i = 0; i < 5; i++) {

            while (!reponse.equals("oui") && !reponse.equals("non")){

                System.out.println("Veuillez rentrer soit oui soit non.");
                reponse = lecteur.next();

            }

                if (compteur < 5) {

                    if (reponse.equals("non")) {

                        return;

                    } else if (reponse.equals("oui")) {

                        System.out.println("Saissir une note : ");
                        autreNote = lecteur.nextDouble();

                        notes[compteur] = autreNote;
                        compteur++;
                    }

                    } else if (compteur == 5) {
                    System.out.println("Le tableau est plein");
                    }

            System.out.println("Voulez vous rentrer une autre note ? [oui ou non]");
            reponse = lecteur.next();

            }
    }
    /**
     * La fonction sumNotes() ne prend pas de paramètre et retourne un double.
     * Permet d'ajouter la somme des notes de la liste/table pour en faire une moyenne par exemple.
     *
     */
    public double sumNotes(){
        double sum = 0;

        for (int i = 0; i < this.compteur; i++){
            sum = sum + notes[i];
        }

        if (compteur == 0){
            return -1;
        } else {
            return sum;
        }
    }
    /**
     * La fonction AddGroup() ne prend pas de paramètre et retourne un Character.
     * Permet d'ajouter un groupe à un élève.
     *
     */
    public void AddGroup(){


        String reponse;
        String groupChoice;

        System.out.println("voulez-vous ajouter l'élève dans un groupe ? [oui ou non]");
        reponse = lecteur.nextLine();

        while (!reponse.equals("oui") && !reponse.equals("non")){ // Que choisir entre oui et non

            System.out.println("Veuillez choisir entre [oui et non]");
            reponse = lecteur.nextLine();

        }

        if (reponse.equals("oui")){

            System.out.println("Dans quel groupe voulez-vous ajouter l'élève ? [Choissisez une lettre]");
            groupChoice = lecteur.nextLine();

            while (groupChoice.length() >= 2 || !groupChoice.matches("[a-zA-Z]")){
                System.out.println("Veuillez choisir qu'une seul lettre");
                groupChoice = lecteur.nextLine();
            }

                group = groupChoice;

        }

    }

}
