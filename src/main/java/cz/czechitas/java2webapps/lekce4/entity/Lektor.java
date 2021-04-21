package cz.czechitas.java2webapps.lekce4.entity;

/**
 * Informace o lektorovi.
 */
public class Lektor {
    private String jmeno;
    private Role role;

    public Lektor() {
    }

    public Lektor(String jmeno, Role role) {
        this.jmeno = jmeno;
        this.role = role;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
