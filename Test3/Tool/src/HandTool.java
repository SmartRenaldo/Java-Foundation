//==================================
// Foundations of Computer Science
// Student: YIQI LI
// id: your a1787585
// Semester: 2
// Year: 2020
// Practical Exam Number: 3
//===================================
public abstract class HandTool extends Tool{
    //variable
    //sharp is true if the tool is sharp and false otherwise
    boolean sharp;

    //constructor

    public HandTool(float weight, float value, boolean sharp) {
        super(weight, value);
        this.sharp = sharp;
    }

    public HandTool(float weight, float value) {
        super(weight, value);
    }

    public boolean isSharp(){
        return this.sharp;
    }
}
