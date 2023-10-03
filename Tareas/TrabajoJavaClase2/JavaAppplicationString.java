public class JavaAppplicationString {
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "b";//2
        String s2 = "c";//3
        System.out.println(s1.compareTo(s2));
        String s3 = "abc";
        String s4 = "ABC";
        System.out.println(s3.equals(s4));
        String s5 = "This is a String.";
        String s6 = new String("This is a String.");
        String s7 = "This is a String.";
        System.out.println(s6 == s5);
        String s8 = "This is a String.";
        String s81 = "This is ";
        String s82 = "a String.";
        String s9 = s81 + s82;
        System.out.println(s9 == s8);

        String s10 = "Tengo deberes sagrados que cumplir y los cumplire hasta quemar el ultimo cartucho.";
        int indice = s10.indexOf("cartucho");
        int longitud = s10.length();
        System.out.println("la posicion encontrada es " + indice);
        System.out.println("la longitud de la cadena es " + longitud);


    }
    }
