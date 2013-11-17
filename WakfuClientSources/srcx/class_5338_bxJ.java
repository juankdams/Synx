import java.io.File;
import java.util.Iterator;

public class bxJ
  implements Ae
{
  private String[] giQ;

  public bxJ(aoo paramaoo)
  {
  }

  public void E(File paramFile)
  {
    this.giQ = new String[] { aoo.eP(paramFile.getAbsolutePath()) };
  }

  public void setPath(String paramString)
  {
    this.giQ = aoo.b(this.giR.Ga(), paramString);
  }

  public String[] bEZ()
  {
    return this.giQ;
  }

  public Iterator iterator()
  {
    return new CJ(this.giR.Ga(), null, this.giQ);
  }

  public boolean Jm()
  {
    return true;
  }

  public int size()
  {
    return this.giQ == null ? 0 : this.giQ.length;
  }
}