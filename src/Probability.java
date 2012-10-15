//Understands the measure (a percentage between 0 and 1) of the expectation that an event will occur
public class Probability {
    private Double percentage;
    private final int CERTAINTY = 1;

    public Probability(Double percentage) {
        this.percentage = percentage;
    }

    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        } else if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Probability objProbability = (Probability) obj;
        return percentage.doubleValue() == objProbability.percentage.doubleValue();
    }

    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + percentage.hashCode();
        return result;
    }

    public Probability and(Probability secondProbability) {
        return new Probability(percentage * secondProbability.percentage);
    }

    public Probability not() {
        return new Probability(CERTAINTY - percentage);
    }

    public Probability or(Probability secondProbability) {
        return new Probability(percentage + secondProbability.percentage - and(secondProbability).percentage);
    }
}
