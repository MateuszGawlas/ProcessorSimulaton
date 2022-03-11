package TheProcessor;

/**
 * This interface is for simulation of the processor.
 */
public interface IProcessor {
    /**
     * This methid simulates the processor working on a task.
     * @param toProcess A process given to the processor so it can work on it.
     */
void process(Process toProcess);
}
