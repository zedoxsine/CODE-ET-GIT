public class FactureManager {

    // Constantes pour les réductions
    private static final double REDUCTION_ALIMENTAIRE = 0.05;
    private static final double REDUCTION_ELECTRONIQUE = 0.10;
    private static final double REDUCTION_LUXE = 0.15;
    private static final double REDUCTION_GROS_MONTANT = 0.05;

   
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        // Validation des entrées
        if (quantite <= 0 || prixUnitaire <= 0) {
            throw new IllegalArgumentException("La quantité et le prix unitaire doivent être positifs.");
        }

        double total = quantite * prixUnitaire;

        // Appliquer la réduction selon le type de produit
        total = appliquerReductionTypeProduit(typeProduit, total);

        // Appliquer une réduction supplémentaire pour les montants supérieurs à 1000
        if (total > 1000) {
            total -= total * REDUCTION_GROS_MONTANT; // Réduction supplémentaire de 5%
        }

        return total;
    }
    private double appliquerReductionTypeProduit(String typeProduit, double total) {
        switch (typeProduit) {
            case "Alimentaire":
                total -= total * REDUCTION_ALIMENTAIRE;
                break;
            case "Electronique":
                total -= total * REDUCTION_ELECTRONIQUE;
                break;
            case "Luxe":
                total -= total * REDUCTION_LUXE;
                break;
            default:
                // Pas de réduction pour un type inconnu
                break;
        }
        return total;
    }
}
