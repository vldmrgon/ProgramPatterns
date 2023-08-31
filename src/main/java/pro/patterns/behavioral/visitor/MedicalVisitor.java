package pro.patterns.behavioral.visitor;

public interface MedicalVisitor {

    void visit(BloodTest bloodTest);

    void visit(UrineTest urineTest);
}
