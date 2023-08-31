package pro.patterns.behavioral.visitor;

public class MedicalAnalyzer implements MedicalVisitor {

    @Override
    public void visit(BloodTest bloodTest) {
        System.out.println("BLOOD TEST");
    }

    @Override
    public void visit(UrineTest urineTest) {
        System.out.println("URINE TEST");
    }
}
