import java.util.ArrayList;
import java.util.Random;

public class Network {
    private ArrayList<Member> users = new ArrayList<>();

    public class Member {
        private String name;
        private ArrayList<Member> friends;
        public Member(String name) {
            this.name = name;
            this.friends = new ArrayList<>();
        }
        public void connect(Member m) {
            if ((!this.friends.contains(m)) & (!m.friends.contains(this))) {
                this.friends.add(m);
                m.friends.add(this);
            }
        }
        public void block(Member m) {
            if ((this.friends.contains(m)) & (m.friends.contains(this))) {
                this.friends.remove(m);
                m.friends.remove(this);
            }
        }
        public void feedback(Random r) {
            if (r.nextInt(100) < 65) {
                deactivate();
            }
        }
        public void deactivate() {
            users.remove(this);
            for (Member user : users) {
                if (user.friends.contains(this)) {
                    user.friends.remove(this);
                }
            }
            System.out.println("User " + this.name + " has decided to leave the network!");
        }
    }

    public Member enroll(String newUser) {
        Member newMember = new Member(newUser);
        users.add(newMember);
        System.out.println("User " + newUser + " has joined the network!");
        return newMember;
    }
}
