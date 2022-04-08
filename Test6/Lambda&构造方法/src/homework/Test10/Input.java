package homework.Test10;

import java.util.Random;

public class Input implements Runnable {
    private Person person;
    private static final Random SYS_RANDOM = new Random();

    @Override
    public void run() {
        while (true) {
            synchronized (person) {
                this.randomlySetPerson();
                person.setFlag(true);
                person.notify();
                try {
                    person.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void randomlySetPerson() {
        this.person.setName(this.randomlySetName(this.randomlySetInteger()));
        this.person.setGender(this.randomlySetGender());
    }

    private String randomlySetGender() {
        int i = (SYS_RANDOM.nextInt(2)) % 2;
        if (i == 1) {
            return "Male";
        }
        return "Female";
    }
    //randomly get a integer from 2 to 7

    private int randomlySetInteger() {
        return SYS_RANDOM.nextInt(6) + 2;
    }
    //num should bigger than 0

    private String randomlySetName(int num) {
        StringBuilder name = new StringBuilder();
        final int UPPER = 65;
        final int LOWER = 97;

        name.append((char) (SYS_RANDOM.nextInt(26) + UPPER));

        for (int i = 0; i < num - 1; i++) {
            name.append((char) (SYS_RANDOM.nextInt(26) + LOWER));
        }

        return name.toString();
    }

    public Input() {
    }

    public Input(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
