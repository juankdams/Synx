import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;

public class dlW
{
  private FF aIn;
  private File bap;
  private URL ljG;
  private Vector ljH = new Vector();
  private File baq;
  private URL ljI;
  private String ljJ;
  private Locator locator;
  private wZ bar = new wZ();

  private wZ ljK = null;

  private Vector ljL = new Vector();

  private boolean ljM = false;

  private Map ljN = new HashMap();

  private Map ljO = null;

  public dlW(FF paramFF)
  {
    this.aIn = paramFF;
    this.bar.b(paramFF);
    this.bar.setName("");
    this.ljH.addElement(this.bar);
  }

  public void Z(File paramFile)
  {
    this.bap = paramFile;
    if (paramFile != null) {
      this.baq = new File(paramFile.getParent());
      this.bar.a(new aaA(paramFile.getAbsolutePath()));
      try {
        j(wh.Fo().k(paramFile));
      } catch (MalformedURLException localMalformedURLException) {
        throw new cJ(localMalformedURLException);
      }
    } else {
      this.baq = null;
    }
  }

  public void j(URL paramURL)
  {
    this.ljG = paramURL;
    this.ljI = new URL(paramURL, ".");
    if (this.bar.gu() == null)
      this.bar.a(new aaA(paramURL.toString()));
  }

  public File cTG()
  {
    return this.bap;
  }

  public File cTH()
  {
    return this.baq;
  }

  public URL cTI()
  {
    return this.ljG;
  }

  public URL cTJ()
  {
    return this.ljI;
  }

  public FF Ga()
  {
    return this.aIn;
  }

  public String cTK()
  {
    return this.ljJ;
  }

  public void pu(String paramString)
  {
    this.ljJ = paramString;
  }

  public bTW cTL()
  {
    if (this.ljL.size() < 1) {
      return null;
    }
    return (bTW)this.ljL.elementAt(this.ljL.size() - 1);
  }

  public bTW cTM()
  {
    if (this.ljL.size() < 2) {
      return null;
    }
    return (bTW)this.ljL.elementAt(this.ljL.size() - 2);
  }

  public void e(bTW parambTW)
  {
    this.ljL.addElement(parambTW);
  }

  public void cTN()
  {
    if (this.ljL.size() > 0)
      this.ljL.removeElementAt(this.ljL.size() - 1);
  }

  public Vector cTO()
  {
    return this.ljL;
  }

  public void a(wZ paramwZ)
  {
    this.ljH.addElement(paramwZ);
    this.ljK = paramwZ;
  }

  public wZ cTP()
  {
    return this.ljK;
  }

  public wZ cTQ()
  {
    return this.bar;
  }

  public void e(wZ paramwZ)
  {
    this.ljK = paramwZ;
  }

  public void f(wZ paramwZ)
  {
    this.bar = paramwZ;
  }

  public Vector cTR()
  {
    return this.ljH;
  }

  public void a(Object paramObject, Attributes paramAttributes)
  {
    String str = paramAttributes.getValue("id");
    if (str != null)
      this.aIn.f(str, paramObject);
  }

  public Locator getLocator()
  {
    return this.locator;
  }

  public void setLocator(Locator paramLocator)
  {
    this.locator = paramLocator;
  }

  public boolean cTS()
  {
    return this.ljM;
  }

  public void jA(boolean paramBoolean)
  {
    this.ljM = paramBoolean;
  }

  public void startPrefixMapping(String paramString1, String paramString2)
  {
    Object localObject = (List)this.ljN.get(paramString1);
    if (localObject == null) {
      localObject = new ArrayList();
      this.ljN.put(paramString1, localObject);
    }
    ((List)localObject).add(paramString2);
  }

  public void endPrefixMapping(String paramString)
  {
    List localList = (List)this.ljN.get(paramString);
    if ((localList == null) || (localList.size() == 0)) {
      return;
    }
    localList.remove(localList.size() - 1);
  }

  public String pv(String paramString)
  {
    List localList = (List)this.ljN.get(paramString);
    if ((localList == null) || (localList.size() == 0)) {
      return null;
    }
    return (String)localList.get(localList.size() - 1);
  }

  public Map cTT()
  {
    return this.ljO;
  }

  public void s(Map paramMap)
  {
    this.ljO = paramMap;
  }
}