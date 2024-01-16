import java.util.concurrent.TimeUnit;

public class DiseaseThread implements Runnable{

    Animal animal;
    Boolean exit;
    Thread t;

    public DiseaseThread(Animal animal) {
        this.animal = animal;
        t = new Thread(this, animal.getName());
        this.exit = false;
        t.start();
    }

    @Override
    public void run() {
        while (!exit) {
            System.out.println("Disease: Waiting 2 seconds ");

            TimeUnit time = TimeUnit.SECONDS;
            try {
                time.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Disease: Making animal sick " + animal.getName());
            this.animal.setHealth_status("Sick");
        }
    }

    public void stop()
    {
        exit = true;
    }

}
