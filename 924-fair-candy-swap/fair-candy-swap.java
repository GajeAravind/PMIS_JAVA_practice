
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0;
        int sumBob = 0;

        // Calculate Alice's total candies
        for (int candy : aliceSizes) {
            sumAlice += candy;
        }

        // Calculate Bob's total candies
        for (int candy : bobSizes) {
            sumBob += candy;
        }

        // Difference Alice and Bob need to balance
        int diff = (sumAlice - sumBob) / 2;

        // Find the boxes to exchange
        for (int alice : aliceSizes) {
            for (int bob : bobSizes) {
                if (alice - bob == diff) {
                    return new int[]{alice, bob};
                }
            }
        }

        return new int[]{};
    }
}
