public abstract class dsv
{
  protected abstract byte bJ();

  public abstract Object d(aYQ paramaYQ, float paramFloat);

  protected abstract void a(dSw paramdSw, Object paramObject1, Object paramObject2);

  protected abstract boolean equals(Object paramObject1, Object paramObject2);

  public final void b(dSw paramdSw, Object paramObject1, Object paramObject2)
  {
    paramdSw.writeByte(bJ());
    a(paramdSw, paramObject1, paramObject2);
  }

  public static void a(dSw paramdSw, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    paramdSw.writeShort((short)(paramInt1 & 0xFFFF));
    if (paramBoolean)
      paramdSw.writeShort((short)(paramInt2 & 0xFFFF));
  }

  public static int a(aYQ paramaYQ, boolean paramBoolean, float paramFloat) {
    int i = paramaYQ.readShort();
    if (!paramBoolean) {
      return i & 0xFFFF;
    }
    int j = paramaYQ.readShort();
    return Math.round(bCO.s(i, j, paramFloat)) & 0xFFFF;
  }

  public static void a(dSw paramdSw, boolean paramBoolean, float paramFloat1, float paramFloat2) {
    paramdSw.writeFloat(paramFloat1);
    if (paramBoolean)
      paramdSw.writeFloat(paramFloat2);
  }

  public static float b(aYQ paramaYQ, boolean paramBoolean, float paramFloat) {
    float f1 = paramaYQ.readFloat();
    if (!paramBoolean) {
      return f1;
    }
    float f2 = paramaYQ.readFloat();
    return bCO.s(f1, f2, paramFloat);
  }

  public static void b(dSw paramdSw, boolean paramBoolean, int paramInt1, int paramInt2) {
    paramdSw.writeInt(paramInt1);
    if (paramBoolean)
      paramdSw.writeInt(paramInt2);
  }

  public static int c(aYQ paramaYQ, boolean paramBoolean, float paramFloat) {
    int i = paramaYQ.readInt();
    if (!paramBoolean) {
      return i;
    }
    int j = paramaYQ.readInt();
    return (int)bCO.s(i, j, paramFloat);
  }
}