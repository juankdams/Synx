package fr.piou.login.server.packet;

import fr.piou.login.LoginConfig;

public class PacketEncrypter {
    
    private static char[] HEX_CHARS = "0123456789ABCDEF".toCharArray();

    private PacketEncrypter() {}
    
    public static String encryptPacket(String packet, int keyId, String key) {
        if (!LoginConfig.getInstance().getBoolean("Dofus.Packet.UseKey")) {
            return packet;
        }
        return prepareData(packet, keyId, key);
    }
    
    private static String prepareData(String s, int _nCurrentKey, String key)
    {
        String _loc3 = "" + HEX_CHARS[_nCurrentKey];
        String _loc4 = checksum(s) + "";
        _loc3 += _loc4;
        return (_loc3 + cypherData(s, prepareKey(key), Integer.parseInt(_loc4, 16) * 2));
    };
    
    private static String prepareKey(String d)
    {
        String _loc3 = new String();
        int _loc4 = 0;
        
        for (; _loc4 < d.length() ; _loc4 += 2) {
            _loc3 += fromCharCode(Integer.parseInt(d.substring(_loc4, _loc4 + 2), 16));
        }
        return (_loc3);
    };
    
    private static char checksum(String s) {
        int _loc3 = 0;
        int _loc4 = 0;
        
        for (; _loc4 < s.length(); ++_loc4) {
            _loc3 += s.codePointAt(_loc4) % 16;
        }
        return (HEX_CHARS[_loc3 % 16]);
    };
    
    private static String cypherData(String d, String k, int c) {
        String _loc5 = new String();
        int _loc6 = k.length();
        //d = dofus.aks.Aks.preEscape(d);
        int _loc7 = 0;
        
        for (; _loc7 < d.length(); ++_loc7) {
            _loc5 += "" + d2h(d.codePointAt(_loc7) ^ k.codePointAt((_loc7 + c) % _loc6));
        }
        return (_loc5);
    }
    
    private static String d2h(int d) {
        if (d > 255) {
            d = 255;
        }
        return (HEX_CHARS[(int)Math.floor(d / 16)] + "" + HEX_CHARS[d % 16]);
    }
    
    public static String preEscape(String s) {
        return s;
    }
   
    public static String fromCharCode(int... codePoints) {
        return new String(codePoints, 0, codePoints.length);
    }
}
