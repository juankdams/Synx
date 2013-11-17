import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import java.awt.Point;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dRq extends dOc
{
  public static final String TAG = "Container";
  private static final aee aOr = new bOO(new dKa());

  protected final ArrayList mmr = new ArrayList();

  protected boolean mms = false;
  protected amp mmt;
  protected boolean mmu = false;

  protected boolean mmv = false;

  protected boolean mmw = false;

  private Or mmx = null;
  private Or mmy = null;

  private boolean mmz = false;

  public static final int mmA = "pack".hashCode();

  public void i(dOc paramdOc)
  {
    a(paramdOc, this.mmr.size());
  }

  public boolean a(dOc paramdOc, int paramInt)
  {
    if ((paramInt < 0) || (paramInt > this.mmr.size())) {
      K.error("Tentative d'ajout d'un widget a un parent avec un index invalide (index=" + paramInt + ", taille=" + this.mmr.size());
    } else if (this.mmr.contains(paramdOc)) {
      K.error("Tentative d'ajout d'un widget déjà contenu");
    } else {
      this.mmr.add(paramInt, paramdOc);
      paramdOc.setContainerParent(this);
      if (isInWidgetTree()) {
        paramdOc.ajj();
      }
      this.mmu = true;
      setNeedsToPreProcess();
      return true;
    }
    return false;
  }

  public void j(dOc paramdOc)
  {
    if ((paramdOc != null) && (this.mmr != null) && (this.mmr.contains(paramdOc))) {
      if (isInWidgetTree()) {
        paramdOc.ccT();
      }
      this.mmr.remove(paramdOc);
      paramdOc.setContainerParent(null);
      this.mmu = true;
      setNeedsToPreProcess();

      paramdOc.beG();
    }
  }

  public void setWidgetOnTop(dOc paramdOc) {
    if ((paramdOc != null) && (this.mmr != null) && (this.mmr.contains(paramdOc))) {
      this.mmr.remove(paramdOc);
      i(paramdOc);
    }
  }

  public void a(crh paramcrh)
  {
    super.a(paramcrh);

    if ((paramcrh instanceof amp))
      setLayoutManager((amp)paramcrh);
  }

  public void c(dOc paramdOc, int paramInt)
  {
    if (a(paramdOc, paramInt)) {
      super.a(paramdOc, false);
    } else if (paramdOc != null) {
      paramdOc.beH();
      K.warn("On libère le Widget qui n'a pas pû être ajouté");
    }
  }

  public void dsk()
  {
    for (dOc localdOc : this.mmr) {
      if (isInWidgetTree()) {
        localdOc.ccT();
      }
      localdOc.setContainerParent(null);
    }
    this.mmr.clear();
    this.mmu = true;
    setNeedsToPreProcess();
  }

  protected void rd()
  {
    super.rd();
    int i = this.mmr.size();
    for (int j = 0; j < i; j++) {
      dOc localdOc = (dOc)this.mmr.get(j);
      EntityGroup localEntityGroup = localdOc.getEntity();
      if ((localdOc.getVisible()) && (localEntityGroup != null))
        this.bqm.d(localEntityGroup);
    }
  }

  public String getTag()
  {
    return "Container";
  }

  public ArrayList getWidgetChildren()
  {
    return this.mmr;
  }

  public Jg getAppearance()
  {
    return this.czl;
  }

  public boolean isAppearanceCompatible(Jg paramJg)
  {
    return true;
  }

  public void setLayoutManager(amp paramamp)
  {
    if ((this.mmt != null) && (!this.mmt.isUnloading())) {
      this.mmt.release();
    }
    this.mmt = paramamp;
  }

  public PT getLayoutManager()
  {
    return this.mmt;
  }

  public void setVisible(boolean paramBoolean) {
    if (paramBoolean != this.aYZ) {
      setNeedsToPreProcess();
      setNeedsToMiddleProcess();
    }

    super.setVisible(paramBoolean);
  }

  protected void setParentVisible(boolean paramBoolean)
  {
    if (paramBoolean != this.meR) {
      super.setParentVisible(paramBoolean);
      for (int i = this.mmr.size() - 1; i >= 0; i--)
        ((dOc)this.mmr.get(i)).setParentVisible(paramBoolean);
    }
  }

  public Or getMaxSize()
  {
    if (this.mmt != null) {
      return this.mmt.getContentPreferedSize(this);
    }
    return new Or(2147483647, 2147483647);
  }

  public Or getContentMinSize()
  {
    if (this.mmt != null)
    {
      if (this.mmx == null) {
        this.mmx = this.mmt.getContentMinSize(this);
      }

      int i = this.haL == null ? this.mmx.width : Math.max(this.mmx.width, this.haL.width);
      int j = this.haL == null ? this.mmx.height : Math.max(this.mmx.height, this.haL.height);

      return new Or(i, j);
    }
    return super.getContentMinSize();
  }

  public Or getContentPrefSize()
  {
    if (this.mmt != null)
    {
      if (this.mmy == null) {
        this.mmy = this.mmt.getContentPreferedSize(this);
      }

      int i = this.aCQ == null ? this.mmy.width : Math.max(this.mmy.width, this.aCQ.width);
      int j = this.aCQ == null ? this.mmy.height : Math.max(this.mmy.height, this.aCQ.height);

      return new Or(i, j);
    }
    return super.getContentPrefSize();
  }

  public Or getContentGreedySize()
  {
    if (this.meE == null) {
      return new Or(this.czl.getContentWidth(), this.czl.getContentHeight());
    }

    Or localOr = this.meE.getContentGreedySize();
    localOr.width -= this.meE.getAppearance().getLeftInset() + this.meE.getAppearance().getRightInset();
    localOr.height -= this.meE.getAppearance().getTopInset() + this.meE.getAppearance().getBottomInset();

    return this.meE.getLayoutManager().getContentGreedySize(this.meE, this, localOr);
  }

  public boolean isRootFocusContainer()
  {
    return this.mms;
  }

  public void setRootFocusContainer(boolean paramBoolean)
  {
    this.mms = paramBoolean;
  }

  public dRq getRootFocusParent()
  {
    if (this.mms) {
      return this;
    }
    return super.getRootFocusParent();
  }

  public void setNonBlocking(boolean paramBoolean)
  {
    setNonBlocking(paramBoolean, false);
  }

  public void setNonBlocking(boolean paramBoolean1, boolean paramBoolean2)
  {
    super.setNonBlocking(paramBoolean1);
    if (paramBoolean2)
      for (dOc localdOc : getWidgetChildren())
        if ((localdOc instanceof dRq))
          ((dRq)localdOc).setNonBlocking(paramBoolean1, paramBoolean2);
        else
          localdOc.setNonBlocking(paramBoolean1);
  }

  public boolean getInvalidateOnMinSizeChange()
  {
    return this.mmw;
  }

  public void setInvalidateOnMinSizeChange(boolean paramBoolean)
  {
    this.mmw = paramBoolean;
  }

  public void setPack(boolean paramBoolean)
  {
    this.mmv = paramBoolean;
  }

  public boolean getPack()
  {
    return this.mmv;
  }

  public dOc getWidget(int paramInt1, int paramInt2)
  {
    if ((this.fnH) || (!this.aYZ) || (!getAppearance().bQ(paramInt1, paramInt2))) {
      return null;
    }

    Object localObject = this.meQ ? null : this;

    paramInt1 -= getAppearance().getLeftInset();
    paramInt2 -= getAppearance().getBottomInset();

    for (int i = this.mmr.size() - 1; i >= 0; i--) {
      dOc localdOc = (dOc)this.mmr.get(i);
      if (!localdOc.isUnloading()) {
        localdOc = localdOc.getWidget(paramInt1 - localdOc.meF.x, paramInt2 - localdOc.meF.y);

        if (localdOc != null) {
          localObject = localdOc;
          break;
        }
      }
    }

    return localObject;
  }

  public dOc getWidget(int paramInt)
  {
    try
    {
      return (dOc)this.mmr.get(paramInt); } catch (Exception localException) {
    }
    return null;
  }

  public dOc getNextFocusableWidget()
  {
    return null;
  }

  public avN getScissor(dOc paramdOc)
  {
    Point localPoint1 = getScreenPosition();
    int i = localPoint1.x + this.czl.getLeftInset();
    int j = localPoint1.y + this.czl.getBottomInset();
    int k = this.czl.getContentWidth();
    int m = this.czl.getContentHeight();

    if (paramdOc == null) {
      return avN.m(i, j, k, m);
    }
    Point localPoint2 = paramdOc.getScreenPosition();

    int n = localPoint2.x;
    int i1 = localPoint2.y;
    int i2 = paramdOc.getWidth();
    int i3 = paramdOc.getHeight();

    avN localavN = avN.aHC();
    if (avN.b(n, i1, i2, i3, i, j, k, m)) {
      localavN.a(n, i1, i2, i3, i, j, k, m);
    }

    return localavN;
  }

  public void ajj()
  {
    super.ajj();
    for (dOc localdOc : this.mmr)
      localdOc.ajj();
  }

  public void ccT()
  {
    super.ccT();
    for (dOc localdOc : this.mmr)
      localdOc.ccT();
  }

  protected void dsl()
  {
    this.mmx = (this.mmy = null);
    this.mmz = true;
    setNeedsToMiddleProcess();
  }

  public void cfM()
  {
    dsl();

    if (this.meE != null) {
      this.meE.cfM();
    }

    if ((this.mmv) || (this.mmw))
      invalidate();
  }

  public void validate()
  {
    super.validate();

    this.mmz = false;

    if (this.mmv) {
      setSizeToPrefSize();
    }

    if ((this.mmt != null) && (this.czl != null))
    {
      this.mmt.a(this);
    }

    setNeedsToResetMeshes();
    this.mmu = false;
  }

  public boolean bb(int paramInt)
  {
    boolean bool = super.bb(paramInt);

    if (this.mmu)
    {
      cfM();
    }

    return bool;
  }

  public boolean je(int paramInt)
  {
    if ((this.aYZ) && 
      (this.mmz))
    {
      invalidate();
    }

    return super.je(paramInt);
  }

  public static dRq checkOut()
  {
    dRq localdRq;
    try
    {
      localdRq = (dRq)aOr.Mm();
      localdRq.fnG = aOr;
    }
    catch (Exception localException)
    {
      K.error("Problème au borrowObject.");
      localdRq = new dRq();
      localdRq.aJ();
    }
    return localdRq;
  }

  public void bc()
  {
    dsk();
    super.bc();

    this.mmx = null;
    this.mmy = null;

    if (this.mmt != null) {
      this.mmt.release();
      this.mmt = null;
    }
  }

  public void aJ()
  {
    super.aJ();

    this.mms = false;
    this.mmu = false;
    this.mmv = false;
    this.mmw = false;

    Jg localJg = Jg.checkOut();
    localJg.setWidget(this);
    a(localJg);

    aId localaId = aId.checkOut();
    a(localaId);

    this.meQ = true;
  }

  public void c(bdj parambdj)
  {
    dRq localdRq = (dRq)parambdj;
    super.c(localdRq);
    localdRq.mmv = this.mmv;
    localdRq.mms = this.mms;
    amp localamp = null;
    if (this.mmt != null)
      localamp = this.mmt.ajQ();
    if (localamp != null)
      localdRq.setLayoutManager(localamp);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == mmA)
      setPack(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject)
  {
    if (paramInt == mmA) {
      setPack(bUD.getBoolean(paramObject));
      return true;
    }
    return super.setPropertyAttribute(paramInt, paramObject);
  }
}