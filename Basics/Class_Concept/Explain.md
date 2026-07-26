# 🧠 Classes Basics: Python & Java

---

# 📌 Python

## 1. What is `self`?

`self` represents the **current object (instance)** of a class.

Whenever you call an instance method, Python automatically passes the object as the first argument.

### Example

```python
class Animal:
    def eat(self):
        print("Eating")
```

```python
dog = Animal()
dog.eat()
```

Python internally converts it to:

```python
Animal.eat(dog)
```

Here,

- `dog` becomes `self`.

---

## Why is `self` Required?

Wrong:

```python
class Animal:
    def eat():
        print("Eating")
```

Output:

```
TypeError:
Animal.eat() takes 0 positional arguments but 1 was given
```

Correct:

```python
class Animal:
    def eat(self):
        print("Eating")
```

---

# 2. Constructor (`__init__`)

The constructor runs automatically whenever an object is created.

Syntax:

```python
class Animal:
    def __init__(self):
        print("Constructor Called")
```

Creating an object:

```python
dog = Animal()
```

Output:

```
Constructor Called
```

---

# 3. Constructor with Parameters

Wrong:

```python
class Animal:
    def __init__(self, name, spec):
        self.name = ""
        self.spec = ""
```

Object:

```python
dog = Animal("Dog", "Barks")
```

Stored values:

```
name = ""
spec = ""
```

The passed values are ignored.

---

Correct:

```python
class Animal:
    def __init__(self, name, spec):
        self.name = name
        self.spec = spec
```

Now,

```python
dog = Animal("Dog", "Barks")
```

stores

```
name = Dog
spec = Barks
```

---

## Full Example

```python
class Animal:

    def __init__(self, name, spec):
        self.name = name
        self.spec = spec

    def eat(self):
        print(f"{self.name} is eating...")
        print(f"{self.name} belongs to {self.spec}")

dog = Animal("Dog", "Canine")
dog.eat()
```

Output

```
Dog is eating...
Dog belongs to Canine
```

---

# Memory Representation

Creating

```python
dog = Animal("Dog", "Canine")
```

creates

```
dog
 │
 ├── name = "Dog"
 └── spec = "Canine"
```

When

```python
dog.eat()
```

is called,

Python internally executes

```python
Animal.eat(dog)
```

So,

```
self → dog
```

---

# Java

---

# What is `public`?

`public` is an **access modifier**.

It decides **who can access a class, method, or variable**.

---

## Class without `public`

```java
class Animal {

}
```

Accessibility:

- ✅ Same package
- ❌ Different packages

---

## Class with `public`

```java
public class Animal {

}
```

Accessibility:

- ✅ Same package
- ✅ Different package

---

# `public` Method

Without `public`

```java
class Animal {

    void eat(){
        System.out.println("Eating");
    }

}
```

Accessible only inside the same package.

---

With `public`

```java
class Animal {

    public void eat(){
        System.out.println("Eating");
    }

}
```

Accessible from anywhere.

---

# `public` Variable

```java
class Animal{

    public String name;

}
```

Now,

```java
Animal a = new Animal();
a.name = "Buddy";
```

works.

---

# Why is `main()` Public?

```java
public static void main(String[] args)
```

Meaning of each keyword:

| Keyword | Meaning |
|---------|---------|
| public | JVM can access it |
| static | No object required |
| void | Returns nothing |
| main | Entry point of program |
| String[] args | Command-line arguments |

---

If `public` is removed

```java
static void main(String[] args)
```

the JVM may not recognize it as the entry point.

---

# Why `static`?

Without `static`

```java
class Main{

    public void main(String[] args){

    }

}
```

The JVM would need to create an object first.

Instead,

```java
public static void main(String[] args)
```

allows the JVM to call

```java
Main.main(args);
```

without creating an object.

---

# Java Access Modifiers

| Modifier | Accessible From |
|-----------|-----------------|
| public | Everywhere |
| protected | Same package + subclasses |
| default (no modifier) | Same package only |
| private | Same class only |

---

# One Public Class Rule

Correct

```java
public class Main{

}
```

File name:

```
Main.java
```

---

Incorrect

```java
public class Animal{

}

public class Dog{

}
```

A Java file can contain **only one public class**, and the filename must match that class.

---

# Summary

## Python

- `self` represents the current object.
- Python automatically passes `self`.
- `__init__()` is the constructor.
- Store constructor parameters using

```python
self.variable = parameter
```

---

## Java

- `public` makes classes, methods, and variables accessible everywhere.
- `main()` is public so the JVM can call it.
- `static` allows calling `main()` without creating an object.
- Only one public class is allowed per file.

---

# Quick Revision

### Python

```python
class Student:

    def __init__(self, name):
        self.name = name

    def display(self):
        print(self.name)

s = Student("Rahul")
s.display()
```

---

### Java

```java
public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal();

        dog.name = "Buddy";
        dog.eat();

    }

}

class Animal {

    public String name;

    public void eat() {
        System.out.println(name + " is eating.");
    }

}
```

---
