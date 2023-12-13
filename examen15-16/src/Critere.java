public interface Critere {
    /* retourne true si et seulement si l’objet o est conforme au critère (on dit que o satisfait le critère) */
    public boolean correspond(Object o);
}