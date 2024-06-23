# java-generics

Summary
Upper Bound (<? extends T>):

You can safely read elements as type T or any superclass of T.
You cannot add elements because the specific type of the collection at runtime is unknown, and adding could violate type safety.
Lower Bound (<? super T>):

You can safely add elements of type T or any subclass of T.
You cannot assume more than Object when reading elements because the collection can hold elements of any superclass of T.
By using upper bounds, you gain flexibility in reading from the collection, knowing that all elements are at least of type T. Conversely, lower bounds give you the ability to safely add elements to the collection, ensuring type safety by restricting the types that can be added.
