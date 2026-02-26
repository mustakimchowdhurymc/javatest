public static void main(String[] args) {

  int[] arr = {1, 2, 3, 4, 5};

  // reverese it
  int a = 0;

  int[] arr1 = new int[arr.length];

  for (int i = arr.length-1 ; i>=0; i-- ){
    arr1[a]= arr[i];
    a = a+1;

}

System.out.println(arr1);

for (int num : arr1) {
    System.out.println(num);
}


// sorting array

int [] arraynumber = {21, 213, 32, 234, 35, 565, 55,32 , 25, 55};

Arrays.sort(arraynumber);

for(int num1 : arraynumber){

    System.out.println(num1);
}


}