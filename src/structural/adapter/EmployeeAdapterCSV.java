package structural.adapter;

public class EmployeeAdapterCSV implements Employee {
    private EmployeeCSV instance;
    public EmployeeAdapterCSV(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return String.valueOf(instance.getId());
    }

    @Override
    public String getFirstName() {
        return instance.getFirstname();
    }

    @Override
    public String getLastName() {
        return instance.getLastname();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }

    @Override
    public String toString() {
        return "EmployeeCSV{" +
                "id='" + instance.getId() + '\'' +
                ", firstName='" + instance.getFirstname() + '\'' +
                ", lastName='" + instance.getLastname() + '\'' +
                ", email='" + instance.getEmailAddress() + '\'' +
                '}';
    }
}
