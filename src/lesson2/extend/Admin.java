package lesson2.extend;


public class Admin extends User {

    private Role role = Role.MANAGER;

    public Admin() {
    }

    public Admin(Role role) {
        this.role = role;
    }

    public Admin(int id, String name, String surname, Role role) {
        super(id, name, surname);
        this.role = role;
    }

    @Override
    public void greeting() {
        System.out.println("hao");
    }

    @Override
    public String toString() {
        return "Admin{" +
                "role=" + role +
                "} " + super.toString();
    }
}
