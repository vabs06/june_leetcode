//  Question Link: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/540/week-2-june-8th-june-14th/3358/
//  Time Complexity: O(1)
//  Space Complexity: O(1) in map case of [1024 * 8]

//  Hash Table concept. [I solved using both HashMap && HashSet ]

class RandomizedSet {

    // Set<Integer> set;
    Map<Integer, Integer> map;
    int A[];
    Random random;
    int idx;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        A = new int[1024 * 8];
        map = new HashMap<>();
        random = new Random();
        // set = new HashSet<Integer>();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain
     * the specified element.
     */
    public boolean insert(int val) {
        // Using Map

        if (!map.containsKey(val)) {
            map.put(val, idx);
            A[idx++] = val;
            return true;
        }
        return false;

        // Using Set
        /*
         * if(set.contains(val) != true){ set.add(val); return true; } return false;
         */
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified
     * element.
     */
    public boolean remove(int val) {
        // Using Map

        Integer index = map.remove(val);
        if (index == null)
            return false;
        if (--idx > index) {
            A[index] = A[idx];
            map.put(A[idx], index);
        }
        return true;

        // Using Set
        /*
         * if(set.contains(val) != false){ set.remove(val); return true; } return false;
         */
    }

    /** Get a random element from the set. */
    public int getRandom() {
        // Using Map
        return A[random.nextInt(idx)];

        // Using Set
        /*
         * int val = random.nextInt(set.size()); Integer data[] = set.toArray(new
         * Integer[0]); return data[val];
         */

    }
}