## Efficiency

### How is this efficient?

 This solution does not use any additional data structures (like a hashmap), so its space complexity is O(1) aside from the output array, which makes it efficient in terms of memory usage, the logic is also very straight forward.

### Why is this not efficient and how would I make this more efficient?
1.	Time Complexity: This solution has a time complexity of O(n²), where n is the number of elements in the nums array. For each element at index i, the inner loop iterates over the remaining n - i - 1 elements, which results in a quadratic number of comparisons. This is inefficient for large arrays, as the number of comparisons grows quickly with the array size.

2.	Scalability: For larger inputs, a nested loop approach becomes much slower, and performance can degrade significantly, especially if the nums array has thousands of elements.

3.	Alternative (More Efficient) Solution Available: A hashmap solution would improve the time complexity to O(n) by storing elements and their indices as you iterate through the array.


## Hashmap Solution

### Time Complexity
1. This solution uses a single loop (`for` loop) to iterate through the array `nums`, which takes \( O(n) \) time.
2. Within each iteration:
   - Calculating the `complement` and checking if it exists in the map (`numMap.containsKey(complement)`) is an \( O(1) \) operation on average.
   - If the complement is not in the map, we add the current number and its index to `numMap`, which is also \( O(1) \).
3. Therefore, the **time complexity** is \( O(n) \) overall, which is much faster than the \( O(n^2) \) complexity of the previous solution.

### Space Complexity
1. The hash map `numMap` stores each unique element of `nums` with its index. In the worst case, this requires storing all `n` elements if no solution is found until the end.
2. Thus, **space complexity** is \( O(n) \).

### Comparison Summary
- **Previous Solution**:
  - **Time Complexity**: \( O(n^2) \) due to the nested loop.
  - **Space Complexity**: \( O(1) \).
- **Optimized Solution (Using HashMap)**:
  - **Time Complexity**: \( O(n) \) due to a single pass and efficient lookups.
  - **Space Complexity**: \( O(n) \) due to storing elements in a hash map.