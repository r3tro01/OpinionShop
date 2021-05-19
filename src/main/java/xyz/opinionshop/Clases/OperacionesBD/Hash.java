package xyz.opinionshop.Clases.OperacionesBD;

public class Hash {
    private static String salt = "OpinionShop";
    
    public static String GetHash(String txt, String hashType) {
        txt = txt + salt;
        
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance(hashType);
            byte[] array = md.digest(txt.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
 
    /* Retorna un hash MD5 a partir de un texto */
    public static String Md5(String txt) {
        return Hash.GetHash(txt, "MD5");
    }
 
    /* Retorna un hash SHA1 a partir de un texto */
    public static String Sha1(String txt) {
        return Hash.GetHash(txt, "SHA1");
    }
}

