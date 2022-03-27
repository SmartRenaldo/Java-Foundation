package DemoStudent;

public class Student {
    //Attributes: name, physic, chemistry, math, average
    private String name;
    private int physic;
    private int chemistry;
    private int math;
    private double average;

    public Student() {
    }

    public Student(String name, int physic, int chemistry, int math) {
        this.name = name;
        this.physic = physic;
        this.chemistry = chemistry;
        this.math = math;
        //Keep two decimal places
        double avg = (physic + chemistry + math) / 3.0;
        this.average = Math.round(avg * 100) / 100.0;
    }

    public void sortStudents(Student[] array) {
        // Sort average score
        for (int i = 1; i < array.length; i++) {
            Student key = array[i];

            // Find the position to insert key element
            // searching to the left from key
            int j = i - 1;
            while (j >= 0 && key.average > array[j].average) {
                array[j + 1] = array[j];
                j--;
            }
            // Insert key element
            array[j + 1] = key;
        }

        // Sort physic score
        for (int i = 1; i < array.length; i++) {
            Student key = array[i];

            // Find the position to insert key element
            // searching to the left from key
            int j = i - 1;
            while (j >= 0 && key.average == array[j].average && key.physic > array[j].physic) {
                array[j + 1] = array[j];
                j--;
            }
            // Insert key element
            array[j + 1] = key;
        }

        // Sort chemistry score
        for (int i = 1; i < array.length; i++) {
            Student key = array[i];

            // Find the position to insert key element
            // searching to the left from key
            int j = i - 1;
            while (j >= 0 && key.average == array[j].average && key.physic == array[j].physic
                    && key.chemistry > array[j].chemistry) {
                array[j + 1] = array[j];
                j--;
            }
            // Insert key element
            array[j + 1] = key;
        }

        // Sort math score
        for (int i = 1; i < array.length; i++) {
            Student key = array[i];

            // Find the position to insert key element
            // searching to the left from key
            int j = i - 1;
            while (j >= 0 && key.average == array[j].average && key.physic == array[j].physic
                    && key.chemistry == array[j].chemistry && key.math > array[j].math) {
                array[j + 1] = array[j];
                j--;
            }
            // Insert key element
            array[j + 1] = key;
        }
    }

    public void sort(String[] array) {
        // Loop through array elements as keys
        for (int i = 1; i < array.length; i++) {
            String key = array[i];

            // Find the position to insert key element
            // searching to the left from key
            int j = i - 1;
            while (j >= 0 && key.compareTo(array[j]) < 0) {
                array[j + 1] = array[j];
                j--;
            }
            // Insert key element
            array[j + 1] = key;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhysic() {
        return physic;
    }

    public void setPhysic(int physic) {
        this.physic = physic;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", physic=" + physic +
                ", chemistry=" + chemistry +
                ", math=" + math +
                ", average=" + average +
                '}';
    }
}
