import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.log4j.Logger;

public final class bbo
  implements aWj
{
  private static final Logger K = Logger.getLogger(bbo.class);

  private static boolean DEBUG = false;
  public static final String fjx = "/";
  private final String m_name;
  private Object aOd = null;
  private boolean drK = false;

  private final List fjy = Collections.synchronizedList(new ArrayList());

  private final ConcurrentLinkedQueue fjz = new ConcurrentLinkedQueue();

  private final ArrayList fjA = new ArrayList();

  private bbo fjB = null;
  private boolean fjC = false;

  private boolean fjD = false;
  private int fjE;
  private String fjF = null;

  private cpa cUY = null;

  private final ArrayList fjG = new ArrayList();
  public static final String fjH = "#";

  public bbo(String paramString, cpa paramcpa)
  {
    this(paramString, paramcpa, false);
  }

  public bbo(String paramString, cpa paramcpa, boolean paramBoolean)
  {
    this.m_name = paramString;
    this.fjC = paramBoolean;
    this.cUY = paramcpa;
    if (this.cUY != null)
      this.cUY.c(this);
  }

  public bbo(String paramString1, bbo parambbo, String paramString2, cpa paramcpa)
  {
    this(paramString1, paramcpa, true);

    this.fjF = paramString2;
    if (parambbo != null)
      parambbo.a(this);
  }

  public bbo(String paramString, bbo parambbo, int paramInt, cpa paramcpa)
  {
    this(paramString, paramcpa, true);

    this.fjB = parambbo;
    this.fjD = true;
    this.fjE = paramInt;
  }

  public String getName()
  {
    return this.m_name;
  }

  public String bpz()
  {
    return this.fjF;
  }

  public void b(cZd paramcZd) {
    this.fjG.add(paramcZd);
  }

  public void c(cZd paramcZd) {
    this.fjG.remove(paramcZd);

    if ((this.fjG.isEmpty()) && (this.fjy.isEmpty()) && (this.fjA.isEmpty()))
      dLE.doY().d(this);
  }

  public void setElementMap(cpa paramcpa)
  {
    this.cUY = paramcpa;
  }

  public boolean isLocal() {
    return this.cUY != null;
  }

  public boolean bpA() {
    return this.drK;
  }

  public cpa getElementMap() {
    return this.cUY;
  }

  public Object getValue()
  {
    return this.aOd;
  }

  public String getString()
  {
    return bUD.getString(this.aOd);
  }

  public boolean getBoolean()
  {
    return bUD.getBoolean(this.aOd);
  }

  public int getInt()
  {
    return bUD.aR(this.aOd);
  }

  public short getShort()
  {
    return bUD.getShort(this.aOd);
  }

  public double getDouble()
  {
    return bUD.getDouble(this.aOd);
  }

  public float getFloat()
  {
    return bUD.getFloat(this.aOd);
  }

  public long getLong()
  {
    return bUD.getLong(this.aOd);
  }

  public boolean isEmpty()
  {
    if ((this.aOd instanceof String))
      return this.aOd.equals("");
    return this.aOd == null;
  }

  public static Object c(Object paramObject, String paramString)
  {
    if (((paramObject instanceof dBv)) && (paramString != null)) {
      Cs localCs = d(paramObject, paramString);

      if (((localCs.getFirst() instanceof dBv)) && (localCs.Lp() != null)) {
        dBv localdBv = (dBv)localCs.getFirst();
        return localdBv.getFieldValue((String)localCs.Lp());
      }

      return null;
    }

    return paramObject;
  }

  public static Cs d(Object paramObject, String paramString)
  {
    Cs localCs = new Cs(paramObject, null);

    String[] arrayOfString = paramString.split("/");

    for (int i = 0; i < arrayOfString.length - 1; i++)
    {
      if (((paramObject instanceof dBv)) && (arrayOfString[i] != null)) {
        paramObject = ((dBv)paramObject).getFieldValue(arrayOfString[i]);
      } else {
        localCs.x(null);
        return localCs;
      }

      localCs.w(paramObject);
    }

    localCs.x(arrayOfString[(arrayOfString.length - 1)]);

    return localCs;
  }

  private Object getValue(String paramString) {
    if (((this.aOd instanceof dBv)) && (paramString != null)) {
      dBv localdBv = (dBv)this.aOd;
      return localdBv.getFieldValue(paramString);
    }

    return this.aOd;
  }

  private Object hJ(String paramString) {
    String[] arrayOfString = paramString.split("/");
    Object localObject = this.aOd;

    for (int i = 0; i < arrayOfString.length; i++) {
      if (((localObject instanceof dBv)) && (arrayOfString[i] != null))
        localObject = ((dBv)localObject).getFieldValue(arrayOfString[i]);
      else {
        return localObject;
      }
    }

    return localObject;
  }

  public Object hK(String paramString) {
    return getValue(paramString);
  }

  public String hL(String paramString) {
    return bUD.getString(getValue(paramString));
  }

  public boolean hM(String paramString) {
    return bUD.getBoolean(getValue(paramString));
  }

  public int hN(String paramString) {
    return bUD.aR(getValue(paramString));
  }

  public long hO(String paramString) {
    return bUD.getLong(getValue(paramString));
  }

  public double hP(String paramString) {
    return bUD.getDouble(getValue(paramString));
  }

  public float hQ(String paramString) {
    return bUD.getFloat(getValue(paramString));
  }

  public void bpB()
  {
    dBv[] arrayOfdBv = null;

    if ((this.aOd instanceof dBv[])) {
      arrayOfdBv = (dBv[])this.aOd;
    }

    int i = 0; for (int j = this.fjA.size(); i < j; i++) {
      bbo localbbo = (bbo)this.fjA.get(i);
      if ((localbbo.fjD) && (arrayOfdBv != null) && (arrayOfdBv.length > localbbo.fjE))
        localbbo.setValue(arrayOfdBv[localbbo.fjE], false);
      else
        localbbo.setValue(hJ(localbbo.bpz()), false);
    }
  }

  public boolean bpC()
  {
    return !this.fjz.isEmpty();
  }

  public void bpD() {
    PE localPE = (PE)this.fjz.poll();
    while (localPE != null) {
      localPE.cid.a(null);
      switch (aol.dsP[localPE.cie.ordinal()]) {
      case 1:
        d(localPE.cid, localPE.aOd);
        break;
      case 2:
        e(localPE.cid, localPE.aOd);
        break;
      case 3:
        f(localPE.cid, localPE.aOd);
      }

      localPE = (PE)this.fjz.poll();
    }
  }

  public void a(dBf paramdBf, boolean paramBoolean) {
    String str = paramdBf.getFieldName().substring(0, paramdBf.getFieldName().indexOf("/"));
    Object localObject = null;
    for (bbo localbbo : this.fjA) {
      if (localbbo.bpz().equalsIgnoreCase(str)) {
        localObject = localbbo;
        break;
      }
    }

    if (localObject == null) {
      localObject = new bbo(a(this, str), this, str, this.cUY);
      ((bbo)localObject).setValue(hK(str), false);
      dLE.doY().c((bbo)localObject);
    }

    paramdBf.qN(paramdBf.getFieldName().substring(paramdBf.getFieldName().indexOf("/") + 1));
    ((bbo)localObject).b(paramdBf, paramBoolean);
  }

  public void a(dBf paramdBf)
  {
    b(paramdBf, true);
  }

  public void b(dBf paramdBf, boolean paramBoolean) {
    if ((paramdBf.getFieldName() != null) && (paramdBf.getFieldName().contains("/"))) {
      a(paramdBf, paramBoolean);
      return;
    }

    if (this.fjy.contains(paramdBf)) {
      K.error("Ajout d'un client à une propriété qui le contient déjà : " + paramdBf);
    } else {
      this.fjy.add(paramdBf);
      ((bdj)paramdBf.getElement()).c(this);
    }

    if (paramdBf.getResultProvider() != null)
      paramdBf.getResultProvider().setResultProviderParent(this);
    Object localObject;
    if (paramdBf.deu()) {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(this.m_name);
      if (paramdBf.getFieldName() != null) {
        ((StringBuilder)localObject).append("/").append(paramdBf.getFieldName());
      }
      ((vn)paramdBf.getElement()).setContentProperty(((StringBuilder)localObject).toString(), this.cUY);
    }

    if (this.drK) {
      localObject = null;
      if (((this.aOd instanceof dBv)) && (paramdBf.getFieldName() != null))
        localObject = ((dBv)this.aOd).getFieldValue(paramdBf.getFieldName());
      else {
        localObject = this.aOd;
      }
      if (paramBoolean) {
        if (paramdBf.getResultProvider() != null) {
          localObject = paramdBf.getResultProvider().getResult(localObject);
        }
        d(paramdBf, localObject);
      } else {
        a(paramdBf, localObject);
      }
    }
  }

  public void ba(bdj parambdj)
  {
    if (parambdj == null) {
      return;
    }

    Iterator localIterator1 = this.fjz.iterator();
    while (localIterator1.hasNext()) {
      if (((PE)localIterator1.next()).cid.getElement() == parambdj) {
        localIterator1.remove();
      }
    }

    ArrayList localArrayList = new ArrayList();
    for (dBf localdBf : this.fjy) {
      if (localdBf.getElement().equals(parambdj)) {
        localArrayList.add(localdBf);
        if (localdBf.deu()) {
          ((vn)localdBf.getElement()).setContentProperty(null, null);
        }
      }
    }
    this.fjy.removeAll(localArrayList);

    parambdj.d(this);

    if ((this.fjC) && (this.fjG.isEmpty()) && (this.fjy.isEmpty()) && (this.fjA.isEmpty())) {
      if (this.fjB != null) {
        this.fjB.b(this);
      }

      dLE.doY().d(this);
    }
  }

  public dBf a(bdj parambdj, String paramString) {
    if (paramString == null) {
      return null;
    }

    for (dBf localdBf : this.fjy) {
      if ((parambdj == localdBf.getElement()) && (paramString.equalsIgnoreCase(localdBf.getAttribute()))) {
        return localdBf;
      }
    }

    return null;
  }

  public void a(bbo parambbo) {
    parambbo.fjB = this;
    this.fjA.add(parambbo);
  }

  public void b(bbo parambbo) {
    this.fjA.remove(parambbo);

    if ((this.fjC) && (this.fjy.isEmpty()) && (this.fjA.isEmpty()) && 
      (this.fjB != null))
      this.fjB.b(this);
  }

  public bbo hR(String paramString)
  {
    if ((!bB) && (paramString == null)) throw new AssertionError("On essaye de récupérer une propriété enfant avec un nom null !");
    for (int i = this.fjA.size() - 1; i >= 0; i--) {
      bbo localbbo = (bbo)this.fjA.get(i);
      if (paramString.equals(localbbo.bpz())) {
        return localbbo;
      }
    }
    return null;
  }

  protected void a(dBf paramdBf, Object paramObject) {
    if (DEBUG) {
      d(paramdBf, paramObject);
    }
    else {
      PE localPE = paramdBf.dez();
      if (localPE != null) {
        if ((localPE.cid == paramdBf) && (localPE.cie != null) && (localPE.cie.equals(cKH.iJr))) {
          if (localPE.cid.getResultProvider() != null)
            localPE.aOd = localPE.cid.getResultProvider().getResult(paramObject);
          else
            localPE.aOd = paramObject;
        }
      }
      else {
        this.fjz.offer(new PE(paramdBf, paramObject, cKH.iJr));
      }
      dLE.doY().g(this);
    }
  }

  protected void b(dBf paramdBf, Object paramObject) {
    if (DEBUG) {
      f(paramdBf, paramObject);
    } else {
      this.fjz.offer(new PE(paramdBf, paramObject, cKH.iJs));
      dLE.doY().g(this);
    }
  }

  protected void c(dBf paramdBf, Object paramObject) {
    if (DEBUG) {
      e(paramdBf, paramObject);
    } else {
      this.fjz.offer(new PE(paramdBf, paramObject, cKH.iJt));
      dLE.doY().g(this);
    }
  }

  private void d(dBf paramdBf, Object paramObject)
  {
    try
    {
      int i = paramdBf.getAttributeHash();
      if (((paramObject instanceof String)) && (duS.fyW != i) && (Sj.crX != i) && (Sj.crY != i))
      {
        if (!((bdj)paramdBf.getElement()).setXMLAttribute(paramdBf.getAttribute(), (String)paramObject));
      }
      else if (((bdj)paramdBf.getElement()).setPropertyAttribute(paramdBf.getAttribute(), paramObject)) {
        return;
      }

      Method localMethod = paramdBf.dev();
      if ((localMethod == null) || (!aFw.a(localMethod, paramObject))) {
        localMethod = paramdBf.det().k(paramdBf.getAttribute(), paramObject == null ? null : paramObject.getClass());
      }
      if (localMethod != null)
        a(localMethod, paramdBf, paramObject);
      else
        K.error("[" + this.m_name + "]Impossible de trouver la méthode set" + paramdBf.getAttribute() + " dans " + paramdBf.getElement() + " avec la classe " + (paramObject == null ? null : paramObject.getClass()));
    }
    catch (Throwable localThrowable)
    {
      K.error("Exception dans Property : ", localThrowable);
    }
  }

  private void e(dBf paramdBf, Object paramObject)
  {
    try
    {
      int i = paramdBf.getAttributeHash();
      if (((paramObject instanceof String)) && (duS.fyW != i) && (Sj.crX != i) && (Sj.crY != i))
      {
        if (!((bdj)paramdBf.getElement()).U(paramdBf.getAttribute(), (String)paramObject));
      }
      else if (((bdj)paramdBf.getElement()).s(paramdBf.getAttribute(), paramObject)) {
        return;
      }

      Method localMethod = paramdBf.dex();
      if (!aFw.a(localMethod, paramObject)) {
        localMethod = paramdBf.det().n(paramdBf.getAttribute(), paramObject == null ? null : paramObject.getClass());
      }
      if (localMethod != null)
        a(localMethod, paramdBf, paramObject);
      else
        K.error("Impossible de trouver la méthode prepend" + paramdBf.getAttribute() + " avec la classe " + (paramObject == null ? null : paramObject.getClass()));
    }
    catch (Throwable localThrowable) {
      K.error("Exception dans Property : ", localThrowable);
    }
  }

  private void f(dBf paramdBf, Object paramObject)
  {
    try
    {
      int i = paramdBf.getAttributeHash();
      if (((paramObject instanceof String)) && (duS.fyW != i) && (Sj.crX != i) && (Sj.crY != i))
      {
        if (!((bdj)paramdBf.getElement()).T(paramdBf.getAttribute(), (String)paramObject));
      }
      else if (((bdj)paramdBf.getElement()).r(paramdBf.getAttribute(), paramObject)) {
        return;
      }

      Method localMethod = paramdBf.dew();
      if (!aFw.a(localMethod, paramObject)) {
        localMethod = paramdBf.det().m(paramdBf.getAttribute(), paramObject == null ? null : paramObject.getClass());
      }
      if (localMethod != null)
        a(localMethod, paramdBf, paramObject);
      else
        K.error("Impossible de trouver la méthode append" + paramdBf.getAttribute() + " dans " + paramdBf.getElement() + " avec la classe " + (paramObject == null ? null : paramObject.getClass()));
    }
    catch (Throwable localThrowable)
    {
      K.error("Exception dans Property : ", localThrowable);
    }
  }

  protected void a(Method paramMethod, dBf paramdBf, Object paramObject)
  {
    try
    {
      if (paramMethod.getParameterTypes().length == 0) {
        return;
      }
      aFw.a(paramMethod, paramdBf.getElement(), new Object[] { paramObject });
    } catch (IllegalArgumentException localIllegalArgumentException) {
      K.error("Exception illegalArgument : " + localIllegalArgumentException);
    } catch (Exception localException) {
      K.error("[" + localException.getClass().getSimpleName() + "] Erreur lors du InvokeMethodAccessor - Method=" + (paramMethod == null ? "null" : paramMethod.getName()) + " - PropertyClientData = " + paramdBf + " - Value = " + paramObject);
    }
  }

  public void setValue(Object paramObject, boolean paramBoolean)
  {
    if (!this.drK) {
      this.drK = true;
      dLE.doY().a(cwZ.ijN, this);
    }

    if ((!paramBoolean) && (paramObject == this.aOd)) {
      return;
    }

    this.aOd = paramObject;
    bpB();

    for (dBf localdBf : this.fjy) {
      String str = localdBf.getFieldName();
      if (((paramObject instanceof dBv)) && (str != null)) {
        dBv localdBv = (dBv)paramObject;
        Object localObject = localdBv.getFieldValue(str);
        a(localdBf, localObject);
      } else {
        a(localdBf, paramObject);
      }
    }
  }

  public void aA(Object paramObject) {
    for (dBf localdBf : this.fjy)
      c(localdBf, paramObject);
  }

  public void aB(Object paramObject)
  {
    for (dBf localdBf : this.fjy)
      b(localdBf, paramObject);
  }

  public void a(String paramString, Object paramObject)
  {
    if (((this.aOd instanceof dBv)) && (paramString != null)) {
      dBv localdBv = (dBv)this.aOd;
      localdBv.a(paramString, paramObject);
      for (dBf localdBf : this.fjy) {
        String str = localdBf.getFieldName();
        if ((str != null) && (str.equals(paramString)))
          a(localdBf, paramObject);
      }
    }
  }

  public void hS(String paramString)
  {
    a(paramString, null);
  }

  public void a(String paramString, Xg paramXg)
  {
    a(new String[] { paramString }, paramXg);
  }

  public void a(String[] paramArrayOfString, Xg paramXg) {
    if ((this.aOd == null) || (!(this.aOd instanceof dBv))) {
      return;
    }

    dBf[] arrayOfdBf = (dBf[])new dBf[this.fjy.size()];
    this.fjy.toArray(arrayOfdBf);
    int i = 0; for (int j = paramArrayOfString.length; i < j; i++) {
      a(paramXg, arrayOfdBf, paramArrayOfString[i]);
    }
    bpB();
  }

  private void a(Xg paramXg, dBf[] paramArrayOfdBf, String paramString) {
    dBv localdBv = (dBv)this.aOd;

    int i = paramString != null ? paramString.hashCode() : 0;
    Object localObject = paramXg != null ? paramXg.get(i) : null;
    int j = localObject != null ? 1 : 0;
    int k = 0; for (int m = paramArrayOfdBf.length; k < m; k++) {
      dBf localdBf = paramArrayOfdBf[k];
      if ((paramString != null) && (paramString.equals(localdBf.getFieldName())))
      {
        if (j == 0) {
          localObject = localdBv.getFieldValue(paramString);
          if (paramXg != null) {
            paramXg.put(i, localObject);
          }
          j = 1;
        }
        a(localdBf, localObject);
      }
    }
  }

  public void bpE()
  {
    Object localObject1;
    Object localObject2;
    if ((this.aOd instanceof dBv)) {
      localObject1 = (dBv)this.aOd;
      for (localObject2 = this.fjy.iterator(); ((Iterator)localObject2).hasNext(); ) { dBf localdBf = (dBf)((Iterator)localObject2).next();
        String str = localdBf.getFieldName();
        if (str != null)
          a(localdBf, ((dBv)localObject1).getFieldValue(str));
        else {
          a(localdBf, this.aOd);
        }
      }
      bpB();
    }
    else if (this.drK) {
      for (localObject1 = this.fjy.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (dBf)((Iterator)localObject1).next();
        a((dBf)localObject2, this.aOd);
      }
    }
  }

  public void a(fu paramfu)
  {
    Object localObject1;
    Object localObject2;
    if ((this.aOd instanceof dBv)) {
      localObject1 = (dBv)this.aOd;
      for (localObject2 = this.fjy.iterator(); ((Iterator)localObject2).hasNext(); ) { dBf localdBf = (dBf)((Iterator)localObject2).next();
        if (localdBf.getResultProvider() == paramfu)
        {
          String str = localdBf.getFieldName();
          if (str != null)
            a(localdBf, ((dBv)localObject1).getFieldValue(str));
          else
            a(localdBf, this.aOd);
        }
      }
      bpB();
    }
    else if (this.drK) {
      for (localObject1 = this.fjy.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (dBf)((Iterator)localObject1).next();
        if (((dBf)localObject2).getResultProvider() == paramfu)
        {
          a((dBf)localObject2, this.aOd);
        } }
    }
  }

  public void b(String paramString, Object paramObject)
  {
    if ((this.aOd == null) || (!(this.aOd instanceof dBv))) {
      return;
    }
    dBv localdBv = (dBv)this.aOd;
    localdBv.b(paramString, paramObject);
    for (dBf localdBf : this.fjy)
      if (localdBf.getFieldName().equals(paramString))
        c(localdBf, paramObject);
  }

  public void c(String paramString, Object paramObject)
  {
    if ((this.aOd == null) || (!(this.aOd instanceof dBv))) {
      return;
    }
    dBv localdBv = (dBv)this.aOd;
    localdBv.c(paramString, paramObject);
    for (dBf localdBf : this.fjy)
      if (localdBf.getFieldName().equals(paramString))
        b(localdBf, paramObject);
  }

  public void bpF()
  {
    if ((this.aOd == null) || (!(this.aOd instanceof dBv)))
      bpH();
    else
      bpG();
  }

  private void bpG()
  {
    if (this.aOd == null) {
      return;
    }
    dBv localdBv = (dBv)this.aOd;

    String[] arrayOfString1 = localdBv.getFields();
    if (arrayOfString1 == null)
      return;
    for (String str1 : arrayOfString1)
      if (str1 != null)
      {
        Object localObject = null;
        if (!localdBv.l(str1))
        {
          localObject = localdBv.getFieldValue(str1);
        }

        for (int k = this.fjy.size() - 1; k >= 0; k--) {
          dBf localdBf = (dBf)this.fjy.get(k);
          String str2 = localdBf.getFieldName();
          if ((str2 != null) && (str2.equals(str1)))
          {
            if (localObject == null) {
              Method localMethod = localdBf.det().l(localdBf.getAttribute(), localObject == null ? null : localObject.getClass());
              try
              {
                localObject = localMethod.invoke(localdBf.getElement(), new Object[0]);

                localdBv.a(str1, localObject);
              } catch (Exception localException) {
                if (localdBf.getElement() == null)
                  K.error("[fieldProviderSynchronize] PropertyClientData avec un element null : field = " + localdBf.getFieldName());
                else if (localMethod == null) {
                  K.error("[fieldProviderSynchronize] La méthode " + ((bdj)localdBf.getElement()).getClass().getName() + ".get" + localdBf.getAttribute() + "() n'existe pas, impossible de la charger");
                }
                else
                  K.error("Exception", localException);
              }
            }
            else
            {
              a(localdBf, localObject);
            }
          }
        }
      }
  }

  private void bpH()
  {
    if (this.fjy.isEmpty()) {
      return;
    }
    dBf localdBf1 = (dBf)this.fjy.get(this.fjy.size() - 1);

    Class localClass = this.aOd == null ? null : this.aOd.getClass();
    Method localMethod = localdBf1.det().l(localdBf1.getAttribute(), localClass);
    if (localMethod == null)
    {
      return;
    }

    try
    {
      this.aOd = localMethod.invoke(localdBf1.getElement(), new Object[0]);
      if (!this.drK) {
        this.drK = true;
        dLE.doY().a(cwZ.ijN, this);
      }
      bpB();

      for (int i = 0; i < this.fjy.size() - 1; i++) {
        dBf localdBf2 = (dBf)this.fjy.get(i);
        a(localdBf2, this.aOd);
      }
    }
    catch (Exception localException) {
      K.error("Impossible de synchroniser la propriété " + this.m_name + " avec " + localdBf1.getElement().getClass().getName() + ", l'attribut " + localdBf1.getAttribute() + " est incompatible !");
    }
  }

  public boolean a(Class paramClass, dUo paramdUo)
  {
    Class localClass = a(paramdUo);
    return (localClass != null) && (localClass.isAssignableFrom(paramClass));
  }

  public Class a(dUo paramdUo)
  {
    Class localClass = this.aOd == null ? null : this.aOd.getClass();
    Method localMethod = paramdUo.k(this.m_name, localClass);
    if (localMethod != null) {
      return localMethod.getDeclaringClass();
    }
    return null;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Property name=").append(this.m_name);
    if (this.cUY != null) {
      localStringBuilder.append(" elementMap=").append(this.cUY.getId());
    }
    localStringBuilder.append(" value=").append(this.aOd);

    return localStringBuilder.toString();
  }

  private static String a(bbo parambbo, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(parambbo.m_name).append("#").append(paramString);
    return localStringBuilder.toString();
  }

  public boolean bpI() {
    return this.fjB != null;
  }
}