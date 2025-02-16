# Java Variable Shadowing Bug

This repository demonstrates a common, yet subtle, error in Java programming: variable shadowing.  The code showcases how a locally declared variable can overshadow an instance variable with the same name, leading to unexpected behavior and difficult-to-debug issues. The solution illustrates how to avoid this by choosing distinct variable names or using 'this' keyword to explicitly access the instance variable.

## Understanding Variable Shadowing

Variable shadowing occurs when a variable declared within a certain scope (e.g., a method) has the same name as a variable declared in an outer scope (e.g., an instance variable or class variable). The inner variable then "shadows" the outer variable, making the outer variable inaccessible within the inner scope unless explicitly accessed using this.  This can lead to confusion and unexpected results.

## How to Avoid Shadowing

* **Use distinct names:**  Choose different names for your variables to avoid any ambiguity. This is the most straightforward approach.
* **Use 'this' keyword:** If you must use the same name, explicitly refer to the instance variable using the 'this' keyword (as shown in the solution).