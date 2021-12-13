## Known as KIT

<b>Abstract Factory Pattern says that just define an interface or abstract class for creating families of related (or dependent) objects but without specifying their concrete sub-classes.</b> 

## <u>When to use(Main Use Case)?</u>

	When there is a requirement of Providing an interface for creating families of related or
	dependent objects without specifying their concrete classes.
	
	
## Use the Abstract Factory pattern when

	 1. a system should be independent of how its products are created, composed,
			and represented.
			
	 2. a system should be configured with one of multiple families of products. 
	 
	 3. a family of related product objects is designed to be used together, and
			you need to enforce this constraint.you want to provide a class library of products, and you
		 	want to reveal just their interfaces, not their implementations.


## Elements:

	 1. AbstractFactory (WidgetFactory)
		declares an interface for operations that create abstract product
		objects.
		
	 2. ConcreteFactory (MotifWidgetFactory, PMWidgetFactory)
		implements the operations to create concrete product objects.
		
	 3. AbstractProduct (Window, ScrollBar)
		declares an interface for a type of product object.
		
	 4. ConcreteProduct (MotifWindow, MotifScrollBar)
		defines a product object to be created by the corresponding concrete
			factory.
		implements the AbstractProduct interface.
		
	 5. Client
		uses only interfaces declared by AbstractFactory and
		AbstractProduct classes.
		
## Advantages : 
	1. Logic or Implementation of any concrete class can be abstracted for client.		
		

		
		
		
		