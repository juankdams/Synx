import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Stack;
import org.apache.log4j.Logger;

public abstract class aNL extends bdj
  implements LM, bWU, crD, Comparable
{
  protected static Logger K = Logger.getLogger(aNL.class);

  protected ArrayList bFw = new ArrayList();
  protected aNL etK;
  private Xg etL;
  private Xg etM;
  private EnumSet etN;
  protected ArrayList etO = null;

  private boolean etP = false;
  private int etQ;
  private int etR;
  private short etS = -1;
  protected cpa cUY;
  protected boolean etT = false;

  protected String bYJ = null;

  protected boolean bun = false;

  protected boolean etU = false;
  protected axU etV;
  protected dlY etW = null;
  protected ArrayList etX;
  protected ArrayList etY;
  protected boolean etZ = true;

  public static final int eua = "id".hashCode();

  public void a(aNL paramaNL)
  {
    a(paramaNL, true);
  }

  public void a(aNL paramaNL, boolean paramBoolean)
  {
    if (paramaNL != null) {
      if ((!bB) && (this.fnH)) throw new AssertionError("Object is already checked-in" + getClass().getSimpleName());
      super.a(paramaNL);

      this.bFw.add(paramaNL);
      paramaNL.setParent(this);
      paramaNL.setTreeDepth(this.etQ + 1);

      anT.aAo().aAp();

      if ((paramBoolean) && ((paramaNL instanceof dOc))) {
        i((dOc)paramaNL);
      }

      if (isInTree()) {
        paramaNL.ZW();
      }

      paramaNL.setIsATemplate(this.fnS);
    } else {
      K.error("Tentative d'ajout un element null à " + getClass().getSimpleName());
    }
  }

  public void h(aNL paramaNL)
  {
    if (this.bFw != null) {
      if ((paramaNL instanceof dOc)) {
        j((dOc)paramaNL);
      }
      paramaNL.beN();
      this.bFw.remove(paramaNL);
      paramaNL.setParent(null);
    }
  }

  public void i(aNL paramaNL)
  {
    h(paramaNL);

    l(paramaNL);
  }

  public void beG()
  {
    if (this.etK != null)
      this.etK.h(this);
  }

  public void beH()
  {
    if (this.etK != null)
      this.etK.i(this);
    else
      l(this);
  }

  public void removeAllChildren()
  {
    if (this.bFw != null) {
      for (int i = this.bFw.size() - 1; i >= 0; i--) {
        h((aNL)this.bFw.get(i));
      }
      this.bFw.clear();
    }
  }

  public void beI()
  {
    if (this.bFw != null) {
      for (int i = this.bFw.size() - 1; i >= 0; i--) {
        i((aNL)this.bFw.get(i));
      }
      this.bFw.clear();
    }
  }

  public void i(dOc paramdOc)
  {
    if (this.etK != null) {
      this.etK.i(paramdOc);
    } else {
      if (this.etO == null) {
        this.etO = new ArrayList();
      }
      this.etO.add(paramdOc);
      setNeedsToPreProcess();
    }
  }

  public void j(dOc paramdOc)
  {
    if (this.etK != null)
      this.etK.j(paramdOc);
  }

  public void setWidgetOnTop(dOc paramdOc)
  {
    if (this.etK != null)
      this.etK.setWidgetOnTop(paramdOc);
  }

  public void a(cKq paramcKq)
  {
    if (this.etX == null) {
      this.etX = new ArrayList(5);
    }
    this.etX.add(paramcKq);
    paramcKq.a(this);
    setNeedsToPreProcess();
  }

  public void b(cKq paramcKq)
  {
    if (paramcKq == null) {
      return;
    }
    if (this.etY == null) {
      this.etY = new ArrayList(5);
    }
    if (!this.etY.contains(paramcKq)) {
      this.etY.add(paramcKq);
      setNeedsToPreProcess();
    }
  }

  public boolean J(Class paramClass)
  {
    if (this.etX == null) {
      return false;
    }

    boolean bool = false;
    for (int i = this.etX.size() - 1; i >= 0; i--) {
      cKq localcKq = (cKq)this.etX.get(i);
      if (localcKq.getClass().equals(paramClass)) {
        b(localcKq);
        bool = true;
      }
    }
    return bool;
  }

  public boolean K(Class paramClass)
  {
    if (this.etX == null) {
      return false;
    }

    for (int i = this.etX.size() - 1; i >= 0; i--) {
      if (((cKq)this.etX.get(i)).getClass().equals(paramClass)) {
        return true;
      }
    }
    return false;
  }

  public void a(CH paramCH, doN paramdoN, boolean paramBoolean)
  {
    int i = paramCH.ordinal();
    ArrayList localArrayList;
    if (paramBoolean) {
      if (this.etL == null) {
        this.etL = new Xg(5);
      }
      localArrayList = (ArrayList)this.etL.get(i);
      if (localArrayList == null) {
        localArrayList = new ArrayList();
        this.etL.put(i, localArrayList);
      }
      if (!localArrayList.contains(paramdoN))
        localArrayList.add(paramdoN);
    }
    else {
      if (this.etM == null) {
        this.etM = new Xg(5);
      }
      localArrayList = (ArrayList)this.etM.get(i);
      if (localArrayList == null) {
        localArrayList = new ArrayList();
        this.etM.put(i, localArrayList);
      }
      if (!localArrayList.contains(paramdoN))
        localArrayList.add(paramdoN);
    }
  }

  public void b(CH paramCH, doN paramdoN, boolean paramBoolean)
  {
    int i = paramCH.ordinal();
    ArrayList localArrayList;
    if (paramBoolean) {
      if (this.etL == null) {
        return;
      }
      localArrayList = (ArrayList)this.etL.get(i);
      if (localArrayList != null) {
        localArrayList.remove(paramdoN);
        if (localArrayList.isEmpty())
          this.etL.remove(i);
      }
    }
    else {
      if (this.etM == null) {
        return;
      }
      localArrayList = (ArrayList)this.etM.get(i);
      if (localArrayList != null) {
        localArrayList.remove(paramdoN);
        if (localArrayList.isEmpty())
          this.etM.remove(i);
      }
    }
  }

  public void beJ()
  {
    if (this.etL != null) {
      this.etL.clear();
      this.etL = null;
    }
    if (this.etM != null) {
      this.etM.clear();
      this.etM = null;
    }
  }

  public ArrayList getListeners(CH paramCH, boolean paramBoolean)
  {
    if ((paramBoolean) && (this.etL != null))
      return (ArrayList)this.etL.get(paramCH.ordinal());
    if ((!paramBoolean) && (this.etM != null)) {
      return (ArrayList)this.etM.get(paramCH.ordinal());
    }
    return null;
  }

  public bTe getElementType()
  {
    return bTe.heE;
  }

  public aNL getParent()
  {
    return this.etK;
  }

  public void setParent(aNL paramaNL)
  {
    if ((!bB) && (paramaNL == this)) throw new AssertionError("On ne peut pas se définir soi-même en parent");
    this.etK = paramaNL;
    if ((this.etK != null) && (this.cUY == null))
      this.cUY = this.etK.getElementMap();
  }

  public ArrayList getChildren()
  {
    return this.bFw;
  }

  public String getId()
  {
    return this.bYJ;
  }

  public void setId(String paramString)
  {
    if ((this.bYJ != null) && (!this.bYJ.equalsIgnoreCase(paramString)) && (this.cUY != null))
    {
      this.cUY.aw(this.bYJ, paramString);
      this.bYJ = paramString;
    } else if ((this.bYJ == null) && (paramString != null) && (this.cUY != null))
    {
      this.bYJ = paramString;
      this.cUY.a(paramString, this);
    } else {
      this.bYJ = paramString;
    }
  }

  public short getModalLevel()
  {
    return this.etS;
  }

  public void setModalLevel(short paramShort)
  {
    this.etS = paramShort;
  }

  public boolean isValidAdd(bdj parambdj)
  {
    return parambdj != this;
  }

  public int getTreePosition() {
    return this.etR;
  }

  public void setTreePosition(int paramInt) {
    this.etR = paramInt;
  }

  public void setTreeDepth(int paramInt) {
    this.etQ = paramInt;
    if (this.bFw != null) {
      int i = 0; for (int j = this.bFw.size(); i < j; i++)
        ((aNL)this.bFw.get(i)).setTreeDepth(paramInt + 1);
    }
  }

  public int getTreeDepth()
  {
    return this.etQ;
  }

  public void setIsATemplate(boolean paramBoolean) {
    this.fnS |= paramBoolean;
    for (int i = this.bFw.size() - 1; i >= 0; i--)
      ((aNL)this.bFw.get(i)).setIsATemplate(paramBoolean);
  }

  public boolean isATemplate()
  {
    return this.fnS;
  }

  public boolean a(CH paramCH)
  {
    if ((this.etL != null) && (this.etL.contains(paramCH.ordinal()))) {
      return true;
    }

    if ((this.etM != null) && (this.etM.contains(paramCH.ordinal()))) {
      return true;
    }

    return false;
  }

  public boolean isValid()
  {
    return this.bun;
  }

  public boolean setAppearance(Jg paramJg)
  {
    K.warn("Tentative d'ajout d'une apparence " + paramJg.getClass().getSimpleName() + " à un " + getClass().getSimpleName());
    paramJg.beH();
    return false;
  }

  public dOc getParentWidget()
  {
    if (this.etK != null) {
      if ((this.etK instanceof dOc)) {
        return (dOc)this.etK;
      }
      return this.etK.getParentWidget();
    }

    return null;
  }

  public boolean j(aNL paramaNL)
  {
    if (this.etK == null)
      return false;
    if (this.etK == paramaNL) {
      return true;
    }
    return this.etK.j(paramaNL);
  }

  public Object getElementValue()
  {
    return this;
  }

  public void setElementMap(cpa paramcpa)
  {
    this.cUY = paramcpa;
  }

  public cpa getElementMap()
  {
    if ((this.cUY == null) && (this.etK != null)) {
      return this.etK.getElementMap();
    }
    return this.cUY;
  }

  public boolean isElementMapRoot()
  {
    return this.etT;
  }

  public void setElementMapRoot(boolean paramBoolean)
  {
    this.etT = paramBoolean;
  }

  public axU getRenderableParent() {
    return this.etV;
  }

  public void setRenderableParent(axU paramaxU) {
    if (this.etV != paramaxU)
      this.etV = paramaxU;
  }

  public void setChildrenAdded(boolean paramBoolean)
  {
    this.etU = paramBoolean;
  }

  public boolean beK()
  {
    return this.etU;
  }

  public dlY getUserDefinedManager()
  {
    return this.etW;
  }

  public void setUserDefinedManager(dlY paramdlY)
  {
    this.etW = paramdlY;
  }

  public void a(CH paramCH, boolean paramBoolean)
  {
    if ((paramBoolean) && (this.etN != null)) {
      this.etN.remove(paramCH);
    } else if (!paramBoolean) {
      if (this.etN == null) {
        this.etN = EnumSet.noneOf(CH.class);
      }
      this.etN.add(paramCH);
    }
  }

  protected void a(cSx paramcSx, boolean paramBoolean)
  {
  }

  public void setCanBeCloned(boolean paramBoolean)
  {
    this.etZ = paramBoolean;
  }

  public boolean Iv() {
    return this.etZ;
  }

  public void a(coN paramcoN)
  {
  }

  public void beL()
  {
    if (this.etW != null)
      this.etW.beL();
  }

  public void beM()
  {
    if (this.etW != null)
      this.etW.beM();
  }

  public boolean isInTree()
  {
    if (this.etK == null) {
      return false;
    }
    return this.etK.isInTree();
  }

  public void ZW()
  {
    int i = 0; for (int j = this.bFw.size(); i < j; i++)
      ((aNL)this.bFw.get(i)).ZW();
  }

  public void beN()
  {
    if (this.etW != null) {
      this.etW.beM();
      this.etW.bTR();
      cBQ.cxL().cxT().oA(this.cUY.getId()).b(this);
    }

    int i = 0; for (int j = this.bFw.size(); i < j; i++)
      ((aNL)this.bFw.get(i)).beN();
  }

  public void c(bdj parambdj)
  {
    aNL localaNL1 = (aNL)parambdj;
    super.c(parambdj);

    localaNL1.bYJ = this.bYJ;
    localaNL1.etU = this.etU;
    localaNL1.etS = this.etS;
    localaNL1.cUY = this.cUY;

    if (this.etL != null) {
      localaNL1.etL = a(localaNL1.etL, this.etL);
    }
    if (this.etM != null) {
      localaNL1.etM = a(localaNL1.etM, this.etM);
    }

    if (this.bFw != null) {
      int i = 0; for (int j = this.bFw.size(); i < j; i++) {
        aNL localaNL2 = (aNL)this.bFw.get(i);
        if (localaNL2.Iv())
          localaNL1.a(localaNL2.beO());
      }
    }
  }

  private Xg a(Xg paramXg1, Xg paramXg2)
  {
    int i = paramXg2.size();
    if (paramXg1 != null)
      paramXg1.aV(paramXg1.size() + i);
    else {
      paramXg1 = new Xg(i);
    }
    for (int j = 0; j < i; j++) {
      int k = paramXg2.uM(j);
      ArrayList localArrayList1 = (ArrayList)paramXg2.hc(j);
      ArrayList localArrayList2 = (ArrayList)paramXg1.get(k);
      int m = localArrayList1.size();
      if (localArrayList2 == null) {
        localArrayList2 = new ArrayList(m);
        paramXg1.put(k, localArrayList2);
      } else {
        localArrayList2.ensureCapacity(m + localArrayList2.size());
      }
      for (int n = 0; n < m; n++)
        localArrayList2.add(localArrayList1.get(n));
    }
    return paramXg1;
  }

  public aNL beO()
  {
    try
    {
      aNL localaNL;
      try
      {
        localaNL = (aNL)IZ.Sq().l(getClass()).newInstance();
      } catch (NullPointerException localNullPointerException) {
        K.error("pas de factory trouvée pour " + getClass().getSimpleName(), localNullPointerException);
        return null;
      }

      c(localaNL);
      return localaNL;
    } catch (Throwable localThrowable) {
      K.error("Exception", localThrowable);
    }

    return null;
  }

  public int k(aNL paramaNL)
  {
    return paramaNL.getTreeDepth() - this.etQ;
  }

  public boolean c(cSx paramcSx, boolean paramBoolean) {
    a(paramcSx, paramBoolean);

    paramcSx.p(this);

    boolean bool = false;
    if ((this.etN == null) || (!this.etN.contains(paramcSx.mp()))) {
      if (paramBoolean)
        bool = b(paramcSx);
      else {
        bool = c(paramcSx);
      }
    }

    if (bool) {
      return true;
    }

    if ((paramcSx.cIl() == this) && (!paramcSx.cIj())) {
      paramcSx.iG(true);
      paramBoolean = false;
    } else if ((paramcSx.cIl() == this) && (paramcSx.cIj())) {
      paramcSx.iG(false);
    }

    if (paramBoolean) {
      aNL localaNL = paramcSx.cIh();
      if (localaNL != null)
        return localaNL.c(paramcSx, true);
    }
    else {
      if (paramcSx.cIj())
        return paramcSx.cIl().c(paramcSx, false);
      if (this.etK != null) {
        return this.etK.c(paramcSx, false);
      }

    }

    return false;
  }

  public void f(cSx paramcSx)
  {
    if (this.etM != null) {
      boolean bool = false;
      ArrayList localArrayList = (ArrayList)this.etM.get(paramcSx.mp().ordinal());
      if (localArrayList != null)
        for (int i = 0; i < localArrayList.size(); i++) {
          bool |= ((doN)localArrayList.get(i)).a(paramcSx);
          if (bool)
            break;
        }
    }
  }

  public boolean g(cSx paramcSx)
  {
    if (paramcSx == null) {
      K.error("L'event est null, impossible de le traiter");
      return false;
    }
    try
    {
      if (paramcSx.cIl() == null) {
        K.error("[" + paramcSx.mp() + "] L'event n'a pas de target, impossible de le traiter");
        return false;
      }

      paramcSx.q(this);

      boolean bool2 = true;
      aNL localaNL;
      if ((this instanceof bsP))
        localaNL = this;
      else {
        localaNL = this.etK;
      }
      paramcSx.o(this);

      while ((localaNL != null) && (!(localaNL instanceof bsP))) {
        paramcSx.o(localaNL);
        localaNL = localaNL.etK;
      }
      boolean bool3;
      if (localaNL != null) {
        return localaNL.c(paramcSx, bool2);
      }

      return false;
    } finally {
      paramcSx.release();
    }
  }

  public static void l(aNL paramaNL)
  {
    if (!paramaNL.isUnloading())
      paramaNL.release();
  }

  public void validate()
  {
    this.bun = true;
  }

  public void invalidate()
  {
    this.bun = false;
    setNeedsToPostProcess();
  }

  public void rV()
  {
    super.rV();
    this.etU = true;
  }

  public void aTa()
  {
    this.etP = true;
    setNeedsToMiddleProcess();
  }

  public boolean bb(int paramInt)
  {
    boolean bool = super.bb(paramInt);
    int i;
    int j;
    if ((this.etO != null) && (!this.etO.isEmpty())) {
      i = this.etO.size();
      for (j = 0; j < i; j++) {
        i((dOc)this.etO.get(j));
      }
      this.etO.clear();
    }

    if (this.etY != null) {
      i = this.etY.size();
      if (i > 0) {
        for (j = 0; j < i; j++) {
          ((cKq)this.etY.get(j)).nv();
        }
        if (this.etX != null) {
          this.etX.removeAll(this.etY);
        }
        this.etY.clear();
      }
    }

    if (this.etX != null) {
      i = this.etX.size();
      if (i > 0) {
        for (j = 0; j < i; j++) {
          ((cKq)this.etX.get(j)).aH(paramInt);
        }
      }
    }

    if ((this.etX != null) && (this.etX.size() > 0)) {
      bool = true;
    }

    return bool;
  }

  public boolean je(int paramInt)
  {
    boolean bool = super.je(paramInt);

    if (!this.etP) {
      aTa();
    }

    return bool;
  }

  public boolean r(int paramInt)
  {
    boolean bool = super.r(paramInt);

    if (!this.bun) {
      validate();
    }

    return bool;
  }

  public boolean b(cSx paramcSx)
  {
    if (this.etL == null) {
      return false;
    }

    ArrayList localArrayList = getListeners(paramcSx.mp(), true);
    if (localArrayList != null)
    {
      synchronized (localArrayList) {
        for (int i = 0; i < localArrayList.size(); i++) {
          if (((doN)localArrayList.get(i)).a(paramcSx)) {
            return true;
          }
        }
      }
    }

    return false;
  }

  public boolean c(cSx paramcSx)
  {
    if (this.etM == null) {
      return false;
    }

    ArrayList localArrayList = getListeners(paramcSx.mp(), false);
    if (localArrayList != null)
    {
      synchronized (localArrayList) {
        for (int i = 0; i < localArrayList.size(); i++) {
          if (((doN)localArrayList.get(i)).a(paramcSx)) {
            return true;
          }
        }
      }
    }

    return false;
  }

  public void bc() {
    super.bc();

    if (this.bFw != null)
    {
      for (int i = this.bFw.size() - 1; i >= 0; i--) {
        i((aNL)this.bFw.get(i));
      }
      this.bFw.clear();
    }

    if (this.etO != null) {
      this.etO.clear();
      this.etO = null;
    }

    this.fnG = null;
    this.etK = null;

    beJ();
    this.etL = null;
    this.etM = null;
    this.etN = null;

    if (this.cUY != null) {
      if (this.bYJ != null) {
        this.cUY.removeElement(this.bYJ);
      }
      if (this.etT) {
        cBQ.cxL().mY(this.cUY.getId());
        this.cUY.coO().ne(this.cUY.getId());
      }
      this.cUY = null;
    }

    this.bYJ = null;

    this.etV = null;

    if (this.etX != null) {
      this.etX.clear();
      this.etX = null;
    }

    if (this.etY != null) {
      this.etY.clear();
      this.etY = null;
    }

    this.etW = null;
  }

  public void aJ() {
    super.aJ();

    this.etP = false;
    this.etS = -1;

    this.etQ = 0;
    this.etT = false;

    this.bun = false;
    this.etU = false;
    this.fnS = false;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (eua == paramInt)
      setId(paramaKN.gL(paramString));
    else {
      return false;
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (eua == paramInt) {
      setId((String)paramObject);
      return true;
    }
    return false;
  }

  public void a(K paramK, aNL paramaNL, Stack paramStack, cDA paramcDA)
  {
    cpa localcpa = paramStack != null ? (cpa)paramStack.peek() : null;

    if ((localcpa == null) && (paramaNL != null)) {
      localcpa = paramaNL.getElementMap();
    }

    setElementMap(localcpa);

    super.a(paramK, paramaNL, paramStack, paramcDA);
  }
}