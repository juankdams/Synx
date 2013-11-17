import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class btC
{
  private static final wh aIk = wh.Fo();
  public static final String gcm = "ISO-8859-1";
  private static final long gcn = 16777216L;

  public static bFe[] a(dwE paramdwE, bFe[] paramArrayOfbFe, Jf paramJf, bnA parambnA)
  {
    return a(paramdwE, paramArrayOfbFe, paramJf, parambnA, aIk.Fp());
  }

  public static bFe[] a(dwE paramdwE, bFe[] paramArrayOfbFe, Jf paramJf, bnA parambnA, long paramLong)
  {
    oK localoK = new oK();
    localoK.s(Arrays.asList(paramArrayOfbFe));
    Ae localAe = a(paramdwE, localoK, paramJf, parambnA, paramLong);

    return localAe.size() == 0 ? new bFe[0] : ((oK)localAe).wl();
  }

  public static Ae a(dwE paramdwE, Ae paramAe, Jf paramJf, bnA parambnA, long paramLong)
  {
    a(paramdwE, paramAe, paramLong);
    cSY localcSY = new cSY(paramLong);

    return a(paramdwE, paramAe, paramJf, parambnA, localcSY);
  }

  public static Ae a(dwE paramdwE, Ae paramAe, Jf paramJf, bnA parambnA, cJr paramcJr)
  {
    if (paramAe.size() == 0) {
      paramdwE.d("No sources found.", 3);
      return bbA.fkM;
    }
    paramAe = oK.a(paramAe);

    oK localoK1 = new oK();
    for (bFe localbFe1 : paramAe) {
      String str = localbFe1.getName();
      str = str == null ? str : str.replace('/', File.separatorChar);

      String[] arrayOfString = null;
      try {
        arrayOfString = paramJf.cg(str);
      } catch (Exception localException) {
        paramdwE.d("Caught " + localException + " mapping resource " + localbFe1, 3);
      }

      if ((arrayOfString == null) || (arrayOfString.length == 0)) {
        paramdwE.d(localbFe1 + " skipped - don't know how to handle it", 3);
      }
      else
      {
        for (int i = 0; i < arrayOfString.length; i++) {
          if (arrayOfString[i] == null) {
            arrayOfString[i] = "(no name)";
          }
        }
        oK localoK2 = new oK();
        for (int j = 0; j < arrayOfString.length; j++) {
          localoK2.b(parambnA.bS(arrayOfString[j].replace(File.separatorChar, '/')));
        }

        aSI localaSI = new aSI();
        localaSI.a(paramcJr.i(localbFe1));
        localaSI.b(localoK2);
        if (localaSI.size() > 0) {
          localoK1.b(localbFe1);
          bFe localbFe2 = (bFe)localaSI.iterator().next();
          paramdwE.d(localbFe1.getName() + " added as " + localbFe2.getName() + (localbFe2.TY() ? " is outdated." : " doesn't exist."), 3);
        }
        else
        {
          paramdwE.d(localbFe1.getName() + " omitted as " + localoK2.toString() + (localoK2.size() == 1 ? " is" : " are ") + " up to date.", 3);
        }
      }
    }

    return localoK1;
  }

  public static void a(bFe parambFe1, bFe parambFe2)
  {
    a(parambFe1, parambFe2, null);
  }

  public static void a(bFe parambFe1, bFe parambFe2, FF paramFF)
  {
    a(parambFe1, parambFe2, null, null, false, false, null, null, paramFF);
  }

  public static void a(bFe parambFe1, bFe parambFe2, btc parambtc, Vector paramVector, boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2, FF paramFF)
  {
    a(parambFe1, parambFe2, parambtc, paramVector, paramBoolean1, paramBoolean2, false, paramString1, paramString2, paramFF);
  }

  public static void a(bFe parambFe1, bFe parambFe2, btc parambtc, Vector paramVector, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2, FF paramFF)
  {
    a(parambFe1, parambFe2, parambtc, paramVector, paramBoolean1, paramBoolean2, paramBoolean3, paramString1, paramString2, paramFF, false);
  }

  public static void a(bFe parambFe1, bFe parambFe2, btc parambtc, Vector paramVector, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2, FF paramFF, boolean paramBoolean4)
  {
    if ((!paramBoolean1) && (!dvA.a(parambFe1, parambFe2, wh.Fo().Fp())))
    {
      return;
    }
    int i = (parambtc != null) && (parambtc.TI()) ? 1 : 0;

    int j = (paramVector != null) && (paramVector.size() > 0) ? 1 : 0;

    String str1 = null;
    if ((parambFe1 instanceof bDb))
      str1 = ((bDb)parambFe1).getEncoding();
    else {
      str1 = paramString1;
    }
    File localFile = null;
    if (parambFe2.G(dmo.class) != null) {
      localFile = ((dmo)parambFe2.G(dmo.class)).getFile();
    }
    if ((localFile != null) && (localFile.isFile()) && (!localFile.canWrite())) {
      if (!paramBoolean4) {
        throw new IOException("can't write to read-only destination file " + localFile);
      }
      if (!aIk.q(localFile))
        throw new IOException("failed to delete read-only destination file " + localFile);
    }
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    Object localObject7;
    if (i != 0) {
      localObject1 = null;
      localObject2 = null;
      try {
        localObject3 = null;
        if (str1 == null)
          localObject3 = new InputStreamReader(parambFe1.getInputStream());
        else {
          localObject3 = new InputStreamReader(parambFe1.getInputStream(), str1);
        }

        localObject1 = new BufferedReader((Reader)localObject3);
        localObject4 = a(parambFe2, paramBoolean3, paramFF);

        if (paramString2 == null)
          localObject5 = new OutputStreamWriter((OutputStream)localObject4);
        else {
          localObject5 = new OutputStreamWriter((OutputStream)localObject4, paramString2);
        }
        localObject2 = new BufferedWriter((Writer)localObject5);
        if (j != 0) {
          localObject6 = new bYe();
          ((bYe)localObject6).setBufferSize(8192);
          ((bYe)localObject6).h((Reader)localObject1);
          ((bYe)localObject6).f(paramVector);
          ((bYe)localObject6).b(paramFF);
          localObject7 = ((bYe)localObject6).cdn();
          localObject1 = new BufferedReader((Reader)localObject7);
        }
        localObject6 = new asN();
        ((asN)localObject6).cQ(true);
        localObject7 = null;
        String str2 = ((asN)localObject6).g((Reader)localObject1);
        while (str2 != null) {
          if (str2.length() == 0)
          {
            ((BufferedWriter)localObject2).newLine();
          } else {
            localObject7 = parambtc.cw(str2);
            ((BufferedWriter)localObject2).write((String)localObject7);
          }
          str2 = ((asN)localObject6).g((Reader)localObject1);
        }
      } finally {
        wh.a((Writer)localObject2);
        wh.e((Reader)localObject1);
      }
    } else if ((j != 0) || ((str1 != null) && (!str1.equals(paramString2))) || ((str1 == null) && (paramString2 != null)))
    {
      localObject1 = null;
      localObject2 = null;
      try {
        localObject3 = null;
        if (str1 == null)
          localObject3 = new InputStreamReader(parambFe1.getInputStream());
        else {
          localObject3 = new InputStreamReader(parambFe1.getInputStream(), str1);
        }

        localObject1 = new BufferedReader((Reader)localObject3);
        localObject4 = a(parambFe2, paramBoolean3, paramFF);

        if (paramString2 == null)
          localObject5 = new OutputStreamWriter((OutputStream)localObject4);
        else {
          localObject5 = new OutputStreamWriter((OutputStream)localObject4, paramString2);
        }
        localObject2 = new BufferedWriter((Writer)localObject5);
        if (j != 0) {
          localObject6 = new bYe();
          ((bYe)localObject6).setBufferSize(8192);
          ((bYe)localObject6).h((Reader)localObject1);
          ((bYe)localObject6).f(paramVector);
          ((bYe)localObject6).b(paramFF);
          localObject7 = ((bYe)localObject6).cdn();
          localObject1 = new BufferedReader((Reader)localObject7);
        }
        localObject6 = new char[8192];
        while (true) {
          int m = ((BufferedReader)localObject1).read((char[])localObject6, 0, localObject6.length);
          if (m == -1) {
            break;
          }
          ((BufferedWriter)localObject2).write((char[])localObject6, 0, m);
        }
      } finally {
        wh.a((Writer)localObject2);
        wh.e((Reader)localObject1);
      }
    } else if ((parambFe1.G(dmo.class) != null) && (localFile != null))
    {
      localObject1 = ((dmo)parambFe1.G(dmo.class)).getFile();

      localObject2 = localFile.getParentFile();
      if ((localObject2 != null) && (!((File)localObject2).isDirectory()) && (!localFile.getParentFile().mkdirs()))
      {
        throw new IOException("failed to create the parent directory for " + localFile);
      }

      localObject3 = null;
      localObject4 = null;
      localObject5 = null;
      localObject6 = null;
      try
      {
        localObject3 = new FileInputStream((File)localObject1);
        localObject4 = new FileOutputStream(localFile);

        localObject5 = ((FileInputStream)localObject3).getChannel();
        localObject6 = ((FileOutputStream)localObject4).getChannel();

        long l1 = 0L;
        long l2 = ((FileChannel)localObject5).size();
        while (l1 < l2) {
          long l3 = Math.min(16777216L, l2 - l1);
          l1 += ((FileChannel)localObject6).transferFrom((ReadableByteChannel)localObject5, l1, l3);
        }
      }
      finally {
        wh.a((Channel)localObject5);
        wh.a((Channel)localObject6);
        wh.b((OutputStream)localObject4);
        wh.c((InputStream)localObject3);
      }
    } else {
      localObject1 = null;
      localObject2 = null;
      try {
        localObject1 = parambFe1.getInputStream();
        localObject2 = a(parambFe2, paramBoolean3, paramFF);

        localObject3 = new byte[8192];
        int k = 0;
        do {
          ((OutputStream)localObject2).write((byte[])localObject3, 0, k);
          k = ((InputStream)localObject1).read((byte[])localObject3, 0, localObject3.length);
        }while (k != -1);
      } finally {
        wh.b((OutputStream)localObject2);
        wh.c((InputStream)localObject1);
      }
    }
    if (paramBoolean2) {
      localObject1 = (ayr)parambFe2.G(ayr.class);
      if (localObject1 != null)
        a((ayr)localObject1, parambFe1.getLastModified());
    }
  }

  public static void a(ayr paramayr, long paramLong)
  {
    paramayr.ce(paramLong < 0L ? System.currentTimeMillis() : paramLong);
  }

  public static boolean a(bFe parambFe1, bFe parambFe2, boolean paramBoolean)
  {
    if (parambFe1.TY() != parambFe2.TY()) {
      return false;
    }
    if (!parambFe1.TY())
    {
      return true;
    }

    if ((parambFe1.isDirectory()) || (parambFe2.isDirectory()))
    {
      return false;
    }
    if (parambFe1.equals(parambFe2)) {
      return true;
    }
    if (!paramBoolean) {
      long l1 = parambFe1.getSize();
      long l2 = parambFe2.getSize();
      if ((l1 != -1L) && (l2 != -1L) && (l1 != l2))
      {
        return false;
      }
    }
    return b(parambFe1, parambFe2, paramBoolean) == 0;
  }

  public static int b(bFe parambFe1, bFe parambFe2, boolean paramBoolean)
  {
    if (parambFe1.equals(parambFe2)) {
      return 0;
    }
    boolean bool1 = parambFe1.TY();
    boolean bool2 = parambFe2.TY();
    if ((!bool1) && (!bool2)) {
      return 0;
    }
    if (bool1 != bool2) {
      return bool1 ? 1 : -1;
    }
    boolean bool3 = parambFe1.isDirectory();
    boolean bool4 = parambFe2.isDirectory();
    if ((bool3) && (bool4)) {
      return 0;
    }
    if ((bool3) || (bool4)) {
      return bool3 ? -1 : 1;
    }
    return paramBoolean ? c(parambFe1, parambFe2) : b(parambFe1, parambFe2);
  }

  public static WO a(dmo paramdmo)
  {
    if (((paramdmo instanceof WO)) || (paramdmo == null)) {
      return (WO)paramdmo;
    }
    WO localWO = new WO(paramdmo.getFile());
    localWO.b(FF.E(paramdmo));
    return localWO;
  }

  private static int b(bFe parambFe1, bFe parambFe2)
  {
    BufferedInputStream localBufferedInputStream1 = null;
    BufferedInputStream localBufferedInputStream2 = null;
    try {
      localBufferedInputStream1 = new BufferedInputStream(parambFe1.getInputStream());
      localBufferedInputStream2 = new BufferedInputStream(parambFe2.getInputStream());

      for (int i = localBufferedInputStream1.read(); i != -1; i = localBufferedInputStream1.read()) {
        int j = localBufferedInputStream2.read();
        if (i != j) {
          return i > j ? 1 : -1;
        }
      }
      return localBufferedInputStream2.read() == -1 ? 0 : -1;
    } finally {
      wh.c(localBufferedInputStream1);
      wh.c(localBufferedInputStream2);
    }
  }

  private static int c(bFe parambFe1, bFe parambFe2)
  {
    BufferedReader localBufferedReader1 = null;
    BufferedReader localBufferedReader2 = null;
    try {
      localBufferedReader1 = new BufferedReader(new InputStreamReader(parambFe1.getInputStream()));
      localBufferedReader2 = new BufferedReader(new InputStreamReader(parambFe2.getInputStream()));

      String str1 = localBufferedReader1.readLine();
      while (str1 != null) {
        String str2 = localBufferedReader2.readLine();
        if (!str1.equals(str2))
        {
          int j;
          if (str2 == null) {
            return 1;
          }
          return str1.compareTo(str2);
        }
        str1 = localBufferedReader1.readLine();
      }
      return localBufferedReader2.readLine() == null ? 0 : -1;
    } finally {
      wh.e(localBufferedReader1);
      wh.e(localBufferedReader2);
    }
  }

  private static void a(dwE paramdwE, Ae paramAe, long paramLong)
  {
    long l = System.currentTimeMillis() + paramLong;
    dwx localdwx = new dwx();
    localdwx.setMillis(l);
    localdwx.a(auZ.dJP);
    aSI localaSI = new aSI();
    localaSI.a(localdwx);
    localaSI.b(paramAe);
    for (bFe localbFe : localaSI)
      paramdwE.d("Warning: " + localbFe.getName() + " modified in the future.", 1);
  }

  private static OutputStream a(bFe parambFe, boolean paramBoolean, FF paramFF)
  {
    if (paramBoolean) {
      aQE localaQE = (aQE)parambFe.G(aQE.class);
      if (localaQE != null) {
        return localaQE.ajc();
      }
      paramFF.d("Appendable OutputStream not available for non-appendable resource " + parambFe + "; using plain OutputStream", 3);
    }

    return parambFe.getOutputStream();
  }
}