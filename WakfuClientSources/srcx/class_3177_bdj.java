import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Stack;
import org.apache.log4j.Logger;

public abstract class bdj
  implements bWU
{
  private static final Logger K = Logger.getLogger(bdj.class);
  private static final boolean fnF = true;
  protected aee fnG;
  protected boolean fnH = false;
  private int fnI = 0;
  private int fnJ = 0;
  protected bdj fnK;
  protected ArrayList fnL = null;

  protected boolean fnM = false;
  protected boolean fnN = false;
  protected boolean fnO = false;

  private int fnP = -1; private int fnQ = -1; private int fnR = -1;

  protected boolean fnS = false;

  private boolean fnT = false;
  private boolean fnU = false;
  public static final String fnV = "include";
  public static final String fnW = "includeId";
  static final int[] fnX = { "include".hashCode(), "includeId".hashCode(), "templateId".hashCode(), "atlas".hashCode() };

  public void c(bbo parambbo)
  {
    if (this.fnL == null) {
      this.fnL = new ArrayList(1);
    }
    if (!this.fnL.contains(parambbo))
      this.fnL.add(parambbo);
  }

  public void d(bbo parambbo)
  {
    if (this.fnL != null)
      this.fnL.remove(parambbo);
  }

  public void a(crh paramcrh)
  {
    paramcrh.setBasicParent(this);
  }

  public void a(aNL paramaNL) {
    paramaNL.setBasicParent(this);
  }

  public void b(crh paramcrh)
  {
    a(paramcrh);
  }

  public void b(aNL paramaNL) {
    a(paramaNL);
  }

  public void bb(bdj parambdj) {
    parambdj.setBasicParent(this);

    switch (cmY.hST[parambdj.getElementType().ordinal()]) {
    case 1:
      b((aNL)parambdj);
      break;
    case 2:
      b((crh)parambdj);
      break;
    }
  }

  public int getLastPreProcessFrame()
  {
    return this.fnP;
  }

  public void setLastPreProcessFrame(int paramInt) {
    this.fnP = paramInt;
  }

  public int getLastMiddleProcessFrame() {
    return this.fnQ;
  }

  public void setLastMiddleProcessFrame(int paramInt) {
    this.fnQ = paramInt;
  }

  public int getLastPostProcessFrame() {
    return this.fnR;
  }

  public void setLastPostProcessFrame(int paramInt) {
    this.fnR = paramInt;
  }

  public void setNeedsToPreProcess()
  {
    if ((!this.fnS) && ((anT.aAo().aAq()) || (!this.fnM))) {
      anT.aAo().aM(this);
      this.fnM = true;
    }
  }

  public void setNeedsToMiddleProcess()
  {
    if ((!this.fnS) && ((anT.aAo().aAq()) || (!this.fnN))) {
      anT.aAo().aN(this);
      this.fnN = true;
    }
  }

  public void setNeedsToPostProcess()
  {
    if ((!this.fnS) && ((anT.aAo().aAq()) || (!this.fnO))) {
      anT.aAo().aO(this);
      this.fnO = true;
    }
  }

  public Object getParentOfType(Class paramClass) {
    if (this.fnK == null) {
      return null;
    }

    if (paramClass.isAssignableFrom(this.fnK.getClass())) {
      return this.fnK;
    }
    return this.fnK.getParentOfType(paramClass);
  }

  public void setBasicParent(bdj parambdj)
  {
    this.fnK = parambdj;
  }

  public bdj getBasicParent() {
    return this.fnK;
  }

  public boolean isUnloading()
  {
    return this.fnH;
  }

  public abstract bTe getElementType();

  public static String getTag(Class paramClass)
  {
    try
    {
      return (String)paramClass.getDeclaredField("TAG").get(null);
    } catch (Exception localException) {
      K.error("Erreur lors de la récupération du tag de " + paramClass.getSimpleName());
    }

    return null;
  }

  public String getTag() {
    return "";
  }

  public int getTreeDepth()
  {
    return this.fnK != null ? this.fnK.getTreeDepth() : 0;
  }

  public int getTreePosition() {
    return this.fnK != null ? this.fnK.getTreePosition() : 0;
  }

  public boolean isInTreeDepthManager()
  {
    return this.fnT;
  }

  public void setInTreeDepthManager(boolean paramBoolean)
  {
    this.fnT = paramBoolean;
  }

  public boolean isAddedNextInTreeDepthManager() {
    return this.fnU;
  }

  public void setAddedNextInTreeDepthManager(boolean paramBoolean) {
    this.fnU = paramBoolean;
  }

  public void setIsATemplate(boolean paramBoolean) {
    this.fnS |= paramBoolean;
  }

  public boolean isATemplate()
  {
    return this.fnS;
  }

  public boolean setXMLAttribute(String paramString1, String paramString2)
  {
    int i = paramString1.hashCode();

    for (int m : fnX) {
      if (i == m)
        return true;
    }
    if (!setXMLAttribute(i, paramString2, aKN.bcs()))
    {
      K.debug(new StringBuilder("Impossible de trouver l'attribut ").append(paramString1).append(" pour ").append(getClass().getSimpleName()));
      return false;
    }

    return true;
  }

  public boolean T(String paramString1, String paramString2) {
    if (!a(paramString1.hashCode(), paramString2, aKN.bcs()))
    {
      K.debug(new StringBuilder("Impossible de trouver l'attribut ").append(paramString1).append(" pour ").append(getClass().getSimpleName()));
      return false;
    }

    return true;
  }

  public boolean U(String paramString1, String paramString2) {
    if (!b(paramString1.hashCode(), paramString2, aKN.bcs()))
    {
      K.debug(new StringBuilder("Impossible de trouver l'attribut ").append(paramString1).append(" pour ").append(getClass().getSimpleName()));
      return false;
    }

    return true;
  }

  public boolean setPropertyAttribute(String paramString, Object paramObject) {
    if (!setPropertyAttribute(paramString.hashCode(), paramObject))
    {
      K.debug(new StringBuilder("Impossible de trouver l'attribut ").append(paramString).append(" pour ").append(getClass().getSimpleName()));
      return false;
    }
    return true;
  }

  public boolean r(String paramString, Object paramObject) {
    if (!e(paramString.hashCode(), paramObject))
    {
      K.debug(new StringBuilder("Impossible de trouver l'attribut ").append(paramString).append(" pour ").append(getClass().getSimpleName()));
      return false;
    }
    return true;
  }

  public boolean s(String paramString, Object paramObject) {
    if (!f(paramString.hashCode(), paramObject))
    {
      K.debug(new StringBuilder("Impossible de trouver l'attribut ").append(paramString).append(" pour ").append(getClass().getSimpleName()));
      return false;
    }
    return true;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN) {
    return false;
  }

  public boolean a(int paramInt, String paramString, aKN paramaKN) {
    return false;
  }

  public boolean b(int paramInt, String paramString, aKN paramaKN) {
    return false;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    return false;
  }

  public boolean e(int paramInt, Object paramObject) {
    return false;
  }

  public boolean f(int paramInt, Object paramObject) {
    return false;
  }

  public boolean bb(int paramInt)
  {
    return false;
  }

  public boolean je(int paramInt) {
    return false;
  }

  public boolean r(int paramInt) {
    return false;
  }

  public void oX(int paramInt) {
    if (this.fnH) {
      return;
    }

    if (this.fnM) {
      this.fnM = false;
      if (cmV.cnG()) {
        boolean bool = bb(paramInt);
        this.fnM |= bool;
      }

      if (this.fnM)
        anT.aAo().aJ(this);
    }
  }

  public void oY(int paramInt)
  {
    if (this.fnH) {
      return;
    }

    if (this.fnN) {
      this.fnN = false;
      if (cmV.cnG()) {
        boolean bool = je(paramInt);
        this.fnN |= bool;
      }

      if (this.fnN)
        anT.aAo().aK(this);
    }
  }

  public void oZ(int paramInt)
  {
    if (this.fnH) {
      return;
    }

    if (this.fnO) {
      this.fnO = false;
      if (cmV.cnG()) {
        boolean bool = r(paramInt);
        this.fnO |= bool;
      }

      if (this.fnO)
        anT.aAo().aL(this);
    }
  }

  public void release()
  {
    try
    {
      if (this.fnG != null)
        this.fnG.y(this);
      else
        bc();
    }
    catch (Exception localException) {
      K.warn("Problème lors du retour dans un pool", localException);
      bc();
    }
  }

  public void brn()
  {
  }

  public void rV()
  {
  }

  public void bc()
  {
    this.fnH = true;

    if (this.fnI >= this.fnJ) {
      K.error("Le nombre de checkIn ne correspond pas aux nombre de checkOut " + getClass().getSimpleName());
    }
    this.fnI += 1;

    this.fnK = null;

    if (this.fnL != null) {
      for (int i = this.fnL.size() - 1; i >= 0; i--) {
        ((bbo)this.fnL.get(i)).ba(this);
      }
      this.fnL = null;
    }
  }

  public void aJ() {
    this.fnH = false;

    if (this.fnJ != this.fnI) {
      K.error("Le nombre de checkOut ne correspond pas aux nombre de checkIn " + getClass().getSimpleName());
    }
    this.fnJ += 1;

    this.fnM = false;
    this.fnN = false;
    this.fnO = false;

    this.fnP = -1;
    this.fnQ = -1;
    this.fnR = -1;
  }

  public void c(bdj parambdj)
  {
  }

  public void w(K paramK) {
    ArrayList localArrayList = paramK.aj();
    int i = localArrayList != null ? localArrayList.size() : 0;

    dUo localdUo = IZ.Sq().dc(paramK.getName());

    for (int j = 0; j < i; j++) {
      K localK = (K)localArrayList.get(j);
      String str1 = localK.getName();
      String str2 = localK.getStringValue();

      if (!setXMLAttribute(str1, str2)) {
        uk.a(this, localdUo, str1, str2);
      }
    }

    brn();
  }

  public void a(K paramK, aNL paramaNL, Stack paramStack, cDA paramcDA)
  {
  }

  public void b(K paramK, aNL paramaNL, Stack paramStack, cDA paramcDA) {
  }

  public void c(K paramK, aNL paramaNL, Stack paramStack, cDA paramcDA) {
  }

  public void d(K paramK, aNL paramaNL, Stack paramStack, cDA paramcDA) {
  }

  public bdj getNewElement(String paramString, aNL paramaNL, Stack paramStack, cDA paramcDA) {
    dUo localdUo = IZ.Sq().dc(paramString);
    if (localdUo == null) {
      K.error("Tag Inconnu : " + paramString);
      return null;
    }
    try
    {
      return (bdj)localdUo.newInstance();
    } catch (Exception localException) {
      K.error(new StringBuilder("Erreur lors de l'instanciation du tag ").append(paramString).append("."), localException);
    }return null;
  }

  public void e(K paramK, aNL paramaNL, Stack paramStack, cDA paramcDA)
  {
    ArrayList localArrayList = paramK.getChildren();
    int i = localArrayList.size();
    aNL localaNL = getElementType() == bTe.heE ? (aNL)this : paramaNL;

    c(paramK, paramaNL, paramStack, paramcDA);

    for (int j = 0; j < i; j++) {
      K localK = (K)localArrayList.get(j);
      String str1 = localK.getName();

      if ((!str1.equals("#text")) && (!str1.equals("#comment")))
      {
        bdj localbdj = getNewElement(str1, localaNL, paramStack, paramcDA);
        if (localbdj != null)
        {
          localbdj.a(localK, paramaNL, paramStack, paramcDA);
          localbdj.w(localK);
          localbdj.b(localK, paramaNL, paramStack, paramcDA);

          bb(localbdj);

          if (localK.e("include") != null) {
            String str2 = localK.e("includeId").getStringValue();

            if (str2 == null) {
              K.error("Pas d'id pour le tag Include, impossible de l'ajouter");
            } else {
              cpa localcpa1 = (cpa)paramStack.peek();
              String str3 = localcpa1 != null ? localcpa1.getId() : "";

              cpa localcpa2 = paramcDA.nd(str3 + '.' + str2);
              localcpa2.d(localcpa1);
              paramStack.push(localcpa2);

              localbdj.e(localK, localaNL, paramStack, paramcDA);
              paramStack.pop();
            }
          }
          else
          {
            localbdj.e(localK, localaNL, paramStack, paramcDA);
          }
        }
      }
    }
    rV();

    d(paramK, paramaNL, paramStack, paramcDA);
  }
}