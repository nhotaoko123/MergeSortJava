# Java Algorithms

This repository contains Java implementations of essential algorithms, focusing on sorting and searching techniques. The current algorithms included are:

## Table of Contents

1. [Merge Sort](#merge-sort)
2. [Binary Search](#binary-search)
3. [Prerequisites](#prerequisites)

## Merge Sort

Merge Sort is a divide-and-conquer algorithm that was invented by John von Neumann in 1945. It works by recursively splitting the array into halves until each subarray contains a single element, then merging those subarrays in a sorted manner.


### Key Features:
- **Time Complexity:** O(n log n)
- **Space Complexity:** O(n)
- **Stability:** Yes (maintains the relative order of equal elements)

### Steps to Implement Merge Sort

1. **Divide the Array**:
   - Calculate the middle index to split the array into two halves.
   - Formula: `middle = (l + r) / 2`, where `l` is the starting index and `r` is the ending index.

2. **Recursive Sorting**:
   - **First Half**: Recursively apply the `mergeSort` function to the first half of the array.
     ```java
     mergeSort(arr, l, middle);
     ```
   - **Second Half**: Recursively apply the `mergeSort` function to the second half of the array.
     ```java
     mergeSort(arr, middle + 1, r);
     ```
3. **Merge**:
   - After both halves are sorted, merge them together to form a single sorted array.
     ```java
     merge(arr, l, middle, r);
     ```

![image](https://github.com/user-attachments/assets/542f7e1c-b49b-4304-abb4-3a9a0a737189)


## Binary Search
Binary Search is an efficient algorithm for finding an item from a sorted list of items. It works by repeatedly dividing the search interval in half. If the value of the search key is less than the item in the middle of the interval, the interval is narrowed to the lower half; otherwise, it is narrowed to the upper half.

### Key Features:
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)
- **Applicability:** Requires a sorted array

### Steps to Implement Merge Sort

1. **Set the Initial Boundaries**:
Initialize two pointers, left and right, representing the boundaries of the search area. Initially, left will be 0, and right will be the last index of the array (array.length - 1).

2. **Implement the Loop**:
   - Calculate the middle index of the current search interval:  int middle = left + (right - left) / 2;
   - Compare the middle element with the target:
        - If they are equal, return the middle index.
        - If the middle element is less than the target, adjust the left boundary to middle + 1 (search in the right half).
        - If the middle element is greater than the target, adjust the right boundary to middle - 1 (search in the left half).

3. **Return the Result**
   - If the loop ends without finding the target, return -1, indicating that the target is not in the array.

![image](https://github.com/user-attachments/assets/c50594c0-8f3b-45a6-8eba-a7535cb0e54b)


## Prerequisites

To run the code, you need to have the following installed:

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor with Java support (e.g., VS Code)
