//==================================
// Foundations of Computer Science
// Student: YIQI LI
// id: your a1787585
// Semester: 2
// Year: 2020
// Practical Exam Number: 3
//===================================
public abstract class PowerTool extends Tool{
    int power;      //represents the power rating of the tool in watts

    public PowerTool(float weight, float value) {
        super(weight, value);
    }

    public PowerTool(float weight, float value, int power) {
        super(weight, value);
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
