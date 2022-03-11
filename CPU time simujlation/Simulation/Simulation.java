package Simulation;

import java.util.ArrayList;
import TheProcessor.*;

public class Simulation {
    /**
     * Number of processes to simulate.
     */
    private static final int PROC_NO = 1000;
    /**
     * Simulated processor. Singleton.
     */
    Processor processor = TheProcessor.Processor.getInstance();

    public static void main(String[] args) {
        System.out.println("Hi 1");
        Simulation simulation = new Simulation();
        System.out.println("Hi 2");
        simulation.runSimulation();
        System.out.println("Hi 3");
    }

    /**
     * Function creates simulated processes.
     * @return The ArrayList of created processes.
     */
    private ArrayList<TheProcessor.Process> createProcesses(){
        ArrayList<TheProcessor.Process> processes = new ArrayList<>(PROC_NO);
        int processTime = 1;
        for(int i=0; i<PROC_NO/3; i++){
            TheProcessor.Process process = new TheProcessor.Process(processTime);
            processes.add(process);
        }
        processTime = 10;
        for(int i=0; i<PROC_NO/3; i++){
            TheProcessor.Process process = new TheProcessor.Process(processTime);
            processes.add(process);
        }
        processTime = 100;
        for(int i=0; i<PROC_NO/3; i++){
            TheProcessor.Process process = new TheProcessor.Process(processTime);
            processes.add(process);
        }
        return processes;
    }

    public void runSimulation(){
        ArrayList<TheProcessor.Process> processes = createProcesses();
        long startTime = System.currentTimeMillis();
        for(int i=0; i<processes.size(); i++){
            processor.process(processes.get(i));
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

}