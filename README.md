# Merge Sort in Java

This repository contains an implementation of the Merge Sort algorithm in Java. Merge Sort is a divide-and-conquer algorithm that divides the input array into two halves, recursively sorts them, and then merges the sorted halves to produce the sorted array.

## Features

- **Efficient Sorting**: Merge Sort has a time complexity of O(n log n), making it efficient for large datasets.
- **Stable Sort**: Maintains the relative order of equal elements.
- **Recursive Implementation**: The algorithm is implemented using recursion.

## Steps to Implement Merge Sort

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


## Prerequisites

To run the code, you need to have the following installed:

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor with Java support (e.g., VS Code)
