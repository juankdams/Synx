import com.sun.jna.Native;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public abstract class PA
  implements Ay
{
  public static String abr()
  {
    char[] arrayOfChar = new char[auL.dHO + 1];
    cjs localcjs = new cjs(arrayOfChar.length);
    if (!cxj.ikc.b(arrayOfChar, localcjs)) {
      throw new ajA(cxj.ikc.GetLastError());
    }
    return Native.toString(arrayOfChar);
  }

  public static String a(Nt paramNt)
  {
    cJv localcJv = new cJv();
    if (0 == cxj.ikc.a(4864, null, paramNt.intValue(), 0, localcJv, 0, null))
    {
      throw new dRy(cxj.ikc.GetLastError());
    }
    String str = localcJv.cDB().getString(0L, !Boolean.getBoolean("w32.ascii"));
    cxj.ikc.f(localcJv.cDB());
    return str.trim();
  }

  public static String gi(int paramInt)
  {
    return a(cLN.yv(paramInt));
  }

  public static String abs()
  {
    aFT localaFT = new aFT(260L);
    char[] arrayOfChar = new char[localaFT.intValue()];
    if (cxj.ikc.a(localaFT, arrayOfChar).intValue() == 0) {
      throw new ajA(cxj.ikc.GetLastError());
    }
    return Native.toString(arrayOfChar);
  }

  public static void dg(String paramString) {
    if (!cxj.ikc.mw(paramString))
      throw new ajA(cxj.ikc.GetLastError());
  }

  public static String[] abt()
  {
    aFT localaFT = cxj.ikc.b(new aFT(0L), null);
    if (localaFT.intValue() <= 0) {
      throw new ajA(cxj.ikc.GetLastError());
    }

    char[] arrayOfChar = new char[localaFT.intValue()];
    localaFT = cxj.ikc.b(localaFT, arrayOfChar);
    if (localaFT.intValue() <= 0) {
      throw new ajA(cxj.ikc.GetLastError());
    }

    ArrayList localArrayList = new ArrayList();
    String str = "";

    for (int i = 0; i < arrayOfChar.length - 1; i++) {
      if (arrayOfChar[i] == 0) {
        localArrayList.add(str);
        str = "";
      } else {
        str = str + arrayOfChar[i];
      }
    }
    return (String[])localArrayList.toArray(new String[0]);
  }

  public static int dh(String paramString)
  {
    int i = cxj.ikc.mx(paramString);
    if (i == -1) {
      throw new ajA(cxj.ikc.GetLastError());
    }
    return i;
  }

  public static int di(String paramString)
  {
    File localFile = new File(paramString);
    if (!localFile.exists()) {
      throw new FileNotFoundException(paramString);
    }

    dNQ localdNQ = null;
    try {
      localdNQ = cxj.ikc.a(paramString, -2147483648, 1, new dxM(), 3, 128, new FS().Qa());

      if (auL.dHJ.equals(localdNQ)) {
        throw new ajA(cxj.ikc.GetLastError());
      }

      int i = cxj.ikc.k(localdNQ);
      switch (i) {
      case 0:
        int j = cxj.ikc.GetLastError();
        switch (j) {
        case 0:
          break;
        default:
          throw new ajA(j);
        }
        break;
      }

      return i;
    }
    finally {
      if ((localdNQ != null) && 
        (!cxj.ikc.h(localdNQ)))
        throw new ajA(cxj.ikc.GetLastError());
    }
  }

  public static int dj(String paramString)
  {
    return cxj.ikc.mv(paramString);
  }

  public static String dk(String paramString)
  {
    int i = cxj.ikc.b(paramString, null, 0);
    if (i == 0)
      return null;
    if (i < 0) {
      throw new ajA(cxj.ikc.GetLastError());
    }

    char[] arrayOfChar = new char[i];
    i = cxj.ikc.b(paramString, arrayOfChar, arrayOfChar.length);
    if (i <= 0) {
      throw new ajA(cxj.ikc.GetLastError());
    }
    return Native.toString(arrayOfChar);
  }

  public static final int a(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    return cxj.ikc.b(paramString1, paramString2, paramInt, paramString3);
  }

  public static final String a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    char[] arrayOfChar = new char[1024];
    cxj.ikc.a(paramString1, paramString2, paramString3, arrayOfChar, new aFT(arrayOfChar.length), paramString4);
    return Native.toString(arrayOfChar);
  }

  public static final void b(String paramString1, String paramString2, String paramString3, String paramString4) {
    if (!cxj.ikc.e(paramString1, paramString2, paramString3, paramString4))
      throw new ajA(cxj.ikc.GetLastError());
  }
}