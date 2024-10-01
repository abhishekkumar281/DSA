package STACK;

class CelebrityInStack {
    public static int celebrity(int mat[][]) {
        int n = mat.length;
        boolean f = false;
        for(int i=0; i<n; i++) {
            f = true;

            for(int j : mat[i]) {
                if(j == 1) {
                    f = false;
                    break;
                }
            }

            if(f) {
                for(int j=0; j<n; j++) {
                    if(i!=j && mat[j][i] == 0) {
                        f = false;
                        break;
                    }
                }
                if(f) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] mat = {{60, 20, 50}, {40, 10, 50}};
        System.out.println(celebrity(mat));

    }
}