public class GestionnaireNotes {

    
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        // Vérification que le tableau n'est pas vide
        if (notes == null || notes.length == 0) {
            System.out.println("Aucune note disponible pour l'étudiant " + nomEtudiant);
            return;
        }

        // Affichage des notes
        System.out.println("Notes de " + nomEtudiant + ":");
        int somme = 0;
        for (int note : notes) {
            System.out.println("- " + note);
            somme += note; // Calcul de la somme dans la même boucle
        }

        // Calcul et affichage de la moyenne
        double moyenne = (double) somme / notes.length;
        System.out.printf("Moyenne : %.2f%n", moyenne); // Affichage formaté avec 2 décimales
    }
}
