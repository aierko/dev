package com.company.Lesson71;

import java.util.Arrays;

/**
 * Created by user on 17.03.2017.
 * Вам предоставляется массив целых чисел, в котором каждый элемент появляется дважды, за исключением одного.
 * Найдите элемент, который появляется только один раз. Ваше решение должно иметь линейную сложность выполнения (O (n)).
 * Попробуйте реализовать его без использования дополнительной памяти.
 */
public class Test03 {
    public static void main(String[] args) {
        int[] numbers = {10, 3, 5, 3,78,5};
                System.out.println(oneNumber(numbers));
    }

    public static int oneNumber(int[] nums) {
        Arrays.sort(nums);
        int element = 0;

        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                i++;
            } else element = nums[i];
        }

        return element;
    }

}
