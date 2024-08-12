public class TestInterfaces {
    public static void main(String[] args) {
        Circle c = new Circle(15);
        System.out.println(c.getArea());

        // Notice how both instances are able to overcome the interface conflict
        ClientX x = new ClientX();
        System.out.println(x.sigma(8));
        ClientY y = new ClientY();
        System.out.println(y.sigma(8));
    }
}
