package wrappers;

public class WrappersClass {

    //Primitiv            non-Primitiv
    // boolean             Boolean
    // char                Character
    // int                 integer

    public static void main(String[] args) {
        int num = 55;
        System.out.println(num);

        Integer num2 = 22 ;
        System.out.println(num2);
        System.out.println(num2.hashCode());

        Character ch = 'd';
        System.out.println(ch.equals(64));

        //Autoboxing
        int num3 = 44;
        Integer autoboxed = num3;

        // unboxed
         Integer num4 = 65;
         int unboxed = num4;
        System.out.println(unboxed);

        System.out.println();

        }


    }



