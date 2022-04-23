package DeepashikaMishraInClass.Lecture_17;

/*//multiple inheritance with the help of interfaces
//interfaces (definition and how they are different from abstract classes)
//abstract classes
//packges, we can talk in detail about access specifications(public ,private, default, protected)
//keyword "this"
//abstract class: contains both abstract methods(user provides only name and signature of the methods
 and concrete methods, i.e.,with definition)
 syntax abstract class class_name{
 //set of abstract methods followed by detailed methods
}

syntax for abstract method   abstract return_type(parameter list)
Imp. points about abstract class: i) We can't create an instance for abstract class
ii) a classes can be sub classed
iii) By using abstract class object we can make a reference to its sub classes
iv)in sub class we must have to define all the abstract methods*/
abstract class Abs_exp{

    abstract void m1();//abstract method
    abstract void m2(String s);//abstract method
    void m3(){
        System.out.println("method m3 defined in class abs_exp");
    }
}
class A extends Abs_exp{

    void m1(){
        System.out.println("m1 is defined in sub class A");
    }
    void m2(String s){
        System.out.println("m2 is defined in sub class A");
    }
}//B has three members viz., m1(),m2()and m3()
class B extends Abs_exp{

    void m1(){
        System.out.println("m1 is defined in sub class B");
    }
    void m2(String s){
        System.out.println("m2 is defined in sub class B");
    }
}//B has three members viz., m1(),m2()and m3()
class C extends A{
    void m4(){
        System.out.println("m4 is defined in sub class c");
    }
    //C has four members viz., m1(),m2()and m3(), m4();
}
class MultipleInheritance {
    public static void main(String []args){

        Abs_exp ob1=new A();// we have created an instance of class A and made reference to it by using super obj
        ob1.m1();
        ob1.m2("hello");
        //ob1.m3();//error we can't access
        Abs_exp ob2=new C();//methods of reference class can only be
        // called and overridden method of object class can be called

        //ob2.m4();//error we can't access
        //Abs_exp.m3();// this statement leads to an error
        //we've created instances of classes A and C
    }
}
