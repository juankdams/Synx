import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dnE extends blM
{
  private dGB lnD;
  private String name;
  private boolean lnE;
  private List attributes;
  private Map lnF;
  private String lnG;
  private dMS lnH;
  private boolean lnI;

  public dnE()
  {
    this.lnE = true;
    this.attributes = new ArrayList();
    this.lnF = new HashMap();
    this.lnG = null;
    this.lnH = null;
    this.lnI = false;
  }

  public void setName(String paramString)
  {
    this.name = paramString;
  }

  public void a(dMS paramdMS)
  {
    if (this.lnH != null) {
      throw new cJ("Only one nested text element allowed");
    }

    if (paramdMS.getName() == null) {
      throw new cJ("the text nested element needed a \"name\" attribute");
    }

    for (bxN localbxN : this.attributes) {
      if (paramdMS.getName().equals(localbxN.getName())) {
        throw new cJ("the name \"" + paramdMS.getName() + "\" is already used as an attribute");
      }

    }

    this.lnH = paramdMS;
    this.lnG = paramdMS.getName();
  }

  public dMS cVi()
  {
    return this.lnH;
  }

  public void jG(boolean paramBoolean)
  {
    this.lnE = paramBoolean;
  }

  public boolean cVj()
  {
    return this.lnE;
  }

  public dGB cVk()
  {
    if (this.lnD != null) {
      throw new cJ("Only one sequential allowed");
    }
    this.lnD = new dGB();
    return this.lnD;
  }

  public aQS cVl()
  {
    aQS localaQS1 = new aQS("sequential");
    localaQS1.dt("sequential");
    localaQS1.setNamespace("");
    localaQS1.hc("sequential");
    new bTW(localaQS1, "sequential");
    int i = this.lnD.bqe().size();
    for (int j = 0; j < i; j++) {
      aQS localaQS2 = (aQS)this.lnD.bqe().get(j);

      localaQS1.a(localaQS2);
      localaQS1.aSQ().c(localaQS2.aSQ());
    }
    return localaQS1;
  }

  public List getAttributes()
  {
    return this.attributes;
  }

  public Map cVm()
  {
    return this.lnF;
  }

  public static boolean W(char paramChar)
  {
    return (Character.isLetterOrDigit(paramChar)) || (paramChar == '.') || (paramChar == '-');
  }

  private static boolean isValidName(String paramString)
  {
    if (paramString.length() == 0) {
      return false;
    }
    for (int i = 0; i < paramString.length(); i++) {
      if (!W(paramString.charAt(i))) {
        return false;
      }
    }
    return true;
  }

  public void a(bxN parambxN)
  {
    if (parambxN.getName() == null) {
      throw new cJ("the attribute nested element needed a \"name\" attribute");
    }

    if (parambxN.getName().equals(this.lnG)) {
      throw new cJ("the name \"" + parambxN.getName() + "\" has already been used by the text element");
    }

    int i = this.attributes.size();
    for (int j = 0; j < i; j++) {
      bxN localbxN = (bxN)this.attributes.get(j);
      if (localbxN.getName().equals(parambxN.getName())) {
        throw new cJ("the name \"" + parambxN.getName() + "\" has already been used in " + "another attribute element");
      }

    }

    this.attributes.add(parambxN);
  }

  public void a(cVq paramcVq)
  {
    if (paramcVq.getName() == null) {
      throw new cJ("the element nested element needed a \"name\" attribute");
    }

    if (this.lnF.get(paramcVq.getName()) != null) {
      throw new cJ("the element " + paramcVq.getName() + " has already been specified");
    }

    if ((this.lnI) || ((paramcVq.cKd()) && (this.lnF.size() != 0)))
    {
      throw new cJ("Only one element allowed when using implicit elements");
    }

    this.lnI = paramcVq.cKd();
    this.lnF.put(paramcVq.getName(), paramcVq);
  }

  public void execute()
  {
    if (this.lnD == null) {
      throw new cJ("Missing sequential element");
    }
    if (this.name == null) {
      throw new cJ("Name not specified");
    }

    this.name = dhB.bg(getURI(), this.name);

    bav localbav = new bav(this);
    localbav.setName(this.name);
    localbav.R(cmA.class);

    aXW localaXW = aXW.v(Ga());

    localaXW.a(localbav);
    d("creating macro  " + this.name, 3);
  }

  private static boolean w(Object paramObject1, Object paramObject2)
  {
    return paramObject1 == null ? false : paramObject2 == null ? true : paramObject1.equals(paramObject2);
  }

  private boolean d(Object paramObject, boolean paramBoolean)
  {
    if (paramObject == this) {
      return true;
    }

    if (paramObject == null) {
      return false;
    }
    if (!paramObject.getClass().equals(getClass())) {
      return false;
    }
    dnE localdnE = (dnE)paramObject;
    if (this.name == null) {
      return localdnE.name == null;
    }
    if (!this.name.equals(localdnE.name)) {
      return false;
    }

    if ((localdnE.gu() != null) && (localdnE.gu().equals(gu())) && (!paramBoolean))
    {
      return true;
    }
    if (this.lnH == null) {
      if (localdnE.lnH != null) {
        return false;
      }
    }
    else if (!this.lnH.equals(localdnE.lnH)) {
      return false;
    }

    if ((getURI() == null) || (getURI().equals("")) || (getURI().equals("antlib:org.apache.tools.ant")))
    {
      if ((localdnE.getURI() != null) && (!localdnE.getURI().equals("")) && (!localdnE.getURI().equals("antlib:org.apache.tools.ant")))
      {
        return false;
      }
    }
    else if (!getURI().equals(localdnE.getURI())) {
      return false;
    }

    if (!this.lnD.a(localdnE.lnD)) {
      return false;
    }
    if (!this.attributes.equals(localdnE.attributes)) {
      return false;
    }
    if (!this.lnF.equals(localdnE.lnF)) {
      return false;
    }
    return true;
  }

  public boolean at(Object paramObject)
  {
    return d(paramObject, false);
  }

  public boolean bm(Object paramObject)
  {
    return d(paramObject, true);
  }

  private static int bn(Object paramObject)
  {
    if (paramObject == null) {
      return 0;
    }
    return paramObject.hashCode();
  }
}