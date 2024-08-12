public class StudentArchive {
    /*
    Encapsulation is an object-oriented programming strategy that allows to guarantee data safety by making all attributes private.
    As such, the only way to interact with encapsulated objects is to either set or get their values.
     */
    private String name;
    private int age;
    private int ID;
    StudentArchive(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    // Setter methods allow to change information for that instance.
    public void setName(String newName) {
        this.name = newName;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }
    public void setID(int newID) {
        this.ID = newID;
    }

    // Getter methids instead allow to see the required value for that instance.
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getID() {
        return ID;
    }
}
