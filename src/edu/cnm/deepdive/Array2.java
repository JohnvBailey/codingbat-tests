package edu.cnm.deepdive;

import java.util.Arrays;

public class Array2 {


  public boolean either24(int[] nums) {
    int two = 0, four = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 2 && nums[i + 1] == 2)
        two++;
      if (nums[i] == 4 && nums[i + 1] == 4)
        four++;
    }
    if (two != 0 && four != 0)
      return false;
    else if (two != 0 || four != 0)
      return true;
    else
      return false;

  }

  public int[] pre4(int[] nums) {
    int[] x = {};
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 4) {
        x = Arrays.copyOf(nums, i);
        break;
      }
    }
    return x;
  }
}
