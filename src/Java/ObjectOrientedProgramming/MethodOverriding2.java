package Java.ObjectOrientedProgramming;

/**
 * Java Method Overriding 2 (Super Keyword)
 *
 * When a method in a subclass overrides a method in superclass,
 * it is still possible to call the overridden method using super keyword.
 * If you write super.func() to call the function func(),
 * it will call the method that was defined in the superclass.
 *
 * You are given a code in the editor.
 * Modify exactly 1 line so that the code prints the following text:
 *
 * Hello I am a motorcycle, I am a cycle with an engine.
 * My ancestor is a cycle who is a vehicle with pedals.
 *
 * If you lose the original code,
 * click the top left button in the editor and create a new buffer.
 */
class BiCycle
{
    String define_me()
    {
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle
{
    String define_me()
    {
        return "a cycle with an engine.";
    }

    MotorCycle()
    {


        System.out.println("Hello I am a motorcycle, I am "+ define_me());
        String temp=super.define_me();
            System.out.println("My ancestor is a cycle who is "+ temp );
    }

}

public class MethodOverriding2 {
    public static void main(String []argh)
    {
        MotorCycle M=new MotorCycle();
    }
}
