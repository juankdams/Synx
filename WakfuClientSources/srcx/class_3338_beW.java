import com.sun.jna.Native;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public abstract class beW
{
  public static String getUserName()
  {
    char[] arrayOfChar = new char[''];
    cjs localcjs = new cjs(arrayOfChar.length);
    boolean bool = aZR.fgU.a(arrayOfChar, localcjs);

    if (!bool) {
      switch (cxj.ikc.GetLastError()) {
      case 122:
        arrayOfChar = new char[localcjs.getValue()];
        break;
      default:
        throw new ajA(Native.getLastError());
      }

      bool = aZR.fgU.a(arrayOfChar, localcjs);
    }

    if (!bool) {
      throw new ajA(Native.getLastError());
    }

    return Native.toString(arrayOfChar);
  }

  public static bsk ih(String paramString)
  {
    return W(null, paramString);
  }

  public static bsk W(String paramString1, String paramString2)
  {
    cjs localcjs1 = new cjs(0);
    cjs localcjs2 = new cjs(0);
    cJv localcJv = new cJv();

    if (aZR.fgU.a(paramString1, paramString2, null, localcjs1, null, localcjs2, localcJv))
    {
      throw new RuntimeException("LookupAccountNameW was expected to fail with ERROR_INSUFFICIENT_BUFFER");
    }

    int i = cxj.ikc.GetLastError();
    if ((localcjs1.getValue() == 0) || (i != 122)) {
      throw new ajA(i);
    }

    dcj localdcj = new dcj(localcjs1.getValue());
    SR localSR = new SR(localdcj);
    char[] arrayOfChar = new char[localcjs2.getValue() + 1];

    if (!aZR.fgU.a(paramString1, paramString2, localSR, localcjs1, arrayOfChar, localcjs2, localcJv))
    {
      throw new ajA(cxj.ikc.GetLastError());
    }

    bsk localbsk = new bsk();
    localbsk.fZc = localcJv.sF().getInt(0L);
    localbsk.name = paramString2;

    String[] arrayOfString1 = paramString2.split("\\\\", 2);
    String[] arrayOfString2 = paramString2.split("@", 2);

    if (arrayOfString1.length == 2)
      localbsk.name = arrayOfString1[1];
    else if (arrayOfString2.length == 2)
      localbsk.name = arrayOfString2[0];
    else {
      localbsk.name = paramString2;
    }

    if (localcjs2.getValue() > 0) {
      localbsk.fYZ = Native.toString(arrayOfChar);
      localbsk.fZd = (localbsk.fYZ + "\\" + localbsk.name);
    } else {
      localbsk.fZd = localbsk.name;
    }

    localbsk.fZa = localSR.getBytes();
    localbsk.fZb = e(new SR(localbsk.fZa));
    return localbsk;
  }

  public static bsk d(SR paramSR)
  {
    return a(null, paramSR);
  }

  public static bsk a(String paramString, SR paramSR)
  {
    cjs localcjs1 = new cjs();
    cjs localcjs2 = new cjs();
    cJv localcJv = new cJv();

    if (aZR.fgU.a(null, paramSR, null, localcjs1, null, localcjs2, localcJv))
    {
      throw new RuntimeException("LookupAccountSidW was expected to fail with ERROR_INSUFFICIENT_BUFFER");
    }

    int i = cxj.ikc.GetLastError();
    if ((localcjs1.getValue() == 0) || (i != 122))
    {
      throw new ajA(i);
    }

    char[] arrayOfChar1 = new char[localcjs2.getValue()];
    char[] arrayOfChar2 = new char[localcjs1.getValue()];

    if (!aZR.fgU.a(null, paramSR, arrayOfChar2, localcjs1, arrayOfChar1, localcjs2, localcJv))
    {
      throw new ajA(cxj.ikc.GetLastError());
    }

    bsk localbsk = new bsk();
    localbsk.fZc = localcJv.sF().getInt(0L);
    localbsk.name = Native.toString(arrayOfChar2);

    if (localcjs2.getValue() > 0) {
      localbsk.fYZ = Native.toString(arrayOfChar1);
      localbsk.fZd = (localbsk.fYZ + "\\" + localbsk.name);
    } else {
      localbsk.fZd = localbsk.name;
    }

    localbsk.fZa = paramSR.getBytes();
    localbsk.fZb = e(paramSR);
    return localbsk;
  }

  public static String e(SR paramSR)
  {
    cJv localcJv = new cJv();
    if (!aZR.fgU.a(paramSR, localcJv)) {
      throw new ajA(cxj.ikc.GetLastError());
    }
    String str = localcJv.cDB().getString(0L, true);
    cxj.ikc.f(localcJv.cDB());
    return str;
  }

  public static byte[] ii(String paramString)
  {
    aPx localaPx = new aPx();
    if (!aZR.fgU.a(paramString, localaPx)) {
      throw new ajA(cxj.ikc.GetLastError());
    }
    return localaPx.bgm().getBytes();
  }

  public static boolean t(String paramString, int paramInt)
  {
    aPx localaPx = new aPx();
    if (!aZR.fgU.a(paramString, localaPx)) {
      throw new ajA(cxj.ikc.GetLastError());
    }
    return aZR.fgU.a(localaPx.bgm(), paramInt);
  }

  public static boolean g(byte[] paramArrayOfByte, int paramInt)
  {
    SR localSR = new SR(paramArrayOfByte);
    return aZR.fgU.a(localSR, paramInt);
  }

  public static bsk ij(String paramString)
  {
    return X(null, paramString);
  }

  public static bsk X(String paramString1, String paramString2)
  {
    return a(paramString1, new SR(ii(paramString2)));
  }

  public static bsk[] e(dNQ paramdNQ)
  {
    cjs localcjs = new cjs();
    if (aZR.fgU.a(paramdNQ, 2, null, 0, localcjs))
    {
      throw new RuntimeException("Expected GetTokenInformation to fail with ERROR_INSUFFICIENT_BUFFER");
    }

    int i = cxj.ikc.GetLastError();
    if (i != 122) {
      throw new ajA(i);
    }

    rL localrL = new rL(localcjs.getValue());

    if (!aZR.fgU.a(paramdNQ, 2, localrL, localcjs.getValue(), localcjs))
    {
      throw new ajA(cxj.ikc.GetLastError());
    }
    ArrayList localArrayList = new ArrayList();

    for (dfd localdfd : localrL.yk()) {
      bsk localbsk = null;
      try {
        localbsk = d(localdfd.kZg);
      } catch (Exception localException) {
        localbsk = new bsk();
        localbsk.fZa = localdfd.kZg.getBytes();
        localbsk.fZb = e(localdfd.kZg);

        localbsk.name = localbsk.fZb;
        localbsk.fZd = localbsk.fZb;
        localbsk.fZc = 2;
      }
      localArrayList.add(localbsk);
    }
    return (bsk[])localArrayList.toArray(new bsk[0]);
  }

  public static bsk f(dNQ paramdNQ)
  {
    cjs localcjs = new cjs();
    if (aZR.fgU.a(paramdNQ, 1, null, 0, localcjs))
    {
      throw new RuntimeException("Expected GetTokenInformation to fail with ERROR_INSUFFICIENT_BUFFER");
    }

    int i = cxj.ikc.GetLastError();
    if (i != 122) {
      throw new ajA(i);
    }

    bTz localbTz = new bTz(localcjs.getValue());

    if (!aZR.fgU.a(paramdNQ, 1, localbTz, localcjs.getValue(), localcjs))
    {
      throw new ajA(cxj.ikc.GetLastError());
    }
    return d(localbTz.heT.kZg);
  }

  public static bsk[] bsx()
  {
    FS localFS = new FS();
    try
    {
      dNQ localdNQ = cxj.ikc.cuC();
      Object localObject1;
      if (!aZR.fgU.a(localdNQ, 10, true, localFS))
      {
        if (1008 != cxj.ikc.GetLastError())
        {
          throw new ajA(cxj.ikc.GetLastError());
        }
        localObject1 = cxj.ikc.cuD();
        if (!aZR.fgU.a((dNQ)localObject1, 10, localFS))
        {
          throw new ajA(cxj.ikc.GetLastError());
        }
      }
      return e(localFS.Qa());
    } finally {
      if ((localFS.Qa() != auL.dHJ) && 
        (!cxj.ikc.h(localFS.Qa())))
        throw new ajA(cxj.ikc.GetLastError());
    }
  }

  public static boolean c(ciA paramciA, String paramString)
  {
    bmV localbmV = new bmV();
    int i = aZR.fgU.a(paramciA, paramString, 0, 131097, localbmV);

    switch (i) {
    case 0:
      aZR.fgU.a(localbmV.bxv());
      return true;
    case 2:
      return false;
    }
    throw new ajA(i);
  }

  public static boolean a(ciA paramciA, String paramString1, String paramString2)
  {
    bmV localbmV = new bmV();
    int i = aZR.fgU.a(paramciA, paramString1, 0, 131097, localbmV);
    try
    {
      switch (i) {
      case 0:
        break;
      case 2:
        return false;
      default:
        throw new ajA(i);
      }
      cjs localcjs1 = new cjs();
      cjs localcjs2 = new cjs();
      i = aZR.fgU.a(localbmV.bxv(), paramString2, 0, localcjs2, (char[])null, localcjs1);
      boolean bool2;
      switch (i) {
      case 0:
      case 122:
      case 234:
        return true;
      case 2:
        return false;
      }
      throw new ajA(i);
    }
    finally {
      if (localbmV.bxv() != auL.dHJ) {
        i = aZR.fgU.a(localbmV.bxv());
        if (i != 0)
          throw new ajA(i);
      }
    }
  }

  public static String b(ciA paramciA, String paramString1, String paramString2)
  {
    bmV localbmV = new bmV();
    int i = aZR.fgU.a(paramciA, paramString1, 0, 131097, localbmV);

    if (i != 0)
      throw new ajA(i);
    try
    {
      cjs localcjs1 = new cjs();
      cjs localcjs2 = new cjs();
      i = aZR.fgU.a(localbmV.bxv(), paramString2, 0, localcjs2, (char[])null, localcjs1);

      if ((i != 0) && (i != 122))
      {
        throw new ajA(i);
      }
      if ((localcjs2.getValue() != 1) && (localcjs2.getValue() != 2))
      {
        throw new RuntimeException("Unexpected registry type " + localcjs2.getValue() + ", expected REG_SZ or REG_EXPAND_SZ");
      }

      char[] arrayOfChar = new char[localcjs1.getValue()];
      i = aZR.fgU.a(localbmV.bxv(), paramString2, 0, localcjs2, arrayOfChar, localcjs1);

      if ((i != 0) && (i != 122))
      {
        throw new ajA(i);
      }
      return Native.toString(arrayOfChar);
    } finally {
      i = aZR.fgU.a(localbmV.bxv());
      if (i != 0)
        throw new ajA(i);
    }
  }

  public static String c(ciA paramciA, String paramString1, String paramString2)
  {
    bmV localbmV = new bmV();
    int i = aZR.fgU.a(paramciA, paramString1, 0, 131097, localbmV);

    if (i != 0)
      throw new ajA(i);
    try
    {
      cjs localcjs1 = new cjs();
      cjs localcjs2 = new cjs();
      i = aZR.fgU.a(localbmV.bxv(), paramString2, 0, localcjs2, (char[])null, localcjs1);

      if ((i != 0) && (i != 122))
      {
        throw new ajA(i);
      }
      if (localcjs2.getValue() != 2) {
        throw new RuntimeException("Unexpected registry type " + localcjs2.getValue() + ", expected REG_SZ");
      }

      char[] arrayOfChar = new char[localcjs1.getValue()];
      i = aZR.fgU.a(localbmV.bxv(), paramString2, 0, localcjs2, arrayOfChar, localcjs1);

      if ((i != 0) && (i != 122))
      {
        throw new ajA(i);
      }
      return Native.toString(arrayOfChar);
    } finally {
      i = aZR.fgU.a(localbmV.bxv());
      if (i != 0)
        throw new ajA(i);
    }
  }

  public static String[] d(ciA paramciA, String paramString1, String paramString2)
  {
    bmV localbmV = new bmV();
    int i = aZR.fgU.a(paramciA, paramString1, 0, 131097, localbmV);

    if (i != 0)
      throw new ajA(i);
    try
    {
      cjs localcjs1 = new cjs();
      cjs localcjs2 = new cjs();
      i = aZR.fgU.a(localbmV.bxv(), paramString2, 0, localcjs2, (char[])null, localcjs1);

      if ((i != 0) && (i != 122))
      {
        throw new ajA(i);
      }
      if (localcjs2.getValue() != 7) {
        throw new RuntimeException("Unexpected registry type " + localcjs2.getValue() + ", expected REG_SZ");
      }

      dcj localdcj = new dcj(localcjs1.getValue());
      i = aZR.fgU.a(localbmV.bxv(), paramString2, 0, localcjs2, localdcj, localcjs1);

      if ((i != 0) && (i != 122))
      {
        throw new ajA(i);
      }
      ArrayList localArrayList = new ArrayList();
      int j = 0;
      Object localObject1;
      while (j < localdcj.size()) {
        localObject1 = localdcj.getString(j, true);
        j += ((String)localObject1).length() * Native.cuL;
        j += Native.cuL;
        if ((((String)localObject1).length() != 0) || (j != localdcj.size()))
        {
          localArrayList.add(localObject1);
        }
      }
      return (String[])localArrayList.toArray(new String[0]);
    } finally {
      i = aZR.fgU.a(localbmV.bxv());
      if (i != 0)
        throw new ajA(i);
    }
  }

  public static byte[] e(ciA paramciA, String paramString1, String paramString2)
  {
    bmV localbmV = new bmV();
    int i = aZR.fgU.a(paramciA, paramString1, 0, 131097, localbmV);

    if (i != 0)
      throw new ajA(i);
    try
    {
      cjs localcjs1 = new cjs();
      cjs localcjs2 = new cjs();
      i = aZR.fgU.a(localbmV.bxv(), paramString2, 0, localcjs2, (char[])null, localcjs1);

      if ((i != 0) && (i != 122))
      {
        throw new ajA(i);
      }
      if (localcjs2.getValue() != 3) {
        throw new RuntimeException("Unexpected registry type " + localcjs2.getValue() + ", expected REG_BINARY");
      }

      byte[] arrayOfByte1 = new byte[localcjs1.getValue()];
      i = aZR.fgU.a(localbmV.bxv(), paramString2, 0, localcjs2, arrayOfByte1, localcjs1);

      if ((i != 0) && (i != 122))
      {
        throw new ajA(i);
      }
      return arrayOfByte1;
    } finally {
      i = aZR.fgU.a(localbmV.bxv());
      if (i != 0)
        throw new ajA(i);
    }
  }

  public static int f(ciA paramciA, String paramString1, String paramString2)
  {
    bmV localbmV = new bmV();
    int i = aZR.fgU.a(paramciA, paramString1, 0, 131097, localbmV);

    if (i != 0)
      throw new ajA(i);
    try
    {
      cjs localcjs1 = new cjs();
      cjs localcjs2 = new cjs();
      i = aZR.fgU.a(localbmV.bxv(), paramString2, 0, localcjs2, (char[])null, localcjs1);

      if ((i != 0) && (i != 122))
      {
        throw new ajA(i);
      }
      if (localcjs2.getValue() != 4) {
        throw new RuntimeException("Unexpected registry type " + localcjs2.getValue() + ", expected REG_DWORD");
      }

      cjs localcjs3 = new cjs();
      i = aZR.fgU.a(localbmV.bxv(), paramString2, 0, localcjs2, localcjs3, localcjs1);

      if ((i != 0) && (i != 122))
      {
        throw new ajA(i);
      }
      return localcjs3.getValue();
    } finally {
      i = aZR.fgU.a(localbmV.bxv());
      if (i != 0)
        throw new ajA(i);
    }
  }

  public static long g(ciA paramciA, String paramString1, String paramString2)
  {
    bmV localbmV = new bmV();
    int i = aZR.fgU.a(paramciA, paramString1, 0, 131097, localbmV);

    if (i != 0)
      throw new ajA(i);
    try
    {
      cjs localcjs1 = new cjs();
      cjs localcjs2 = new cjs();
      i = aZR.fgU.a(localbmV.bxv(), paramString2, 0, localcjs2, (char[])null, localcjs1);

      if ((i != 0) && (i != 122))
      {
        throw new ajA(i);
      }
      if (localcjs2.getValue() != 11) {
        throw new RuntimeException("Unexpected registry type " + localcjs2.getValue() + ", expected REG_QWORD");
      }

      clb localclb = new clb();
      i = aZR.fgU.a(localbmV.bxv(), paramString2, 0, localcjs2, localclb, localcjs1);

      if ((i != 0) && (i != 122))
      {
        throw new ajA(i);
      }
      return localclb.getValue();
    } finally {
      i = aZR.fgU.a(localbmV.bxv());
      if (i != 0)
        throw new ajA(i);
    }
  }

  public static Object h(ciA paramciA, String paramString1, String paramString2)
  {
    Object localObject = null;
    cjs localcjs1 = new cjs();
    byte[] arrayOfByte = new byte[16383];
    cjs localcjs2 = new cjs(16383);

    int i = aZR.fgU.a(paramciA, paramString1, paramString2, 65535, localcjs1, arrayOfByte, localcjs2);

    if (localcjs1.getValue() == 0) {
      return null;
    }
    if ((i != 0) && (i != 122))
    {
      throw new ajA(i);
    }

    dcj localdcj = new dcj(localcjs2.getValue());
    localdcj.write(0L, arrayOfByte, 0, localcjs2.getValue());

    if (localcjs1.getValue() == 4)
      localObject = new Integer(localdcj.getInt(0L));
    else if (localcjs1.getValue() == 11)
      localObject = new Long(localdcj.getLong(0L));
    else if (localcjs1.getValue() == 3)
      localObject = localdcj.i(0L, localcjs2.getValue());
    else if ((localcjs1.getValue() == 1) || (localcjs1.getValue() == 2))
    {
      localObject = localdcj.getString(0L, true);
    }

    return localObject;
  }

  public static boolean d(ciA paramciA, String paramString)
  {
    bmV localbmV = new bmV();
    cjs localcjs = new cjs();
    int i = aZR.fgU.a(paramciA, paramString, 0, null, 0, 131097, null, localbmV, localcjs);

    if (i != 0) {
      throw new ajA(i);
    }
    i = aZR.fgU.a(localbmV.bxv());
    if (i != 0) {
      throw new ajA(i);
    }
    return 1 == localcjs.getValue();
  }

  public static boolean i(ciA paramciA, String paramString1, String paramString2)
  {
    bmV localbmV = new bmV();
    int i = aZR.fgU.a(paramciA, paramString1, 0, 4, localbmV);

    if (i != 0)
      throw new ajA(i);
    try
    {
      return d(localbmV.bxv(), paramString2);
    } finally {
      i = aZR.fgU.a(localbmV.bxv());
      if (i != 0)
        throw new ajA(i);
    }
  }

  public static void a(ciA paramciA, String paramString, int paramInt)
  {
    byte[] arrayOfByte = new byte[4];
    arrayOfByte[0] = ((byte)(paramInt & 0xFF));
    arrayOfByte[1] = ((byte)(paramInt >> 8 & 0xFF));
    arrayOfByte[2] = ((byte)(paramInt >> 16 & 0xFF));
    arrayOfByte[3] = ((byte)(paramInt >> 24 & 0xFF));
    int i = aZR.fgU.a(paramciA, paramString, 0, 4, arrayOfByte, 4);

    if (i != 0)
      throw new ajA(i);
  }

  public static void a(ciA paramciA, String paramString1, String paramString2, int paramInt)
  {
    bmV localbmV = new bmV();
    int i = aZR.fgU.a(paramciA, paramString1, 0, 131103, localbmV);

    if (i != 0)
      throw new ajA(i);
    try
    {
      a(localbmV.bxv(), paramString2, paramInt);
    } finally {
      i = aZR.fgU.a(localbmV.bxv());
      if (i != 0)
        throw new ajA(i);
    }
  }

  public static void a(ciA paramciA, String paramString, long paramLong)
  {
    byte[] arrayOfByte = new byte[8];
    arrayOfByte[0] = ((byte)(int)(paramLong & 0xFF));
    arrayOfByte[1] = ((byte)(int)(paramLong >> 8 & 0xFF));
    arrayOfByte[2] = ((byte)(int)(paramLong >> 16 & 0xFF));
    arrayOfByte[3] = ((byte)(int)(paramLong >> 24 & 0xFF));
    arrayOfByte[4] = ((byte)(int)(paramLong >> 32 & 0xFF));
    arrayOfByte[5] = ((byte)(int)(paramLong >> 40 & 0xFF));
    arrayOfByte[6] = ((byte)(int)(paramLong >> 48 & 0xFF));
    arrayOfByte[7] = ((byte)(int)(paramLong >> 56 & 0xFF));
    int i = aZR.fgU.a(paramciA, paramString, 0, 11, arrayOfByte, 8);

    if (i != 0)
      throw new ajA(i);
  }

  public static void a(ciA paramciA, String paramString1, String paramString2, long paramLong)
  {
    bmV localbmV = new bmV();
    int i = aZR.fgU.a(paramciA, paramString1, 0, 131103, localbmV);

    if (i != 0)
      throw new ajA(i);
    try
    {
      a(localbmV.bxv(), paramString2, paramLong);
    } finally {
      i = aZR.fgU.a(localbmV.bxv());
      if (i != 0)
        throw new ajA(i);
    }
  }

  public static void j(ciA paramciA, String paramString1, String paramString2)
  {
    char[] arrayOfChar = Native.dA(paramString2);
    int i = aZR.fgU.a(paramciA, paramString1, 0, 1, arrayOfChar, arrayOfChar.length * Native.cuL);

    if (i != 0)
      throw new ajA(i);
  }

  public static void a(ciA paramciA, String paramString1, String paramString2, String paramString3)
  {
    bmV localbmV = new bmV();
    int i = aZR.fgU.a(paramciA, paramString1, 0, 131103, localbmV);

    if (i != 0)
      throw new ajA(i);
    try
    {
      j(localbmV.bxv(), paramString2, paramString3);
    } finally {
      i = aZR.fgU.a(localbmV.bxv());
      if (i != 0)
        throw new ajA(i);
    }
  }

  public static void k(ciA paramciA, String paramString1, String paramString2)
  {
    char[] arrayOfChar = Native.dA(paramString2);
    int i = aZR.fgU.a(paramciA, paramString1, 0, 2, arrayOfChar, arrayOfChar.length * Native.cuL);

    if (i != 0)
      throw new ajA(i);
  }

  public static void b(ciA paramciA, String paramString1, String paramString2, String paramString3)
  {
    bmV localbmV = new bmV();
    int i = aZR.fgU.a(paramciA, paramString1, 0, 131103, localbmV);

    if (i != 0)
      throw new ajA(i);
    try
    {
      k(localbmV.bxv(), paramString2, paramString3);
    } finally {
      i = aZR.fgU.a(localbmV.bxv());
      if (i != 0)
        throw new ajA(i);
    }
  }

  public static void a(ciA paramciA, String paramString, String[] paramArrayOfString)
  {
    int i = 0;
    for (String str1 : paramArrayOfString) {
      i += str1.length() * Native.cuL;
      i += Native.cuL;
    }
    i += Native.cuL;

    int j = 0;
    dcj localdcj = new dcj(i);
    for (String str2 : paramArrayOfString) {
      localdcj.setString(j, str2, true);
      j += str2.length() * Native.cuL;
      j += Native.cuL;
    }
    for (int n = 0; n < Native.cuL; n++) {
      localdcj.setByte(j++, (byte)0);
    }

    n = aZR.fgU.a(paramciA, paramString, 0, 7, localdcj.i(0L, i), i);

    if (n != 0)
      throw new ajA(n);
  }

  public static void a(ciA paramciA, String paramString1, String paramString2, String[] paramArrayOfString)
  {
    bmV localbmV = new bmV();
    int i = aZR.fgU.a(paramciA, paramString1, 0, 131103, localbmV);

    if (i != 0)
      throw new ajA(i);
    try
    {
      a(localbmV.bxv(), paramString2, paramArrayOfString);
    } finally {
      i = aZR.fgU.a(localbmV.bxv());
      if (i != 0)
        throw new ajA(i);
    }
  }

  public static void a(ciA paramciA, String paramString, byte[] paramArrayOfByte)
  {
    int i = aZR.fgU.a(paramciA, paramString, 0, 3, paramArrayOfByte, paramArrayOfByte.length);

    if (i != 0)
      throw new ajA(i);
  }

  public static void a(ciA paramciA, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    bmV localbmV = new bmV();
    int i = aZR.fgU.a(paramciA, paramString1, 0, 131103, localbmV);

    if (i != 0)
      throw new ajA(i);
    try
    {
      a(localbmV.bxv(), paramString2, paramArrayOfByte);
    } finally {
      i = aZR.fgU.a(localbmV.bxv());
      if (i != 0)
        throw new ajA(i);
    }
  }

  public static void e(ciA paramciA, String paramString)
  {
    int i = aZR.fgU.b(paramciA, paramString);
    if (i != 0)
      throw new ajA(i);
  }

  public static void l(ciA paramciA, String paramString1, String paramString2)
  {
    bmV localbmV = new bmV();
    int i = aZR.fgU.a(paramciA, paramString1, 0, 131103, localbmV);

    if (i != 0)
      throw new ajA(i);
    try
    {
      e(localbmV.bxv(), paramString2);
    } finally {
      i = aZR.fgU.a(localbmV.bxv());
      if (i != 0)
        throw new ajA(i);
    }
  }

  public static void f(ciA paramciA, String paramString)
  {
    int i = aZR.fgU.a(paramciA, paramString);
    if (i != 0)
      throw new ajA(i);
  }

  public static void m(ciA paramciA, String paramString1, String paramString2)
  {
    bmV localbmV = new bmV();
    int i = aZR.fgU.a(paramciA, paramString1, 0, 131103, localbmV);

    if (i != 0)
      throw new ajA(i);
    try
    {
      f(localbmV.bxv(), paramString2);
    } finally {
      i = aZR.fgU.a(localbmV.bxv());
      if (i != 0)
        throw new ajA(i);
    }
  }

  public static String[] b(ciA paramciA)
  {
    cjs localcjs1 = new cjs();
    cjs localcjs2 = new cjs();
    int i = aZR.fgU.a(paramciA, null, null, null, localcjs1, localcjs2, null, null, null, null, null, null);

    if (i != 0) {
      throw new ajA(i);
    }
    ArrayList localArrayList = new ArrayList(localcjs1.getValue());
    char[] arrayOfChar = new char[localcjs2.getValue() + 1];
    for (int j = 0; j < localcjs1.getValue(); j++) {
      cjs localcjs3 = new cjs(localcjs2.getValue() + 1);

      i = aZR.fgU.a(paramciA, j, arrayOfChar, localcjs3, null, null, null, null);

      if (i != 0) {
        throw new ajA(i);
      }
      localArrayList.add(Native.toString(arrayOfChar));
    }
    return (String[])localArrayList.toArray(new String[0]);
  }

  public static String[] g(ciA paramciA, String paramString)
  {
    bmV localbmV = new bmV();
    int i = aZR.fgU.a(paramciA, paramString, 0, 131097, localbmV);

    if (i != 0)
      throw new ajA(i);
    try
    {
      return b(localbmV.bxv());
    } finally {
      i = aZR.fgU.a(localbmV.bxv());
      if (i != 0)
        throw new ajA(i);
    }
  }

  public static bmV b(ciA paramciA, String paramString, int paramInt)
  {
    bmV localbmV = new bmV();
    int i = aZR.fgU.a(paramciA, paramString, 0, paramInt, localbmV);

    if (i != 0) {
      throw new ajA(i);
    }

    return localbmV;
  }

  public static TreeMap c(ciA paramciA)
  {
    cjs localcjs1 = new cjs();
    cjs localcjs2 = new cjs();
    cjs localcjs3 = new cjs();
    int i = aZR.fgU.a(paramciA, null, null, null, null, null, null, localcjs1, localcjs2, localcjs3, null, null);

    if (i != 0) {
      throw new ajA(i);
    }
    TreeMap localTreeMap = new TreeMap();
    char[] arrayOfChar = new char[localcjs2.getValue() + 1];
    byte[] arrayOfByte = new byte[localcjs3.getValue()];
    for (int j = 0; j < localcjs1.getValue(); j++) {
      cjs localcjs4 = new cjs(localcjs2.getValue() + 1);

      cjs localcjs5 = new cjs(localcjs3.getValue());

      cjs localcjs6 = new cjs();
      i = aZR.fgU.a(paramciA, j, arrayOfChar, localcjs4, null, localcjs6, arrayOfByte, localcjs5);

      if (i != 0) {
        throw new ajA(i);
      }

      String str1 = Native.toString(arrayOfChar);

      if (localcjs5.getValue() == 0) {
        switch (localcjs6.getValue()) {
        case 3:
          localTreeMap.put(str1, new byte[0]);
          break;
        case 1:
        case 2:
          localTreeMap.put(str1, new char[0]);
          break;
        case 7:
          localTreeMap.put(str1, new String[0]);
          break;
        case 0:
          localTreeMap.put(str1, null);
          break;
        case 4:
        case 5:
        case 6:
        default:
          throw new RuntimeException("Unsupported empty type: " + localcjs6.getValue());
        }

      }
      else
      {
        dcj localdcj1 = new dcj(localcjs5.getValue());
        localdcj1.write(0L, arrayOfByte, 0, localcjs5.getValue());

        switch (localcjs6.getValue()) {
        case 11:
          localTreeMap.put(str1, Long.valueOf(localdcj1.getLong(0L)));
          break;
        case 4:
          localTreeMap.put(str1, Integer.valueOf(localdcj1.getInt(0L)));
          break;
        case 1:
        case 2:
          localTreeMap.put(str1, localdcj1.getString(0L, true));
          break;
        case 3:
          localTreeMap.put(str1, localdcj1.i(0L, localcjs5.getValue()));

          break;
        case 7:
          dcj localdcj2 = new dcj(localcjs5.getValue());
          localdcj2.write(0L, arrayOfByte, 0, localcjs5.getValue());
          ArrayList localArrayList = new ArrayList();
          int k = 0;
          while (k < localdcj2.size()) {
            String str2 = localdcj2.getString(k, true);
            k += str2.length() * Native.cuL;
            k += Native.cuL;
            if ((str2.length() != 0) || (k != localdcj2.size()))
            {
              localArrayList.add(str2);
            }
          }
          localTreeMap.put(str1, localArrayList.toArray(new String[0]));
          break;
        case 5:
        case 6:
        case 8:
        case 9:
        case 10:
        default:
          throw new RuntimeException("Unsupported type: " + localcjs6.getValue());
        }
      }
    }
    return localTreeMap;
  }

  public static TreeMap h(ciA paramciA, String paramString)
  {
    bmV localbmV = new bmV();
    int i = aZR.fgU.a(paramciA, paramString, 0, 131097, localbmV);

    if (i != 0)
      throw new ajA(i);
    try
    {
      return c(localbmV.bxv());
    } finally {
      i = aZR.fgU.a(localbmV.bxv());
      if (i != 0)
        throw new ajA(i);
    }
  }

  public static cFm a(ciA paramciA, int paramInt)
  {
    cFm localcFm = new cFm(paramciA, paramInt);
    int i = aZR.fgU.a(paramciA, localcFm.aPx, localcFm.izl, null, localcFm.izm, localcFm.izn, localcFm.izo, localcFm.izp, localcFm.izq, localcFm.izr, localcFm.izs, localcFm.aPz);

    if (i != 0) {
      throw new ajA(i);
    }

    return localcFm;
  }

  public static lM b(ciA paramciA, int paramInt)
  {
    lM locallM = new lM(paramciA, paramInt);
    int i = aZR.fgU.a(paramciA, locallM.dwIndex, locallM.aPv, locallM.aPw, null, locallM.aPx, locallM.aPy, locallM.aPz);

    if (i != 0) {
      throw new ajA(i);
    }

    return locallM;
  }

  public static String g(Map paramMap)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    for (Map.Entry localEntry : paramMap.entrySet()) {
      if (localEntry.getValue() != null) {
        localStringBuffer.append((String)localEntry.getKey() + "=" + (String)localEntry.getValue() + "");
      }
    }
    return localStringBuffer.toString() + "";
  }

  public static dcN[] A(String paramString, boolean paramBoolean)
  {
    int i = 4;
    int j = 1024;
    int k = 0;
    dcj localdcj = null;
    do
    {
      k = 0;
      localdcj = new dcj(j);
      localObject = new cjs();
      boolean bool1 = aZR.fgU.a(new cFg(paramString), i, localdcj, j, (cjs)localObject);

      if (!bool1) {
        m = cxj.ikc.GetLastError();
        localdcj.clear();
        if (122 != m) {
          throw new ajA(m);
        }
      }
      int m = ((cjs)localObject).getValue();
      if (j < m) {
        k = 1;
        j = m;
        localdcj.clear();
      }
    }
    while (k != 0);

    Object localObject = new aNi(localdcj);

    localdcj.clear();
    aLL localaLL = ((aNi)localObject).bdZ();
    dcN[] arrayOfdcN1 = localaLL.bdl();

    if (paramBoolean) {
      HashMap localHashMap = new HashMap();
      for (dcN localdcN1 : arrayOfdcN1) {
        boolean bool2 = (localdcN1.mcj & 0x1F) != 0;
        String str = localdcN1.dpe() + "/" + bool2 + "/" + localdcN1.getClass().getName();

        dcN localdcN2 = (dcN)localHashMap.get(str);
        if (localdcN2 != null) {
          int i2 = localdcN2.kVS;
          i2 |= localdcN1.kVS;
          localdcN2.kVS = i2;
        } else {
          localHashMap.put(str, localdcN1);
        }
      }
      return (dcN[])localHashMap.values().toArray(new dcN[localHashMap.size()]);
    }

    return arrayOfdcN1;
  }
}