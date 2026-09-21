public class MainExperiment {
    public static void main(String[] args) throws Exception {
        Laptop laptop = new Laptop("Thinkpad");
        Printer printer = new Printer("Epson L3110");
        laptop.printDocument(printer, "Report.pdf");
    }
}
