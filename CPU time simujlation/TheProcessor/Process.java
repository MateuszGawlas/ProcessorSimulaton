package TheProcessor;

/**
 * Class for the simullated processes,
 */
public class Process implements IProcess{

    /**
     * Field holding the information of how many "ticks" this process needs.
     */
    private int timeNeeded;

    /**
     * Constructor for the process.
     * @param timeNeeded Time the process will need.
     */
    public Process(int timeNeeded){
        this.timeNeeded = timeNeeded;
    }
    

    @Override
    /**
     * Method returns the time this process needs.
     */
    public int getTime() {
        return timeNeeded;
    }

    @Override
    /**
     * Method simulates processing this process.
     */
    public void processTheProcess() {
        timeNeeded--;
    }
    
}
