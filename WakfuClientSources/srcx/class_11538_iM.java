import org.apache.log4j.Logger;

public class iM
{
  private static final Logger K = Logger.getLogger(iM.class);

  private static final iM aJg = new iM();
  public static final byte aJh = 5;
  public static final byte aJi = 0;
  public static final byte aJj = 1;
  public static final byte aJk = 2;
  public static final byte aJl = 3;
  public static final byte aJm = 4;
  public final cSR aJn;

  private iM()
  {
    this.aJn = new cSR(45);
    o((byte)0);
    o((byte)1);
    o((byte)2);
    o((byte)4);
    p((byte)3);
    this.aJn.compact();
  }

  private void o(byte paramByte) {
    String str = q(paramByte);
    for (byte b = 0; b < 5; b = (byte)(b + 1))
      this.aJn.put(bCO.c(paramByte, b, (byte)0, (byte)0), str + b);
  }

  private void p(byte paramByte)
  {
    String str = q(paramByte);
    for (byte b1 = 0; b1 < 5; b1 = (byte)(b1 + 1))
      for (byte b2 = 0; b2 < 5; b2 = (byte)(b2 + 1))
        this.aJn.put(bCO.c(paramByte, b1, b2, (byte)0), str + b1 + "_" + b2);
  }

  private String q(byte paramByte)
  {
    switch (paramByte) {
    case 0:
      return "AnimMort";
    case 1:
      return "AnimPousse";
    case 2:
      return "AnimEtape";
    case 4:
      return "AnimHit";
    case 3:
      return "AnimRegression";
    }
    K.error("type d'animation inconnue " + paramByte);
    return "";
  }

  public String a(byte paramByte1, byte paramByte2) {
    if (paramByte2 >= 5)
      return q(paramByte1) + paramByte2;
    return (String)this.aJn.get(bCO.c(paramByte1, paramByte2, (byte)0, (byte)0));
  }

  public String a(byte paramByte1, byte paramByte2, byte paramByte3) {
    if ((paramByte2 >= 5) || (paramByte3 >= 5))
      return q(paramByte1) + paramByte2 + "_" + paramByte3;
    return (String)this.aJn.get(bCO.c(paramByte1, paramByte2, paramByte3, (byte)0));
  }

  public static iM qM() {
    return aJg;
  }
}