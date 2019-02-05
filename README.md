# UnitTests
This is a small project using JUnit 5 to test operation methods.

First, we need to create a new Maven project in Eclipse. Some Eclipse versions need to have downloaded a special package to use Maven. Once created the project, we need to download and the JUnit 5 jars. They can be found in this repo: https://github.com/noopur2507/eclipse-junit5.git. We need to go to Configure Build Path of the project, there we can add new jars to it. After that, we need to modify the pom file, we need to add new dependencies and properties in order to be able to use JUnit 5 framework.

The dependency is:

<dependency>
<groupId>org.junit.jupiter</groupId>
<artifactId>junit-jupiter-api</artifactId>
<version>5.1.0</version>
<scope>test</scope>
</dependency>

Also, we need to add these properties to the pom file:

<properties>
<maven.compiler.source>1.6</maven.compiler.source>
<maven.compiler.target>1.6</maven.compiler.target>
</properties>
Our project has two packages, "main" package and "test" package. We need to create one java class in the main package. This class is going to have the methods that we are going to evaluate in the Unit tests. For this example, I'm going to crate a simple operations class with sum, subtraction, product, and division.

Now, we are going to create a new JUnit Test Case in the "test" package. For this tutorial, it's important to select "New JUnit Jupiter test" while creating the new file. In this new class, a method named Test is going to appear. Here we can add our tests. In my case, I want to compare the expected results with the current results of my operations. In order to compare these two results, we are going to use the assertEquals(x, y), in which x is our expected value, and y is our final result.

Finally, we are going to run our code as a JUnit Test. For this, we are going to select our project, click in Run As, and select the JUnit Test option. If all of our expected results are correct, a green bar will be shown. In case we have mistake in our tests, the bar will be red. 

With this, we can see if our expected results are passing the test or not. It's not that hard to implement the JUnit framework and it's really helpful if we want to test our methods. 


