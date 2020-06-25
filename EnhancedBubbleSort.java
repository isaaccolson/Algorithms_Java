static void countSwaps(int[] a) {

        int totalSwaps = 0;
        boolean swapped = true;
        //enhanced bubble sort
        for (int i = 0; i < a.length -1; i++) {
            swapped = false; 
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j+1]) {
                    swapped = true;
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    totalSwaps++;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println("Array is sorted in " + totalSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);
    }
