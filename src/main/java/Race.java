public class Race {
    private static Car leader;
    Race() {}
    public static void defineLeaderFromParticipants(Car carOne, Car carTwo, Car carThree) {
        if (carOne.getSpeed() * 24 > carTwo.getSpeed() * 24) {
            if (carOne.getSpeed() * 24 > carThree.getSpeed() * 24) leader = carOne;
            else {
                leader = carThree;
            }
        } else if (carTwo.getSpeed() * 24 > carThree.getSpeed() * 24) {
            leader = carTwo;
        } else {
            leader = carThree;
        }
    }
    public Car getLeader() {
        return this.leader;
    }
}