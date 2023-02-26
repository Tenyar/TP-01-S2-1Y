package tp1.universite;
/**
 * La classe TestEtudiant est un main qui éxecute les exercices 2 et 3.
 * ATTENTION des contraintes sur la notion d’étudiant :
 * Vous devez créer des objets de type "Etudiant" pour intéragir avec les différentes méthodes
 *
 */
public class TestEtudiant {
    public static void main(String[] args) {

        // ------------------------------------------- PART 2 -------------------------------------------
        // Création de l'objet pour intéragir avec.



        //a.getNom().capitalize("");
        //maChaine = maChaine.substring(0,1).toUpperCase() + maChaine.substring(1).toLowerCase();

        Etudiant etudiant1 = new Etudiant("DUPONT", "pierre", "DUPONTP");
        Etudiant etudiant2 = new Etudiant("martin", "francis", "martinf");

        // ajout d'une adresse
        etudiant2.setAdresse("2 Place Doyen Gosse");

        System.out.println("voulez vous ajouter une note à l'étudiant 1 ?");
        etudiant1.addNote();
        etudiant1.sumNotes();
        etudiant1.getMoyenne();
        etudiant1.AddGroup();

        EtudiantUtilitaire.affiche(etudiant1);
        EtudiantUtilitaire.affiche(etudiant2);
    }

}
