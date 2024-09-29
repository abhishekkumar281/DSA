package STACK;

class RectagularArea {
    static int getMaxArea(int[] hist) {
        int res = 0, n = hist.length;

        for (int i = 0; i < n; i++) {
            int curr = hist[i];

            for (int j = i - 1; j >= 0 && hist[j] >= hist[i]; j--)
                curr += hist[i];

            for (int j = i + 1; j < n && hist[j] >= hist[i]; j++)
                curr += hist[i];

            res = Math.max(res, curr);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] hist = {60, 20, 50, 40, 10, 50, 60};
        System.out.println(getMaxArea(hist));
    }
}
