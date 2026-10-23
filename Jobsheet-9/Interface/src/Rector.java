public class Rector {
    public void giveCumlaudeCertification (Cumlaude cumlaudeStudent) {
        System.out.println("I am the RECTOR, granting a cumlaude award.");
        System.out.println("Congratulations! Please introduce yourself..");
        
        cumlaudeStudent.graduate();
        cumlaudeStudent.reachHighGPA();
        
        System.out.println("-----------------------------------");
    }
}
