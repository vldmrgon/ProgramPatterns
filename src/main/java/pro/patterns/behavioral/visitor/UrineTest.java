package pro.patterns.behavioral.visitor;

import lombok.Getter;

@Getter
public class UrineTest implements MedicalTest {

    private final double glucose;
    private final double pH;

    public UrineTest(double pH, double glucose) {
        this.glucose = glucose;
        this.pH = pH;
    }

    @Override
    public void accept(MedicalVisitor visitor) {
        visitor.visit(this);
    }
}