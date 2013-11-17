import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class WO extends bFe
  implements aQE, ayr, bnA, dmo
{
  private static final wh aIk = wh.Fo();
  private static final int cGF = bFe.aj("null file".getBytes());
  private File cGG;
  private File bNx;

  public WO()
  {
  }

  public WO(File paramFile, String paramString)
  {
    this.bNx = paramFile;
    this.cGG = aIk.e(paramFile, paramString);
  }

  public WO(File paramFile)
  {
    C(paramFile);
  }

  public WO(FF paramFF, File paramFile)
  {
    this(paramFile);
    b(paramFF);
  }

  public WO(FF paramFF, String paramString)
  {
    this(paramFF, paramFF.bO(paramString));
  }

  public void C(File paramFile)
  {
    cuu();
    this.cGG = paramFile;
    if ((paramFile != null) && ((PE() == null) || (!aIk.d(PE(), paramFile))))
      w(paramFile.getParentFile());
  }

  public File getFile()
  {
    if (cum()) {
      return ((WO)cup()).getFile();
    }
    cuo();
    synchronized (this) {
      if (this.cGG == null)
      {
        File localFile = PE();
        String str = super.getName();
        if (str != null) {
          C(aIk.e(localFile, str));
        }
      }
    }
    return this.cGG;
  }

  public void w(File paramFile)
  {
    cuu();
    this.bNx = paramFile;
  }

  public File PE()
  {
    if (cum()) {
      return ((WO)cup()).PE();
    }
    cuo();
    return this.bNx;
  }

  public void a(cxK paramcxK)
  {
    if ((this.cGG != null) || (this.bNx != null)) {
      throw cuq();
    }
    super.a(paramcxK);
  }

  public String getName()
  {
    if (cum()) {
      return ((bFe)cup()).getName();
    }
    File localFile = PE();
    return localFile == null ? ajd().getName() : aIk.c(localFile, ajd());
  }

  public boolean TY()
  {
    return cum() ? ((bFe)cup()).TY() : ajd().exists();
  }

  public long getLastModified()
  {
    return cum() ? ((bFe)cup()).getLastModified() : ajd().lastModified();
  }

  public boolean isDirectory()
  {
    return cum() ? ((bFe)cup()).isDirectory() : ajd().isDirectory();
  }

  public long getSize()
  {
    return cum() ? ((bFe)cup()).getSize() : ajd().length();
  }

  public InputStream getInputStream()
  {
    return cum() ? ((bFe)cup()).getInputStream() : new FileInputStream(ajd());
  }

  public OutputStream getOutputStream()
  {
    if (cum()) {
      return ((WO)cup()).getOutputStream();
    }
    return bA(false);
  }

  public OutputStream ajc()
  {
    if (cum()) {
      return ((WO)cup()).ajc();
    }
    return bA(true);
  }

  private OutputStream bA(boolean paramBoolean) {
    File localFile1 = ajd();
    if (localFile1.exists()) {
      if ((localFile1.isFile()) && (!paramBoolean))
        localFile1.delete();
    }
    else {
      File localFile2 = localFile1.getParentFile();
      if ((localFile2 != null) && (!localFile2.exists())) {
        localFile2.mkdirs();
      }
    }
    return paramBoolean ? new FileOutputStream(localFile1.getAbsolutePath(), true) : new FileOutputStream(localFile1);
  }

  public int b(bFe parambFe)
  {
    if (cum()) {
      return ((bFe)cup()).b(parambFe);
    }
    if (equals(parambFe)) {
      return 0;
    }
    dmo localdmo = (dmo)parambFe.G(dmo.class);
    if (localdmo != null) {
      File localFile1 = getFile();
      if (localFile1 == null) {
        return -1;
      }
      File localFile2 = localdmo.getFile();
      if (localFile2 == null) {
        return 1;
      }
      return localFile1.compareTo(localFile2);
    }
    return super.b(parambFe);
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (cum()) {
      return cup().equals(paramObject);
    }
    if (!paramObject.getClass().equals(getClass())) {
      return false;
    }
    WO localWO = (WO)paramObject;
    return getFile() == null ? false : localWO.getFile() == null ? true : getFile().equals(localWO.getFile());
  }

  public int hashCode()
  {
    if (cum()) {
      return cup().hashCode();
    }
    return gAf * (getFile() == null ? cGF : getFile().hashCode());
  }

  public String toString()
  {
    if (cum()) {
      return cup().toString();
    }
    if (this.cGG == null) {
      return "(unbound file resource)";
    }
    String str = this.cGG.getAbsolutePath();
    return aIk.aS(str).getAbsolutePath();
  }

  public boolean Jm()
  {
    if (cum()) {
      return ((WO)cup()).Jm();
    }
    cuo();
    return true;
  }

  public void ce(long paramLong)
  {
    if (cum()) {
      ((WO)cup()).ce(paramLong);
      return;
    }
    if (!ajd().setLastModified(paramLong))
      d("Failed to change file modification time", 1);
  }

  protected File ajd()
  {
    if (getFile() == null) {
      throw new cJ("file attribute is null!");
    }
    cuo();
    return getFile();
  }

  public bFe bS(String paramString)
  {
    File localFile = aIk.e(getFile(), paramString);
    WO localWO = new WO(localFile);
    if (aIk.d(PE(), localFile)) {
      localWO.w(PE());
    }
    return localWO;
  }
}