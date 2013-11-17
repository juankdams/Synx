import com.sun.opengl.util.texture.TextureCoords;

public class dFd extends dzZ
{
  private final short hGA;
  private final short hGB;
  private final short lOA;
  private final short lOB;
  private final short[] lOC;

  public static dFd a(short paramShort1, short paramShort2, short[] paramArrayOfShort1, short[] paramArrayOfShort2)
  {
    if ((paramArrayOfShort1.length <= 1) || (paramArrayOfShort2.length <= 2)) {
      throw new cJ("pas une animation");
    }
    if (paramArrayOfShort1.length * 2 != paramArrayOfShort2.length) {
      throw new cJ("valeurs incorrectes");
    }

    int i = 0;
    for (int j = 0; j < paramArrayOfShort1.length; j++) {
      i += paramArrayOfShort1[j];
    }

    cLM localcLM1 = new cLM();
    cLM localcLM2 = new cLM();
    for (int k = 0; k < paramArrayOfShort2.length; k += 2) {
      localcLM1.dK(paramArrayOfShort2[k]);
      localcLM2.dK(paramArrayOfShort2[(k + 1)]);
    }

    k = (short)(paramShort1 / localcLM1.size());
    short s = (short)(paramShort2 / localcLM2.size());
    return new dFd(i, k, s, paramShort1, paramShort2, paramArrayOfShort1, paramArrayOfShort2);
  }

  public static dFd b(short paramShort1, short paramShort2, short[] paramArrayOfShort1, short[] paramArrayOfShort2)
  {
    if ((paramArrayOfShort1.length <= 1) || (paramArrayOfShort2.length <= 2)) {
      throw new cJ("pas une animation");
    }
    if (paramArrayOfShort1.length * 2 != paramArrayOfShort2.length) {
      throw new cJ("valeurs incorrectes");
    }

    int i = 0;
    for (int j = 0; j < paramArrayOfShort1.length; j++) {
      i += paramArrayOfShort1[j];
    }

    cLM localcLM1 = new cLM();
    cLM localcLM2 = new cLM();
    for (int k = 0; k < paramArrayOfShort2.length; k += 2) {
      localcLM1.dK(paramArrayOfShort2[k]);
      localcLM2.dK(paramArrayOfShort2[(k + 1)]);
    }

    k = (short)(paramShort1 * localcLM1.size());
    short s = (short)(paramShort2 * localcLM2.size());
    return new dFd(i, paramShort1, paramShort2, k, s, paramArrayOfShort1, paramArrayOfShort2);
  }

  public static dFd a(dFd paramdFd, short paramShort1, short paramShort2) {
    return new dFd(paramdFd.lGH, paramdFd.hGA, paramdFd.hGB, paramShort1, paramShort2, paramdFd.lGI, paramdFd.lOC);
  }

  private dFd(int paramInt, short paramShort1, short paramShort2, short paramShort3, short paramShort4, short[] paramArrayOfShort1, short[] paramArrayOfShort2)
  {
    super(paramInt, paramArrayOfShort1);
    this.hGA = paramShort1;
    this.hGB = paramShort2;
    this.lOA = paramShort3;
    this.lOB = paramShort4;
    this.lOC = paramArrayOfShort2;
  }

  public short[] dgF() {
    return this.lOC;
  }

  public int ddh() {
    return this.lGH;
  }

  public short[] dgG() {
    return this.lGI;
  }

  public void a(dSw paramdSw)
  {
    if ((this.lGI == null) || (this.lGI.length <= 1)) {
      paramdSw.writeByte((byte)0);
    } else {
      byte b = (byte)this.lGI.length;
      paramdSw.writeByte(b);

      paramdSw.writeInt(this.lGH);
      paramdSw.writeShort(this.hGA);
      paramdSw.writeShort(this.hGB);
      paramdSw.writeShort(this.lOA);
      paramdSw.writeShort(this.lOB);
      for (int i = 0; i < b; i++) {
        paramdSw.writeShort(this.lGI[i]);
      }
      if ((!bB) && (this.lOC.length != 2 * b)) throw new AssertionError();
      for (i = 0; i < this.lOC.length; i++)
        paramdSw.writeShort(this.lOC[i]);
    }
  }

  public static dFd G(aYQ paramaYQ)
  {
    return (dFd)dzZ.b(true, paramaYQ, true);
  }

  public TextureCoords br(short paramShort)
  {
    throw new UnsupportedOperationException("utiliser la classe AnimData.Use");
  }

  public int cjF() {
    return this.hGA;
  }

  public int cjG() {
    return this.hGB;
  }

  public short dgH() {
    return this.lOA;
  }

  public short dgI() {
    return this.lOB;
  }
}