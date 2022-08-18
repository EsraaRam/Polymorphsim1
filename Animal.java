class Animal extends Object{ 
public void makeNoise() { 
System.out.println("iam just an animal"); 
}
} class Cat extends Animal { 
@Override public void makeNoise() { 
System.out.println("Meow"); 
} 
} 
class Dog extends Animal {
 @Override public void makeNoise() { 
System.out.println("woof woof!"); 
} 
public void grow() { 
System.out.println("Grrrrrrr"); 
}
} 
public class Polymorphsim {
 public static void main(String[] args) { 
makeNoiseOfAnimal(new Cat());
 } 
public static void makeNoiseOfAnimal(Animal a){
 a.makeNoise(); 
if(a instanceof Dog d) {
 d.grow(); 
} 
} 
}
