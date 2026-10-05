public class Inheritance1 {
    public static void main(String[] args) throws Exception {
        PermanentStaff ST = new PermanentStaff("Budi", "Malang", "Male", 20, 2000000, 200000, 250000, "2A", 100000);
        ST.showPermanentStaff();

        DailyWorker SH = new DailyWorker("Indah", "Malang", "Female", 27, 10000, 100000, 50000, 100);
        SH.showDailyWorker();
    }
}
