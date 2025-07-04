# Java Collections Complete Summary

## 1. Collection Interface
The Java `Collection` interface (`java.util.Collection`) is a root interface for most collections like `List`, `Set`, `Queue`, etc. You don't instantiate `Collection` directly but use its subtypes.

### Example:
```java
Collection<String> collection = new HashSet<>();
collection.add("element");
collection.remove("element");
```

---

## 2. Iterator Interface
The `Iterator` interface is used to iterate over collections.

### Methods:
- `hasNext()` – checks if more elements exist
- `next()` – returns the next element
- `remove()` – removes the last element returned by `next()`
- `forEachRemaining()` – iterates remaining elements using lambda

### Example:
```java
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
    String value = iterator.next();
    System.out.println(value);
}
```

---

## 3. Iterable Interface
The `Iterable` interface allows objects to be used in the enhanced `for-each` loop.

### Example:
```java
List<String> list = new ArrayList<>();
list.add("one");
list.add("two");
list.add("three");

for (String item : list) {
    System.out.println(item);
}
```

To use `Iterable`, a class must implement the `iterator()` method:
```java
public interface Iterable<T> {
    Iterator<T> iterator();
    Spliterator<T> spliterator();
    void forEach(Consumer<? super T> action);
}
```

---

## 4. Collections Utility Class

### Examples:
```java
List<String> list = new ArrayList<>();
Collections.addAll(list, "one", "two", "three");
Collections.sort(list);
Collections.reverse(list);
Collections.shuffle(list);
String min = Collections.min(list);
String max = Collections.max(list);
Collections.replaceAll(list, "one", "ONE");
Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet<>(list));
```

---

## 5. List, Set, SortedSet

### List:
```java
List<String> list = new ArrayList<>();
list.add("element 1");
list.add("element 2");
```

### Set:
```java
Set<String> set = new HashSet<>();
set.add("element 1");
```

### SortedSet:
```java
SortedSet<String> sortedSet = new TreeSet<>();
```

---

## 6. Map and SortedMap

### Map:
```java
Map<String, String> map = new HashMap<>();
map.put("key1", "value1");
```

### SortedMap:
```java
SortedMap<String, String> sortedMap = new TreeMap<>();
```

---

## 7. Properties
```java
Properties props = new Properties();
props.setProperty("username", "admin");
String username = props.getProperty("username");
```

---

## 8. Queue and Deque

### Queue:
```java
Queue<String> queue = new LinkedList<>();
queue.add("one");
queue.poll();
```

### Deque:
```java
Deque<String> deque = new LinkedList<>();
deque.addFirst("first");
deque.addLast("last");
```

---

## 9. Stack
```java
Stack<String> stack = new Stack<>();
stack.push("item");
stack.pop();
```

---

## 10. hashCode()
Used in hashing-based collections.
```java
class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
```

---

## 11. Comparable vs Comparator

### Comparable:
```java
class Student implements Comparable<Student> {
    String name;
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }
}
```

### Comparator:
```java
Comparator<Student> comparator = (s1, s2) -> s1.name.compareTo(s2.name);
```

---

## 12. Java Stream API
```java
List<String> items = Arrays.asList("one", "two", "three");

items.stream().filter(i -> i.startsWith("o"))
     .map(String::toUpperCase)
     .forEach(System.out::println);

List<String> filtered = items.stream()
    .filter(i -> i.startsWith("t"))
    .collect(Collectors.toList());

long count = items.stream().count();
String reduced = items.stream().reduce((a, b) -> a + " " + b).get();
```

---

## ✅ Summary
This document covers:
- Collection interfaces and implementations
- Iterator vs Iterable
- Collections utility methods
- Generic collections
- Map, Queue, Stack
- hashCode and equals contract
- Sorting with Comparable and Comparator
- Stream API usage

You can upload this file as `README.md` to a GitHub repository to serve as a Java Collections reference.

