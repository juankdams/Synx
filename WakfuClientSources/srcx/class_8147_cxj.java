import com.sun.jna.Native;
import java.nio.Buffer;

public abstract interface cxj extends PW
{
  public static final cxj ikc = (cxj)Native.a("kernel32", cxj.class, Pa.cgq);

  public abstract int a(int paramInt1, axA paramaxA1, int paramInt2, int paramInt3, Buffer paramBuffer, int paramInt4, axA paramaxA2);

  public abstract boolean a(dNQ paramdNQ, Buffer paramBuffer, int paramInt, cjs paramcjs, cnn paramcnn);

  public abstract axA f(axA paramaxA);

  public abstract axA g(axA paramaxA);

  public abstract bHM mu(String paramString);

  public abstract void a(GJ paramGJ);

  public abstract void b(GJ paramGJ);

  public abstract int GetTickCount();

  public abstract int GetCurrentThreadId();

  public abstract dNQ cuC();

  public abstract int GetCurrentProcessId();

  public abstract dNQ cuD();

  public abstract int g(dNQ paramdNQ);

  public abstract int wZ(int paramInt);

  public abstract boolean c(dNQ paramdNQ, cjs paramcjs);

  public abstract boolean a(dNQ paramdNQ, int paramInt);

  public abstract int GetLastError();

  public abstract void xa(int paramInt);

  public abstract int mv(String paramString);

  public abstract int a(int paramInt1, axA paramaxA1, int paramInt2, int paramInt3, axA paramaxA2, int paramInt4, axA paramaxA3);

  public abstract int a(int paramInt1, axA paramaxA1, int paramInt2, int paramInt3, cJv paramcJv, int paramInt4, axA paramaxA2);

  public abstract dNQ a(String paramString, int paramInt1, int paramInt2, dxM paramdxM, int paramInt3, int paramInt4, dNQ paramdNQ);

  public abstract boolean h(String paramString1, String paramString2, boolean paramBoolean);

  public abstract boolean aC(String paramString1, String paramString2);

  public abstract boolean a(String paramString1, String paramString2, aFT paramaFT);

  public abstract boolean a(String paramString, dxM paramdxM);

  public abstract boolean a(dNQ paramdNQ, axA paramaxA, int paramInt, cjs paramcjs, cnn paramcnn);

  public abstract dNQ a(dNQ paramdNQ1, dNQ paramdNQ2, axA paramaxA, int paramInt);

  public abstract boolean a(dNQ paramdNQ, cjs paramcjs, bdR parambdR, cJv paramcJv, int paramInt);

  public abstract boolean a(dNQ paramdNQ, int paramInt, axA paramaxA, cnn paramcnn);

  public abstract int b(dNQ paramdNQ, int paramInt);

  public abstract int a(int paramInt1, dNQ[] paramArrayOfdNQ, boolean paramBoolean, int paramInt2);

  public abstract boolean a(dNQ paramdNQ1, dNQ paramdNQ2, dNQ paramdNQ3, FS paramFS, int paramInt1, boolean paramBoolean, int paramInt2);

  public abstract boolean h(dNQ paramdNQ);

  public abstract boolean a(dNQ paramdNQ, oS paramoS, int paramInt1, boolean paramBoolean, int paramInt2, cjs paramcjs, cnn paramcnn, aQt paramaQt);

  public abstract int a(String paramString, char[] paramArrayOfChar, int paramInt);

  public abstract axA dZ(int paramInt1, int paramInt2);

  public abstract boolean a(dNQ paramdNQ, byte[] paramArrayOfByte, int paramInt, cjs paramcjs, cnn paramcnn);

  public abstract dNQ a(dxM paramdxM, boolean paramBoolean1, boolean paramBoolean2, String paramString);

  public abstract boolean i(dNQ paramdNQ);

  public abstract boolean j(dNQ paramdNQ);

  public abstract dNQ a(dNQ paramdNQ, dxM paramdxM, int paramInt1, int paramInt2, int paramInt3, String paramString);

  public abstract axA a(dNQ paramdNQ, int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  public abstract boolean h(axA paramaxA);

  public abstract boolean b(char[] paramArrayOfChar, cjs paramcjs);

  public abstract dNQ c(int paramInt1, boolean paramBoolean, int paramInt2);

  public abstract boolean a(String paramString1, String paramString2, dxM paramdxM1, dxM paramdxM2, boolean paramBoolean, aFT paramaFT, axA paramaxA, String paramString3, brC parambrC, Fl paramFl);

  public abstract dNQ d(int paramInt1, boolean paramBoolean, int paramInt2);

  public abstract aFT a(aFT paramaFT, char[] paramArrayOfChar);

  public abstract aFT cuE();

  public abstract boolean a(ayL paramayL);

  public abstract boolean a(bsq parambsq);

  public abstract void a(bVv parambVv);

  public abstract void b(bVv parambVv);

  public abstract boolean d(dNQ paramdNQ, cjs paramcjs);

  public abstract boolean a(amv paramamv);

  public abstract boolean a(dNQ paramdNQ, baG parambaG1, baG parambaG2, baG parambaG3);

  public abstract int a(dNQ paramdNQ, duo paramduo1, duo paramduo2, duo paramduo3);

  public abstract boolean a(String paramString, aFT paramaFT);

  public abstract aFT b(aFT paramaFT, char[] paramArrayOfChar);

  public abstract boolean a(String paramString, bhT parambhT1, bhT parambhT2, bhT parambhT3);

  public abstract boolean mw(String paramString);

  public abstract boolean a(FS paramFS1, FS paramFS2, dxM paramdxM, int paramInt);

  public abstract boolean a(dNQ paramdNQ, int paramInt1, int paramInt2);

  public abstract int mx(String paramString);

  public abstract int k(dNQ paramdNQ);

  public abstract boolean a(dNQ paramdNQ, int paramInt1, axA paramaxA1, int paramInt2, axA paramaxA2, int paramInt3, cjs paramcjs, axA paramaxA3);

  public abstract boolean a(String paramString, clb paramclb1, clb paramclb2, clb paramclb3);

  public abstract dNQ a(aFT paramaFT1, aFT paramaFT2);

  public abstract boolean a(dNQ paramdNQ, kg paramkg);

  public abstract boolean b(dNQ paramdNQ, kg paramkg);

  public abstract boolean aD(String paramString1, String paramString2);

  public abstract int b(String paramString, char[] paramArrayOfChar, int paramInt);

  public abstract cjJ cuF();

  public abstract cjJ cuG();

  public abstract int b(String paramString1, String paramString2, int paramInt, String paramString3);

  public abstract aFT a(String paramString1, String paramString2, String paramString3, char[] paramArrayOfChar, aFT paramaFT, String paramString4);

  public abstract boolean e(String paramString1, String paramString2, String paramString3, String paramString4);
}