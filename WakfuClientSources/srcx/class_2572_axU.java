import java.util.ArrayList;
import org.apache.log4j.Logger;

public class axU extends dRq
  implements vn
{
  public static final String TAG = "renderableContainer";
  private aNL[] dNj;
  private ArrayList dNk;
  private final ArrayList dNl = new ArrayList();

  private cZd dNm = null;

  private eR dNn = null;

  private azz bZ = new azz();

  private cWq dNo = null;

  private cpa dNp = null;
  private bXx aBc;
  private boolean ce = true;

  private boolean dNq = false;

  private NH dNr = null;

  private doN dNs = null;

  private String cn = null;
  private cpa co = null;

  public static final int cs = "content".hashCode();
  public static final int dNt = "enableDND".hashCode();

  public axU()
  {
    this(null);
  }

  public axU(cWq paramcWq) {
    this.dNo = paramcWq;
    setNonBlocking(false);
  }

  public void a(aNL paramaNL)
  {
    super.a(paramaNL);
    if ((paramaNL instanceof eR))
      this.bZ.a((eR)paramaNL);
  }

  private void aJw()
  {
    if (this.dNr != null) {
      ajT.axh().a(this.dNr, true);
    }
    this.dNr = new NH(this);
    ajT.axh().a(this.dNr);
  }

  public void g(aNL paramaNL)
  {
    this.dNl.add(paramaNL);
    a(paramaNL);
  }

  public void a(CH paramCH, doN paramdoN, boolean paramBoolean)
  {
    super.a(paramCH, paramdoN, paramBoolean);
    if ((paramCH == CH.bGe) && (this.dNs == null)) {
      this.dNs = new ahE(this);

      super.a(CH.bGx, this.dNs, false);
    }
  }

  public void b(CH paramCH, doN paramdoN, boolean paramBoolean)
  {
    super.b(paramCH, paramdoN, paramBoolean);
    if ((paramCH == CH.bGe) && (a(paramCH))) {
      b(CH.bGx, this.dNs, false);
      this.dNs = null;
    }
  }

  public String getTag()
  {
    return "renderableContainer";
  }

  public void setRenderableChildren(aNL[] paramArrayOfaNL)
  {
    this.dNj = paramArrayOfaNL;
  }

  public void setItemElements(ArrayList paramArrayList)
  {
    this.dNk = paramArrayList;
  }

  public void setRenderer(eR parameR) {
    if (parameR != this.dNn)
    {
      if (this.dNn != null) {
        this.dNn.c(this);
      }

      this.dNn = parameR;

      for (int i = this.dNl.size() - 1; i >= 0; i--) {
        i((aNL)this.dNl.get(i));
      }

      this.dNl.clear();
    }
  }

  public boolean getEnableDND()
  {
    return this.ce;
  }

  public void setEnableDND(boolean paramBoolean)
  {
    this.ce = paramBoolean;
  }

  public boolean aJx() {
    return (this.ce) && (this.aBc.isEnabledFull());
  }

  public azz getRendererManager() {
    return this.bZ;
  }

  public void setRendererManager(azz paramazz) {
    if ((paramazz != null) && (this.bZ != paramazz)) {
      if (this.bZ != null) {
        this.bZ.h(this);
      }

      this.bZ = paramazz;
      this.bZ.g(this);
    }
  }

  public void setContentProperty(String paramString, cpa paramcpa)
  {
    this.cn = paramString;
    this.co = paramcpa;
  }

  public void c(dMr paramdMr)
  {
    Object localObject = this.dNm == null ? null : this.dNm.getValue();
    cEv localcEv = cEv.a(paramdMr, this, CH.bGg, localObject);
    g(localcEv);
    paramdMr.iH(localcEv.cIn());
  }

  public void d(dMr paramdMr)
  {
    Object localObject = this.dNm == null ? null : this.dNm.getValue();
    cEv localcEv = cEv.a(paramdMr, this, CH.bGf, localObject);
    g(localcEv);
    paramdMr.iH(localcEv.cIn());
  }

  public void e(dMr paramdMr)
  {
    Object localObject = this.dNm == null ? null : this.dNm.getValue();
    cEv localcEv = cEv.a(paramdMr, this, CH.bGd, localObject);
    g(localcEv);
    paramdMr.iH(localcEv.cIn());
  }

  public void f(dMr paramdMr)
  {
    Object localObject = this.dNm == null ? null : this.dNm.getValue();
    cEv localcEv = cEv.a(paramdMr, this, CH.bGe, localObject);
    g(localcEv);
    paramdMr.iH(localcEv.cIn());
  }

  public void aJy() {
    if ((this.dNn != null) && 
      (this.dNj != null) && (this.dNj.length != 0)) {
      this.dNn.a(this.dNj, this.dNm);
    }

    this.dNq = false;
  }

  public cWq getCollection()
  {
    return this.dNo;
  }

  public void setCollection(cWq paramcWq)
  {
    this.dNo = paramcWq;
  }

  public void setInnerElementMap(cpa paramcpa)
  {
    this.dNp = paramcpa;
  }

  public cpa getInnerElementMap()
  {
    return this.dNp;
  }

  public void setContent(Object paramObject) {
    if (this.fnS) {
      return;
    }
    if ((this.dNm == null) || (this.dNm.getValue() != paramObject)) {
      setItemValue(paramObject);
    }
    this.dNq = true;
  }

  public void setItem(cZd paramcZd) {
    setItem(paramcZd, false);
  }

  public void setItem(cZd paramcZd, boolean paramBoolean) {
    if (this.dNm != paramcZd) {
      a(this.dNm);
      cZd.d(this.dNm);
      this.dNm = paramcZd;
      l(true, paramBoolean);
    }
  }

  public void aJz() {
    l(true, false);
  }

  public void l(boolean paramBoolean1, boolean paramBoolean2) {
    paramBoolean2 = false;

    if (this.bZ == null) {
      return;
    }

    if (this.bZ.i(this)) {
      aJA();
      paramBoolean1 = true;
    }

    if ((this.dNk != null) && (this.dNm != null) && (this.dNm.cMf() != null)) {
      bbo localbbo1 = this.dNm.cMf();
      if ((localbbo1.getValue() instanceof dBv)) {
        int i = 0; for (int j = this.dNk.size(); i < j; i++) {
          aaE localaaE = (aaE)this.dNk.get(i);
          Object localObject;
          if (localaaE.getParent() != null)
            localObject = localaaE.getParent();
          else {
            localObject = localaaE;
          }
          if ((localaaE.getField() != null) && (localaaE.getField().contains("/")))
          {
            Cs localCs = bbo.d(localbbo1.getValue(), localaaE.getField());

            String str1 = localaaE.getField().substring(0, localaaE.getField().length() - ((String)localCs.Lp()).length() - 1);
            String str2 = localbbo1.getName() + "/" + str1;

            bbo localbbo2 = dLE.doY().l(str2, this.co);

            if (localbbo2 == null) {
              localbbo2 = new bbo(str2, localbbo1, str1, this.co);
              localbbo2.setValue(localCs.getFirst(), false);
              dLE.doY().c(localbbo2);
            }

            localbbo2.a(new dBf(localObject, IZ.Sq().dc(((aNL)localObject).getTag()), localaaE.getAttribute(), (String)localCs.Lp(), localaaE.getResultProvider()));
          } else {
            localbbo1.a(new dBf(localObject, IZ.Sq().dc(((aNL)localObject).getTag()), localaaE.getAttribute(), localaaE.getField(), localaaE.getResultProvider()));
          }
        }
      }
    }

    if (paramBoolean1)
      if (paramBoolean2)
        aJy();
      else
        this.dNq = true;
  }

  public cWq getRenderableCollection()
  {
    return this.dNo;
  }

  public void setItemValue(Object paramObject) {
    cZd localcZd = cZd.a(paramObject, this.cn, this.co, this);

    setItem(localcZd);
  }

  public Object getItemValue() {
    if (this.dNm != null) {
      return this.dNm.getValue();
    }
    return null;
  }

  public cZd getItem() {
    return this.dNm;
  }

  public eR getRenderer() {
    return this.dNn;
  }

  public void aJA() {
    if ((this.mmr != null) && (this.mmr.size() == 0) && (this.dNn != null)) {
      this.dNn.d(this);
      anT.aAo().aAr();
    }
  }

  public bXx getDragNDropable()
  {
    return this.aBc;
  }

  public void setDragNDropable(bXx parambXx) {
    if (this.aBc == null)
      aJw();
    this.aBc = parambXx;
  }

  public void aJB()
  {
    a(CH.bGs, new ahF(this), false);

    a(CH.bGt, new ahC(this), false);

    a(CH.bGw, new ahD(this), false);
  }

  public void aJC()
  {
    a(this.dNm);
  }

  private void a(cZd paramcZd)
  {
    bbo localbbo1;
    if ((paramcZd != null) && (paramcZd.cMf() != null) && (this.dNk != null)) {
      localbbo1 = paramcZd.cMf();
      if ((localbbo1.getValue() instanceof dBv))
        for (aaE localaaE : this.dNk)
        {
          Object localObject;
          if (localaaE.getParent() != null)
            localObject = localaaE.getParent();
          else {
            localObject = localaaE;
          }
          if ((localaaE.getField() != null) && (localaaE.getField().contains("/")))
          {
            Cs localCs = bbo.d(localbbo1.getValue(), localaaE.getField());

            String str1 = localaaE.getField().substring(0, localaaE.getField().length() - ((String)localCs.Lp()).length() - 1);
            String str2 = localbbo1.getName() + "/" + str1;

            bbo localbbo2 = dLE.doY().l(str2, this.co);

            if (localbbo2 != null)
              localbbo2.ba((bdj)localObject);
          }
          else
          {
            localbbo1.ba((bdj)localObject);
          }
        }
    }
  }

  public void aJD()
  {
    this.dNq = true;
  }

  public boolean aJE() {
    boolean bool = false;

    if (this.dNn == null) {
      l(true, false);
      bool = true;
    }
    if (this.dNq) {
      aJy();
      bool = true;
    }

    return bool;
  }

  public void c(bdj parambdj)
  {
    axU localaxU = (axU)parambdj;
    super.c(parambdj);

    localaxU.ce = this.ce;

    for (int i = localaxU.mmr.size() - 1; i >= 0; i--) {
      ((dOc)localaxU.mmr.get(i)).beH();
    }

    if (this.dNs != null)
      localaxU.dNs = new ahI(this, localaxU);
  }

  public void bc()
  {
    super.bc();

    if (this.dNr != null) {
      try {
        ajT.axh().a(this.dNr, true);
      } catch (Exception localException) {
        K.error("", localException);
      }
    }
    this.dNr = null;

    cwf.ctJ().k(this);
    this.dNl.clear();
    this.dNo = null;
    this.aBc = null;
    this.dNj = null;

    if (this.dNm != null) {
      a(this.dNm);
      cZd.d(this.dNm);
      this.dNm = null;
    }

    if (this.dNk != null) {
      this.dNk.clear();
      this.dNk = null;
    }

    this.cn = null;
    this.co = null;

    this.dNp = null;

    this.dNn = null;

    if (this.bZ != null) {
      this.bZ.h(this);
      this.bZ = null;
    }
  }

  public void aJ()
  {
    cwf.ctJ().j(this);
    super.aJ();
    aJB();
    this.ce = true;
    this.meQ = false;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == dNt)
      setEnableDND(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == cs)
      setContent(paramObject);
    else if (paramInt == dNt)
      setEnableDND(bUD.getBoolean(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}