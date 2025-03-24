To convert an `ArrayList<Integer>` to an `int[]` in Java, you can't directly use `.toArray()` because it returns an `Integer[]`, not `int[]`. Instead, you can use one of the following methods:

---

### **1. Using Streams (Java 8+)**
This is the cleanest way to convert an `ArrayList<Integer>` to an `int[]`:
```java
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        int[] array = list.stream().mapToInt(Integer::intValue).toArray(); // Convert to int[]
        
        // Print the array
        for (int num : array) {
            System.out.println(num);
        }
    }
}
```
> ✅ **`mapToInt(Integer::intValue)` unboxes `Integer` to `int` automatically.**

---

### **Optimized Approach**
1. **Use `Set` Instead of `ArrayList<Integer>` for `ans`**  
   - Since we only store unique intersections, using a `HashSet` for `ans` avoids duplicate checks.  
   - After collecting all elements, we convert the set to an `int[]`.

2. **Use `retainAll()` to Reduce Code**  
   - Instead of manually checking `contains()` and `remove()`, we can use `retainAll()`, which finds the intersection in one step.

---

### **Optimized Code**
```java
import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n); // Store unique elements of nums1
        }

        HashSet<Integer> set2 = new HashSet<>();
        for (int n : nums2) {
            set2.add(n); // Store unique elements of nums2
        }

        set1.retainAll(set2); // Keep only common elements

        return set1.stream().mapToInt(Integer::intValue).toArray(); // Convert Set<Integer> to int[]
    }
}
```
---

### **Fixed Code Using Iterative Approach**
```java
import java.util.*;

class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        HashSet<String> supply = new HashSet<>(Arrays.asList(supplies)); // Initialize supply
        List<String> ans = new ArrayList<>();
        boolean addedNewRecipe = true;

        while (addedNewRecipe) {
            addedNewRecipe = false;

            for (int i = 0; i < recipes.length; i++) {
                if (!supply.contains(recipes[i])) { // If recipe is not already added
                    boolean canMake = true;
                    for (String ingredient : ingredients.get(i)) {
                        if (!supply.contains(ingredient)) {
                            canMake = false;
                            break;
                        }
                    }

                    if (canMake) {
                        ans.add(recipes[i]);
                        supply.add(recipes[i]); // Add recipe to supply
                        addedNewRecipe = true;  // Continue checking
                    }
                }
            }
        }

        return ans;
    }
}
```

---

The statement `Arrays.fill(arr, -1);` is **incorrect** because `Arrays.fill()` works only on **one-dimensional** arrays, but `arr` is a **two-dimensional** array.  

### Correct Ways to Fill a 2D Array in Java:

1. **Using a Loop (Recommended for 2D Arrays)**  
   ```java
   for (int i = 0; i <= m; i++) {
       Arrays.fill(arr[i], -1);
   }
   ```
   - This iterates over each row (`arr[i]`) and fills it with `-1`.

2. **Using `Stream` (Less Readable but Works)**
   ```java
   Arrays.stream(arr).forEach(row -> Arrays.fill(row, -1));
   ```
   - This uses Java Streams to iterate over each row and fill it.

Would you like further clarification or an alternative approach? 🚀