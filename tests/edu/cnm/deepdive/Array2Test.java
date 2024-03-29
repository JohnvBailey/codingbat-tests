package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


class Array2Test {

Array2 array = new Array2();
  static Object[][] input = {
      {new int[]{1, 2, 2}, true},
      {new int[]{4, 4, 1}, true},
      {new int[]{4, 4, 1, 2, 2}, false},
      {new int[]{1, 2, 3, 4}, false},
      {new int[]{3, 5, 9}, false},
      {new int[]{1, 2, 3, 4, 4}, true},
      {new int[]{2, 2, 3, 4}, true},
      {new int[]{1, 2, 3, 2, 2, 4}, true},
      {new int[]{1, 2, 3, 2, 2, 4, 4}, false},
      {new int[]{1, 2}, false},
      {new int[]{2, 2}, true},
      {new int[]{4, 4}, true},
      {new int[]{2}, false},
      {new int[]{}, false}
  };

  int [] array1 = { 1,2,2};
  int [] array2 = { 4, 4, 1};
  int [] array3 = { 1, 2, 3, 4, 4};
  int [] array4 = { 2, 2, 3, 4};
  int [] array5 = { 1, 2, 3, 2, 2, 4};
  int [] array6 = { 2, 2};
  int [] array7 = { 4, 4};

  private static Object[][] Either24Source() {
    return input;
  }

  @ParameterizedTest
@MethodSource("either24Source")
  void isEither24(int [] nums, boolean expected){
    boolean actual = array.either24(nums);
    if (expected){
      assertTrue(actual);
    }else {
      assertFalse(actual);
    }
    assertAll();

//    int [] array1 = { 1,2,2};
//    int [] array1 = { 1,2,2};
//    int [] array1 = { 1,2,2};




//    assertTrue(array.either24(array1));
//    assertTrue(array.either24(array2));
//    assertTrue(array.either24(array3));
//    assertTrue(array.either24(array4));
//    assertTrue(array.either24(array5));
//    assertTrue(array.either24(array6));
//    assertTrue(array.either24(array7));
//
//    assertFalse(array);



  }



}