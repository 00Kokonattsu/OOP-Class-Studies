public class Program {
    public static void main(String[] args) throws Exception {
        Rector MrRector = new Rector();

        College_Student normalStudent = new College_Student("Charlie");
        Bachelor bachelorCumlaude = new Bachelor("Dini");
        Master masterCumlaude = new Master("Elok");

        // MrRector.giveCumlaudeCertification(normalStudent);
        MrRector.giveCumlaudeCertification(bachelorCumlaude);
        MrRector.giveCumlaudeCertification(masterCumlaude);
        
    }
}
