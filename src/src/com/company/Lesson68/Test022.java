package com.company.Lesson68;

import java.util.Arrays;

/**
 * Created by user on 10.03.2017.
 * Вам предоставляется массив целых чисел, в котором каждый элемент появляется дважды, за исключением одного.
 * Найдите элемент, который появляется только один раз. Ваше решение должно иметь линейную сложность выполнения (O (n)).
 * Попробуйте реализовать его без использования дополнительной памяти.
 */

public class Test022 {
    public static void main(String[] args) {
        int[] numbers = {2};
        System.out.println(singleNumber(numbers));
    }

    public static int singleNumber(int[] nums){
        Arrays.sort(nums);                          // 0, 0, 1, 2, 2, 3, 3
        int result = 0;

        if(nums.length == 1){
            return nums[0];
        }

        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]){
                i++;
            } else result = nums[i];
        }

        return result;
    }

}

