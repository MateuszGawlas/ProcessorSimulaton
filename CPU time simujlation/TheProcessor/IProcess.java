package TheProcessor;

/**
 * Interface fir the process.
 */
public interface IProcess {
    
    /**
     * Functuin returns number of "ticks" the process will take.
     * @return Number of remaining simulation "ticks".
     */
    public int getTime();
    
    /**
     * Method diminishes the number of "ticks" required by the process.
     */
    public void processTheProcess();
}
