import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

public class dPL extends ZipEntry
  implements Cloneable
{
  public static final int miH = 3;
  public static final int miI = 0;
  private static final int miJ = 65535;
  private static final int miK = 16;
  private static final byte[] EMPTY = new byte[0];

  private int miL = -1;

  private long size = -1L;

  private int miM = 0;
  private int miN = 0;
  private long miO = 0L;
  private LinkedHashMap miP = null;
  private boW miQ = null;
  private String name = null;
  private byte[] miR = null;
  private Qz miS = new Qz();

  public dPL(String paramString)
  {
    super(paramString);
    setName(paramString);
  }

  public dPL(ZipEntry paramZipEntry)
  {
    super(paramZipEntry);
    setName(paramZipEntry.getName());
    byte[] arrayOfByte = paramZipEntry.getExtra();
    if (arrayOfByte != null) {
      c(cEc.a(arrayOfByte, true, vG.bkt));
    }
    else
    {
      dqR();
    }
    setMethod(paramZipEntry.getMethod());
    this.size = paramZipEntry.getSize();
  }

  public dPL(dPL paramdPL)
  {
    this(paramdPL);
    Di(paramdPL.dqL());
    kQ(paramdPL.dqM());
    c(paramdPL.lk(true));
  }

  protected dPL()
  {
    this("");
  }

  public dPL(File paramFile, String paramString)
  {
    this((paramFile.isDirectory()) && (!paramString.endsWith("/")) ? paramString + "/" : paramString);

    if (paramFile.isFile()) {
      setSize(paramFile.length());
    }
    setTime(paramFile.lastModified());
  }

  public Object clone()
  {
    dPL localdPL = (dPL)super.clone();

    localdPL.Di(dqL());
    localdPL.kQ(dqM());
    localdPL.c(lk(true));
    return localdPL;
  }

  public int getMethod()
  {
    return this.miL;
  }

  public void setMethod(int paramInt)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException("ZIP compression method can not be negative: " + paramInt);
    }

    this.miL = paramInt;
  }

  public int dqL()
  {
    return this.miM;
  }

  public void Di(int paramInt)
  {
    this.miM = paramInt;
  }

  public long dqM()
  {
    return this.miO;
  }

  public void kQ(long paramLong)
  {
    this.miO = paramLong;
  }

  public void Dj(int paramInt)
  {
    kQ(paramInt << 16 | ((paramInt & 0x80) == 0 ? 1 : 0) | (isDirectory() ? 16 : 0));

    this.miN = 3;
  }

  public int dqN()
  {
    return this.miN != 3 ? 0 : (int)(dqM() >> 16 & 0xFFFF);
  }

  public int getPlatform()
  {
    return this.miN;
  }

  protected void Dk(int paramInt)
  {
    this.miN = paramInt;
  }

  public void c(bpz[] paramArrayOfbpz)
  {
    this.miP = new LinkedHashMap();
    for (bpz localbpz : paramArrayOfbpz) {
      if ((localbpz instanceof boW))
        this.miQ = ((boW)localbpz);
      else {
        this.miP.put(localbpz.HA(), localbpz);
      }
    }
    dqR();
  }

  public bpz[] dqO()
  {
    return lk(false);
  }

  public bpz[] lk(boolean paramBoolean)
  {
    if (this.miP == null) {
      return new bpz[] { (!paramBoolean) || (this.miQ == null) ? new bpz[0] : this.miQ };
    }

    ArrayList localArrayList = new ArrayList(this.miP.values());

    if ((paramBoolean) && (this.miQ != null)) {
      localArrayList.add(this.miQ);
    }
    return (bpz[])localArrayList.toArray(new bpz[0]);
  }

  public void a(bpz parambpz)
  {
    if ((parambpz instanceof boW)) {
      this.miQ = ((boW)parambpz);
    } else {
      if (this.miP == null) {
        this.miP = new LinkedHashMap();
      }
      this.miP.put(parambpz.HA(), parambpz);
    }
    dqR();
  }

  public void b(bpz parambpz)
  {
    if ((parambpz instanceof boW)) {
      this.miQ = ((boW)parambpz);
    } else {
      LinkedHashMap localLinkedHashMap = this.miP;
      this.miP = new LinkedHashMap();
      this.miP.put(parambpz.HA(), parambpz);
      if (localLinkedHashMap != null) {
        localLinkedHashMap.remove(parambpz.HA());
        this.miP.putAll(localLinkedHashMap);
      }
    }
    dqR();
  }

  public void c(bTM parambTM)
  {
    if (this.miP == null) {
      throw new NoSuchElementException();
    }
    if (this.miP.remove(parambTM) == null) {
      throw new NoSuchElementException();
    }
    dqR();
  }

  public void dqP()
  {
    if (this.miQ == null) {
      throw new NoSuchElementException();
    }
    this.miQ = null;
    dqR();
  }

  public bpz d(bTM parambTM)
  {
    if (this.miP != null) {
      return (bpz)this.miP.get(parambTM);
    }
    return null;
  }

  public boW dqQ()
  {
    return this.miQ;
  }

  public void setExtra(byte[] paramArrayOfByte)
  {
    try
    {
      bpz[] arrayOfbpz = cEc.a(paramArrayOfByte, true, vG.bkt);

      a(arrayOfbpz, true);
    }
    catch (ZipException localZipException) {
      throw new RuntimeException("Error parsing extra fields for entry: " + getName() + " - " + localZipException.getMessage(), localZipException);
    }
  }

  protected void dqR()
  {
    super.setExtra(cEc.a(lk(true)));
  }

  public void aO(byte[] paramArrayOfByte)
  {
    try
    {
      bpz[] arrayOfbpz = cEc.a(paramArrayOfByte, false, vG.bkt);

      a(arrayOfbpz, false);
    } catch (ZipException localZipException) {
      throw new RuntimeException(localZipException.getMessage(), localZipException);
    }
  }

  public byte[] dqS()
  {
    byte[] arrayOfByte = getExtra();
    return arrayOfByte != null ? arrayOfByte : EMPTY;
  }

  public byte[] dqT()
  {
    return cEc.b(lk(true));
  }

  public void kR(long paramLong)
  {
    setCompressedSize(paramLong);
  }

  public String getName()
  {
    return this.name == null ? super.getName() : this.name;
  }

  public boolean isDirectory()
  {
    return getName().endsWith("/");
  }

  protected void setName(String paramString)
  {
    if ((paramString != null) && (getPlatform() == 0) && (paramString.indexOf("/") == -1))
    {
      paramString = paramString.replace('\\', '/');
    }
    this.name = paramString;
  }

  public long getSize()
  {
    return this.size;
  }

  public void setSize(long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("invalid entry size");
    }
    this.size = paramLong;
  }

  protected void d(String paramString, byte[] paramArrayOfByte)
  {
    setName(paramString);
    this.miR = paramArrayOfByte;
  }

  public byte[] dqU()
  {
    if (this.miR != null) {
      byte[] arrayOfByte = new byte[this.miR.length];
      System.arraycopy(this.miR, 0, arrayOfByte, 0, this.miR.length);
      return arrayOfByte;
    }
    return null;
  }

  public int hashCode()
  {
    return getName().hashCode();
  }

  public Qz dqV()
  {
    return this.miS;
  }

  public void a(Qz paramQz)
  {
    this.miS = paramQz;
  }

  private void a(bpz[] paramArrayOfbpz, boolean paramBoolean)
  {
    if (this.miP == null) {
      c(paramArrayOfbpz);
    } else {
      for (bpz localbpz : paramArrayOfbpz)
      {
        Object localObject;
        if ((localbpz instanceof boW))
          localObject = this.miQ;
        else {
          localObject = d(localbpz.HA());
        }
        if (localObject == null) {
          a(localbpz);
        }
        else
        {
          byte[] arrayOfByte;
          if ((paramBoolean) || (!(localObject instanceof crQ)))
          {
            arrayOfByte = localbpz.Oy();
            ((bpz)localObject).b(arrayOfByte, 0, arrayOfByte.length);
          } else {
            arrayOfByte = localbpz.Ow();
            ((crQ)localObject).f(arrayOfByte, 0, arrayOfByte.length);
          }
        }
      }

      dqR();
    }
  }

  public Date dqW()
  {
    return new Date(getTime());
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }
    dPL localdPL = (dPL)paramObject;
    String str1 = getName();
    String str2 = localdPL.getName();
    if (str1 == null) {
      if (str2 != null)
        return false;
    }
    else if (!str1.equals(str2)) {
      return false;
    }
    String str3 = getComment();
    String str4 = localdPL.getComment();
    if (str3 == null) {
      str3 = "";
    }
    if (str4 == null) {
      str4 = "";
    }
    return (getTime() == localdPL.getTime()) && (str3.equals(str4)) && (dqL() == localdPL.dqL()) && (getPlatform() == localdPL.getPlatform()) && (dqM() == localdPL.dqM()) && (getMethod() == localdPL.getMethod()) && (getSize() == localdPL.getSize()) && (getCrc() == localdPL.getCrc()) && (getCompressedSize() == localdPL.getCompressedSize()) && (Arrays.equals(dqT(), localdPL.dqT())) && (Arrays.equals(dqS(), localdPL.dqS())) && (this.miS.equals(localdPL.miS));
  }
}