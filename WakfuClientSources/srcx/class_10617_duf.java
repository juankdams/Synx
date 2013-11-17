public class duf
{
  public static void a(Su paramSu, bDl parambDl)
  {
    if ((!bB) && ((paramSu == null) || (parambDl == null))) throw new AssertionError();
    float[] arrayOfFloat;
    if (paramSu.getType() == 1) {
      arrayOfFloat = clP.hOQ;
    } else if (paramSu.aeI()) {
      arrayOfFloat = clP.hON;
    } else {
      byz localbyz = byv.bFN().bFO();
      if ((localbyz.bHj().Td()) && (localbyz.bHj().Ta().bv(paramSu.getId()) != null))
        arrayOfFloat = clP.hOP;
      else {
        arrayOfFloat = clP.hOO;
      }
    }
    a(paramSu, arrayOfFloat, parambDl);
  }

  public static void b(Su paramSu, bDl parambDl) {
    b(paramSu, clP.hOS, parambDl);
  }

  public static void a(Su paramSu, float[] paramArrayOfFloat, bDl parambDl) {
    a(paramSu, true, false, paramArrayOfFloat, parambDl);
  }

  public static void b(Su paramSu, float[] paramArrayOfFloat, bDl parambDl) {
    a(paramSu, false, true, paramArrayOfFloat, parambDl);
  }

  private static void a(Su paramSu, boolean paramBoolean1, boolean paramBoolean2, float[] paramArrayOfFloat, bDl parambDl) {
    if ((!bB) && ((paramSu == null) || (parambDl == null) || (paramArrayOfFloat == null))) throw new AssertionError();

    if (paramBoolean1) {
      b(paramSu.getId(), 0, paramSu.fa(), paramSu.fb(), paramSu.fc(), paramSu, parambDl.bMh(), paramSu.cQF(), paramArrayOfFloat, parambDl);
    }

    if (paramBoolean2)
      a(paramSu.getId(), 0, paramSu.fa(), paramSu.fb(), paramSu.fc(), paramSu, parambDl.bMh(), paramSu.cQF(), paramArrayOfFloat, parambDl);
  }

  public static void a(bAF parambAF, float[] paramArrayOfFloat, bDl parambDl)
  {
    a(parambAF, paramArrayOfFloat, true, false, parambDl);
  }

  public static void b(bAF parambAF, float[] paramArrayOfFloat, bDl parambDl) {
    a(parambAF, paramArrayOfFloat, false, true, parambDl);
  }

  private static void a(bAF parambAF, float[] paramArrayOfFloat, boolean paramBoolean1, boolean paramBoolean2, bDl parambDl) {
    if ((!bB) && ((parambAF == null) || (parambDl == null) || (paramArrayOfFloat == null))) throw new AssertionError();

    if (paramBoolean1) {
      b(parambAF.getId(), 0, parambAF.getWorldX(), parambAF.getWorldY(), parambAF.getAltitude(), parambAF, parambDl.bMh(), null, paramArrayOfFloat, parambDl);
    }

    if (paramBoolean2)
      a(parambAF.getId(), 0, parambAF.getWorldX(), parambAF.getWorldY(), parambAF.getAltitude(), parambAF, parambDl.bMh(), null, paramArrayOfFloat, parambDl);
  }

  public static void a(long paramLong, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, Object paramObject, avz paramavz, String paramString, float[] paramArrayOfFloat, bDl parambDl)
  {
    parambDl.a(paramLong, paramInt, paramFloat1, paramFloat2, paramFloat3, paramString, paramObject, paramavz, paramArrayOfFloat);
  }

  public static void b(long paramLong, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, Object paramObject, avz paramavz, String paramString, float[] paramArrayOfFloat, bDl parambDl)
  {
    a(paramLong, paramInt, paramFloat1, paramFloat2, paramFloat3, paramObject, paramavz, null, paramString, paramArrayOfFloat, parambDl);
  }

  public static void a(long paramLong, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, Object paramObject, avz paramavz, String paramString1, String paramString2, float[] paramArrayOfFloat, bDl parambDl)
  {
    parambDl.a(paramLong, paramInt, paramFloat1, paramFloat2, paramFloat3, paramString2, paramObject, paramavz, paramString1, paramArrayOfFloat);
  }

  public static void a(int paramInt, long paramLong, bDl parambDl) {
    parambDl.n(paramInt, paramLong);
  }

  public static void b(int paramInt, long paramLong, bDl parambDl) {
    parambDl.o(paramInt, paramLong);
  }

  public static void c(Su paramSu, bDl parambDl) {
    a(0, paramSu.getId(), parambDl);
  }

  public static void d(Su paramSu, bDl parambDl) {
    b(0, paramSu.getId(), parambDl);
  }

  public static void a(bAF parambAF, bDl parambDl) {
    a(0, parambAF.getId(), parambDl);
  }

  public static void b(bAF parambAF, bDl parambDl) {
    b(0, parambAF.getId(), parambDl);
  }
}