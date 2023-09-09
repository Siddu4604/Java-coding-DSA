public class RotationOfString {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDBA";
        if (isRotation(s1, s2)) {
            System.out.println("Rotation");
        } else {
            System.out.println("Not rotation");
        }

    }

    public static boolean isRotation(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        } else {
            String concatanated = s1 + s2;
            return concatanated.contains(s2);
        }

    }
}
