
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        if (flowerbed.length > 1) {
            for (int i = 0; i < flowerbed.length - 1; i++) {

                if (i == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    count++;

                }
                if (i == flowerbed.length - 2 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i + 1] = 1;
                    count++;

                }
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0
                        && i != 0) {
                    flowerbed[i] = 1;
                    count++;

                }
            }
        } else {
            if (flowerbed[0] == 0) {
                count++;

            }

        }

        return count >= n;

    }

    public static void main(String[] args) {
        CanPlaceFlowers cFlowers = new CanPlaceFlowers();
        int[] flowerbed = { 0, 0, 1, 0, 0 };
        int n = 1;
        System.out.println(
                cFlowers.canPlaceFlowers(flowerbed, n)

        );
    }
}
