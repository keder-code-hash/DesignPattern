#What is?
Cloning of an existing object instead of creating a new one.At the time of cloning we can also modify our cloned object.

#Problem :-
Suppose Anyone wants an duplicate copy of the existing object.We can go through all the filed of that object and create a new one
Problem Solved!!But there may be some private instances variable which are not visible to outside,So we can't get their value.There 
There may be some interface which are being implemented in that class and it follows some of the variables so we can't also get
them.And lastly we have to dependent upon the parameters which are essential to build that object.

#Solution :-
So we can make an GetClone() method which will return the new object of that class.And method will be defined in an interface and
gets implemented by the respective class(Advantages : method body is not visible).
  


#Applicability : -	

1. when a system is independent upon the product creation,composition and representation. 

2. when the classes to instantiate are specified at runtime.

3. When instances of a particular class have a few combination of state.Then it may be more convenient to not
			instantiate the class manually rather than cloning the object of that class.

#Participants : -		

+ **Prototype** :-
	` Just an interface for the cloning method.  `
	
+ **Concrete Prototype** : -
	` implements the Prototype interface and defined the required method body. `
	
+ **Client** :- 
	` create a new object by prototype cloning. `
	 
### The main advantages of prototype pattern are as follows:

	1. It reduces the need of sub-classing.
	2. It hides complexities of creating objects.
	3. The clients can get new objects without knowing which type of object it will be.
	4. It lets you add or remove objects at runtime.	

## structure :- 
<p align="center">
<img src="file:///home/keder/Public/Design_pattern/DesignPattern/src/in/design_patt/prototype/prototype.png" alt="structure of prototype" style="height:300px;width:600Px; border: 5px solid #555;box-shadow: 10px 16px 24px 8px rgba(82,73,73,0.79);
-webkit-box-shadow: 10px 16px 24px 8px rgba(82,73,73,0.79);
-moz-box-shadow: 10px 16px 24px 8px rgba(82,73,73,0.79);border-radius: 48px 0px 80px 7px;
-webkit-border-radius: 48px 0px 80px 7px;
-moz-border-radius: 48px 0px 80px 7px;"></img>
</p>
		 	