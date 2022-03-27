package StudentManagement;

public class StudentManagement {
    String[] names = new String[30];

    public void addName(String name) {
        for (int i = 0; i < 30; i++) {
            if (names[i] == null) {
                names[i] = name;
                break;
            }
        }
    }

    //在a.equals(b)结构中，a不可以为null，b可以为null
    public boolean findName(int start, int end, String name) {
        boolean flag = false;
        for (int i = start - 1; i < end; i++) {
            if (name.equals(names[i])) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void showNames() {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.print(names[i] + "  ");
            }
        }
    }
}
