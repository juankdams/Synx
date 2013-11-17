import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

public class wZ
  implements aFO
{
  private String name;
  private String boR = "";

  private String boS = "";
  private cjq boT;
  private cjq boU;
  private List boV = null;

  private List children = new ArrayList();

  private aaA RX = aaA.cOW;
  private FF aIn;
  private String description = null;

  public wZ()
  {
  }

  public wZ(wZ paramwZ)
  {
    this.name = paramwZ.name;
    this.boR = paramwZ.boR;
    this.boS = paramwZ.boS;
    this.boT = paramwZ.boT;
    this.boU = paramwZ.boU;
    this.boV = paramwZ.boV;
    this.RX = paramwZ.RX;
    this.aIn = paramwZ.aIn;
    this.description = paramwZ.description;

    this.children = paramwZ.children;
  }

  public void b(FF paramFF)
  {
    this.aIn = paramFF;
  }

  public FF Ga()
  {
    return this.aIn;
  }

  public void a(aaA paramaaA)
  {
    this.RX = paramaaA;
  }

  public aaA gu()
  {
    return this.RX;
  }

  public void bg(String paramString)
  {
    for (String str : b(paramString, getName(), "depends"))
      bh(str);
  }

  public static List b(String paramString1, String paramString2, String paramString3)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramString1.length() > 0) {
      StringTokenizer localStringTokenizer = new StringTokenizer(paramString1, ",", true);

      while (localStringTokenizer.hasMoreTokens()) {
        String str = localStringTokenizer.nextToken().trim();

        if (("".equals(str)) || (",".equals(str))) {
          throw new cJ("Syntax Error: " + paramString3 + " attribute of target \"" + paramString2 + "\" contains an empty string.");
        }

        localArrayList.add(str);

        if (localStringTokenizer.hasMoreTokens()) {
          str = localStringTokenizer.nextToken();
          if ((!localStringTokenizer.hasMoreTokens()) || (!",".equals(str))) {
            throw new cJ("Syntax Error: " + paramString3 + " attribute for target \"" + paramString2 + "\" ends with a \",\" " + "character");
          }

        }

      }

    }

    return localArrayList;
  }

  public void setName(String paramString)
  {
    this.name = paramString;
  }

  public String getName()
  {
    return this.name;
  }

  public void a(aGK paramaGK)
  {
    this.children.add(paramaGK);
  }

  public void a(bTW parambTW)
  {
    this.children.add(parambTW);
  }

  public aGK[] Gb()
  {
    ArrayList localArrayList = new ArrayList(this.children.size());
    for (Iterator localIterator = this.children.iterator(); localIterator.hasNext(); ) { Object localObject = localIterator.next();
      if ((localObject instanceof aGK)) {
        localArrayList.add((aGK)localObject);
      }
    }
    return (aGK[])localArrayList.toArray(new aGK[localArrayList.size()]);
  }

  public void bh(String paramString)
  {
    if (this.boV == null) {
      this.boV = new ArrayList(2);
    }
    this.boV.add(paramString);
  }

  public Enumeration Gc()
  {
    return Collections.enumeration(this.boV == null ? Collections.emptyList() : this.boV);
  }

  public boolean bi(String paramString)
  {
    FF localFF = Ga();
    Hashtable localHashtable = localFF == null ? null : localFF.PN();
    return (localFF != null) && (localFF.a(getName(), localHashtable, false).contains(localHashtable.get(paramString)));
  }

  public void L(String paramString)
  {
    this.boR = (paramString == null ? "" : paramString);
    a(new cCa(this, this.boR));
  }

  public String Gd()
  {
    return "".equals(this.boR) ? null : this.boR;
  }

  public void a(cjq paramcjq)
  {
    if (this.boT == null) {
      this.boT = paramcjq;
    } else {
      cdp localcdp = new cdp();
      localcdp.b(Ga());
      localcdp.a(gu());
      localcdp.c(this.boT);
      localcdp.c(paramcjq);
      this.boT = localcdp;
    }
  }

  public void M(String paramString)
  {
    this.boS = (paramString == null ? "" : paramString);
    b(new cRU(this, this.boS));
  }

  public String Ge()
  {
    return "".equals(this.boS) ? null : this.boS;
  }

  public void b(cjq paramcjq)
  {
    if (this.boU == null) {
      this.boU = paramcjq;
    } else {
      aCs localaCs = new aCs();
      localaCs.b(Ga());
      localaCs.a(gu());
      localaCs.c(this.boU);
      localaCs.c(paramcjq);
      this.boU = localaCs;
    }
  }

  public void setDescription(String paramString)
  {
    this.description = paramString;
  }

  public String getDescription()
  {
    return this.description;
  }

  public String toString()
  {
    return this.name;
  }

  public void execute()
  {
    if ((this.boT != null) && (!this.boT.gh())) {
      this.aIn.a(this, "Skipped because property '" + this.aIn.bH(this.boR) + "' not set.", 3);

      return;
    }
    if ((this.boU != null) && (this.boU.gh())) {
      this.aIn.a(this, "Skipped because property '" + this.aIn.bH(this.boS) + "' set.", 3);

      return;
    }
    cWU localcWU = cWU.Z(Ga());
    localcWU.cDP();
    try
    {
      for (int i = 0; i < this.children.size(); i++) {
        Object localObject1 = this.children.get(i);
        if ((localObject1 instanceof aGK)) {
          aGK localaGK = (aGK)localObject1;
          localaGK.perform();
        } else {
          ((bTW)localObject1).N(this.aIn);
        }
      }
    } finally {
      localcWU.cDQ();
    }
  }

  public final void Gf()
  {
    Object localObject1 = null;
    this.aIn.c(this);
    try {
      execute();
    } catch (RuntimeException localRuntimeException) {
      localObject1 = localRuntimeException;
      throw localRuntimeException;
    } finally {
      this.aIn.a(this, (Throwable)localObject1);
    }
  }

  void a(aGK paramaGK, bTW parambTW)
  {
    int i;
    while ((i = this.children.indexOf(paramaGK)) >= 0)
      this.children.set(i, parambTW);
  }

  void a(aGK paramaGK1, aGK paramaGK2)
  {
    int i;
    while ((i = this.children.indexOf(paramaGK1)) >= 0)
      this.children.set(i, paramaGK2);
  }
}