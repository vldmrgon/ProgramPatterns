package pro.patterns.behavioral.visitor;

public class TestVisitor {

    public static void main(String[] args) {

        BloodTest bloodTest = new BloodTest(120, 12);
        UrineTest urineTest = new UrineTest(1.0, 12.2);

        MedicalAnalyzer medicalAnalyzer = new MedicalAnalyzer();

        bloodTest.accept(medicalAnalyzer);
        urineTest.accept(medicalAnalyzer);

    }
}
