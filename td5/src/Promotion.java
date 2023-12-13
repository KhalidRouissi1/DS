import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface Promotion {
    LocalDate debutPromo = LocalDate.of(2022, 3, 19);
    LocalDate finPromo = LocalDate.of(2022, 3, 31);

    float prixDeVente(String dateStr);

    default boolean estPeriodePromo(String dateStr) {
        LocalDate purchaseDate = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return (purchaseDate.isAfter(debutPromo) || purchaseDate.isEqual(debutPromo))
                && (purchaseDate.isBefore(finPromo) || purchaseDate.isEqual(finPromo));
    }

    static double calculerRemise(double prixAvantRemise, double prixApresRemise) {
        return ((prixAvantRemise - prixApresRemise) / prixAvantRemise) * 100;
    }
}
