package dataStructures.hashTable;

import java.util.*;

public class Main {

    /// interview question
    public static boolean intemInCommonNSquared(int[] array1, int[] array2) {
        for (int i : array1) {
            for (int j : array2) {
                if (i == j) return true;
            }
        }
        return false;
    }

    public static Character firstNonRepeatingChar(String str) {
        HashMap<Character, Integer> characters = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (characters.get(str.charAt(i)) != null) {
                Integer value = characters.get(str.charAt(i));
                characters.put(str.charAt(i), value+= 1);
            } else {
                characters.put(str.charAt(i), 1);
            }
        }
        Character res = null;
        System.out.println(characters.keySet());
        System.out.println(characters.values());

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            if (characters.get(str.charAt(i)) == 1) {
                res = str.charAt(i);
                return res;
            }
        }

        return res;

    }

    public static List<List<String>> groupAnagrams(String[] strings) {
        HashMap<String, List<String>> strHashMap = new HashMap<>();

        for (String i : strings) {
            char[] chars = i.toCharArray();
            Arrays.sort(chars);
            String canonical = new String(chars);
            if (strHashMap.containsKey(canonical)) {
                strHashMap.get(canonical).add(i);
            } else {
                List<String> group = new ArrayList<>();
                group.add(i);
                strHashMap.put(canonical, group);
            }
        }

        return new ArrayList<>(strHashMap.values());
    }

    public static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();
        for (int i : array1) {
            myHashMap.put(i, true);
        }

        for (int j : array2) {
            System.out.println(myHashMap.get(j));
            if (myHashMap.get(j) != null) return true;
        }

        return false;
    }

    public static List<Integer> removeDuplicates(List<Integer> myList){
        Set<Integer> uniqueSet = new HashSet<>(myList);
        return new ArrayList<>(uniqueSet);
    }

    public static boolean hasUniqueChars(String string) {
        char[] stringList = string.toCharArray();
        Set<Character> uniqueString = new HashSet<>();

        for (Character i : stringList) {
            if (uniqueString.contains(i)) {
                return false;
            }
            uniqueString.add(i);
        }
        return true;
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsHashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            numsHashMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numsHashMap.containsKey(complement) && numsHashMap.get(complement) != i) {
                return new int[]{i, numsHashMap.get(complement)};
            }
        }

        return new int[]{};

    }

    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        Set<Integer> intSet = new HashSet<>();
        List<int[]> pairs = new ArrayList<>();

        for (int i : arr1) {
            intSet.add(i);
        }

        for (int j : arr2) {
            int complement = target - j;
            if (intSet.contains(complement)) {
                pairs.add(new int[]{complement, j});
            }
        }
        return pairs;
    }

    public static List<List<String>> groupAnagramss(String[] strings) {
        HashMap<String, List<String>> strHashMap = new HashMap<>();

        for (String i : strings) {
            char[] charStr = i.toCharArray();
            Arrays.sort(charStr);
            String sortedStr = new String(charStr);
            if (strHashMap.get(sortedStr) != null) {
                strHashMap.get(sortedStr).add(i);
            } else {
                strHashMap.put(sortedStr, new ArrayList<>(Collections.singleton(i)));
            }
        }

        return new ArrayList<>(strHashMap.values());
    }

    public static int longestConsecutiveSequence(int[] nums) {
        Set<Integer> intSet = new HashSet<>();

        for (int i : nums) {
            intSet.add(i);
        }

        int longestStreak = 0;

        for (int j : intSet) {
            if (!intSet.contains(j - 1)) {
                int currentNum = j;
                int currentStreak = 1;
                while (intSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {

        int[] array1 = {100, 4, 200, 1, 3, 2};
        int[] array2 = {2, 4, 5};

        System.out.println(groupAnagramss(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

    }
}
