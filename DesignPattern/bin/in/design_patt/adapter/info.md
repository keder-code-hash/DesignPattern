# Also Known as Wrapper 

## why use it ?
This type of design pattern lets any user to convert one interface to another.This lets classes
work together which could not be done earlier due to incompatible interface.
---
## problems :

There is an interface named **ToolKit** which has some common method for the editor,like
**view()** for showing a shape defined in **TextView** class,**delete()** to delete a shape.
<br/>
Suppose there is a drawing editor.In that <u>line,rectangle,triangle</u> can be drawn by some graphical 
object which has two methods for editing named edit() and drawing named draw().The interface named
**CommonShape** for this graphical object is defined in a abstract class called **Shape**.To draw
a line LineShape class is defined which is a subclass of Shape,similarly to draw TriangleShape
class of subclass Shape is defined.
<br/>
Now we want to implement an other features for **TextShape** which requires two methods for 
<i>**showing and edit the text**</i>.Now,for edit the text edit() is defined in Shape class and
can be reused,But there is no method for **view()** the text.
<br/>
So, to implements the TextShape we have to use TextView for showing the text and CommonShape for
edit and write the text.But we can't use these together. 

<i>we can't also reuse the logic of view() in Shape class but the logic is not visible in ToolKit 
as it is an interface.</i>

---
# Solution : 

1. By using an composition.view() method can be redefined in Different LineShape,TextShape class
	according to the requirement.
2. By implementing the main interface as per requirements.

---
# where we can apply ?

1. Reusing an existing class,whose interfaces are not same.**class adaptor(__use inheritance__)**
2. When we need to inherit one class to other.Then there may be some common methods and other
	methods too.So we can't define all methods in one interface only.So there we can also use this 
	pattern.**object adaptor(__use composition__)**

---
# Design :

1. **Target Interface** : desired interface class, which will be directly used by the user.
2. **adapter class** : A wrapper class Which implements the actual logic for user.It is also used to 
						modify the existing adpatee class method's logic.
3. **adaptee class** : It implements the actual interface and defines the logic.This class is used in 
						adapter class.
4. **clients** : it implements the UI view for whole application which will interact with adapter class.
---

# Advantages:

 1. It increases the "Reusability" of the code and decreases the "Duplicity".
 
---

# Types :  

<ul>
	<li>
		<u>Class Adaptor</u> : Designed above
	</li>
	<li>
		<u>Object Adaptor</u> : https://tutorials4beginner.com/tutorial/java-design-
								pattern/structural-design-pattern-adapter-pattern
	</li>
</ul> 

---

