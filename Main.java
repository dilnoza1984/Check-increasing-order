class Main {
  public static void main(String[] args) {
    
   // TESTS

    System.out.println(numsIncreasing(new int[]{1, 3, 4}));  //→ true
    System.out.println(numsIncreasing(new int[]{1, 3, 2})); // → false
    System.out.println(numsIncreasing(new int[]{1, 1, 4})); // → true
     System.out.println(numsIncreasing(new int[]{1, 1, 0, 2, 3, 4})); // → false



  }


  public static boolean numsIncreasing(int[] arr) {
   boolean flag = false;
    
    for (int i = 0; i < arr.length-1; i++){
      if (arr[i+1] >= arr[i])
        flag = true;
      else
        return false;
    }

    return flag;
  }
}