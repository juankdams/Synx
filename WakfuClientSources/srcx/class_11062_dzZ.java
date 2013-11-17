import com.sun.opengl.util.texture.TextureCoords;

public abstract class dzZ
{
  protected final int lGH;
  protected final short[] lGI;

  public dzZ(int paramInt, short[] paramArrayOfShort)
  {
    if (paramInt == 0)
      throw new cJ("animation sans frame");
    this.lGH = paramInt;
    this.lGI = paramArrayOfShort;
  }

  public abstract void a(dSw paramdSw);

  public abstract TextureCoords br(short paramShort);

  public int ddh()
  {
    return this.lGH;
  }

  public String toString()
  {
    return "durée: " + this.lGH + "ms " + " images: " + this.lGI.length;
  }

  public static TextureCoords[] a(short[] paramArrayOfShort, short paramShort1, short paramShort2, int paramInt1, int paramInt2, boolean paramBoolean) {
    if ((!bB) && (paramInt1 <= 0)) throw new AssertionError();
    if ((!bB) && (paramInt2 <= 0)) throw new AssertionError();

    float f1 = bCO.sj(paramInt1);
    float f2 = bCO.sj(paramInt2) - 0.5F;

    float f3 = paramShort1 / f1;
    float f4 = paramShort2 / f2;

    TextureCoords[] arrayOfTextureCoords = new TextureCoords[paramArrayOfShort.length / 2];
    for (int i = 0; i < arrayOfTextureCoords.length; i++) {
      float f5 = (paramArrayOfShort[(i * 2)] + 0.5F) / f1;
      float f6 = (paramArrayOfShort[(i * 2 + 1)] + 0.5F) / f2;

      if (paramBoolean)
        arrayOfTextureCoords[i] = new TextureCoords(f3 + f5, f4 + f6, f5, f6);
      else {
        arrayOfTextureCoords[i] = new TextureCoords(f5, f4 + f6, f3 + f5, f6);
      }
    }
    return arrayOfTextureCoords;
  }

  private static dzZ a(boolean paramBoolean1, aYQ paramaYQ, boolean paramBoolean2) {
    int i = paramaYQ.readByte() & 0xFF;
    if (i == 0)
      return null;
    int j = paramaYQ.readInt();
    short s1 = paramaYQ.readShort();
    short s2 = paramaYQ.readShort();
    short s3 = paramaYQ.readShort();
    short s4 = paramaYQ.readShort();

    short[] arrayOfShort1 = paramaYQ.ou(i);
    short[] arrayOfShort2 = paramaYQ.ou(i * 2);

    if (paramBoolean1) {
      return new dFd(j, s1, s2, s3, s4, arrayOfShort1, arrayOfShort2, null);
    }

    TextureCoords[] arrayOfTextureCoords = a(arrayOfShort2, s1, s2, s3, s4, paramBoolean2);
    return new aTy(j, arrayOfShort1, arrayOfTextureCoords);
  }
}