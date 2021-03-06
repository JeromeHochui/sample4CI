package user;
public class User {

    private Long id;

    private String lastName;

    private String firstName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = "lastName=" + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id.equals(user.id);
    }
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
    public String toString() {
        if (id == null) {
            return "";
        }
        return "id=" + id + ", lastName=" + lastName + ", firstName=" + firstName;
    }
    
}
