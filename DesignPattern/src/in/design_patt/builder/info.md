# Introduction :- 

		Separate the construction form the complex object object creation,So that we can use the same construction and use it for creation of another object.Basically It drastically increases the reusability of the code.

## Applicability : -

		. the algorithm for creating a complex object should be independent of the parts that make up the object and how they're assembled.
		
		. the construction process must allow different representations for the 	object that's constructed.


## Elements Of Builder :- 

	1. Builder -
			It is an abstract interface contains the methods for creating parts of any product.
			
	2. ConcreteBuilder -
			. construct or assemble the parts of product by implementing the methods of builder interface.
			. Also provide the interface for retrieving the product.
			. Sometimes keep the track of the representation it creates.
			
	3. Director -
			. construct any product by using the builder interface.
			
	4. Product -
			. Represents the complex object or the final product.
			. includes class that defines the constitiuent parts of the product includes the interface which is required for final result.

## Advantages :-   
     
	1. It provides a clear separation between object construction and representation.
	2. We can easily modify the internal representation of an object.
	 			
## Flow :-			
![flow](file:///home/keder/Public/Design_pattern/DesignPattern/src/in/design_patt/builder/Flow.png)	
		
## structure :-
![structure](file:///home/keder/Public/Design_pattern/DesignPattern/src/in/design_patt/builder/structure.png)
	 			
## PROBLEM STATEMENT :-
			
	Pizza can be either a Veg pizza or Non-Veg pizza of several types (like cheese pizza, onion pizza, masala-pizza etc) and will be of 4 sizes i.e. small, medium, large, extra-large.(JAVATPOINTS)
			

			
			
			