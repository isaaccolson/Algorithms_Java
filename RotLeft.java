// Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int length = a.length;
        int[] shiftedA = new int[length];
            for (int i = 0; i < length; i++) {
                int index = i + d;
                if (index > length - 1) {
                    index = index - length;
                }
                shiftedA[i] = a[index];
            }
        return shiftedA;
    }
