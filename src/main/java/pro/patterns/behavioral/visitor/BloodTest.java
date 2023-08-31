package pro.patterns.behavioral.visitor;

import lombok.Getter;

@Getter
public class BloodTest implements MedicalTest {

    private final double whiteBloodCells;
    private final double hemoglobin;

    public BloodTest(double hemoglobin, double whiteBloodCells) {
        this.whiteBloodCells = whiteBloodCells;
        this.hemoglobin = hemoglobin;
    }

    @Override
    public void accept(MedicalVisitor visitor) {
        visitor.visit(this);
    }
}