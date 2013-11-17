import com.sun.jna.Native;

public abstract interface aZR extends bBH
{
  public static final aZR fgU = (aZR)Native.a("Advapi32", aZR.class, Pa.cgq);
  public static final int MAX_KEY_LENGTH = 255;
  public static final int fgV = 16383;
  public static final int fgW = 65535;
  public static final int fgX = 24;
  public static final int fgY = 72;
  public static final int fgZ = 8;
  public static final int fha = 16;
  public static final int fhb = 4;
  public static final int fhc = 32;
  public static final int fhd = 1;
  public static final int fhe = 64;
  public static final int fhf = 2;

  public abstract boolean a(char[] paramArrayOfChar, cjs paramcjs);

  public abstract boolean a(String paramString1, String paramString2, SR paramSR, cjs paramcjs1, char[] paramArrayOfChar, cjs paramcjs2, cJv paramcJv);

  public abstract boolean a(String paramString, SR paramSR, char[] paramArrayOfChar1, cjs paramcjs1, char[] paramArrayOfChar2, cjs paramcjs2, cJv paramcJv);

  public abstract boolean a(SR paramSR, cJv paramcJv);

  public abstract boolean a(String paramString, aPx paramaPx);

  public abstract int b(SR paramSR);

  public abstract boolean c(SR paramSR);

  public abstract boolean a(SR paramSR, int paramInt);

  public abstract boolean a(int paramInt, SR paramSR1, SR paramSR2, cjs paramcjs);

  public abstract boolean a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, FS paramFS);

  public abstract boolean a(dNQ paramdNQ, int paramInt, boolean paramBoolean, FS paramFS);

  public abstract boolean a(dNQ paramdNQ, int paramInt, FS paramFS);

  public abstract boolean b(dNQ paramdNQ, int paramInt, FS paramFS);

  public abstract boolean a(dNQ paramdNQ, int paramInt1, dxM paramdxM, int paramInt2, int paramInt3, FS paramFS);

  public abstract boolean a(dNQ paramdNQ, int paramInt1, bik parambik, int paramInt2, cjs paramcjs);

  public abstract boolean b(dNQ paramdNQ);

  public abstract boolean oz(int paramInt);

  public abstract boolean boS();

  public abstract int a(ciA paramciA, String paramString, int paramInt1, int paramInt2, bmV parambmV);

  public abstract int a(ciA paramciA, String paramString, int paramInt, cjs paramcjs1, char[] paramArrayOfChar, cjs paramcjs2);

  public abstract int a(ciA paramciA, String paramString, int paramInt, cjs paramcjs1, byte[] paramArrayOfByte, cjs paramcjs2);

  public abstract int a(ciA paramciA, String paramString, int paramInt, cjs paramcjs1, cjs paramcjs2, cjs paramcjs3);

  public abstract int a(ciA paramciA, String paramString, int paramInt, cjs paramcjs1, clb paramclb, cjs paramcjs2);

  public abstract int a(ciA paramciA, String paramString, int paramInt, cjs paramcjs1, axA paramaxA, cjs paramcjs2);

  public abstract int a(ciA paramciA);

  public abstract int a(ciA paramciA, String paramString);

  public abstract int a(ciA paramciA, String paramString, int paramInt1, int paramInt2, char[] paramArrayOfChar, int paramInt3);

  public abstract int a(ciA paramciA, String paramString, int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3);

  public abstract int a(ciA paramciA, String paramString1, int paramInt1, String paramString2, int paramInt2, int paramInt3, dxM paramdxM, bmV parambmV, cjs paramcjs);

  public abstract int b(ciA paramciA, String paramString);

  public abstract int a(ciA paramciA, int paramInt, char[] paramArrayOfChar1, cjs paramcjs1, cjs paramcjs2, char[] paramArrayOfChar2, cjs paramcjs3, duo paramduo);

  public abstract int a(ciA paramciA, int paramInt, char[] paramArrayOfChar, cjs paramcjs1, cjs paramcjs2, cjs paramcjs3, byte[] paramArrayOfByte, cjs paramcjs4);

  public abstract int a(ciA paramciA, char[] paramArrayOfChar, cjs paramcjs1, cjs paramcjs2, cjs paramcjs3, cjs paramcjs4, cjs paramcjs5, cjs paramcjs6, cjs paramcjs7, cjs paramcjs8, cjs paramcjs9, duo paramduo);

  public abstract int a(ciA paramciA, String paramString1, String paramString2, int paramInt, cjs paramcjs1, byte[] paramArrayOfByte, cjs paramcjs2);

  public abstract dNQ Q(String paramString1, String paramString2);

  public abstract boolean c(dNQ paramdNQ);

  public abstract dNQ R(String paramString1, String paramString2);

  public abstract boolean d(dNQ paramdNQ);

  public abstract boolean a(dNQ paramdNQ, cjs paramcjs);

  public abstract boolean a(dNQ paramdNQ, int paramInt1, int paramInt2, int paramInt3, SR paramSR, int paramInt4, int paramInt5, String[] paramArrayOfString, axA paramaxA);

  public abstract boolean a(dNQ paramdNQ, String paramString);

  public abstract boolean b(dNQ paramdNQ, String paramString);

  public abstract dNQ S(String paramString1, String paramString2);

  public abstract boolean a(dNQ paramdNQ, int paramInt1, int paramInt2, axA paramaxA, int paramInt3, cjs paramcjs1, cjs paramcjs2);

  public abstract boolean b(dNQ paramdNQ, cjs paramcjs);

  public abstract boolean a(aIy paramaIy, int paramInt1, CX paramCX, int paramInt2, cjs paramcjs);

  public abstract boolean a(aIy paramaIy, int paramInt, bGi parambGi);

  public abstract boolean a(aIy paramaIy, int paramInt, String[] paramArrayOfString);

  public abstract boolean a(aIy paramaIy);

  public abstract aIy a(aIy paramaIy, String paramString, int paramInt);

  public abstract aIy c(String paramString1, String paramString2, int paramInt);

  public abstract boolean a(dNQ paramdNQ, String paramString1, String paramString2, dxM paramdxM1, dxM paramdxM2, boolean paramBoolean, int paramInt, String paramString3, String paramString4, brC parambrC, dch paramdch);

  public abstract boolean a(dNQ paramdNQ, boolean paramBoolean, bUK parambUK1, int paramInt, bUK parambUK2, cjs paramcjs);

  public abstract boolean a(String paramString, dCW paramdCW, char[] paramArrayOfChar, cjs paramcjs);

  public abstract boolean a(String paramString1, String paramString2, dCW paramdCW);

  public abstract boolean a(cFg paramcFg, int paramInt1, axA paramaxA, int paramInt2, cjs paramcjs);
}