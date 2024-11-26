public class StockManager {

  
    public int gererStock(String typeOperation, String produit, int quantite, int stock) {
        // Vérifier que la quantité est positive
        if (quantite < 0) {
            System.out.println("Erreur : la quantité ne peut pas être négative.");
            return stock;
        }

        switch (typeOperation.toLowerCase()) {
            case "ajout":
                stock += quantite;
                System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
                break;
            case "retrait":
                if (stock >= quantite) {
                    stock -= quantite;
                    System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
                } else {
                    System.out.println("Stock insuffisant pour le produit : " + produit);
                }
                break;
            default:
                System.out.println("Opération inconnue. Utilisez 'ajout' ou 'retrait'.");
                break;
        }
        return stock; // Retourne le stock mis à jour
    }
}
