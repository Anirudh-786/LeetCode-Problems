package org.example;

public class Maximum {

    static int getMaximum(int arr[]) {
        int maxi = arr[0];

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        //jab main yaha pahuchenga, toh poora array compare ho chuka
        //honga and maxi k andar sabse badi value hongi
        return maxi;
    }


    static void main() {
        int arr[] = {1,3,5,9};
        System.out.println(getMaximum(arr));
    }
}
