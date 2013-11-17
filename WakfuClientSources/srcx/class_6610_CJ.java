import java.io.File;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CJ
  implements Iterator
{
  private FF aIn;
  private File bGO;
  private String[] bGP;
  private int pos = 0;

  public CJ()
  {
  }

  public CJ(FF paramFF)
  {
    this.aIn = paramFF;
  }

  public CJ(File paramFile)
  {
    this(null, paramFile);
  }

  public CJ(FF paramFF, File paramFile)
  {
    this(paramFF);
    this.bGO = paramFile;
  }

  public CJ(File paramFile, String[] paramArrayOfString)
  {
    this(null, paramFile, paramArrayOfString);
  }

  public CJ(FF paramFF, File paramFile, String[] paramArrayOfString)
  {
    this(paramFF, paramFile);
    f(paramArrayOfString);
  }

  public void f(String[] paramArrayOfString)
  {
    int i = this.bGP == null ? 0 : this.bGP.length;
    String[] arrayOfString = new String[i + paramArrayOfString.length];
    if (i > 0) {
      System.arraycopy(this.bGP, 0, arrayOfString, 0, i);
    }
    this.bGP = arrayOfString;
    System.arraycopy(paramArrayOfString, 0, this.bGP, i, paramArrayOfString.length);
  }

  public boolean hasNext()
  {
    return this.pos < this.bGP.length;
  }

  public bFe Ef()
  {
    return LU();
  }

  public void remove()
  {
    throw new UnsupportedOperationException();
  }

  public WO LU()
  {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    WO localWO = new WO(this.bGO, this.bGP[(this.pos++)]);
    localWO.b(this.aIn);
    return localWO;
  }
}