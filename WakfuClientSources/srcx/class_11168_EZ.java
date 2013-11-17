import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class EZ extends cwV
  implements Cloneable
{
  private List bMm = new ArrayList();
  private List bMn = new ArrayList();
  private List bMo = new ArrayList();
  private List bMp = new ArrayList();

  public void a(cxK paramcxK)
  {
    if ((!this.bMm.isEmpty()) || (!this.bMn.isEmpty())) {
      throw cuq();
    }
    super.a(paramcxK);
  }

  public void a(EZ paramEZ)
  {
    if (cum()) {
      throw cur();
    }
    String[] arrayOfString1 = paramEZ.f(Ga());
    String[] arrayOfString2 = paramEZ.g(Ga());
    int i;
    if (arrayOfString1 != null) {
      for (i = 0; i < arrayOfString1.length; i++) {
        OA().setName(arrayOfString1[i]);
      }
    }
    if (arrayOfString2 != null)
      for (i = 0; i < arrayOfString2.length; i++)
        OC().setName(arrayOfString2[i]);
  }

  public cMT OA()
  {
    if (cum()) {
      throw cur();
    }
    return f(this.bMm);
  }

  public cMT OB()
  {
    if (cum()) {
      throw cur();
    }
    return f(this.bMo);
  }

  public cMT OC()
  {
    if (cum()) {
      throw cur();
    }
    return f(this.bMn);
  }

  public cMT OD()
  {
    if (cum()) {
      throw cur();
    }
    return f(this.bMp);
  }

  public void bE(String paramString)
  {
    if (cum()) {
      throw cuq();
    }
    if ((paramString != null) && (paramString.length() > 0)) {
      StringTokenizer localStringTokenizer = new StringTokenizer(paramString, ", ", false);
      while (localStringTokenizer.hasMoreTokens())
        OA().setName(localStringTokenizer.nextToken());
    }
  }

  public void bF(String paramString)
  {
    if (cum()) {
      throw cuq();
    }
    if ((paramString != null) && (paramString.length() > 0)) {
      StringTokenizer localStringTokenizer = new StringTokenizer(paramString, ", ", false);
      while (localStringTokenizer.hasMoreTokens())
        OC().setName(localStringTokenizer.nextToken());
    }
  }

  private cMT f(List paramList)
  {
    cMT localcMT = new cMT(this);
    paramList.add(localcMT);
    return localcMT;
  }

  public void u(File paramFile)
  {
    if (cum()) {
      throw cuq();
    }
    OB().setName(paramFile.getAbsolutePath());
  }

  public void v(File paramFile)
  {
    if (cum()) {
      throw cuq();
    }
    OD().setName(paramFile.getAbsolutePath());
  }

  private void a(File paramFile, List paramList, FF paramFF)
  {
    BufferedReader localBufferedReader = null;
    try
    {
      localBufferedReader = new BufferedReader(new FileReader(paramFile));

      String str = localBufferedReader.readLine();
      while (str != null) {
        if (str.length() > 0) {
          str = paramFF.bH(str);
          f(paramList).setName(str);
        }
        str = localBufferedReader.readLine();
      }
    } catch (IOException localIOException) {
      throw new cJ("An error occurred while reading from pattern file: " + paramFile, localIOException);
    }
    finally {
      wh.e(localBufferedReader);
    }
  }

  public void a(EZ paramEZ, FF paramFF)
  {
    if (cum()) {
      throw new cJ("Cannot append to a reference");
    }
    T(paramFF);
    String[] arrayOfString1 = paramEZ.f(paramFF);
    if (arrayOfString1 != null) {
      for (int i = 0; i < arrayOfString1.length; i++) {
        OA().setName(arrayOfString1[i]);
      }
    }
    String[] arrayOfString2 = paramEZ.g(paramFF);
    if (arrayOfString2 != null)
      for (int j = 0; j < arrayOfString2.length; j++)
        OC().setName(arrayOfString2[j]);
  }

  public String[] f(FF paramFF)
  {
    if (cum()) {
      return i(paramFF).f(paramFF);
    }
    T(paramFF);
    j(paramFF);
    return a(this.bMm, paramFF);
  }

  public String[] g(FF paramFF)
  {
    if (cum()) {
      return i(paramFF).g(paramFF);
    }
    T(paramFF);
    j(paramFF);
    return a(this.bMn, paramFF);
  }

  public boolean h(FF paramFF)
  {
    if (cum()) {
      return i(paramFF).h(paramFF);
    }
    T(paramFF);
    return (this.bMo.size() > 0) || (this.bMp.size() > 0) || (this.bMm.size() > 0) || (this.bMn.size() > 0);
  }

  private EZ i(FF paramFF)
  {
    return (EZ)U(paramFF);
  }

  private String[] a(List paramList, FF paramFF)
  {
    if (paramList.size() == 0) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    for (cMT localcMT : paramList) {
      String str = localcMT.X(paramFF);
      if ((str != null) && (str.length() > 0)) {
        localArrayList.add(str);
      }
    }
    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }

  private void j(FF paramFF)
  {
    Iterator localIterator;
    cMT localcMT;
    String str;
    File localFile;
    if (this.bMo.size() > 0) {
      for (localIterator = this.bMo.iterator(); localIterator.hasNext(); ) { localcMT = (cMT)localIterator.next();
        str = localcMT.X(paramFF);
        if (str != null) {
          localFile = paramFF.bO(str);
          if (!localFile.exists()) {
            throw new cJ("Includesfile " + localFile.getAbsolutePath() + " not found.");
          }

          a(localFile, this.bMm, paramFF);
        }
      }
      this.bMo.clear();
    }
    if (this.bMp.size() > 0) {
      for (localIterator = this.bMp.iterator(); localIterator.hasNext(); ) { localcMT = (cMT)localIterator.next();
        str = localcMT.X(paramFF);
        if (str != null) {
          localFile = paramFF.bO(str);
          if (!localFile.exists()) {
            throw new cJ("Excludesfile " + localFile.getAbsolutePath() + " not found.");
          }

          a(localFile, this.bMn, paramFF);
        }
      }
      this.bMp.clear();
    }
  }

  public String toString()
  {
    return "patternSet{ includes: " + this.bMm + " excludes: " + this.bMn + " }";
  }

  public Object clone()
  {
    try
    {
      EZ localEZ = (EZ)super.clone();
      localEZ.bMm = new ArrayList(this.bMm);
      localEZ.bMn = new ArrayList(this.bMn);
      localEZ.bMo = new ArrayList(this.bMo);
      localEZ.bMp = new ArrayList(this.bMp);
      return localEZ;
    } catch (CloneNotSupportedException localCloneNotSupportedException) {
      throw new cJ(localCloneNotSupportedException);
    }
  }

  public void b(EZ paramEZ)
  {
    a(new cza(paramEZ, null));
  }
}