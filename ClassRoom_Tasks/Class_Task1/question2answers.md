# Think & Analyze

## 1. Which Stream operations will you use for filtering and transformation?

We use `filter()` to select marks greater than or equal to 60 and `map()` to add 5 bonus marks to each selected mark.

---

## 2. Where will you use a lambda expression?

Lambda expressions are used with Stream operations.

- `mark -> mark >= 60` is used with `filter()` to select marks.
- `mark -> mark + 5` is used with `map()` to add bonus marks.

---

## 3. Why is map() suitable for adding bonus marks?

`map()` is suitable because it is used to transform each element of a stream into a new value.

For example:

- 78 becomes 83
- 90 becomes 95
- 65 becomes 70

Therefore, `map()` is suitable for adding 5 bonus marks to each selected mark.

---

## 4. Which operation can be used to calculate the average?

The `average()` operation is used to calculate the average of the updated marks.

Since the marks are integers, `mapToInt()` can be used before `average()`.

---

## 5. Explain the difference between filter() and map() in your solution.

`filter()` is used to select elements based on a condition. It does not modify the elements.

Example:

`filter(mark -> mark >= 60)`

selects only marks that are greater than or equal to 60.

`map()` is used to transform each selected element into a new value.

Example:

`map(mark -> mark + 5)`

adds 5 bonus marks to each selected mark.

Therefore:

- `filter()` → selects elements
- `map()` → transforms elements

---

## 6. Can the same task be solved without Stream API? Explain briefly.

Yes, the same task can be solved without the Stream API using traditional `for` loops, `if` statements, and sorting methods.

A loop can be used to check marks greater than or equal to 60 and add 5 bonus marks. Another calculation can be used to find the average, and sorting can be used to display the marks in descending order.

However, the Stream API provides a shorter and more readable functional programming approach using operations such as `filter()`, `map()`, `average()`, and `sorted()`.
