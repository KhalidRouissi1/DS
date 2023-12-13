public class ConditionAge implements ConditionAcces{

    private int AgeMin;

    public ConditionAge(int ageMin) {
        AgeMin = ageMin;
    }

    @Override
    public boolean accesPossible(Personne p) {
        return p.getAge()>AgeMin;
    }
}
