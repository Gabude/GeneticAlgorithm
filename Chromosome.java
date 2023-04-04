package Scheme_Project.Group_GeneticAlgorithm;

import java.util.Arrays;
import java.util.Random;

public class Chromosome {
    private int[] genes;
    private int fitness = 0;

    private boolean isFitnessChanged = true;

    public Chromosome(int length) {
        genes = new int[length];
    }

    public Chromosome initializeChromosome() {

        Random rd = new Random(); // creating Random object
        for (int i = 0; i < genes.length; i++) {
            genes[i] = 1 + rd.nextInt(8); // storing random integers in an array
        }
        return this;
    }

    public int[] getGenes() {
        isFitnessChanged = true;
        return genes;
    }
    public int getFitness() {

        if(isFitnessChanged){
            fitness = recalculateFitness();
            isFitnessChanged = false;
        }
        return fitness;
    }

    private int recalculateFitness() {
        int chromosomeFitness = 0;

        for (int i = 0; i < genes.length; i++) {
            if(genes[i] == GeneticAlgorithm.TARGET_CHROMOSOME[i]) chromosomeFitness++;
        }
        return chromosomeFitness;
    }

    @Override
    public String toString() {
        return  Arrays.toString(this.genes) ;
    }

}
