package DeepashikaMishraInClass.Lecture_17;
/*Binding: Connecting a method call to the method body is known as binding.
    1)Static Binding (also known as Early Binding).
    2)Dynamic Binding (also known as Late Binding).

Dynamic binding
When type of the object is determined at run-time, it is known as dynamic binding.
	*/


class Animal
{
    void eat(){
        System.out.println("animal is eating...");
    }
    final void run(){// final keyword will make the method final, it won't allow to change that particular method
        System.out.println("Run!");
    }
}

class Dog_02 extends Animal
{
    @Override
    void eat(){
        System.out.println("dog is eating...");
    }

    public static void main(String []args)
    {
        Animal a=new Animal();
        Dog_02 b=new Dog_02();
        Animal c=new Dog_02();// it will create Dog2 constructor
        c.eat();
        c.run();//c create the object of Dog_02 which can only call its override method but, it can call the methods of Animal bcz Dog_02 extends Animal
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

//object type cannot be determined by the compiler, because the instance of Dog2 is also an instance of Animal.
// compiler doesn't know its type, only its base type.