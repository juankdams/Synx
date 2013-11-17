import java.util.HashMap;
import java.util.Random;

public class dlV
{
  private static final dlV ljy = new dlV();

  private final Random ljz = new yb();
  private final char[] iDL;
  private final char[] iDM;
  private final HashMap ljA = new HashMap();

  private final int ljB = 1;

  private final int ljC = 20;

  private final int ljD = 45;

  private final int ljE = 30;

  private final int ljF = 8;

  private dlV()
  {
    char[] arrayOfChar1 = { 'a', 'e', 'i', 'o', 'u', 'y' };

    char[] arrayOfChar2 = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z' };

    short[] arrayOfShort1 = { 9, 15, 8, 6, 6, 1 };

    short[] arrayOfShort2 = { 2, 2, 3, 2, 2, 2, 1, 1, 5, 3, 6, 2, 1, 6, 6, 6, 2, 1, 1, 1 };

    a('c', new char[] { '_', 'h', 'l', 'r' }, new short[] { 8, 3, 2, 2 });
    a('g', new char[] { '_', 'l', 'n', 'r' }, new short[] { 10, 2, 1, 2 });
    a('l', new char[] { '_', 'l' }, new short[] { 8, 1 });
    a('m', new char[] { '_', 'm' }, new short[] { 8, 1 });
    a('n', new char[] { '_', 'n' }, new short[] { 6, 1 });
    a('p', new char[] { '_', 'h', 'l', 'r', 'p' }, new short[] { 8, 2, 1, 3, 1 });
    a('q', new char[] { '_', 'u' }, new short[] { 0, 1 });
    a('s', new char[] { '_', 'h', 'k', 'l', 'n', 'p', 'q', 'r', 's', 't' }, new short[] { 15, 1, 1, 1, 2, 5, 1, 2, 10, 5 });
    a('t', new char[] { '_', 'h', 'r', 't' }, new short[] { 8, 3, 5, 1 });

    a('a', new char[] { 't' }, new short[] { 1 });
    a('e', new char[] { 't', 'd' }, new short[] { 2, 1 });
    a('i', new char[0], new short[0]);
    a('o', new char[] { 't' }, new short[] { 1 });
    a('u', new char[] { 's', 't' }, new short[] { 2, 1 });
    a('y', new char[0], new short[0]);

    int i = 0;
    bHu localbHu = new bHu();
    for (int j = 0; j < arrayOfChar1.length; j++)
      i += arrayOfShort1[j];
    for (j = 0; j < i; k = (short)(j + 1))
      localbHu.add(j);
    this.iDL = new char[i];
    int n;
    int i1;
    int i2;
    for (int k = 0; k < arrayOfChar1.length; k++) {
      for (n = 0; n < arrayOfShort1[k]; n++) {
        i1 = this.ljz.nextInt(localbHu.size());
        i2 = localbHu.get(i1);
        this.iDL[i2] = arrayOfChar1[k];
        localbHu.aP(i1);
      }
    }

    i = 0;
    localbHu = new bHu();
    for (k = 0; k < arrayOfChar2.length; k++)
      i += arrayOfShort2[k];
    for (k = 0; k < i; m = (short)(k + 1))
      localbHu.add(k);
    this.iDM = new char[i];
    for (int m = 0; m < arrayOfChar2.length; m++)
      for (n = 0; n < arrayOfShort2[m]; n++) {
        i1 = this.ljz.nextInt(localbHu.size());
        i2 = localbHu.get(i1);
        this.iDM[i2] = arrayOfChar2[m];
        localbHu.aP(i1);
      }
  }

  public static dlV cTw()
  {
    return ljy;
  }

  private void a(char paramChar, char[] paramArrayOfChar, short[] paramArrayOfShort)
  {
    int i = 0;
    for (int j = 0; j < paramArrayOfChar.length; j++)
      i += paramArrayOfShort[j];
    bHu localbHu = new bHu();
    for (int k = 0; k < i; m = (short)(k + 1))
      localbHu.add(k);
    char[] arrayOfChar = new char[i];
    for (int m = 0; m < paramArrayOfChar.length; m++) {
      for (int n = 0; n < paramArrayOfShort[m]; n++) {
        int i1 = this.ljz.nextInt(localbHu.size());
        int i2 = localbHu.get(i1);
        arrayOfChar[i2] = paramArrayOfChar[m];
        localbHu.aP(i1);
      }
    }
    this.ljA.put(Character.valueOf(paramChar), arrayOfChar);
  }

  private boolean AI(int paramInt)
  {
    return this.ljz.nextInt(100) < paramInt;
  }

  private char cTx()
  {
    return this.iDL[this.ljz.nextInt(this.iDL.length)];
  }

  private char cTy()
  {
    return this.iDM[this.ljz.nextInt(this.iDM.length)];
  }

  private String cTz()
  {
    String str = "";
    char c = cTy();
    str = str + c;
    if (this.ljA.containsKey(Character.valueOf(c))) {
      char[] arrayOfChar = (char[])this.ljA.get(Character.valueOf(c));
      if (arrayOfChar.length > 0)
        str = str + arrayOfChar[this.ljz.nextInt(arrayOfChar.length)];
    }
    str = str + cTx();
    str = str.replace("_", "");
    return str;
  }

  private String cTA()
  {
    if (AI(20))
      return (cTx() + "").toUpperCase();
    String str = cTz();
    if (str.charAt(0) == str.charAt(1))
      str = str.substring(1);
    str = str.substring(0, 1).toUpperCase() + str.substring(1);
    return str;
  }

  private String cTB()
  {
    String str = "";
    for (int i = 0; (i < 1) && (AI(45)); i++) {
      str = str + cTz();
    }
    return str;
  }

  private String cTC()
  {
    String str = cTz();
    char[] arrayOfChar1 = str.toCharArray();
    char c = arrayOfChar1[(arrayOfChar1.length - 1)];
    if ((this.ljA.containsKey(Character.valueOf(c))) && 
      (AI(30))) {
      char[] arrayOfChar2 = (char[])this.ljA.get(Character.valueOf(c));
      if (arrayOfChar2.length > 1) {
        str = str + arrayOfChar2[this.ljz.nextInt(arrayOfChar2.length)];
      }
    }
    return str;
  }

  private String cTD()
  {
    return cTA() + cTB() + cTC();
  }

  public String cTE()
  {
    if (AI(8))
      return cTD() + "-" + cTD();
    return cTD();
  }

  public String[] AJ(int paramInt)
  {
    String[] arrayOfString = new String[paramInt];
    for (int i = 0; i < paramInt; i++)
      arrayOfString[i] = cTE();
    return arrayOfString;
  }

  public String cTF() {
    String str = cTE();
    if (!aYD.avC().eA(str))
      return cTF();
    return str;
  }
}