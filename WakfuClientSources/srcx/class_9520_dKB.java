import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import java.util.zip.ZipException;

public class dKB
{
  private static final int lYw = 509;
  static final int lYx = 15;
  static final int lYy = 8;
  private static final int lYz = 0;
  private static final int lYA = 1;
  private static final int lYB = 2;
  private static final int lYC = 3;
  private final List entries = new LinkedList();

  private final Map lYD = new HashMap(509);
  private final String encoding;
  private final dxu lYE;
  private final String lYF;
  private final RandomAccessFile lYG;
  private final boolean lYH;
  private boolean closed;
  private final byte[] lYI = new byte[8];
  private final byte[] lYJ = new byte[4];
  private final byte[] lYK = new byte[42];
  private final byte[] lYL = new byte[2];
  private static final int lYM = 42;
  private static final long lYN = bpr.ac(dRv.mmZ);
  private static final int lYO = 22;
  private static final int lYP = 65557;
  private static final int lYQ = 16;
  private static final int lYR = 20;
  private static final int lYS = 8;
  private static final int lYT = 48;
  private static final long lYU = 26L;
  private final Comparator lYV = new aKK(this);

  public dKB(File paramFile)
  {
    this(paramFile, null);
  }

  public dKB(String paramString)
  {
    this(new File(paramString), null);
  }

  public dKB(String paramString1, String paramString2)
  {
    this(new File(paramString1), paramString2, true);
  }

  public dKB(File paramFile, String paramString)
  {
    this(paramFile, paramString, true);
  }

  public dKB(File paramFile, String paramString, boolean paramBoolean)
  {
    this.lYF = paramFile.getAbsolutePath();
    this.encoding = paramString;
    this.lYE = ach.dY(paramString);
    this.lYH = paramBoolean;
    this.lYG = new RandomAccessFile(paramFile, "r");
    int i = 0;
    try {
      Map localMap = djt();

      v(localMap);
      i = 1;
    } finally {
      if (i == 0)
        try {
          this.closed = true;
          this.lYG.close();
        }
        catch (IOException localIOException2)
        {
        }
    }
  }

  public String getEncoding()
  {
    return this.encoding;
  }

  public void close()
  {
    this.closed = true;

    this.lYG.close();
  }

  public static void a(dKB paramdKB)
  {
    if (paramdKB != null)
      try {
        paramdKB.close();
      }
      catch (IOException localIOException)
      {
      }
  }

  public Enumeration djr()
  {
    return Collections.enumeration(this.entries);
  }

  public Enumeration djs()
  {
    dPL[] arrayOfdPL = (dPL[])this.entries.toArray(new dPL[0]);
    Arrays.sort(arrayOfdPL, this.lYV);
    return Collections.enumeration(Arrays.asList(arrayOfdPL));
  }

  public dPL ro(String paramString)
  {
    LinkedList localLinkedList = (LinkedList)this.lYD.get(paramString);
    return localLinkedList != null ? (dPL)localLinkedList.getFirst() : null;
  }

  public Iterable rp(String paramString)
  {
    List localList = (List)this.lYD.get(paramString);
    return localList != null ? localList : Collections.emptyList();
  }

  public Iterable rq(String paramString)
  {
    dPL[] arrayOfdPL = new dPL[0];
    if (this.lYD.containsKey(paramString)) {
      arrayOfdPL = (dPL[])((LinkedList)this.lYD.get(paramString)).toArray(arrayOfdPL);
      Arrays.sort(arrayOfdPL, this.lYV);
    }
    return Arrays.asList(arrayOfdPL);
  }

  public boolean f(dPL paramdPL)
  {
    return bom.b(paramdPL);
  }

  public InputStream g(dPL paramdPL)
  {
    if (!(paramdPL instanceof auy)) {
      return null;
    }

    acP localacP = ((auy)paramdPL).aGM();
    bom.e(paramdPL);
    long l = acP.a(localacP);
    aTh localaTh = new aTh(this, l, paramdPL.getCompressedSize());

    switch (paramdPL.getMethod()) {
    case 0:
      return localaTh;
    case 8:
      localaTh.biB();
      Inflater localInflater = new Inflater(true);
      return new aKH(this, localaTh, localInflater, localInflater);
    }

    throw new ZipException("Found unsupported compression method " + paramdPL.getMethod());
  }

  protected void finalize()
  {
    try
    {
      if (!this.closed) {
        System.err.println("Cleaning up unclosed ZipFile for archive " + this.lYF);

        close();
      }
    } finally {
      super.finalize();
    }
  }

  private Map djt()
  {
    HashMap localHashMap = new HashMap();

    dju();

    this.lYG.readFully(this.lYJ);
    long l = bpr.ac(this.lYJ);

    if ((l != lYN) && (djy())) {
      throw new IOException("central directory is empty, can't expand corrupt archive.");
    }

    while (l == lYN) {
      u(localHashMap);
      this.lYG.readFully(this.lYJ);
      l = bpr.ac(this.lYJ);
    }
    return localHashMap;
  }

  private void u(Map paramMap)
  {
    this.lYG.readFully(this.lYK);
    int i = 0;
    acP localacP = new acP(null);
    auy localauy = new auy(localacP);

    int j = bTM.k(this.lYK, i);
    i += 2;
    localauy.Dk(j >> 8 & 0xF);

    i += 2;

    Qz localQz = Qz.d(this.lYK, i);
    boolean bool = localQz.aci();
    dxu localdxu = bool ? ach.cRc : this.lYE;

    localauy.a(localQz);

    i += 2;

    localauy.setMethod(bTM.k(this.lYK, i));
    i += 2;

    long l = bom.fL(bpr.h(this.lYK, i));
    localauy.setTime(l);
    i += 4;

    localauy.setCrc(bpr.h(this.lYK, i));
    i += 4;

    localauy.setCompressedSize(bpr.h(this.lYK, i));
    i += 4;

    localauy.setSize(bpr.h(this.lYK, i));
    i += 4;

    int k = bTM.k(this.lYK, i);
    i += 2;

    int m = bTM.k(this.lYK, i);
    i += 2;

    int n = bTM.k(this.lYK, i);
    i += 2;

    int i1 = bTM.k(this.lYK, i);
    i += 2;

    localauy.Di(bTM.k(this.lYK, i));
    i += 2;

    localauy.kQ(bpr.h(this.lYK, i));
    i += 4;

    byte[] arrayOfByte1 = new byte[k];
    this.lYG.readFully(arrayOfByte1);
    localauy.d(localdxu.K(arrayOfByte1), arrayOfByte1);

    acP.a(localacP, bpr.h(this.lYK, i));

    this.entries.add(localauy);

    byte[] arrayOfByte2 = new byte[m];
    this.lYG.readFully(arrayOfByte2);
    localauy.aO(arrayOfByte2);

    a(localauy, localacP, i1);

    byte[] arrayOfByte3 = new byte[n];
    this.lYG.readFully(arrayOfByte3);
    localauy.setComment(localdxu.K(arrayOfByte3));

    if ((!bool) && (this.lYH))
      paramMap.put(localauy, new dUk(arrayOfByte1, arrayOfByte3, null));
  }

  private void a(dPL paramdPL, acP paramacP, int paramInt)
  {
    acw localacw = (acw)paramdPL.d(acw.bRt);

    if (localacw != null) {
      boolean bool1 = paramdPL.getSize() == 4294967295L;
      boolean bool2 = paramdPL.getCompressedSize() == 4294967295L;
      boolean bool3 = acP.b(paramacP) == 4294967295L;

      localacw.a(bool1, bool2, bool3, paramInt == 65535);

      if (bool1)
        paramdPL.setSize(localacw.aoO().ah());
      else if (bool2) {
        localacw.a(new bPi(paramdPL.getSize()));
      }

      if (bool2)
        paramdPL.setCompressedSize(localacw.aoP().ah());
      else if (bool1) {
        localacw.b(new bPi(paramdPL.getCompressedSize()));
      }

      if (bool3)
        acP.a(paramacP, localacw.aoQ().ah());
    }
  }

  private void dju()
  {
    djx();
    boolean bool = false;
    int i = this.lYG.getFilePointer() > 20L ? 1 : 0;

    if (i != 0) {
      this.lYG.seek(this.lYG.getFilePointer() - 20L);
      this.lYG.readFully(this.lYJ);
      bool = Arrays.equals(dRv.mnc, this.lYJ);
    }
    if (!bool)
    {
      if (i != 0) {
        CO(16);
      }
      djw();
    } else {
      djv();
    }
  }

  private void djv()
  {
    CO(4);

    this.lYG.readFully(this.lYI);
    this.lYG.seek(bPi.am(this.lYI));
    this.lYG.readFully(this.lYJ);
    if (!Arrays.equals(this.lYJ, dRv.mnb)) {
      throw new ZipException("archive's ZIP64 end of central directory locator is corrupt.");
    }

    CO(44);

    this.lYG.readFully(this.lYI);
    this.lYG.seek(bPi.am(this.lYI));
  }

  private void djw()
  {
    CO(16);
    this.lYG.readFully(this.lYJ);
    this.lYG.seek(bpr.ac(this.lYJ));
  }

  private void djx()
  {
    boolean bool = a(22L, 65557L, dRv.mna);

    if (!bool)
      throw new ZipException("archive is not a ZIP archive");
  }

  private boolean a(long paramLong1, long paramLong2, byte[] paramArrayOfByte)
  {
    boolean bool = false;
    long l1 = this.lYG.length() - paramLong1;
    long l2 = Math.max(0L, this.lYG.length() - paramLong2);

    if (l1 >= 0L) {
      for (; l1 >= l2; l1 -= 1L) {
        this.lYG.seek(l1);
        int i = this.lYG.read();
        if (i == -1) {
          break;
        }
        if (i == paramArrayOfByte[0]) {
          i = this.lYG.read();
          if (i == paramArrayOfByte[1]) {
            i = this.lYG.read();
            if (i == paramArrayOfByte[2]) {
              i = this.lYG.read();
              if (i == paramArrayOfByte[3]) {
                bool = true;
                break;
              }
            }
          }
        }
      }
    }
    if (bool) {
      this.lYG.seek(l1);
    }
    return bool;
  }

  private void CO(int paramInt)
  {
    int i = 0;
    while (i < paramInt) {
      int j = this.lYG.skipBytes(paramInt - i);
      if (j <= 0) {
        throw new EOFException();
      }
      i += j;
    }
  }

  private void v(Map paramMap)
  {
    for (Iterator localIterator = this.entries.iterator(); localIterator.hasNext(); )
    {
      auy localauy = (auy)localIterator.next();
      acP localacP = localauy.aGM();
      long l = acP.b(localacP);
      this.lYG.seek(l + 26L);
      this.lYG.readFully(this.lYL);
      int i = bTM.ao(this.lYL);
      this.lYG.readFully(this.lYL);
      int j = bTM.ao(this.lYL);
      int k = i;
      while (k > 0) {
        int m = this.lYG.skipBytes(k);
        if (m <= 0) {
          throw new IOException("failed to skip file name in local file header");
        }

        k -= m;
      }
      byte[] arrayOfByte = new byte[j];
      this.lYG.readFully(arrayOfByte);
      localauy.setExtra(arrayOfByte);
      acP.b(localacP, l + 26L + 2L + 2L + i + j);

      if (paramMap.containsKey(localauy)) {
        localObject = (dUk)paramMap.get(localauy);
        bom.a(localauy, dUk.a((dUk)localObject), dUk.b((dUk)localObject));
      }

      Object localObject = localauy.getName();
      LinkedList localLinkedList = (LinkedList)this.lYD.get(localObject);
      if (localLinkedList == null) {
        localLinkedList = new LinkedList();
        this.lYD.put(localObject, localLinkedList);
      }
      localLinkedList.addLast(localauy);
    }
  }

  private boolean djy()
  {
    this.lYG.seek(0L);
    this.lYG.readFully(this.lYJ);
    return Arrays.equals(this.lYJ, dRv.mmX);
  }
}