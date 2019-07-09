package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Array2Test {

  @Test
  void isEither24(){
    Array2 array = new Array2();
    int [] array1 = { 1,2,2};
    int [] array2 = { 4, 4, 1};
    int [] array3 = { 1, 2, 3, 4, 4};
    int [] array4 = { 2, 2, 3, 4};
    int [] array5 = { 1, 2, 3, 2, 2, 4};
    int [] array6 = { 2, 2};
    int [] array7 = { 4, 4};
//    int [] array1 = { 1,2,2};
//    int [] array1 = { 1,2,2};
//    int [] array1 = { 1,2,2};




    assertTrue(array.either24(array1));
    assertTrue(array.either24(array2));
    assertTrue(array.either24(array3));
    assertTrue(array.either24(array4));
    assertTrue(array.either24(array5));
    assertTrue(array.either24(array6));
    assertTrue(array.either24(array7));




  }



}