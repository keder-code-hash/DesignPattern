## It is also known as virtual constructor.

## Applicable:
	1. When a class can't anticipate(predict) the class of object ,it must create.
	2. A class wants its subclasses to specify the object it creates.
	3. classes delegate responsibility to one of several helper subclasses, and
	   you want to localize the knowledge of which helper subclass is the delegate.
	   
## Structure :-
	Participants
		  Product (Document)
		  	1. defines the interface of objects the factory method creates.
		
		  ConcreteProduct (MyDocument)
		  	1. implements the Product interface.
		
		  Creator (Application)
		  	1. declares the factory method, which returns an object of type Product.
				Creator may also define a default implementation of the factory
				method that returns a default ConcreteProduct object.
			
		  	2. may call the factory method to create a Product object.
		
		  ConcreteCreator (MyApplication)
			1. overrides the factory method to return an instance of a
				ConcreteProduct.

## Construction :-
 
[![](https://mermaid.ink/img/eyJjb2RlIjoiY2xhc3NEaWFncmFtXG4gICAgQ29uY3JldGVDcmVhdG9yIDx8LS0gQ3JlYXRvclxuICAgIENvbmNyZXRlUHJvZHVjdCA8fC0tIFByb2R1Y3QgXG4gICAgQ29uY3JldGVDcmVhdG9yIC4uIEluc3RhbnRpYXRlMSBcbiAgICBDcmVhdG9yIC4uIEluc3RhbnRpYXRlIFxuICAgIGNsYXNzIENyZWF0b3J7IFxuICAgICAgK0ZhY3RvcnlNZXRob2QoKVxuICAgICAgK0FuT3BlcmF0aW9uKClcbiAgICB9XG4gICAgY2xhc3MgQ29uY3JldGVDcmVhdG9yeyBcbiAgICAgIEZhY3RvcnlNZXRob2QoKVxuICAgIH1cbiAgICBjbGFzcyBQcm9kdWN0e1xuICAgICAgXG4gICAgfVxuICAgIGNsYXNzIENvbmNyZXRlUHJvZHVjdHtcblxuICAgIH1cbiAgICBjbGFzcyBJbnN0YW50aWF0ZXtcbiAgICAgIHByb2R1Y3Q9RmFjdG9yeU1ldGhvZCgpXG4gICAgICBBbnlPcGVyYXRpb24oKVxuICAgIH1cbiAgICBjbGFzcyBJbnN0YW50aWF0ZTF7XG4gICAgICByZXR1cm4gbmV3IENvbmNyZXRlUHJvZHVjdCgpXG4gICAgfVxuICAgICAgICAgICAgIiwibWVybWFpZCI6eyJ0aGVtZSI6ImRlZmF1bHQifSwidXBkYXRlRWRpdG9yIjpmYWxzZSwiYXV0b1N5bmMiOnRydWUsInVwZGF0ZURpYWdyYW0iOmZhbHNlfQ)](https://mermaid-js.github.io/mermaid-live-editor/edit/#eyJjb2RlIjoiY2xhc3NEaWFncmFtXG4gICAgQ29uY3JldGVDcmVhdG9yIDx8LS0gQ3JlYXRvclxuICAgIENvbmNyZXRlUHJvZHVjdCA8fC0tIFByb2R1Y3QgXG4gICAgQ29uY3JldGVDcmVhdG9yIC4uIEluc3RhbnRpYXRlMSBcbiAgICBDcmVhdG9yIC4uIEluc3RhbnRpYXRlIFxuICAgIGNsYXNzIENyZWF0b3J7IFxuICAgICAgK0ZhY3RvcnlNZXRob2QoKVxuICAgICAgK0FuT3BlcmF0aW9uKClcbiAgICB9XG4gICAgY2xhc3MgQ29uY3JldGVDcmVhdG9yeyBcbiAgICAgIEZhY3RvcnlNZXRob2QoKVxuICAgIH1cbiAgICBjbGFzcyBQcm9kdWN0e1xuICAgICAgXG4gICAgfVxuICAgIGNsYXNzIENvbmNyZXRlUHJvZHVjdHtcblxuICAgIH1cbiAgICBjbGFzcyBJbnN0YW50aWF0ZXtcbiAgICAgIHByb2R1Y3Q9RmFjdG9yeU1ldGhvZCgpXG4gICAgICBBbnlPcGVyYXRpb24oKVxuICAgIH1cbiAgICBjbGFzcyBJbnN0YW50aWF0ZTF7XG4gICAgICByZXR1cm4gbmV3IENvbmNyZXRlUHJvZHVjdCgpXG4gICAgfVxuICAgICAgICAgICAgIiwibWVybWFpZCI6IntcbiAgXCJ0aGVtZVwiOiBcImRlZmF1bHRcIlxufSIsInVwZGF0ZUVkaXRvciI6ZmFsc2UsImF1dG9TeW5jIjp0cnVlLCJ1cGRhdGVEaWFncmFtIjpmYWxzZX0)