public class TestBranch {
    public static void main(String[] args) {
        BranchCollection aeki = new BranchCollection("aeki");
        System.out.println(aeki.payCheck(75, 2)); // Full price: 150
        System.out.println(aeki.payCheck(23.50, 20)); // Discount: 352.50 instead of 470

        BranchCollection s = new BranchCollection("Antonio Vivaldi");
        System.out.println(s.vivaldi(3)); // Okay: expect "Summer"
        System.out.println(s.vivaldi(0)); // Still okay: "???" will be returned as a default output
    }
}
