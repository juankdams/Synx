package fr.piou.login.server.packet;

import fr.piou.login.LoginConfig;

public class PacketDecrypter {
    
    private PacketDecrypter() {}
    
    public static String decryptPacket(String packet, int keyId, String key) {
        if (!LoginConfig.getInstance().getBoolean("Dofus.Packet.UseKey")) {
            return packet;
        }
        return unprepareData(packet, keyId, key);
    }
    
    private static String unprepareData(String s, int _nCurrentKey, String key) {
        String _loc3 = key;
        String _loc4 = s.substring(1, 2).toUpperCase();
        String _loc5 = decypherData(s.substring(2), PacketEncrypter.prepareKey(_loc3), Integer.parseInt(_loc4, 16) * 2);
        return (_loc5.replace("%0A", "\n"));
    }
    
    private static String decypherData(String d, String k, int c){
        String _loc5 = new String();
        int _loc6 = k.length();
        int _loc7 = 0;
        int _loc9 = 0;
        
        for (;_loc9 < d.length();_loc9 += 2) {
            _loc5 += "" + PacketEncrypter.fromCharCode(Integer.parseInt(d.substring(_loc9, _loc9 + 2), 16) ^ k.codePointAt((_loc7++ + c) % _loc6));
        }
        return (_loc5);
    }
}
