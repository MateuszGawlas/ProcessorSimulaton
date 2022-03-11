package TheProcessor;

public class Processor implements IProcessor{

    /**
     * The singleton instance of thr processor.
     */
    private static final Processor processorInstance = new Processor();

    /**
     * Ensuting no other instance can bd created.
     */
    private Processor(){}

    /**
     * The method te get the instance of Processor.
     * @return The instance of Processor.
     */
    public static final Processor getInstance(){
        return processorInstance;
    }

    @Override
    /**
     * This method ssimulates the process being processedd by the CPI.
     */
    public void process(Process toProcess) {
        int timeNeeded = toProcess.getTime();
        for(int i=0; i<timeNeeded; i++){
            try {
                wait(10);
            } catch (InterruptedException e) {
                System.out.println();
                e.printStackTrace();
            }
        }
    }
    
}