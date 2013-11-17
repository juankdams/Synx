import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipException;

public class dRv extends FilterOutputStream
{
  private static final int bt = 512;
  private boolean finished = false;
  private static final int mmG = 8192;
  public static final int DEFLATED = 8;
  public static final int DEFAULT_COMPRESSION = -1;
  public static final int STORED = 0;
  static final String DEFAULT_ENCODING = null;
  public static final int mmH = 2048;
  private static final byte[] EMPTY = new byte[0];
  private aFJ mmI;
  private String mmJ = "";

  private int level = -1;

  private boolean mmK = false;

  private int miL = 8;

  private final List entries = new LinkedList();

  private final CRC32 crc = new CRC32();

  private long mmL = 0L;

  private long mmM = 0L;

  private long mmN = 0L;

  private static final byte[] mmO = { 0, 0 };

  private static final byte[] mmP = { 0, 0, 0, 0 };

  private final Map mmQ = new HashMap();

  private String encoding = null;

  private dxu lYE = ach.dY(DEFAULT_ENCODING);

  protected final Deflater def = new Deflater(this.level, true);

  protected byte[] buf = new byte[512];
  private final RandomAccessFile mmR;
  private boolean mmS = true;

  private boolean mmT = false;

  private brb mmU = brb.fMn;

  private boolean mmV = false;

  private aeW mmW = aeW.cWX;

  protected static final byte[] mmX = bpr.fJO.getBytes();

  protected static final byte[] mmY = bpr.fJP.getBytes();

  protected static final byte[] mmZ = bpr.fJN.getBytes();

  protected static final byte[] mna = bpr.fS(101010256L);

  static final byte[] mnb = bpr.fS(101075792L);

  static final byte[] mnc = bpr.fS(117853008L);

  private static final byte[] mnd = bpr.fS(1L);

  public dRv(OutputStream paramOutputStream)
  {
    super(paramOutputStream);
    this.mmR = null;
  }

  public dRv(File paramFile)
  {
    super(null);
    RandomAccessFile localRandomAccessFile = null;
    try {
      localRandomAccessFile = new RandomAccessFile(paramFile, "rw");
      localRandomAccessFile.setLength(0L);
    } catch (IOException localIOException1) {
      if (localRandomAccessFile != null) {
        try {
          localRandomAccessFile.close();
        }
        catch (IOException localIOException2) {
        }
        localRandomAccessFile = null;
      }
      this.out = new FileOutputStream(paramFile);
    }
    this.mmR = localRandomAccessFile;
  }

  public boolean aPG()
  {
    return this.mmR != null;
  }

  public void setEncoding(String paramString)
  {
    this.encoding = paramString;
    this.lYE = ach.dY(paramString);
    if ((this.mmS) && (!ach.dZ(paramString)))
      this.mmS = false;
  }

  public String getEncoding()
  {
    return this.encoding;
  }

  public void lp(boolean paramBoolean)
  {
    this.mmS = ((paramBoolean) && (ach.dZ(this.encoding)));
  }

  public void a(brb parambrb)
  {
    this.mmU = parambrb;
  }

  public void lq(boolean paramBoolean)
  {
    this.mmT = paramBoolean;
  }

  public void a(aeW paramaeW)
  {
    this.mmW = paramaeW;
  }

  public void finish()
  {
    if (this.finished) {
      throw new IOException("This archive has already been finished");
    }

    if (this.mmI != null) {
      closeEntry();
    }

    this.mmM = this.mmL;
    for (dPL localdPL : this.entries) {
      m(localdPL);
    }
    this.mmN = (this.mmL - this.mmM);
    dsu();
    dst();
    this.mmQ.clear();
    this.entries.clear();
    this.def.end();
    this.finished = true;
  }

  public void closeEntry()
  {
    if (this.finished) {
      throw new IOException("Stream has already been finished");
    }

    if (this.mmI == null) {
      throw new IOException("No current entry to close");
    }

    if (!aFJ.a(this.mmI)) {
      write(EMPTY, 0, 0);
    }

    dss();

    aeW localaeW = p(aFJ.b(this.mmI));
    long l1 = this.mmL - aFJ.c(this.mmI);
    long l2 = this.crc.getValue();
    this.crc.reset();

    boolean bool = a(l1, l2, localaeW);

    if (this.mmR != null) {
      lr(bool);
    }

    l(aFJ.b(this.mmI));
    this.mmI = null;
  }

  private void dss()
  {
    if (aFJ.b(this.mmI).getMethod() == 8) {
      this.def.finish();
      while (!this.def.finished())
        deflate();
    }
  }

  private boolean a(long paramLong1, long paramLong2, aeW paramaeW)
  {
    if (aFJ.b(this.mmI).getMethod() == 8)
    {
      aFJ.b(this.mmI).setSize(aFJ.d(this.mmI));
      aFJ.b(this.mmI).setCompressedSize(paramLong1);
      aFJ.b(this.mmI).setCrc(paramLong2);

      this.def.reset();
    } else if (this.mmR == null) {
      if (aFJ.b(this.mmI).getCrc() != paramLong2) {
        throw new ZipException("bad CRC checksum for entry " + aFJ.b(this.mmI).getName() + ": " + Long.toHexString(aFJ.b(this.mmI).getCrc()) + " instead of " + Long.toHexString(paramLong2));
      }

      if (aFJ.b(this.mmI).getSize() != paramLong1) {
        throw new ZipException("bad size for entry " + aFJ.b(this.mmI).getName() + ": " + aFJ.b(this.mmI).getSize() + " instead of " + paramLong1);
      }

    }
    else
    {
      aFJ.b(this.mmI).setSize(paramLong1);
      aFJ.b(this.mmI).setCompressedSize(paramLong1);
      aFJ.b(this.mmI).setCrc(paramLong2);
    }

    boolean bool = (paramaeW == aeW.cWV) || (aFJ.b(this.mmI).getSize() >= 4294967295L) || (aFJ.b(this.mmI).getCompressedSize() >= 4294967295L);

    if ((bool) && (paramaeW == aeW.cWW)) {
      throw new blz(blz.a(aFJ.b(this.mmI)));
    }

    return bool;
  }

  private void lr(boolean paramBoolean)
  {
    long l = this.mmR.getFilePointer();

    this.mmR.seek(aFJ.e(this.mmI));
    aP(bpr.fS(aFJ.b(this.mmI).getCrc()));
    if ((!o(aFJ.b(this.mmI))) || (!paramBoolean)) {
      aP(bpr.fS(aFJ.b(this.mmI).getCompressedSize()));
      aP(bpr.fS(aFJ.b(this.mmI).getSize()));
    } else {
      aP(bpr.fJQ.getBytes());
      aP(bpr.fJQ.getBytes());
    }

    if (o(aFJ.b(this.mmI)))
    {
      this.mmR.seek(aFJ.e(this.mmI) + 12L + 4L + r(aFJ.b(this.mmI)).limit() + 4L);

      aP(bPi.fS(aFJ.b(this.mmI).getSize()));
      aP(bPi.fS(aFJ.b(this.mmI).getCompressedSize()));

      if (!paramBoolean)
      {
        this.mmR.seek(aFJ.e(this.mmI) - 10L);
        aP(bTM.getBytes(10));

        aFJ.b(this.mmI).c(acw.bRt);

        aFJ.b(this.mmI).dqR();

        if (aFJ.f(this.mmI)) {
          this.mmV = false;
        }
      }
    }
    this.mmR.seek(l);
  }

  public void h(dPL paramdPL)
  {
    if (this.finished) {
      throw new IOException("Stream has already been finished");
    }

    if (this.mmI != null) {
      closeEntry();
    }

    this.mmI = new aFJ(paramdPL, null);
    this.entries.add(aFJ.b(this.mmI));

    i(aFJ.b(this.mmI));

    aeW localaeW = p(aFJ.b(this.mmI));
    b(localaeW);

    if (a(aFJ.b(this.mmI), localaeW))
    {
      acw localacw = n(aFJ.b(this.mmI));

      bPi localbPi = bPi.gVV;
      if ((aFJ.b(this.mmI).getMethod() == 0) && (aFJ.b(this.mmI).getSize() != -1L))
      {
        localbPi = new bPi(aFJ.b(this.mmI).getSize());
      }
      localacw.a(localbPi);
      localacw.b(localbPi);
      aFJ.b(this.mmI).dqR();
    }

    if ((aFJ.b(this.mmI).getMethod() == 8) && (this.mmK)) {
      this.def.setLevel(this.level);
      this.mmK = false;
    }
    k(aFJ.b(this.mmI));
  }

  private void i(dPL paramdPL)
  {
    if (paramdPL.getMethod() == -1) {
      paramdPL.setMethod(this.miL);
    }

    if (paramdPL.getTime() == -1L)
      paramdPL.setTime(System.currentTimeMillis());
  }

  private void b(aeW paramaeW)
  {
    if ((aFJ.b(this.mmI).getMethod() == 0) && (this.mmR == null)) {
      if (aFJ.b(this.mmI).getSize() == -1L) {
        throw new ZipException("uncompressed size is required for STORED method when not writing to a file");
      }

      if (aFJ.b(this.mmI).getCrc() == -1L) {
        throw new ZipException("crc checksum is required for STORED method when not writing to a file");
      }

      aFJ.b(this.mmI).setCompressedSize(aFJ.b(this.mmI).getSize());
    }

    if (((aFJ.b(this.mmI).getSize() >= 4294967295L) || (aFJ.b(this.mmI).getCompressedSize() >= 4294967295L)) && (paramaeW == aeW.cWW))
    {
      throw new blz(blz.a(aFJ.b(this.mmI)));
    }
  }

  private boolean a(dPL paramdPL, aeW paramaeW)
  {
    return (paramaeW == aeW.cWV) || (paramdPL.getSize() >= 4294967295L) || (paramdPL.getCompressedSize() >= 4294967295L) || ((paramdPL.getSize() == -1L) && (this.mmR != null) && (paramaeW != aeW.cWW));
  }

  public void setComment(String paramString)
  {
    this.mmJ = paramString;
  }

  public void setLevel(int paramInt)
  {
    if ((paramInt < -1) || (paramInt > 9))
    {
      throw new IllegalArgumentException("Invalid compression level: " + paramInt);
    }

    this.mmK = (this.level != paramInt);
    this.level = paramInt;
  }

  public void setMethod(int paramInt)
  {
    this.miL = paramInt;
  }

  public boolean j(dPL paramdPL)
  {
    return bom.b(paramdPL);
  }

  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    bom.e(aFJ.b(this.mmI));
    aFJ.a(this.mmI, true);
    if (aFJ.b(this.mmI).getMethod() == 8) {
      n(paramArrayOfByte, paramInt1, paramInt2);
    } else {
      o(paramArrayOfByte, paramInt1, paramInt2);
      this.mmL += paramInt2;
    }
    this.crc.update(paramArrayOfByte, paramInt1, paramInt2);
  }

  private void n(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((paramInt2 > 0) && (!this.def.finished())) {
      aFJ.a(this.mmI, paramInt2);
      if (paramInt2 <= 8192) {
        this.def.setInput(paramArrayOfByte, paramInt1, paramInt2);
        dsv();
      } else {
        int i = paramInt2 / 8192;
        for (int j = 0; j < i; j++) {
          this.def.setInput(paramArrayOfByte, paramInt1 + j * 8192, 8192);

          dsv();
        }
        j = i * 8192;
        if (j < paramInt2) {
          this.def.setInput(paramArrayOfByte, paramInt1 + j, paramInt2 - j);
          dsv();
        }
      }
    }
  }

  public void close()
  {
    if (!this.finished) {
      finish();
    }
    destroy();
  }

  public void flush()
  {
    if (this.out != null)
      this.out.flush();
  }

  protected final void deflate()
  {
    int i = this.def.deflate(this.buf, 0, this.buf.length);
    if (i > 0) {
      o(this.buf, 0, i);
      this.mmL += i;
    }
  }

  protected void k(dPL paramdPL)
  {
    boolean bool = this.lYE.gQ(paramdPL.getName());
    ByteBuffer localByteBuffer = r(paramdPL);

    if (this.mmU != brb.fMn) {
      a(paramdPL, bool, localByteBuffer);
    }

    this.mmQ.put(paramdPL, Long.valueOf(this.mmL));

    aP(mmX);
    this.mmL += 4L;

    int i = paramdPL.getMethod();

    e(i, (!bool) && (this.mmT), o(paramdPL));

    this.mmL += 4L;

    aP(bTM.getBytes(i));
    this.mmL += 2L;

    aP(bom.fK(paramdPL.getTime()));
    this.mmL += 4L;

    aFJ.b(this.mmI, this.mmL);
    if ((i == 8) || (this.mmR != null)) {
      aP(mmP);
      if (o(aFJ.b(this.mmI)))
      {
        aP(bpr.fJQ.getBytes());
        aP(bpr.fJQ.getBytes());
      } else {
        aP(mmP);
        aP(mmP);
      }
    } else {
      aP(bpr.fS(paramdPL.getCrc()));
      arrayOfByte = bpr.fJQ.getBytes();
      if (!o(paramdPL)) {
        arrayOfByte = bpr.fS(paramdPL.getSize());
      }
      aP(arrayOfByte);
      aP(arrayOfByte);
    }

    this.mmL += 12L;

    aP(bTM.getBytes(localByteBuffer.limit()));
    this.mmL += 2L;

    byte[] arrayOfByte = paramdPL.dqS();
    aP(bTM.getBytes(arrayOfByte.length));
    this.mmL += 2L;

    o(localByteBuffer.array(), localByteBuffer.arrayOffset(), localByteBuffer.limit() - localByteBuffer.position());

    this.mmL += localByteBuffer.limit();

    aP(arrayOfByte);
    this.mmL += arrayOfByte.length;

    aFJ.c(this.mmI, this.mmL);
  }

  private void a(dPL paramdPL, boolean paramBoolean, ByteBuffer paramByteBuffer)
  {
    if ((this.mmU == brb.fMm) || (!paramBoolean))
    {
      paramdPL.a(new yW(paramdPL.getName(), paramByteBuffer.array(), paramByteBuffer.arrayOffset(), paramByteBuffer.limit() - paramByteBuffer.position()));
    }

    String str = paramdPL.getComment();
    if ((str != null) && (!"".equals(str)))
    {
      boolean bool = this.lYE.gQ(str);

      if ((this.mmU == brb.fMm) || (!bool))
      {
        ByteBuffer localByteBuffer = q(paramdPL).encode(str);
        paramdPL.a(new afM(str, localByteBuffer.array(), localByteBuffer.arrayOffset(), localByteBuffer.limit() - localByteBuffer.position()));
      }
    }
  }

  protected void l(dPL paramdPL)
  {
    if ((paramdPL.getMethod() != 8) || (this.mmR != null)) {
      return;
    }
    aP(mmY);
    aP(bpr.fS(paramdPL.getCrc()));
    int i = 4;
    if (!o(paramdPL)) {
      aP(bpr.fS(paramdPL.getCompressedSize()));
      aP(bpr.fS(paramdPL.getSize()));
    } else {
      i = 8;
      aP(bPi.fS(paramdPL.getCompressedSize()));
      aP(bPi.fS(paramdPL.getSize()));
    }
    this.mmL += 8 + 2 * i;
  }

  protected void m(dPL paramdPL)
  {
    aP(mmZ);
    this.mmL += 4L;

    long l = ((Long)this.mmQ.get(paramdPL)).longValue();
    boolean bool1 = (o(paramdPL)) || (paramdPL.getCompressedSize() >= 4294967295L) || (paramdPL.getSize() >= 4294967295L) || (l >= 4294967295L);

    if ((bool1) && (this.mmW == aeW.cWW))
    {
      throw new blz("archive's size exceeds the limit of 4GByte.");
    }

    a(paramdPL, l, bool1);

    aP(bTM.getBytes(paramdPL.getPlatform() << 8 | (!this.mmV ? 20 : 45)));

    this.mmL += 2L;

    int i = paramdPL.getMethod();
    boolean bool2 = this.lYE.gQ(paramdPL.getName());
    e(i, (!bool2) && (this.mmT), bool1);

    this.mmL += 4L;

    aP(bTM.getBytes(i));
    this.mmL += 2L;

    aP(bom.fK(paramdPL.getTime()));
    this.mmL += 4L;

    aP(bpr.fS(paramdPL.getCrc()));
    if ((paramdPL.getCompressedSize() >= 4294967295L) || (paramdPL.getSize() >= 4294967295L))
    {
      aP(bpr.fJQ.getBytes());
      aP(bpr.fJQ.getBytes());
    } else {
      aP(bpr.fS(paramdPL.getCompressedSize()));
      aP(bpr.fS(paramdPL.getSize()));
    }

    this.mmL += 12L;

    ByteBuffer localByteBuffer1 = r(paramdPL);

    aP(bTM.getBytes(localByteBuffer1.limit()));
    this.mmL += 2L;

    byte[] arrayOfByte = paramdPL.dqT();
    aP(bTM.getBytes(arrayOfByte.length));
    this.mmL += 2L;

    String str = paramdPL.getComment();
    if (str == null) {
      str = "";
    }

    ByteBuffer localByteBuffer2 = q(paramdPL).encode(str);

    aP(bTM.getBytes(localByteBuffer2.limit()));
    this.mmL += 2L;

    aP(mmO);
    this.mmL += 2L;

    aP(bTM.getBytes(paramdPL.dqL()));
    this.mmL += 2L;

    aP(bpr.fS(paramdPL.dqM()));
    this.mmL += 4L;

    aP(bpr.fS(Math.min(l, 4294967295L)));
    this.mmL += 4L;

    o(localByteBuffer1.array(), localByteBuffer1.arrayOffset(), localByteBuffer1.limit() - localByteBuffer1.position());

    this.mmL += localByteBuffer1.limit();

    aP(arrayOfByte);
    this.mmL += arrayOfByte.length;

    o(localByteBuffer2.array(), localByteBuffer2.arrayOffset(), localByteBuffer2.limit() - localByteBuffer2.position());

    this.mmL += localByteBuffer2.limit();
  }

  private void a(dPL paramdPL, long paramLong, boolean paramBoolean)
  {
    if (paramBoolean) {
      acw localacw = n(paramdPL);
      if ((paramdPL.getCompressedSize() >= 4294967295L) || (paramdPL.getSize() >= 4294967295L))
      {
        localacw.b(new bPi(paramdPL.getCompressedSize()));
        localacw.a(new bPi(paramdPL.getSize()));
      }
      else {
        localacw.b(null);
        localacw.a(null);
      }
      if (paramLong >= 4294967295L) {
        localacw.c(new bPi(paramLong));
      }
      paramdPL.dqR();
    }
  }

  protected void dst()
  {
    aP(mna);

    aP(mmO);
    aP(mmO);

    int i = this.entries.size();
    if ((i > 65535) && (this.mmW == aeW.cWW))
    {
      throw new blz("archive contains more than 65535 entries.");
    }

    if ((this.mmM > 4294967295L) && (this.mmW == aeW.cWW)) {
      throw new blz("archive's size exceeds the limit of 4GByte.");
    }

    byte[] arrayOfByte = bTM.getBytes(Math.min(i, 65535));

    aP(arrayOfByte);
    aP(arrayOfByte);

    aP(bpr.fS(Math.min(this.mmN, 4294967295L)));
    aP(bpr.fS(Math.min(this.mmM, 4294967295L)));

    ByteBuffer localByteBuffer = this.lYE.encode(this.mmJ);
    aP(bTM.getBytes(localByteBuffer.limit()));
    o(localByteBuffer.array(), localByteBuffer.arrayOffset(), localByteBuffer.limit() - localByteBuffer.position());
  }

  protected static bpr b(Date paramDate)
  {
    return bom.b(paramDate);
  }

  protected static byte[] fK(long paramLong)
  {
    return bom.fK(paramLong);
  }

  protected byte[] getBytes(String paramString)
  {
    try
    {
      ByteBuffer localByteBuffer = ach.dY(this.encoding).encode(paramString);

      byte[] arrayOfByte = new byte[localByteBuffer.limit()];
      System.arraycopy(localByteBuffer.array(), localByteBuffer.arrayOffset(), arrayOfByte, 0, arrayOfByte.length);

      return arrayOfByte;
    } catch (IOException localIOException) {
      throw new ZipException("Failed to encode name: " + localIOException.getMessage());
    }
  }

  protected void dsu()
  {
    if (this.mmW == aeW.cWW) {
      return;
    }

    if ((!this.mmV) && ((this.mmM >= 4294967295L) || (this.mmN >= 4294967295L) || (this.entries.size() >= 65535)))
    {
      this.mmV = true;
    }

    if (!this.mmV) {
      return;
    }

    long l = this.mmL;

    aP(mnb);

    aP(bPi.fS(44L));

    aP(bTM.getBytes(45));
    aP(bTM.getBytes(45));

    aP(mmP);
    aP(mmP);

    byte[] arrayOfByte = bPi.fS(this.entries.size());
    aP(arrayOfByte);
    aP(arrayOfByte);

    aP(bPi.fS(this.mmN));
    aP(bPi.fS(this.mmM));

    aP(mnc);

    aP(mmP);

    aP(bPi.fS(l));

    aP(mnd);
  }

  protected final void aP(byte[] paramArrayOfByte)
  {
    o(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  protected final void o(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.mmR != null)
      this.mmR.write(paramArrayOfByte, paramInt1, paramInt2);
    else
      this.out.write(paramArrayOfByte, paramInt1, paramInt2);
  }

  protected static long qu(int paramInt)
  {
    return bom.qu(paramInt);
  }

  private void dsv() {
    while (!this.def.needsInput())
      deflate();
  }

  private void e(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 10;
    Qz localQz = new Qz();
    localQz.bi((this.mmS) || (paramBoolean1));
    if ((paramInt == 8) && (this.mmR == null))
    {
      i = 20;
      localQz.bj(true);
    }
    if (paramBoolean2) {
      i = 45;
    }

    aP(bTM.getBytes(i));

    aP(localQz.encode());
  }

  private acw n(dPL paramdPL)
  {
    if (this.mmI != null) {
      aFJ.b(this.mmI, !this.mmV);
    }
    this.mmV = true;
    acw localacw = (acw)paramdPL.d(acw.bRt);

    if (localacw == null)
    {
      localacw = new acw();
    }

    paramdPL.b(localacw);

    return localacw;
  }

  private boolean o(dPL paramdPL)
  {
    return paramdPL.d(acw.bRt) != null;
  }

  private aeW p(dPL paramdPL)
  {
    if ((this.mmW != aeW.cWX) || (this.mmR != null) || (paramdPL.getMethod() != 8) || (paramdPL.getSize() != -1L))
    {
      return this.mmW;
    }
    return aeW.cWW;
  }

  private dxu q(dPL paramdPL) {
    boolean bool = this.lYE.gQ(paramdPL.getName());
    return (!bool) && (this.mmT) ? ach.cRc : this.lYE;
  }

  private ByteBuffer r(dPL paramdPL)
  {
    return q(paramdPL).encode(paramdPL.getName());
  }

  void destroy()
  {
    if (this.mmR != null) {
      this.mmR.close();
    }
    if (this.out != null)
      this.out.close();
  }
}