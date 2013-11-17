import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import org.apache.log4j.Logger;

public abstract class dPs
  implements dej
{
  public static final Logger K = Logger.getLogger(dPs.class);

  protected final bLb mgU = new baL(this, null);
  private String SK;
  private final HashMap mgV = new HashMap();
  private long mgW;
  private long mgX;
  private long mgY;
  private long mgZ;
  private boolean mha;

  protected dPs(long paramLong, boolean paramBoolean)
  {
    this.mgX = paramLong;
    this.mha = paramBoolean;
  }

  public abstract String getExtension();

  public abstract FilenameFilter getFilenameFilter();

  protected abstract bLb ai(byte[] paramArrayOfByte);

  private bLb rK(String paramString)
  {
    if ((!bB) && (this.SK == null)) throw new AssertionError();
    if ((!bB) && (paramString == null)) throw new AssertionError();

    String str = this.SK + paramString;
    byte[] arrayOfByte = readFile(str);
    bLb localbLb;
    if (arrayOfByte.length == 0) {
      K.error("Impossible d'ouvrir un stream pour le fichier " + str);
      localbLb = this.mgU;
    } else {
      localbLb = ai(arrayOfByte);
      this.mgW += localbLb.asH();
      dqB();
      if ((!bB) && (this.mgW < 0L)) throw new AssertionError();
    }
    if (this.mha) {
      this.mgV.put(paramString, localbLb);
    }
    return localbLb;
  }

  private static byte[] readFile(String paramString) {
    byte[] arrayOfByte;
    try {
      arrayOfByte = dtb.readFile(paramString);
    } catch (IOException localIOException) {
      K.error("", localIOException);
      arrayOfByte = bPR.EMPTY_BYTE_ARRAY;
    }
    return arrayOfByte;
  }

  private void dqB()
  {
    Iterator localIterator = this.mgV.values().iterator();

    for (; (localIterator.hasNext()) && (this.mgX < this.mgW) && (!this.mgV.isEmpty()); 
      throw new AssertionError()) { bLb localbLb = (bLb)localIterator.next();
      this.mgW -= localbLb.asH();
      localIterator.remove();
      this.mgY += 1L;
      if ((bB) || ((this.mgV.isEmpty()) && (this.mgW == 0L)) || ((!this.mgV.isEmpty()) && (this.mgW > 0L))); }
  }
  public final Object getData(String paramString) { if ((!bB) && (paramString == null)) throw new AssertionError();
    bLb localbLb = this.mha ? (bLb)this.mgV.get(paramString) : null;
    if (localbLb == null) {
      localbLb = rK(paramString);
      this.mgZ += 1L;
    }
    return localbLb.get(); }

  public final void kO(long paramLong)
  {
    this.mgX = paramLong;
  }

  public boolean dqC() {
    return this.mha;
  }

  public final void kP(long paramLong) {
    this.mha = true;
    kO(paramLong);
  }

  public final String getPath() {
    return this.SK;
  }

  public final void setPath(String paramString) {
    if ((!bB) && (paramString == null)) throw new AssertionError();
    this.SK = paramString;
  }

  public void dqD()
  {
    h(9223372036854775807L, 1.0F);
    kO(this.mgW);
  }

  public void of() {
    this.mgV.clear();
  }

  public void h(long paramLong, float paramFloat)
  {
    kO(paramLong);

    if ((!bB) && (this.SK == null)) throw new AssertionError();

    paramLong = (int)((float)this.mgX * paramFloat);
    try
    {
      URL localURL = new URL(this.SK);
      Object localObject1;
      Object localObject2;
      if (localURL.getProtocol().equals("file")) {
        localObject1 = new File(localURL.getPath() + File.separator);
        localObject2 = ((File)localObject1).list(getFilenameFilter());
        for (int i = 0; (i < localObject2.length) && (this.mgW < paramLong); i++) {
          rK(localObject2[i]);
        }

      }
      else if (localURL.getProtocol().equals("jar")) {
        localObject1 = null;
        try {
          localObject1 = new JarFile(localURL.getPath());

          localObject2 = ((JarFile)localObject1).entries();

          while ((((Enumeration)localObject2).hasMoreElements()) && (this.mgW < paramLong)) {
            localObject3 = ((JarEntry)((Enumeration)localObject2).nextElement()).getName();
            if (((String)localObject3).endsWith(getExtension()))
              rK((String)localObject3);
          }
        }
        catch (Exception localException2) {
          K.error("Exception", localException2);
        }
        if (localObject1 != null)
          ((JarFile)localObject1).close();
      }
    }
    catch (Exception localException1)
    {
      Object localObject3;
      K.error("Impossible de précharger le contenu de " + this.SK + " depuis une URL(tentative depuis un fichier");
      try {
        File localFile = new File(this.SK + File.separator);
        localObject3 = localFile.list(getFilenameFilter());
        for (int j = 0; (j < localObject3.length) && (this.mgW < paramLong); j++)
          rK(localObject3[j]);
      }
      catch (Exception localException3) {
        K.error("Exception", localException3);
      }
    }
    K.info("PRELOAD " + this);
  }

  public void a(dOU paramdOU)
  {
  }

  public void oY(String paramString) {
  }

  public void be(String paramString1, String paramString2) {
  }

  public void oX(String paramString) {
  }

  public void b(dOU paramdOU) {
  }

  public String toString() {
    return getClass().getSimpleName() + ": cacheSize=" + this.mgV.size() + "\t size=" + this.mgW + "octets/ " + this.mgX + " missCache=" + this.mgZ + " notEnoughSize=" + this.mgY;
  }
}