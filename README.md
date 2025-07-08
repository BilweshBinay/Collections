## Java Collections – Complete Examples with Real-World Use Cases

This repository contains complete Java programs demonstrating all major Collection interfaces and classes with full operations.  
Each example is based on real-world use cases.

### Includes usage of:

- List (`ArrayList`, `LinkedList`)  
- Set (`HashSet`, `TreeSet`)  
- Map (`HashMap`, `TreeMap`, `LinkedHashMap`)  
- Queue, Deque, Stack, Properties
- NavigableSet (`.lower()`,` .higher()`, `.floor()`, `.ceiling()`, `.pollFirst()`)

## ArrayList vs LinkedList in Java

```markdown
|  Feature               |  ArrayList                                 |  LinkedList                                   |
|------------------------|--------------------------------------------|-----------------------------------------------|
| Storage Type           | Dynamic Array                              | Doubly Linked Nodes                           |
| Access Speed           | Fast (O(1) for get/set)                    |  Slow (O(n) for get/set)                      |
| Insert/Delete (Middle) | Slow – Shifts elements                     |  Fast – Just re-link nodes                    |
| Memory Usage           | More memory efficient                      | More memory – Stores extra node references    |
| Best Used When         | Frequent Access / Read Operations          | Frequent Insertions / Deletions               |
```
