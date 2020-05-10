/**
 * The task calculates the maximum value of things for a given weight.
 */
public class Task6 {

    public static void main(String[] args) {
        Backpack backpack = new Backpack(40);
        Thing[] things = new Thing[] {
                new Thing(3, 15),
                new Thing(5, 19),
                new Thing(10, 30),
                new Thing(17, 58),
                new Thing(16, 49),
                new Thing(20, 59),
                new Thing(19, 60),
        };

        System.out.println( "The maximum value of items for a backpack with a capacity of 40 is " +
                calculateMaxValueForWeight(things.length -1, backpack.getCapacity() , things));
    }

    /**
     * Calculates the maximum value of things for a given weight.
     *
     * @param i current things index. Can't be greater than size of things array - 1
     * @param weight weight to calculate
     * @param things array of things
     * @return maximum value for weight
     */
    private static int calculateMaxValueForWeight(int i, int weight, Thing[] things) {
        if (i < 0 || things == null || i > things.length -1) {
            return 0;
        }
        if (things[i].getWeight() > weight) {
            return calculateMaxValueForWeight(i-1, weight, things);
        }
        else {
            return Math.max(
                    calculateMaxValueForWeight(i-1, weight, things),
                    calculateMaxValueForWeight(i-1, weight - things[i].getWeight(),things)
                            + things[i].getValue());
        }
    }
}
