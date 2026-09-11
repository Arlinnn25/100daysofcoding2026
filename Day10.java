public class BatasMinMaxTipeData {
    public static void main(String[] args) {
    
        System.out.println("=== BATAS MINIMAL & MAKSIMAL TIPE DATA ===\n");

        // Batas minimal dan maksimal dari byte
        System.out.println("BYTE:");
        System.out.println("Minimal  : " + Byte.MIN_VALUE);
        System.out.println("Maksimal : " + Byte.MAX_VALUE + "\n");

        // Batas minimal dan maksimal dari Short
        System.out.println("SHORT:");
        System.out.println("Minimal  : " + Short.MIN_VALUE);
        System.out.println("Maksimal : " + Short.MAX_VALUE + "\n");

        // Batas minimal dan maksimal dari Int
        System.out.println("INT:");
        System.out.println("Minimal  : " + Integer.MIN_VALUE);
        System.out.println("Maksimal : " + Integer.MAX_VALUE + "\n");

        // Batas minimal dan maksimal dari Long
        System.out.println("LONG:");
        System.out.println("Minimal  : " + Long.MIN_VALUE);
        System.out.println("Maksimal : " + Long.MAX_VALUE + "\n");

        // Batas minimal dan maksimal dari Float
        System.out.println("FLOAT:");
        System.out.println("Minimal  : " + Float.MIN_VALUE + " (Positif Terkecil)");
        System.out.println("Maksimal : " + Float.MAX_VALUE + "\n");

        // Batas minimal dan maksimal dari Double
        System.out.println("DOUBLE:");
        System.out.println("Minimal  : " + Double.MIN_VALUE + " (Positif Terkecil)");
        System.out.println("Maksimal : " + Double.MAX_VALUE + "\n");

        // Batas minamal dan maksimal dari Char
        System.out.println("CHAR:");
        System.out.println("Minimal  : " + (int) Character.MIN_VALUE);
        System.out.println("Maksimal : " + (int) Character.MAX_VALUE + "\n");

        // Boolean hanya memiliki true atau false
        System.out.println("BOOLEAN:");
        System.out.println("Nilai    : hanya " + Boolean.TRUE + " atau " + Boolean.FALSE);
    }
}

