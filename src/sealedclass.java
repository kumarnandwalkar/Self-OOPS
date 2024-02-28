// final class, as we know using final keyword means that we cannot change anything in the final methode or the final class
// similarly if we use final keyword for a  class then it mwans that we cannot inherit it in any othe class

/*
sealed class is used when we want only some classes to extend this class, except that class no other class should be able to
extend this class but also in whichever class it is extended that extended class should be final, non-sealed or seald class
we can define which class should be able to extend the sealed class and that can be done with permits keyword,
other than the class mentioned in permits are not allowed to extend the sealed class

we can extend non-sealed class also without any restrictions
also when we extend this sealed class into any another interface then that interface cannot be final, so when we are extending
the sealed class that sealed class should be sealed or non-sealed theres no option for final

 */


sealed class newclass permits newclassA, newclassC
{

}

final class newclassC extends newclass
{

}
non-sealed class newclassA extends newclass
{

}

class newclassB extends newclassA
{

}


sealed interface newinterfaceclass permits newextendedimplementation
{

}

non-sealed class newextendedimplementation implements newinterfaceclass
{

}
public class sealedclass
{
    public static void main(String[] args) {

    }
}
