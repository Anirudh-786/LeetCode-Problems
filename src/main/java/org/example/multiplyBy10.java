static int[] multiplyBy10 (int[] arr) {
    int size = arr.length;
    int newArray[] = new int [size];

    for(int i=0; i<size; i++) {
        int element = arr[i];
        int newElement = element * 10;
        newArray[i] = newElement;
    }
    return newArray;

}

static void main() {
    int arr[] = {15,25,35,45,55};
    int ans[] = multiplyBy10(arr);
    System.out.println("priting ans array: ");
    for(int i : ans) {
        System.out.println(i);
    }
}


