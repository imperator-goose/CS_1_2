package net.ruslan.cs_2;

import java.util.LinkedHashMap;
import java.util.Map;

public class CS_2_1 {

        public int firstUniqChar(String s) {
            Map<Character, Integer> count = new LinkedHashMap<>();

            // Подсчитываем количество символов
            for (char c : s.toCharArray()) {
                count.put(c, count.getOrDefault(c, 0) + 1);
            }

            // Ищем первый неповторяющийся символ
            for (int i = 0; i < s.length(); i++) {
                if (count.get(s.charAt(i)) == 1) {
                    return i;
                }
            }

            return -1;
        }

}