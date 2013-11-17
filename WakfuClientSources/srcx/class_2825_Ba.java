import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class Ba extends cwV
  implements Ae
{
  private List bwP = new ArrayList();
  private File bwQ;

  public Ba()
  {
  }

  protected Ba(Ba paramBa)
  {
    this.bwQ = paramBa.bwQ;
    this.bwP = paramBa.bwP;
    b(paramBa.Ga());
  }

  public void a(cxK paramcxK)
  {
    if ((this.bwQ != null) || (this.bwP.size() != 0)) {
      throw cuq();
    }
    super.a(paramcxK);
  }

  public void s(File paramFile)
  {
    cuu();
    this.bwQ = paramFile;
  }

  public File c(FF paramFF)
  {
    if (cum()) {
      return e(paramFF).c(paramFF);
    }
    return this.bwQ;
  }

  public void bo(String paramString)
  {
    cuu();
    if ((paramString != null) && (paramString.length() > 0)) {
      StringTokenizer localStringTokenizer = new StringTokenizer(paramString, ", \t\n\r\f", false);

      while (localStringTokenizer.hasMoreTokens())
        this.bwP.add(localStringTokenizer.nextToken());
    }
  }

  public String[] d(FF paramFF)
  {
    if (cum()) {
      return e(paramFF).d(paramFF);
    }

    if (this.bwQ == null) {
      throw new cJ("No directory specified for filelist.");
    }

    if (this.bwP.size() == 0) {
      throw new cJ("No files specified for filelist.");
    }

    return (String[])this.bwP.toArray(new String[this.bwP.size()]);
  }

  protected Ba e(FF paramFF)
  {
    return (Ba)U(paramFF);
  }

  public void a(arL paramarL)
  {
    if (paramarL.getName() == null) {
      throw new cJ("No name specified in nested file element");
    }

    this.bwP.add(paramarL.getName());
  }

  public Iterator iterator()
  {
    if (cum()) {
      return e(Ga()).iterator();
    }
    return new CJ(Ga(), this.bwQ, (String[])this.bwP.toArray(new String[this.bwP.size()]));
  }

  public int size()
  {
    if (cum()) {
      return e(Ga()).size();
    }
    return this.bwP.size();
  }

  public boolean Jm()
  {
    return true;
  }
}