public class Rector {
    public void giveCumlaudeCertification (Cumlaude cumlaudeStudent) {
        System.out.println("I am the RECTOR, granting a cumlaude award.");
        System.out.println("Congratulations! Please introduce yourself..");
        
        cumlaudeStudent.graduate();
        cumlaudeStudent.reachHighGPA();
        
        System.out.println("-----------------------------------");
    }

    public void giveOutstandingStudentCertificate (Achievement outstandingStudent) {
        System.out.println("I am the RECTOR, granting an OUTSTANDING STUDENT award.");
        System.out.println("Congratulations! How did you achieve this?");

        outstandingStudent.winningCompetition();
        outstandingStudent.makingScientificPublication();

        System.out.println("------------------------------------------------");
    }
}
