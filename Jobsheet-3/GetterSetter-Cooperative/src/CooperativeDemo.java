public class CooperativeDemo {
    public static void main(String[] args) throws Exception {
        Member member1 = new Member("Iwan", "Jalan Mawar");
        System.out.println("Simpanan " + member1.getName() + ": Rp " + member1.getSavings());

        member1.setName("Iwan Setiawan");
        member1.setAlamat("Jalan Sukarno Hatta no 10");
        member1.deposit(100000);
        System.out.println("Simpanan " + member1.getName() + ": Rp " + member1.getSavings());
    
        member1.withdraw(5000);
        System.out.println("Simpanan " + member1.getName() + ": Rp " + member1.getSavings());
    }
}
