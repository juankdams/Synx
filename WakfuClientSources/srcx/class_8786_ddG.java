import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ddG extends dRq
  implements vn
{
  public static final String TAG = "ComboBoxPlus";
  public static final String kXi = "ComboBox";
  public static final String kXj = "renderable";
  public static final String kXk = "list";
  public static final String kXl = "button";
  private boolean kXm;
  private boolean kXn;
  private doN fvF;
  private doN cGQ;
  private doN kXo;
  private ccG bah;
  private axU bRF;
  private biy igL;
  private int fdb;
  private ajY kXp;
  private String cn;
  private cpa co;
  private aFG aWn;
  private aFG drn;
  public static final int cs = "content".hashCode();
  public static final int fdh = "maxRows".hashCode();
  public static final int cv = "selectedValue".hashCode();
  public static final int drs = "align".hashCode();
  public static final int drt = "hotSpotPosition".hashCode();
  public static final int kXq = "behaviour".hashCode();

  public ddG()
  {
    this.kXm = false;
    this.kXn = true;

    this.bah = null;
    this.bRF = null;
    this.igL = null;
    this.fdb = -1;

    this.kXp = ajY.djI;

    this.cn = null;
    this.co = null;
    this.aWn = aFG.ecn;
    this.drn = aFG.ech;
  }

  public void a(aNL paramaNL)
  {
    int i = 1;
    if ((paramaNL instanceof ccG)) {
      if (this.bah != null) {
        this.bah.release();
      }
      i = 0;
      this.bah = ((ccG)paramaNL);
      this.bah.setModalLevel(Ts.cwm);
      D(this.bah);
    } else if ((paramaNL instanceof axU)) {
      if (this.bRF != null) {
        this.bRF.release();
      }
      this.bRF = ((axU)paramaNL);
    } else if ((paramaNL instanceof biy)) {
      if (this.igL != null) {
        this.igL.beH();
      }
      this.igL = ((biy)paramaNL);
    }

    if (i != 0)
      super.a(paramaNL);
  }

  public dOc getWidgetByThemeElementName(String paramString, boolean paramBoolean)
  {
    if ("renderable".equalsIgnoreCase(paramString)) {
      if (this.bRF != null)
        return this.bRF;
    }
    else if ("list".equalsIgnoreCase(paramString)) {
      if (this.bah != null)
        return this.bah;
    }
    else if ("button".equalsIgnoreCase(paramString)) {
      return this.igL;
    }
    return null;
  }

  public String getTag()
  {
    return "ComboBoxPlus";
  }

  public biy getButton()
  {
    return this.igL;
  }

  public ccG getList()
  {
    return this.bah;
  }

  public int getMaxRows() {
    return this.fdb;
  }

  public void setMaxRows(int paramInt) {
    this.fdb = paramInt;
  }

  public void setElementMap(cpa paramcpa)
  {
    super.setElementMap(paramcpa);

    if (this.bah != null)
      this.bah.setElementMap(paramcpa);
  }

  public Object getSelectedValue()
  {
    if (this.bah != null) {
      return this.bah.getSelectedValue();
    }
    return null;
  }

  public void setSelectedValue(Object paramObject)
  {
    if (paramObject == null) {
      return;
    }

    if (this.bah != null) {
      this.bah.setSelectedValue(paramObject);
      Object localObject = this.bah.getSelectedValue();
      if ((paramObject != localObject) && ((localObject == null) || (!localObject.equals(paramObject)))) {
        K.error("Impossible de retrouver la valeur sélectionnée dans la liste - il faut appliquer l'attribut content AVANT selectedValue - " + paramObject + " - " + localObject);
      }

      setRenderableContent(localObject, -1);
    }
  }

  public axU getRenderable()
  {
    return this.bRF;
  }

  public void setContentProperty(String paramString, cpa paramcpa) {
    this.cn = paramString;
    this.co = paramcpa;
  }

  private void setRenderableContent(Object paramObject, int paramInt) {
    if (this.bRF != null) {
      int i = 0;
      Object localObject;
      if (this.bah != null) {
        localObject = this.bah.getSelectedValue();
        i = this.bah.getSelectedOffset();
      } else {
        localObject = paramObject;
        if (paramInt != -1) {
          i = paramInt;
        }
      }
      if (localObject != null) {
        this.bRF.setContentProperty(this.cn + "#" + i, this.co);
      }
      this.bRF.setContent(localObject);
    }
  }

  public void setContent(Iterable paramIterable)
  {
    if (paramIterable != null)
    {
      int i = 1;
      Object localObject1 = null;

      if (this.bah != null) {
        this.bah.setContentProperty(this.cn, this.co);
        this.bah.setContent(paramIterable);

        if ((this.bah.size() != 0) && (this.bah.getSelectedValue() == null)) {
          i = 0;
          localObject1 = this.bah.getItems().get(0);
          this.bah.setSelectedOffset(0);
        }
      }

      Object localObject2 = null;
      int j = -1;
      if (i == 0) {
        localObject2 = localObject1;
        j = 0;
      }
      setRenderableContent(localObject2, j);
    }
  }

  public void setContent(Object[] paramArrayOfObject) {
    if (paramArrayOfObject != null) {
      int i = 1;
      Object localObject1 = null;

      if (this.bah != null) {
        this.bah.setContentProperty(this.cn, this.co);
        this.bah.setContent(paramArrayOfObject);

        if ((this.bah.size() != 0) && (this.bah.getSelectedValue() == null)) {
          i = 0;
          localObject1 = this.bah.getItems().get(0);
          this.bah.setSelectedOffset(0);
        }
      }

      Object localObject2 = null;
      int j = -1;
      if (i == 0) {
        localObject2 = localObject1;
        j = 0;
      }
      setRenderableContent(localObject2, j);
    }
  }

  public void setHotSpotPosition(aFG paramaFG)
  {
    if (paramaFG != null)
      this.drn = paramaFG;
  }

  public void setAlign(aFG paramaFG) {
    if (paramaFG != null)
      this.aWn = paramaFG;
  }

  public void ajj()
  {
    super.ajj();
    setFocusable(true);
  }

  public void setBehaviour(ajY paramajY)
  {
    this.kXp = paramajY;
  }

  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    if (this.igL != null)
      this.igL.setEnabled(paramBoolean);
  }

  public void setNetEnabled(boolean paramBoolean) {
    super.setNetEnabled(paramBoolean);
    if (this.igL != null)
      this.igL.setNetEnabled(paramBoolean);
  }

  public void rV() {
    super.rV();
    if (this.igL != null)
      this.igL.setVisible(this.kXp.axk());
  }

  public void cON()
  {
    this.kXo = new aSb(this);

    a(CH.bGw, this.kXo, false);
  }

  public void a(bsP parambsP)
  {
    this.fvF = new aSd(this);

    parambsP.a(CH.bGu, this.fvF, false);

    this.cGQ = new aRW(this);

    parambsP.a(CH.bGv, this.cGQ, false);
  }

  public void D(ccG paramccG)
  {
    paramccG.a(CH.bGk, new aRY(this), false);
  }

  public void cdM()
  {
    if (this.kXm)
      closePopup();
    else
      cdN();
  }

  private void closePopup()
  {
    if (this.kXm) {
      this.bah.beG();
      this.kXm = false;

      MQ.WK().WN();
    }
  }

  private void cdN()
  {
    if (!this.kXm)
    {
      Or localOr = this.bah.getIdealSize(this.fdb, -1);

      int j = localOr.height;

      int k = getDisplayY();

      bsP localbsP = bsP.getInstance();

      aFG localaFG1 = this.aWn;
      aFG localaFG2 = this.drn;

      int m = getDisplayY() + localaFG1.iP(getHeight()) - localaFG2.iP(j);

      if ((m < 0) || (m > localbsP.getAppearance().getContentHeight() - j))
      {
        localaFG1 = localaFG1.aSd();
        localaFG2 = localaFG2.aSd();
      }

      m = getDisplayY() + localaFG1.iP(getHeight()) - localaFG2.iP(j);

      m = Math.max(0, Math.min(m, localbsP.getAppearance().getContentHeight() - j));

      if ((k - j < 0) && (k + getHeight() + j > localbsP.getHeight()))
      {
        j = k;
        m = 0;
      }

      this.bah.setSizeToPrefSize();
      int i = Math.max(this.bah.getWidth(), getWidth());

      this.bah.setSize(i, j);

      this.bah.setPosition(getDisplayX(), m);
      this.bah.setNonBlocking(false);

      localbsP.getLayeredContainer().b(this.bah, 30000);

      this.kXm = true;
      this.kXn = true;

      MQ.WK().WM();
    }
  }

  public boolean isAppearanceCompatible(Jg paramJg)
  {
    return paramJg instanceof av;
  }

  public void bc()
  {
    super.bc();

    bsP.getInstance().b(CH.bGu, this.fvF, false);

    bsP.getInstance().b(CH.bGv, this.cGQ, false);

    this.cGQ = null;
    this.fvF = null;
    this.kXo = null;

    this.aWn = null;
    this.drn = null;

    this.bah.beH();

    this.igL = null;
    this.bah = null;
    this.bRF = null;
  }

  public void aJ()
  {
    super.aJ();

    dEj localdEj = new dEj(this, null);
    localdEj.aJ();
    a(localdEj);

    av localav = new av();
    localav.aJ();
    localav.setWidget(this);
    a(localav);

    this.kXp = ajY.djI;

    biy localbiy = new biy();
    localbiy.aJ();
    a(localbiy);

    this.bah = new ccG();
    this.bah.aJ();

    this.bRF = new axU();
    this.bRF.aJ();

    this.meQ = false;

    cON();
    a(bsP.getInstance());
  }

  public void c(bdj parambdj)
  {
    ddG localddG = (ddG)parambdj;
    super.c(localddG);

    localddG.kXp = this.kXp;
    localddG.fdb = this.fdb;

    dOc localdOc = (dOc)this.bah.beO();

    localdOc.meW = false;
    localdOc.beJ();

    localddG.a(localdOc);

    localddG.b(CH.bGu, this.fvF, false);
    localddG.b(CH.bGv, this.cGQ, false);
    localddG.b(CH.bGw, this.kXo, false);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == fdh)
      setMaxRows(bUD.aR(paramString));
    else if (paramInt == drs)
      setAlign(aFG.gr(paramString));
    else if (paramInt == kXq)
      setBehaviour((ajY)paramaKN.b(ajY.class, paramString));
    else if (paramInt == drt)
      setHotSpotPosition(aFG.gr(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject)
  {
    if (paramInt == fdh)
      setMaxRows(bUD.aR(paramObject));
    else if (paramInt == drs)
      setAlign((aFG)paramObject);
    else if (paramInt == drt)
      setHotSpotPosition((aFG)paramObject);
    else if (paramInt == cs) {
      if ((paramObject == null) || (paramObject.getClass().isArray()))
        setContent((Object[])paramObject);
      else if ((paramObject instanceof Iterable))
        setContent((Iterable)paramObject);
      else
        return false;
    }
    else if (paramInt == cv)
      setSelectedValue(paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }
}