package by.academy.classwork9;

public class Test {
    public static void main(String[] args) {

int arr1 [] = {1,2,3,4,5};

int arr2 [][] = {{1,2,3},{4,5,6}};

for(int i = 0; i< arr1.length; i++) {
    System.out.println(arr1[i]);
}

for(int each: arr1){
    System.out.println(each);
}

for(int i =0; i<arr2.length; i++)
    for(int j=0; j<arr2[i].length; j++){
        System.out.println(arr2[i][j]);
    }

int lastNumber = arr1[arr1.length -1];
        System.out.println("last number:" + lastNumber);


    }
}
