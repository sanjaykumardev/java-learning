import java.util.*;

class Individual {
    String name;
    String gender;
    Individual father;
    Individual mother;

    Individual(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
}

class Family {
    private Map<String, Individual> individuals = new HashMap<>();

    public void addIndividual(String name, String gender, String fatherName, String motherName) {
        Individual individual = individuals.getOrDefault(name, new Individual(name, gender));
        individual.gender = gender;
        individual.father = individuals.getOrDefault(fatherName, new Individual(fatherName, ""));
        individual.mother = individuals.getOrDefault(motherName, new Individual(motherName, ""));
        individuals.put(name, individual);
        individuals.put(fatherName, individual.father);
        individuals.put(motherName, individual.mother);
    }

    public List<String> findEligibleMatches(String personName) {
        Individual individual = individuals.get(personName);
        if (individual == null) {
            return Collections.emptyList();
        }

        List<String> matches = new ArrayList<>();

        if (individual.gender.equals("Male")) {
            if (individual.father != null && individual.father.father != null) {
                Individual paternalGrandfather = individual.father.father;
                for (Individual aunt : getChildren(paternalGrandfather)) {
                    if (aunt.gender.equals("Female")) {
                        for (Individual cousin : getChildren(aunt)) {
                            if (cousin.gender.equals("Female")) {
                                matches.add(cousin.name);
                            }
                        }
                    }
                }
            }
            if (individual.mother != null && individual.mother.father != null) {
                Individual maternalGrandfather = individual.mother.father;
                for (Individual uncle : getChildren(maternalGrandfather)) {
                    if (uncle.gender.equals("Male")) {
                        for (Individual cousin : getChildren(uncle)) {
                            if (cousin.gender.equals("Female")) {
                                matches.add(cousin.name);
                            }
                        }
                    }
                }
            }
        } else if (individual.gender.equals("Female")) {
            if (individual.father != null && individual.father.father != null) {
                Individual paternalGrandfather = individual.father.father;
                for (Individual aunt : getChildren(paternalGrandfather)) {
                    if (aunt.gender.equals("Female")) {
                        for (Individual cousin : getChildren(aunt)) {
                            if (cousin.gender.equals("Male")) {
                                matches.add(cousin.name);
                            }
                        }
                    }
                }
            }
            if (individual.mother != null && individual.mother.father != null) {
                Individual maternalGrandfather = individual.mother.father;
                for (Individual uncle : getChildren(maternalGrandfather)) {
                    if (uncle.gender.equals("Male")) {
                        for (Individual cousin : getChildren(uncle)) {
                            if (cousin.gender.equals("Male")) {
                                matches.add(cousin.name);
                            }
                        }
                    }
                }
            }
        }

        return matches;
    }

    private List<Individual> getChildren(Individual parent) {
        List<Individual> children = new ArrayList<>();
        for (Individual individual : individuals.values()) {
            if (individual.father == parent || individual.mother == parent) {
                children.add(individual);
            }
        }
        return children;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Family familyTree = new Family();

        System.out.println("Enter the number of people:");
        int numberOfPeople = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter details in format <name>, <gender>, <father's name>, <mother's name>:");
        for (int i = 0; i < numberOfPeople; i++) {
            String input = scanner.nextLine();
            String[] details = input.split(", ");
            familyTree.addIndividual(details[0], details[1], details[2], details[3]);
        }
        System.out.println("Enter the person's name to find eligible matches:");
        String personName = scanner.nextLine();
        List<String> matches = familyTree.findEligibleMatches(personName);
        System.out.println("Eligible matches for " + personName + ": " + String.join(", ", matches));
    }
}