import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

//Ensures Probability represents the value of the expectation that an event will occur in mathematical way
public class TestProbability {

    public final int totalProbability = 1;
    public final Double CHANCE_OF_GETTING_SOME_NUMBER_IN_ADIE = 0.167;

    @Test
    public void verifyEqualityOfChanceOfDice3AndDice6() {
        Probability chanceOf3 = new Probability(CHANCE_OF_GETTING_SOME_NUMBER_IN_ADIE);
        Probability chanceOf6 = new Probability(CHANCE_OF_GETTING_SOME_NUMBER_IN_ADIE);

        assertThat(chanceOf3, equalTo(chanceOf6));
    }

    @Test
    public void verifyIfTwoObjectsAreDifferent() throws Exception {
        Probability obj1 = new Probability(0.2);
        Probability obj2 = new Probability(0.25);

        assertThat(false, equalTo(obj1.equals(obj2)));
    }

    @Test
    public void chancesOfGettingNotRollingThree() throws Exception {
        Probability probabilityOfRollingThree = new Probability(CHANCE_OF_GETTING_SOME_NUMBER_IN_ADIE);

        assertThat(probabilityOfRollingThree.not(), equalTo(new Probability(totalProbability - CHANCE_OF_GETTING_SOME_NUMBER_IN_ADIE)));
    }

    @Test
    public void chancesOfGettingOneAndSixOnTwoDifferentDies() throws Exception {
        Probability probability = new Probability(CHANCE_OF_GETTING_SOME_NUMBER_IN_ADIE);
        Probability probabilityOfSix = new Probability(CHANCE_OF_GETTING_SOME_NUMBER_IN_ADIE);
        Probability probabilityOfBothOneAndSix = new Probability(CHANCE_OF_GETTING_SOME_NUMBER_IN_ADIE * CHANCE_OF_GETTING_SOME_NUMBER_IN_ADIE);

        assertThat(probabilityOfBothOneAndSix.equals(probability.and(probabilityOfSix)), is(true));
    }

    @Test
    public void chanceOfGettingOneOrSix() throws Exception {
        Probability probabilityOfGettingOne = new Probability(CHANCE_OF_GETTING_SOME_NUMBER_IN_ADIE);
        Probability probabilityOfGettingSix = new Probability(CHANCE_OF_GETTING_SOME_NUMBER_IN_ADIE);
        Probability probabilityOfGettingOneOrSix = probabilityOfGettingOne.not().and(probabilityOfGettingSix.not()).not();

        assertThat(probabilityOfGettingOneOrSix.equals(probabilityOfGettingOne.or(probabilityOfGettingSix)), is(true));
    }
}
