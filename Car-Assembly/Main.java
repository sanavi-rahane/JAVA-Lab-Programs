// 11) Create the CarAssembly class which implements Runnable interface with the following parts:
// ●	Private fields for the componentName(String) and timeToPrepare(int)
// ●	Write a constructor CarAssembly that has two parameters componentName and timeToPrepare . This method should initialize all the private fields of the class.
// ●	Write an run method that has sleep method which takes timeToPrepare parameter. The sleep method is invoveked between two print statements componentName is preparing & componentName is ready.
// ●	Components names and their preparation times are as follows
// ●	Engine-3000, Body-4000, Wheels-5000
// Create three threads namely engineThread, bodyThread, wheelThread and use Join method for Sysnchronization.



class CarAssembly implements Runnable {
    private String componentName;
    private int timeToPrepare;

    // Constructor
    public CarAssembly(String componentName, int timeToPrepare) {
        this.componentName = componentName;
        this.timeToPrepare = timeToPrepare;
    }

    // run method from Runnable interface
    @Override
    public void run() {
        try {
            System.out.println(componentName + " is preparing...");
            Thread.sleep(timeToPrepare);
            System.out.println(componentName + " is ready.");
        } catch (InterruptedException e) {
            System.out.println(componentName + " preparation interrupted.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Runnable tasks
        CarAssembly engine = new CarAssembly("Engine", 3000);
        CarAssembly body = new CarAssembly("Body", 4000);
        CarAssembly wheels = new CarAssembly("Wheels", 5000);

        // Create threads
        Thread engineThread = new Thread(engine);
        Thread bodyThread = new Thread(body);
        Thread wheelThread = new Thread(wheels);

        try {
            // Start and join engine thread
            engineThread.start();
            engineThread.join();

            // Start and join body thread
            bodyThread.start();
            bodyThread.join();

            // Start and join wheels thread
            wheelThread.start();
            wheelThread.join();

            System.out.println("All car components are ready. Car assembly complete!");
        } catch (InterruptedException e) {
            System.out.println("Assembly process interrupted.");
        }
    }
}
