package Scheme_Project.Group_GeneticAlgorithm;


public class GeneticAlgorithm {
    public static final int POPULATION_SIZE = 8;
    public static final int[] TARGET_CHROMOSOME = {2,4,4,1,5,4,1,7};

    public Population evolve(Population population){
        return mutatePopulation(crossoverPopulation(population));
    }


    private Population crossoverPopulation(Population population) {
        return population;
    }

    private Population mutatePopulation(Population population) {
        return population;
    }

}
