# Question 1 – Analyze OOP and Polymorphism

## 1. What will be the output?

The output will be:

Developer salary  
Manager salary

This happens because the `Developer` and `Manager` classes override the `calculateSalary()` method of the `Employee` class.

---

## 2. Why can an Employee reference hold a Developer or Manager object?

An `Employee` reference can hold a `Developer` or `Manager` object because both classes inherit from the `Employee` class.

Since `Developer` and `Manager` are subclasses of `Employee`, their objects can be assigned to an `Employee` reference.

This is known as **upcasting**.

For example:

- An Employee reference can point to a Developer object.
- An Employee reference can point to a Manager object.

The reference type is `Employee`, but the actual object can be a subclass such as `Developer` or `Manager`.

---

## 3. Which version of calculateSalary() is executed and why?

The `calculateSalary()` method of the actual object is executed.

If the Employee reference points to a `Developer` object, the `Developer` version of `calculateSalary()` is executed.

If the Employee reference points to a `Manager` object, the `Manager` version is executed.

This happens because Java uses **Dynamic Method Dispatch**.

The method to be executed is determined at **runtime** based on the actual object, rather than the reference type.

Therefore:

- Developer object → Developer's `calculateSalary()`
- Manager object → Manager's `calculateSalary()`

---

## 4. Identify the OOP concept demonstrated by this program

The main OOP concept demonstrated is **Runtime Polymorphism**.

The program demonstrates the following OOP concepts:

### Inheritance

`Developer` and `Manager` inherit properties and methods from the `Employee` class.

### Method Overriding

Both `Developer` and `Manager` provide their own implementation of the `calculateSalary()` method.

### Runtime Polymorphism

The same method call can produce different results depending on the actual object.

### Dynamic Method Dispatch

Java determines which overridden method should be executed at runtime.

---

## 5. Modification – Adding a Tester Class

A `Tester` class can be added by extending the `Employee` class and overriding the `calculateSalary()` method.

The Tester class can display:

**Tester salary**

An Employee reference can then refer to a Tester object.

When `calculateSalary()` is called using that reference, the overridden method in the Tester class is executed.

The output after adding Tester will be:

Developer salary  
Manager salary  
Tester salary

---

## OOP Concepts Summary

| Concept | Explanation |
|---|---|
| Inheritance | Developer, Manager, and Tester inherit from Employee. |
| Method Overriding | Subclasses provide their own implementation of calculateSalary(). |
| Runtime Polymorphism | The same method call behaves differently for different objects. |
| Dynamic Method Dispatch | The overridden method is selected at runtime. |
| Upcasting | A subclass object is referenced using a superclass reference. |

---

## Conclusion

This program demonstrates **Runtime Polymorphism** using inheritance and method overriding.

An `Employee` reference can refer to different subclass objects such as `Developer`, `Manager`, and `Tester`. Java determines which version of `calculateSalary()` to execute at runtime based on the actual object.
