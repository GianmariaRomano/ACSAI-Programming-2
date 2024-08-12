public class Encapsulation {
    public static void main(String[] args) {
        StudentArchive sheet = new StudentArchive("James Gosling", 69, 7188149);

        System.out.println(sheet.getName());
        System.out.println(sheet.getAge());
        System.out.println(sheet.getID());

        sheet.setID(7697456);
        System.out.println(sheet.getID()); // Expect to see the new ID.
    }
}
