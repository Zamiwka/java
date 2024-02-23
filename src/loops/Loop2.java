package src.loops;

public class Loop2 {
    public static void main(String[] args) {
        String fio = "Asanov Asan";
        String familia = "";
        for (int loop2 = 0; loop2 < fio.length(); loop2++){
            familia = familia + fio.charAt(loop2);
            if (fio.charAt(loop2) == ' '){
                break;
            }
        }
        //          01234567890  --> index
        //          Asanov Asan
        //      0           0 < fio.length()
        //      familia = ""  +  "A"
        //      1           1 < fio.length()
        //      familia = "A" + "s"
        //      2           2 < fio.length()
        //      familia = "As" + "a"
        //      .......
        //      .......
        //      6

        System.out.println(familia);

        String fio1 ="Amanov Aman";
        String name = "";
        String  surname ="";
        for (int i = 0; i<fio1.length();i++){
            surname += fio1.charAt(i);
            if (fio.charAt(i)==' '){
              name += fio1.substring(i+1);
                break;
            }

        }
        System.out.println(name + " " + surname);


    }
}
