import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class eR extends bxE
{
  public static final String TAG = "ItemRenderer";
  private static final Logger K = Logger.getLogger(eR.class);

  private azz aBa = null;

  private ArrayList aBb = new ArrayList();

  private bXx aBc = null;
  private fu aBd;
  private ArrayList aBe = new ArrayList();

  private ArrayList aBf = new ArrayList();

  private static final ArrayList aBg = new ArrayList();

  public static final int aBh = "onActivation".hashCode();
  public static final int aBi = "onClick".hashCode();
  public static final int aBj = "onDoubleClick".hashCode();
  public static final int aBk = "onFocusChange".hashCode();
  public static final int aBl = "onItemClick".hashCode();
  public static final int aBm = "onItemDoubleClick".hashCode();
  public static final int aBn = "onItemOut".hashCode();
  public static final int aBo = "onItemOver".hashCode();
  public static final int aBp = "onKeyPress".hashCode();
  public static final int aBq = "onKeyRelease".hashCode();
  public static final int aBr = "onKeyType".hashCode();
  public static final int aBs = "onListSelectionChange".hashCode();
  public static final int aBt = "onMouseDrag".hashCode();
  public static final int aBu = "onMouseDragIn".hashCode();
  public static final int aBv = "onMouseDragOut".hashCode();
  public static final int aBw = "onMouseEnter".hashCode();
  public static final int aBx = "onMouseExit".hashCode();
  public static final int aBy = "onMouseMove".hashCode();
  public static final int aBz = "onMousePress".hashCode();
  public static final int aBA = "onMouseRelease".hashCode();
  public static final int aBB = "onMouseWheel".hashCode();
  public static final int aBC = "onSelectionChange".hashCode();
  public static final int aBD = "onSliderMove".hashCode();
  public static final int aBE = "onDrag".hashCode();
  public static final int aBF = "onDrop".hashCode();
  public static final int aBG = "onDragOut".hashCode();
  public static final int aBH = "onDropOut".hashCode();
  public static final int aBI = "onDragOver".hashCode();
  public static final int aBJ = "onPopupDisplay".hashCode();
  public static final int aBK = "onPopupHide".hashCode();

  public void b(axU paramaxU)
  {
    for (XJ localXJ : this.aBf)
      paramaxU.a(localXJ.mp(), localXJ, false);
  }

  public void c(axU paramaxU)
  {
    for (XJ localXJ : this.aBf)
      paramaxU.b(localXJ.mp(), localXJ, false);
  }

  public String getTag()
  {
    return "ItemRenderer";
  }

  public azz getManager() {
    return this.aBa;
  }

  public void setManager(azz paramazz) {
    this.aBa = paramazz;
  }

  public void setOnActivation(vI paramvI) {
    this.aBf.add(paramvI);
  }

  public void setOnClick(csA paramcsA) {
    this.aBf.add(paramcsA);
  }

  public void setOnDoubleClick(Zd paramZd) {
    this.aBf.add(paramZd);
  }

  public void setOnFocusChange(bmW parambmW) {
    this.aBf.add(parambmW);
  }

  public void setOnKeyPress(aOn paramaOn) {
    this.aBf.add(paramaOn);
  }

  public void setOnKeyRelease(akx paramakx) {
    this.aBf.add(paramakx);
  }

  public void setOnKeyType(dbp paramdbp) {
    this.aBf.add(paramdbp);
  }

  public void setOnListSelectionChange(dTZ paramdTZ) {
    this.aBf.add(paramdTZ);
  }

  public void setOnMouseDrag(EB paramEB) {
    this.aBf.add(paramEB);
  }

  public void setOnMouseDragIn(bLt parambLt) {
    this.aBf.add(parambLt);
  }

  public void setOnMouseDragOut(VS paramVS) {
    this.aBf.add(paramVS);
  }

  public void setOnMouseEnter(bDy parambDy) {
    this.aBf.add(parambDy);
  }

  public void setOnMouseExit(DY paramDY) {
    this.aBf.add(paramDY);
  }

  public void setOnMouseMove(aDL paramaDL) {
    this.aBf.add(paramaDL);
  }

  public void setOnMousePress(aMB paramaMB) {
    this.aBf.add(paramaMB);
  }

  public void setOnMouseRelease(adV paramadV) {
    this.aBf.add(paramadV);
  }

  public void setOnMouseWheel(vT paramvT) {
    this.aBf.add(paramvT);
  }

  public void setOnItemOut(cVk paramcVk) {
    this.aBf.add(paramcVk);
  }

  public void setOnItemOver(anx paramanx) {
    this.aBf.add(paramanx);
  }

  public void setOnItemClick(aqC paramaqC) {
    this.aBf.add(paramaqC);
  }

  public void setOnItemDoubleClick(bpP parambpP) {
    this.aBf.add(parambpP);
  }

  public void setOnDrag(dVA paramdVA) {
    this.aBf.add(paramdVA);
  }

  public void setOnDrop(bQa parambQa) {
    this.aBf.add(parambQa);
  }

  public void setOnDropOut(fp paramfp) {
    this.aBf.add(paramfp);
  }

  public void setOnDragOut(boO paramboO) {
    this.aBf.add(paramboO);
  }

  public void setOnDragOver(Bc paramBc) {
    this.aBf.add(paramBc);
  }

  public void setOnSliderMove(dis paramdis) {
    this.aBf.add(paramdis);
  }

  public void setOnSelectionChange(bvO parambvO) {
    this.aBf.add(parambvO);
  }

  public void setOnPopupDisplay(cCu paramcCu) {
    this.aBf.add(paramcCu);
  }

  public void setOnPopupHide(jL paramjL) {
    this.aBf.add(paramjL);
  }

  public void a(aNL paramaNL)
  {
    int i = 1;
    if ((paramaNL instanceof fu)) {
      this.aBd = ((fu)paramaNL);
    } else if ((paramaNL instanceof NK)) {
      this.aBe.add((NK)paramaNL);
    } else {
      if ((paramaNL instanceof dOc)) {
        ((dOc)paramaNL).setVisible(false);
      }
      this.aBb.add(paramaNL);
      paramaNL.setIsATemplate(true);
      i = 0;
    }
    if (i != 0)
      super.a(paramaNL, false);
  }

  public boolean isRenderableCompatible(axU paramaxU)
  {
    if (this.aBd != null) {
      Object localObject = this.aBd.getResult(paramaxU);
      if ((localObject instanceof Boolean)) {
        return ((Boolean)localObject).booleanValue();
      }
    }

    return true;
  }

  public void d(axU paramaxU)
  {
    this.aBc = null;
    ArrayList localArrayList = new ArrayList();

    cpa localcpa = new cpa(null, this.cUY.coO());
    localcpa.d(this.cUY);

    for (NK localNK : this.aBe) {
      localNK.ZV();
      localObject = localNK.getProperty();
      if (localObject != null)
      {
        ((bbo)localObject).ba(paramaxU);
      }
      localNK.aI(paramaxU);
    }
    Object localObject;
    b(paramaxU);

    int i = 0; for (int j = this.aBb.size(); i < j; i++) {
      localObject = ((aNL)this.aBb.get(i)).beO();
      if ((localObject instanceof dOc)) {
        ((dOc)localObject).setVisible(true);
      }
      a((aNL)localObject, aBg, localArrayList, paramaxU, null, localcpa);
      paramaxU.g((aNL)localObject);
    }

    if (this.aBc != null) {
      paramaxU.setDragNDropable(this.aBc);
    }

    paramaxU.setInnerElementMap(localcpa);
    paramaxU.setRenderableChildren((aNL[])aBg.toArray(new aNL[aBg.size()]));
    paramaxU.setItemElements(localArrayList);

    aBg.clear();
  }

  private void a(aNL paramaNL, ArrayList paramArrayList1, ArrayList paramArrayList2, axU paramaxU, bXx parambXx, cpa paramcpa)
  {
    paramaNL.setElementMap(paramcpa);
    if (paramaNL.getId() != null) {
      paramcpa.a(paramaNL.getId(), paramaNL);
    }

    if (((paramaNL instanceof aaE)) && (paramaNL.getParentOfType(eR.class) == null)) {
      paramArrayList2.add((aaE)paramaNL);

      if (paramaNL.getParent() != null)
        localObject = paramaNL.getParent();
      else {
        localObject = paramaxU;
      }

      if (!paramArrayList1.contains(localObject)) {
        paramArrayList1.add(localObject);
      }

    }

    if ((paramaNL instanceof dOc)) {
      paramaNL.setRenderableParent(paramaxU);
      if ((paramaNL instanceof bXx)) {
        this.aBc = (parambXx = (bXx)paramaNL);
        ((dOc)paramaNL).setDragAndDropParent(parambXx);
      }
    }

    for (Object localObject = paramaNL.getChildren().iterator(); ((Iterator)localObject).hasNext(); ) { aNL localaNL = (aNL)((Iterator)localObject).next();
      a(localaNL, paramArrayList1, paramArrayList2, paramaxU, parambXx, paramcpa);
    }
  }

  private void a(aNL paramaNL, String paramString1, int paramInt, cZd paramcZd, String paramString2, fu paramfu)
  {
    if ((paramaNL == null) || (paramString1 == null)) {
      return;
    }
    try
    {
      aFw.a(paramString1, paramaNL, paramcZd, paramInt, paramString2, paramfu);
    } catch (Exception localException) {
      K.error("Erreur à l'invoke method=" + paramString1, localException);
    }
  }

  public void a(aNL[] paramArrayOfaNL, cZd paramcZd) {
    if (paramArrayOfaNL == null) {
      return;
    }
    for (aNL localaNL1 : paramArrayOfaNL) {
      ArrayList localArrayList = localaNL1.getChildren();
      aNL[] arrayOfaNL2 = (aNL[])localArrayList.toArray(new aNL[localArrayList.size()]);
      for (aNL localaNL2 : arrayOfaNL2)
        if ((localaNL2 instanceof aaE))
        {
          aaE localaaE = (aaE)localaNL2;
          String str = paramcZd != null ? localaaE.getField() : null;
          a(localaNL1, localaaE.getAttribute(), localaaE.getAttributeHash(), paramcZd, str, localaaE.getResultProvider());
        }
    }
  }

  public boolean b(cSx paramcSx)
  {
    return false;
  }

  public boolean c(cSx paramcSx)
  {
    return false;
  }

  public void bc()
  {
    super.bc();
    this.aBd = null;
    this.aBc = null;
    this.aBf.clear();
    this.aBf = null;
    this.aBe.clear();
    this.aBe = null;
    if (this.aBb != null) {
      for (int i = this.aBb.size() - 1; i >= 0; i--) {
        ((aNL)this.aBb.get(i)).release();
      }
      this.aBb.clear();
      this.aBb = null;
    }

    this.aBa = null;
  }

  public void aJ() {
    super.aJ();
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);
    eR localeR = (eR)parambdj;
    localeR.aBf.addAll(this.aBf);
    for (int i = 0; i < this.aBb.size(); i++)
      localeR.aBb.add(((aNL)this.aBb.get(i)).beO());
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == aBh)
      setOnActivation((vI)paramaKN.b(vI.class, paramString));
    else if (paramInt == aBi)
      setOnClick((csA)paramaKN.b(csA.class, paramString));
    else if (paramInt == aBj)
      setOnDoubleClick((Zd)paramaKN.b(Zd.class, paramString));
    else if (paramInt == aBk)
      setOnFocusChange((bmW)paramaKN.b(bmW.class, paramString));
    else if (paramInt == aBl)
      setOnItemClick((aqC)paramaKN.b(aqC.class, paramString));
    else if (paramInt == aBm)
      setOnItemDoubleClick((bpP)paramaKN.b(bpP.class, paramString));
    else if (paramInt == aBn)
      setOnItemOut((cVk)paramaKN.b(cVk.class, paramString));
    else if (paramInt == aBo)
      setOnItemOver((anx)paramaKN.b(anx.class, paramString));
    else if (paramInt == aBE)
      setOnDrag((dVA)paramaKN.b(dVA.class, paramString));
    else if (paramInt == aBF)
      setOnDrop((bQa)paramaKN.b(bQa.class, paramString));
    else if (paramInt == aBG)
      setOnDragOut((boO)paramaKN.b(boO.class, paramString));
    else if (paramInt == aBH)
      setOnDropOut((fp)paramaKN.b(fp.class, paramString));
    else if (paramInt == aBI)
      setOnDragOver((Bc)paramaKN.b(Bc.class, paramString));
    else if (paramInt == aBp)
      setOnKeyPress((aOn)paramaKN.b(aOn.class, paramString));
    else if (paramInt == aBq)
      setOnKeyRelease((akx)paramaKN.b(akx.class, paramString));
    else if (paramInt == aBr)
      setOnKeyType((dbp)paramaKN.b(dbp.class, paramString));
    else if (paramInt == aBs)
      setOnListSelectionChange((dTZ)paramaKN.b(dTZ.class, paramString));
    else if (paramInt == aBt)
      setOnMouseDrag((EB)paramaKN.b(EB.class, paramString));
    else if (paramInt == aBu)
      setOnMouseDragIn((bLt)paramaKN.b(bLt.class, paramString));
    else if (paramInt == aBv)
      setOnMouseDragOut((VS)paramaKN.b(VS.class, paramString));
    else if (paramInt == aBw)
      setOnMouseEnter((bDy)paramaKN.b(bDy.class, paramString));
    else if (paramInt == aBx)
      setOnMouseExit((DY)paramaKN.b(DY.class, paramString));
    else if (paramInt == aBy)
      setOnMouseMove((aDL)paramaKN.b(aDL.class, paramString));
    else if (paramInt == aBz)
      setOnMousePress((aMB)paramaKN.b(aMB.class, paramString));
    else if (paramInt == aBA)
      setOnMouseRelease((adV)paramaKN.b(adV.class, paramString));
    else if (paramInt == aBB)
      setOnMouseWheel((vT)paramaKN.b(vT.class, paramString));
    else if (paramInt == aBC)
      setOnSelectionChange((bvO)paramaKN.b(bvO.class, paramString));
    else if (paramInt == aBD)
      setOnSliderMove((dis)paramaKN.b(dis.class, paramString));
    else if (paramInt == aBJ)
      setOnPopupDisplay((cCu)paramaKN.b(cCu.class, paramString));
    else if (paramInt == aBK)
      setOnPopupHide((jL)paramaKN.b(jL.class, paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }
}