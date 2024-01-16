import java.util.concurrent.TimeUnit;

public class DoctorThread implements Runnable{

    Animal animal;
    Boolean exit;
    Thread t;

    public DoctorThread(Animal animal) {
        this.animal = animal;
        t = new Thread(this, animal.getName());
        this.exit = false;
        t.start();
    }

    @Override
    public void run() {
        while (!exit) {
            System.out.println("Doctor: Healing animal " + animal.getName());
            this.animal.setHealth_status("Healthy");
        }
    }

    public void stop()
    {
        exit = true;
    }

}
