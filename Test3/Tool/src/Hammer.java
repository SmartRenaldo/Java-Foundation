//==================================
// Foundations of Computer Science
// Student: YIQI LI
// id: your a1787585
// Semester: 2
// Year: 2020
// Practical Exam Number: 3
//===================================
public class Hammer extends HandTool {
    //constructor
    public Hammer(float weight, float value) {
        super(weight, value);
        super.sharp = true;
    }


    @Override
    public void useTool(int num) {
        super.setValue(super.getValue() - 0.01F * num);
        if (super.getValue() < 0) {     //make sure the value can never drop below zero
            return;
        }
        System.out.println("Bang!");
    }
}
