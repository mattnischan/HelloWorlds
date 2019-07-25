# Hello Worlds
A number of increasingly insane Hello World examples in Scala.
### 1. HelloWorldMain
A standard Hello World example using a regular Java-like main function in an object.
### 2. HelloWorldApp
A more standard Scala style Hello World example using the `App` trait.
### 3. HelloWorldMainer
This example uses a trait (named `Mainer`) to show defining a main function inside of a trait. Extending the trait adds the `main()` function to the object, which is called by Java when the program runs.
### 4. HelloWorldFunky
This example gets a little more indirect. We start with a Scala style program that extends app, but add a couple of more advanced Scala concepts.
* Using an object as a function by defining an `apply()` method: The object `FunkyHello` has an `apply()` method which takes a string and returns a string. This method makes all the characters uppercase and inserts a space between each character.
* Extending a function with an object: The object `FunkyHello` also extends the `String => String` function, which means the above `apply()` method _must_ be defined.
### 5. HelloWorldFunkier
The funkier example adds a class instance to the mix. This uses the `FunkierHello` object's `apply()` method, which takes a string and returns a new instance of the `FunkierHello` class. This class has a single method defined on it, the `sayHello()` method, which prints the message that was supplied when constructing the class instance. The `FunkierHello` class has a single public class property, `message`, which is defined in the class constructor.

Additionally, the `FunkyHello` function object is used to mutate the message in the same way as the previous example.
### 6. HelloWorldExtraCrispy
This example extends the previous example a bit further. The `ExtraCrispyHello` class takes a function in the constructor, and that function is used by the class's `sayHello()` method to mutate the provided message. The function that must be passed in takes a string and returns a string.
### 7. HelloWorldEvil
The evil example adds the Scala extension method concept, which are called _implicit classes_. The `EvilHello` object defines a single implicit class `EvilStringExtensions` on the `String` class, which contains a method `say()` that prints the provided message.

This allows the user to run the `say()` method directly on the message itself in the application code.
### 8. HelloWorldTrulyEvil
This example is by far the most indirect and least recommended. A trait `Sayance` is defined, which has a single `say()` method. This method takes an _implicit parameter_ of a string.

The application code then defines an implicit val with the message. Because the `say()` method takes an implicit parameter, it is not necessary to pass the parameter at all in the parameter list; any `String` which has been defined as implicit on the current scope will be used. Therefore, you can use the `say()` method without any parameters, and it will use the "Hello World!" message that has been defined.