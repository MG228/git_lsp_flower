package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a set of integers.
 */
public class IntegerSet {
    // Store the set elements in an ArrayList
    private List<Integer> set = new ArrayList<>();


    public IntegerSet() {
    }

    /**
     * makes the set.
     *
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /**
     * Clears set.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the number of elements in the set.
     *
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks if this set is equal to another set.
     *
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IntegerSet that = (IntegerSet) o;

        return set.equals(that.set);
    }

    /**
     * Checks if the set contains a specific interger.
     *
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest element.
     *
     */
    public int largest() {
        if (set.isEmpty())
            return Integer.MIN_VALUE; // Return a special value to indicate error
        int max = set.get(0);
        for (int num : set) {
            if (num > max)
                max = num;
        }
        return max;
    }

    /**
     * Returns the smallest element.
     *
     */
    public int smallest() {
        if (set.isEmpty())
            return Integer.MAX_VALUE; // Return a special value to indicate error
        int min = set.get(0);
        for (int num : set) {
            if (num < min)
                min = num;
        }
        return min;
    }

    /**
     * Adds an integer if not in set.
     *
     */
    public void add(int item) {
        if (!set.contains(item))
            set.add(item);
    }

    /**
     * Removes an element from the set if found.
     *
     */
    public void remove(int item) {
        set.remove((Integer) item);
    }

    /**
     * creates a union of two sets.
     *
     */
    public void union(IntegerSet intSetb) {
        for (int num : intSetb.set) {
            if (!set.contains(num))
                set.add(num);
        }
    }

    /**
     * creates a intersection of two sets.
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * finds the difference of two sets.
     *
     */
    public void diffrence(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * finds the complement of this set.
     *
     */
    public void complement(IntegerSet intSetb) {
        List<Integer> complement = new ArrayList<>();
        for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE; i++) {
            if (!set.contains(i))
                complement.add(i);
        }
        set = complement;
    }

    /**
     * if the set is empty.
     *
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * string representation of the set.
     *
     */
    @Override
    public String toString() {
        return set.toString();
    }
}

