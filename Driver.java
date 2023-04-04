package Scheme_Project.Group_GeneticAlgorithm;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        Population population = new
                Population(GeneticAlgorithm.POPULATION_SIZE).initializePopulation();
        System.out.println("------------------------------------------");
        System.out.println("Generation # 0 " + " | Fittest chromosome fitness: " + population.getChromosomes()[0].getFitness());
        printPopulation(population, "Target Chromosome: "+ Arrays.toString(GeneticAlgorithm.TARGET_CHROMOSOME));
    }

    private static void printPopulation(Population population, String heading) {
        System.out.println(heading);
        System.out.println("------------------------------------------");
        for (int i = 0; i < population.getChromosomes().length; i++) {
            System.out.println("Chromosome # "+ i + " : " + Arrays.toString(population.getChromosomes()[i].getGenes())+
                    " | Fitness:  "+ population.getChromosomes()[i].getFitness());
        }
    }
}
