import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class aQS extends aGK
{
  private final String bdi;
  private String eNE = "";
  private String eNF;
  private Object eNG;
  private List children = null;

  private boolean eNH = false;

  public aQS(String paramString)
  {
    this.bdi = paramString;
  }

  public List getChildren()
  {
    return this.children;
  }

  public String getTag()
  {
    return this.bdi;
  }

  public String getNamespace()
  {
    return this.eNE;
  }

  public void setNamespace(String paramString)
  {
    if (paramString.equals("ant:current")) {
      aXW localaXW = aXW.v(Ga());

      paramString = localaXW.bnn();
    }
    this.eNE = (paramString == null ? "" : paramString);
  }

  public String getQName()
  {
    return this.eNF;
  }

  public void hc(String paramString)
  {
    this.eNF = paramString;
  }

  public bTW aSQ()
  {
    return super.aSQ();
  }

  public void aSK()
  {
    if (this.eNG != null) {
      return;
    }
    ar(a(this, aSQ()));
  }

  public void ar(Object paramObject)
  {
    if (paramObject == null) {
      return;
    }
    this.eNG = paramObject;

    aSQ().aD(this.eNG);
    aGK localaGK = null;
    if ((this.eNG instanceof aGK)) {
      localaGK = (aGK)this.eNG;

      localaGK.b(aSQ());

      if (aSQ().getId() != null) {
        aSH().a(this, (aGK)this.eNG);
      }

    }

    if (localaGK != null)
      localaGK.aSK();
    else {
      aSQ().N(Ga());
    }

    a(this.eNG, aSQ());
  }

  protected void gv(String paramString)
  {
    if ((this.eNG instanceof aGK))
      ((aGK)this.eNG).gv(paramString);
    else
      super.gv(paramString);
  }

  protected int g(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((this.eNG instanceof aGK)) {
      return ((aGK)this.eNG).g(paramArrayOfByte, paramInt1, paramInt2);
    }
    return super.g(paramArrayOfByte, paramInt1, paramInt2);
  }

  protected void gw(String paramString)
  {
    if ((this.eNG instanceof aGK))
      ((aGK)this.eNG).gw(paramString);
    else
      super.gw(paramString);
  }

  protected void gx(String paramString)
  {
    if ((this.eNG instanceof aGK))
      ((aGK)this.eNG).gx(paramString);
    else
      super.gx(paramString);
  }

  protected void gy(String paramString)
  {
    if ((this.eNG instanceof aGK))
      ((aGK)this.eNG).gy(paramString);
    else
      super.gy(paramString);
  }

  public void execute()
  {
    if (this.eNG == null)
    {
      return;
    }
    try {
      if ((this.eNG instanceof aGK)) {
        ((aGK)this.eNG).execute();
      }

    }
    finally
    {
      if (aSQ().getId() == null) {
        this.eNG = null;
        aSQ().aD(null);
      }
    }
  }

  public void a(aQS paramaQS)
  {
    if (this.children == null) {
      this.children = new ArrayList();
    }
    this.children.add(paramaQS);
  }

  protected void a(Object paramObject, bTW parambTW)
  {
    if ((paramObject instanceof bew)) {
      paramObject = ((bew)paramObject).bsm();
    }

    String str = getNamespace();
    Class localClass = paramObject.getClass();
    wE localwE = wE.a(Ga(), localClass);

    if (this.children != null) {
      Iterator localIterator = this.children.iterator();
      for (int i = 0; localIterator.hasNext(); i++) {
        bTW localbTW = parambTW.ud(i);
        aQS localaQS = (aQS)localIterator.next();
        try {
          if ((localbTW.c(localaQS)) || 
            (!localwE.k(str, dhB.bg(localaQS.getNamespace(), localaQS.getTag()))))
          {
            if (!a(str, localwE, paramObject, localaQS, localbTW))
            {
              if (!(paramObject instanceof aFO)) {
                localwE.b(Ga(), paramObject, localaQS.getTag());
              }
              else
              {
                aFO localaFO = (aFO)paramObject;
                localaFO.a(localaQS);
              }
            }
          }
        } catch (dVt localdVt) { throw new cJ(parambTW.cag() + " doesn't support the nested \"" + localdVt.getElement() + "\" element.", localdVt); }

      }
    }
  }

  protected String bhp()
  {
    return dhB.bg(getNamespace(), getTag());
  }

  public void b(aQS paramaQS)
  {
    if (this.eNH) {
      return;
    }

    aSQ().d(paramaQS.aSQ());
    if (paramaQS.children != null) {
      ArrayList localArrayList = new ArrayList();
      localArrayList.addAll(paramaQS.children);
      if (this.children != null) {
        localArrayList.addAll(this.children);
      }
      this.children = localArrayList;
    }
    this.eNH = true;
  }

  protected Object a(aQS paramaQS, bTW parambTW)
  {
    if (!parambTW.c(paramaQS)) {
      return null;
    }
    aXW localaXW = aXW.v(Ga());

    String str = paramaQS.bhp();
    Object localObject = localaXW.a(paramaQS, paramaQS.getNamespace(), str);
    if (localObject == null) {
      throw M("task or type", str);
    }
    if ((localObject instanceof bBD)) {
      bBD localbBD = (bBD)localObject;
      localObject = localbBD.M(paramaQS.Ga());
      if (localObject == null) {
        throw M("preset " + str, localbBD.bKK().bhp());
      }

      paramaQS.b(localbBD.bKK());
      if ((localObject instanceof aGK)) {
        aGK localaGK = (aGK)localObject;
        localaGK.gu(paramaQS.aSP());
        localaGK.dt(paramaQS.aSI());
        localaGK.init();
      }
    }
    if ((localObject instanceof aQS)) {
      localObject = ((aQS)localObject).a((aQS)localObject, parambTW);
    }
    if ((localObject instanceof aGK)) {
      ((aGK)localObject).d(aSH());
    }
    if ((localObject instanceof dwE)) {
      ((dwE)localObject).a(gu());
    }
    return localObject;
  }

  protected aGK b(aQS paramaQS, bTW parambTW)
  {
    aGK localaGK = Ga().bL(paramaQS.getTag());

    if (localaGK != null) {
      localaGK.a(gu());

      localaGK.d(aSH());
      localaGK.init();
    }
    return localaGK;
  }

  protected cJ M(String paramString1, String paramString2)
  {
    aXW localaXW = aXW.v(Ga());
    String str = localaXW.P(paramString2, paramString1);
    return new cJ(str, gu());
  }

  public String aSI()
  {
    return (this.eNG == null) || (!(this.eNG instanceof aGK)) ? super.aSI() : ((aGK)this.eNG).aSI();
  }

  public aGK anB()
  {
    if ((this.eNG instanceof aGK)) {
      return (aGK)this.eNG;
    }
    return null;
  }

  public Object bhq()
  {
    return this.eNG;
  }

  public void as(Object paramObject)
  {
    this.eNG = paramObject;
  }

  private boolean a(String paramString, wE paramwE, Object paramObject, aQS paramaQS, bTW parambTW)
  {
    String str = dhB.bg(paramaQS.getNamespace(), paramaQS.getTag());

    if (paramwE.a(paramString, str, Ga(), paramObject))
    {
      aAK localaAK = null;
      try {
        localaAK = paramwE.b(Ga(), paramString, paramObject, str, paramaQS);
      }
      catch (dVt localdVt) {
        if (!paramwE.isDynamic()) {
          throw localdVt;
        }

        return false;
      }
      localaAK.ga(parambTW.cab());
      Object localObject1 = localaAK.create();
      Object localObject2;
      if ((localObject1 instanceof bBD)) {
        localObject2 = (bBD)localObject1;

        localObject1 = localaAK.aMC();
        paramaQS.b(((bBD)localObject2).bKK());
      }
      parambTW.a(localaAK);
      parambTW.aD(localObject1);
      if ((localObject1 instanceof aGK)) {
        localObject2 = (aGK)localObject1;
        ((aGK)localObject2).b(parambTW);
        ((aGK)localObject2).dt(str);
        ((aGK)localObject2).gu(str);
      }
      if ((localObject1 instanceof dwE)) {
        ((dwE)localObject1).a(paramaQS.gu());
      }
      parambTW.N(Ga());
      paramaQS.a(localObject1, parambTW);
      localaAK.store();
      return true;
    }
    return false;
  }

  public boolean at(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (!getClass().getName().equals(paramObject.getClass().getName())) {
      return false;
    }
    aQS localaQS1 = (aQS)paramObject;

    if (!N(this.bdi, localaQS1.bdi)) {
      return false;
    }
    if (!this.eNE.equals(localaQS1.eNE)) {
      return false;
    }
    if (!this.eNF.equals(localaQS1.eNF)) {
      return false;
    }

    if (!aSQ().cac().equals(localaQS1.aSQ().cac()))
    {
      return false;
    }

    if (!aSQ().caf().toString().equals(localaQS1.aSQ().caf().toString()))
    {
      return false;
    }

    int i = this.children == null ? 0 : this.children.size();
    if (i == 0) {
      return (localaQS1.children == null) || (localaQS1.children.size() == 0);
    }
    if (localaQS1.children == null) {
      return false;
    }
    if (i != localaQS1.children.size()) {
      return false;
    }
    for (int j = 0; j < i; j++) {
      aQS localaQS2 = (aQS)this.children.get(j);
      if (!localaQS2.at(localaQS1.children.get(j))) {
        return false;
      }
    }
    return true;
  }

  private static boolean N(String paramString1, String paramString2) {
    return paramString1 == null ? false : paramString2 == null ? true : paramString1.equals(paramString2);
  }

  public aQS u(FF paramFF)
  {
    aQS localaQS1 = new aQS(getTag());
    localaQS1.setNamespace(getNamespace());
    localaQS1.b(paramFF);
    localaQS1.hc(getQName());
    localaQS1.gu(aSP());
    localaQS1.dt(aSI());
    localaQS1.a(gu());
    if (aSH() == null) {
      localObject1 = new wZ();
      ((wZ)localObject1).b(Ga());
      localaQS1.d((wZ)localObject1);
    } else {
      localaQS1.d(aSH());
    }
    Object localObject1 = new bTW(localaQS1, aSI());

    ((bTW)localObject1).ga(aSQ().cab());
    Hashtable localHashtable = aSQ().cac();
    for (Object localObject2 = localHashtable.entrySet().iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (Map.Entry)((Iterator)localObject2).next();
      ((bTW)localObject1).setAttribute((String)((Map.Entry)localObject3).getKey(), (String)((Map.Entry)localObject3).getValue());
    }
    Object localObject3;
    ((bTW)localObject1).addText(aSQ().caf().toString());

    for (localObject2 = aSQ().cae(); ((Enumeration)localObject2).hasMoreElements(); ) {
      localObject3 = (bTW)((Enumeration)localObject2).nextElement();
      aQS localaQS2 = (aQS)((bTW)localObject3).bsm();
      aQS localaQS3 = localaQS2.u(paramFF);
      ((bTW)localObject1).c(localaQS3.aSQ());
      localaQS1.a(localaQS3);
    }
    return localaQS1;
  }
}