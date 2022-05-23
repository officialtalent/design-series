# design-series
Designing flexible software with design patterns and SOLID principles.

### Design Principles
1. Identify the aspects of your application that vary and separate them from what stays the same.
2. Program to an interface, not an implementation.

Programming to an implementation would be:
```JAVA
Dog d = new Dog();
d.bark();
```

Programming to an interface/supertype would be:
```JAVA
Animal animal = new Dog();
animal.makeSound();
```
Even better, rather than hardcoding the instantiation of the subtype (like new Dog()) into the
code, assign the concrete implementation object at runtime:
```JAVA
a = getAnimal();
a.makeSound();
```
Designing classes:
```JAVA
public interface Animal {
  // Interface (supertype)
  void makeSound();
}

public class Dog implements Animal {
  // Concrete implementation
  @Override
  public void makeSound() {
    bark();
  }
  
  public void bark() {
    ...
  }
}

public class Cat implements Animal {
  // Concrete implementation
  @Override
  public void makeSound() {
    meow();
  }
  
  public void meow() {
    ...
  }
}

```
