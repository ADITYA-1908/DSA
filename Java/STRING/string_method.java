public class string_method {
    public static void main(String args[]) {
        char e;
        String a, b, c, d;
        a = "ADITYA";
        b = "subham";
        c = "    adi_subham    ";
        // Character_Extraction
        e = a.charAt(0);
        System.out.println(e); 
        System.out.println(a.indexOf('Y')); 
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
        System.out.println(a.concat(b));
        System.out.println(a.length());
        System.out.println(c.trim());
        System.out.println(a.equals(b));
        System.out.println(a.replace('A', 'a'));
    }
}