public class GestionnaireNotes {

    // Affiche note et moyennes
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        // Affichage des notes
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }

        // Calcul de la somme des notes
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }

        // Affichage de la moyenne
        double moyenne = (double) somme / notes.length;
        System.out.println("Moyenne : " + moyenne);
    }
}
