Collection in Java 
The Java Collection interface represents the operations possible on a generic collection, like on a List, Set, Stack, Queue and Deque. For instance, methods to access the elements based on their index are available in the Java Collection interface.  

Iterator
The Java Iterator interface represents an object capable of iterating through a collection of Java objects, one object at a time. The Iterator interface is one of the oldest mechanisms in Java for iterating collections of objects.

Method	Description
hasNext()	Returns true if the Iterator has more elements, and false if not.
next()	Return the next element from the Iterator
remove()	Removes the latest element returned from next() from the Collection the Iterator is iterating over.
forEachRemaining()	Iterates over all remaining elements in the Iterator and calls a Java Lambda Expression passing each remaining element as parameter to the lambda expression.


Example: - 
Iterator iterator = list.iterator();
while(iterator.hasNext()) {
    Object nextObject = iterator.next();
}

Iterable
The first way to iterate the elements of a Java Iterable is via the Java for-each loop loop. Below is an example showing how to iterate the elements of a Java List via the Java for-each loop. Since the Java List interface extends the Collection interface, and the Collection interface extends the Iterable interface, a List object can be used with the for-each loop.
Example: - 
List<String> list = new ArrayList><();
list.add("one");
list.add("two");
list.add("three");
for( String element : list ){
    System.out.println( element.toString() );
}
The method you must implement is named iterator (). This method must return a Java Iterator which can be used to iterate the elements of the object implementing the Iterable interface. Obtaining the Iterator happens behind the scenes, so you don't see that done. The Java compiler takes care of generating the code for that, when you use a Iterable with the for-each loop.

public interface Iterable<T> {
  Iterator<T>    iterator();
  Spliterator<T> spliterator();
  void           forEach(Consumer<? super T> action);
}

Java Collection 
The Java Collection interface (java.util.Collection) is one of the root interfaces of the Java Collection API. Though you do not instantiate a Collection directly, but rather a subtype of Collection, you may often treat these subtypes uniformly as a Collection.
Ex: - Collection collection = new ArrayList();
Add Element in collection
Ex: - String     anElement  = "an element";
        Collection collection = new HashSet();
         boolean didCollectionChange = collection.add(anElement);

Remove elements from collection
Ex: - boolean wasElementRemoved = collection.remove(“anElement”);

Generic Collections
When you set a generic type for a Java Collection, you do so when you declare the variable referencing it. Here is an example of setting the generic type of a Collection and HashSet to a Java String - meaning it can only contain String instances:

Ex: - Collection<String> stringCollection = new HashSet<String>();

Generic Iterator
Ex: - Iterator<String> iterator = stringCollection.iterator();

Generic Iteration Using for loop
Ex: - Collection<String> stringCollection = new HashSet<String>();
          for(String stringElement : stringCollection) {
                  //do something with each stringElement    
          }



Java Collections Class 
addAll()
Ex: - List<String> list = new ArrayList<>();
         Collections.addAll(list, "element 1", "element 2", "element 3");
 
binarySearch() 
Ex: -       List<String> list = new ArrayList<>();
list.add("one");
list.add("two");
list.add("three");
list.add("four");
list.add("five");
Collections.sort(list);
int searchIndex = Collections.binarySearch(list, "four");
System.out.println(searchIndex);
copy ()
List<String> source = new ArrayList<>();
Collections.addAll(source, "e1", "e2", "e3");
List<String> destination = new ArrayList<>();
Collections.copy(destination, source);

reverse ()
List>String< list = new ArrayList<String>();
list.add("one");
list.add("two");
list.add("three");
Collections.reverse(list);

shuffle (): - Collections.shuffle(list);
sort (): - Collections.sort(list);
copy (): - Collections.copy(destination, source);
min (): - String min = (String) Collections.min(source);
max (): - String max = (String) Collections.max(source);
replace (): - boolean replacedAny = Collections.replaceAll(source, "A", "C");
unmodifiableSet (): - Set normalSet    = new HashSet();
                                      Set immutableSet = Collections.unmodifiableSet(normalSet);

List
The Java List interface, java.util.List, represents an ordered sequence of objects. The elements contained in a Java List can be inserted, accessed, iterated and removed according to the order in which they appear internally in the Java List. The ordering of the elements is why this data structure is called a List.
Ex: - 
List<String> listA = new ArrayList<> ();
listA.add("element 1");
listA.add("element 2");
listA.add("element 3");

Set
The Java Set interface, java.util.Set, represents a collection of objects where each object in the Java Set is unique. In other words, the same object cannot occur more than once in a Java Set. The Java Set interface is a standard Java interface, and it is a subtype of the Java Collection interface, meaning Set inherits from Collection.
Ex: -
Set<String> setA = new HashSet<>();
setA.add("element 1");
setA.add("element 2");
setA.add("element 3");

Sorted set
The Java SortedSet interface, java.util.SortedSet, is a subtype of the java.util.Set interface. The Java SortedSet interface behaves like a normal Set with the exception that the elements it contains are sorted internally. This means that when you iterate the elements of a SortedSet the elements are iterated in the sorted order.
The Tree SortedSet 
The Java Collections API only has one implementation of the Java SortedSet interface - the java.util.TreeSet class. The java.util.concurrent package also has an implementation of this interface, but I will leave the concurrency utilities out of this trail.
Ex: - SortedSet sortedSet = new TreeSet();

Map
The Java Map interface, java.util.Map, represents a mapping between a key and a value. More specifically, a Java Map can store pairs of keys and values. Each key is linked to a specific value. Once stored in a Map, you can later look up the value using just the key.
•	java.util.HashMap
•	java.util.Hashtable
•	java.util.EnumMap
•	java.util.IdentityHashMap
•	java.util.LinkedHashMap
•	java.util.Properties
•	java.util.TreeMap
•	java.util.WeakHashMap

Ex: -
Map<String, String> map = new HashMap<>();
map.put("key1", "element 1");
map.put("key2", "element 2");
map.put("key3", "element 3");

SortedMap
The Java SortedMap interface, java.util.SortedMap, is a subtype of the java.util.Map interface, with the addition that the elements stored in a Java SortedMap map are sorted internally. This means you can iterate the elements stored in a SortedMap in the sort order.
Ex: - SortedMap sortedMap = new TreeMap();

Properties
The Java Properties class, java.util.Properties, is like a Java Map of Java String key and value pairs. The Java Properties class can write the key, value pairs to a properties file on disk, and read the properties back in again. This is an often used mechanism for storing simple configuration properties for Java applications.
Ex: - 
Properties properties = new Properties();
properties.setProperty("email", "email@gmail.com");
String email = properties.getProperty("email");

Queue
The Java Queue interface, java.util.Queue represents a data structure designed to have elements inserted at the end of the queue, and elements removed from the beginning of the queue. This is similar to how a queue in a supermarket works.
•	java.util.LinkedList
•	java.util.PriorityQueue
Ex: - 
Queue<String> queue = new LinkedList<>();
queue.add("element 1");
queue.add("element 2");
String element1 = queue.poll();
String element2 = queue.remove();
Dequeue
The Java Deque interface, java.util.Deque, represents a double ended queue, meaning a queue where you can add and remove elements to and from both ends of the queue. The name Deque is an abbreviation of Double Ended Queue.
Ex: - Deque<MyObject> deque = new LinkedList<MyObject>();

Stack
The Java Stack class, java.util.Stack, is a classical stack data structure. You can push elements to the top of a Java Stack and pop them again, meaning read and remove the elements from the top of the stack.
Ex: - 
Stack<String> stack = new Stack<String>();
stack.push("1");
stack.push("2");
stack.push("3");
stack.pop("3");

hashCode ()
The hashCode() method of objects is used when you insert them into a HashTable, HashMap or HashSet.When inserting an object into a hastable you use a key. The hash code of this key is calculated, and used to determine where to store the object internally. When you need to lookup an object in a hashtable you also use a key. The hash code of this key is calculated and used to determine where to search for the object.
1.	If object1 and object2 are equal according to their equals() method, they must also have the same hash code.
2.	If object1 and object2 have the same hash code, they do NOT have to be equal too.
Ex: - 
class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
}

Java Sorted Collection
You can sort a Java List collections using the java.util.Collections.sort() method. You can sort these two types of List's.
1.	List
2.	LinkedList

The compareTo() method should compare this object to another object, return an int value. Here are the rules for that int value:
•	Return a negative value if this object is smaller than the other object
•	Return 0 (zero) if this object is equal to the other object.
•	Return a positive value if this object is larger than the other object.

Comparable 
The Java Comparable interface,java.lang.Comparable, represents an object which can be compared to other objects. For instance, numbers can be compared, strings can be compared using alphabetical comparison etc. Several of the built-in classes in Java implements the Java Comparable interface. You can also implement the Java Comparable interface yourself, to make your own classes comparable.
Ex: - 
package java.lang;    
public interface Comparable<T> {
    int compareTo(T);
}
compareTo()
The Java Comparable compareTo() method takes a single object as parameter and returns an int value. The int returned signal whether the object the compareTo() method is called on is larger than, equal to or smaller than the parameter object.
Comparator 
the Java Comparator interface only has a single method. This method, the compare() method, takes two objects which the Comparator implementation is intended to compare. The compare() method returns an int which signals which of the two objects was larger.

Stream
The Java Stream API provides a more functional programming approach to iterating and processing elements of e.g. a collection. The Java Stream API was added to Java in Java 8.Streams are designed to work with Java lambda expressions.
Stream.filter()
stream.filter( item -> item.startsWith("o") );

Stream.map()
items.stream().map( item -> item.toUpperCase() )

Stream.collect()
List<String> filtered = items.stream().filter( item -> item.startsWith("o") ).collect(Collectors.toList());

Stream.min() and Stream.max()
String shortest = items.stream().min(Comparator.comparing(item -> item.length())).get();

Stream.count()
long count = items.stream().filter( item -> item.startsWith("t")).count();

Stream.reduce()
String reduced2 = items.stream().reduce((acc, item) -> acc + " " + item).get();



