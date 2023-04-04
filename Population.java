package Scheme_Project.Group_GeneticAlgorithm;

import java.util.Arrays;

public class Population {

    private Chromosome[] chromosomes;

    public Population(int length) {
        chromosomes = new Chromosome[length];
    }

    public Population initializePopulation() {
        for (int i = 0; i < chromosomes.length; i++) {
            chromosomes[i] = new Chromosome(GeneticAlgorithm.TARGET_CHROMOSOME.length).initializeChromosome();
        }
        sortChromosomesByFitness();
        return this;
    }

    public  void sortChromosomesByFitness() {

        Arrays.sort(chromosomes,(chromosome1, chromosomes2) -> {
            int flag = 0;
            if(chromosome1.getFitness() > chromosomes2.getFitness())
                flag = -1;
            else  if(chromosome1.getFitness() <  chromosomes2.getFitness())
                flag = 1;
            return flag;
        });

//
//
//        int x = chromosomes.length;
//        for (int i = 0; i < x - 1; i++)
//
//            for (int j = 0; j < x - i - 1; j++) {
//               for (Chromo p : chromosomes)
//                if (p[j] > p[j + 1]) {
//                    Chromo tempVar = chromosomes[j];
//                    chromosomes[j] = chromosomes[j + 1];
//                    chromosomes[j + 1] = tempVar;
//                }
//            }
    }



    public Chromosome[] getChromosomes() {
        return chromosomes;
    }

}
