package homework.Test10;

public class Output implements Runnable {
    private Person person;

    @Override
    public void run() {
        while (true) {
            synchronized (person) {
                if (person.isFlag()) {
                    person.print();
                    person.setFlag(false);
                    person.notify();
                }
                try {
                    person.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Output(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
