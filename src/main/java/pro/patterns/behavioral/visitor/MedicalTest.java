package pro.patterns.behavioral.visitor;

public interface MedicalTest {
    void accept(MedicalVisitor visitor);
}
