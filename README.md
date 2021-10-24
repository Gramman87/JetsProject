# Jets Project

## Description
The goal of this project was to further expand on the implementation of the four pillars of object oriented programming. Abstraction, hiding complexity by hiding the unnecessary details from the user. Polymorphism describes the concept that different classes can be used with the same interface. Each of these classes can provide its own implementation of the interface. Inheritance, the mechanism of basing an object or class upon another object or class, retaining similar implementation. Encapsulation, the bundling of data with the methods that operate on that data, or the restricting of direct access to some of an object's components.

I first assembled a .csv file to read into my program a collection of different aircraft. The aircraft were part of one of three concrete classes all of which extended an abstract "Jets" class. Upon launch these aircraft would be read in by the FileReader and BufferReader. Parsed out into the five fields constructing a jet, and placed into an ArrayList encapsulated in a seperate AirField class. In this structure all existing and jets and any added could be manipulated indirectly through the AirField.

My program consisted of two packages, the first "Application" package contains the JetsApp and AppController classes. The JetsApp contained the one and only static method in the program, "main". The AppController was another step to further abstraction and encapsulation handling most user input and all communication to the "Entities" package which contained my AirField and jet classes and interfaces.

UI is a simple terminal style multiple choice but available actions included calling jetType specific interfaces as well as concrete methods inherited from the abstract jets class. Adding and removing objects and finally writing favorite objects to a file.

## Lessons Learned
This is the first project I took the time before starting to develop my own UML diagram to guide my coding. This made a huge difference in how I approached building my classes and writing out my different methods. I felt very comfortable and confident moving through the steps of the build out rather than being shaken by unexpected compile issues or exceptions thrown. When these things happened it was more rare and more quickly overcome as well.

## Technologies
Java, Eclipse, Git, GitHub, Markdown, Unix Shell