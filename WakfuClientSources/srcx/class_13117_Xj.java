public class Xj
  implements Vj
{
  private Class caa = XJ.class;

  public XJ dO(String paramString) {
    return null;
  }

  public XJ c(Class paramClass, String paramString) {
    Object localObject = null;

    if (paramString != null) {
      if (paramClass.equals(vI.class))
        localObject = new vI();
      else if (paramClass.equals(zZ.class))
        localObject = new zZ();
      else if (paramClass.equals(bmW.class))
        localObject = new bmW();
      else if (paramClass.equals(aOn.class))
        localObject = new aOn();
      else if (paramClass.equals(akx.class))
        localObject = new akx();
      else if (paramClass.equals(dbp.class))
        localObject = new dbp();
      else if (paramClass.equals(blg.class))
        localObject = new blg();
      else if (paramClass.equals(cnr.class))
        localObject = new cnr();
      else if (paramClass.equals(ajE.class))
        localObject = new ajE();
      else if (paramClass.equals(aMB.class))
        localObject = new aMB();
      else if (paramClass.equals(adV.class))
        localObject = new adV();
      else if (paramClass.equals(csA.class))
        localObject = new csA();
      else if (paramClass.equals(Zd.class))
        localObject = new Zd();
      else if (paramClass.equals(bDy.class))
        localObject = new bDy();
      else if (paramClass.equals(DY.class))
        localObject = new DY();
      else if (paramClass.equals(VS.class))
        localObject = new VS();
      else if (paramClass.equals(EB.class))
        localObject = new EB();
      else if (paramClass.equals(bLt.class))
        localObject = new bLt();
      else if (paramClass.equals(aDL.class))
        localObject = new aDL();
      else if (paramClass.equals(adV.class))
        localObject = new adV();
      else if (paramClass.equals(vT.class))
        localObject = new vT();
      else if (paramClass.equals(bpv.class))
        localObject = new bpv();
      else if (paramClass.equals(bvO.class))
        localObject = new bvO();
      else if (paramClass.equals(dis.class))
        localObject = new dis();
      else if (paramClass.equals(aIr.class))
        localObject = new aIr();
      else if (paramClass.equals(aFU.class))
        localObject = new aFU();
      else if (paramClass.equals(cVk.class))
        localObject = new cVk();
      else if (paramClass.equals(anx.class))
        localObject = new anx();
      else if (paramClass.equals(aqC.class))
        localObject = new aqC();
      else if (paramClass.equals(bpP.class))
        localObject = new bpP();
      else if (paramClass.equals(dVA.class))
        localObject = new dVA();
      else if (paramClass.equals(boO.class))
        localObject = new boO();
      else if (paramClass.equals(Bc.class))
        localObject = new Bc();
      else if (paramClass.equals(bQa.class))
        localObject = new bQa();
      else if (paramClass.equals(fp.class))
        localObject = new fp();
      else if (paramClass.equals(dTZ.class))
        localObject = new dTZ();
      else if (paramClass.equals(cCu.class))
        localObject = new cCu();
      else if (paramClass.equals(jL.class)) {
        localObject = new jL();
      }
    }

    if (localObject != null) {
      ((XJ)localObject).hg(paramString);
    }

    return localObject;
  }

  public Class WY() {
    return this.caa;
  }

  public boolean WZ() {
    return true;
  }

  public boolean Xa() {
    return true;
  }

  public String a(deg paramdeg, uk paramuk, Class paramClass, String paramString, cDA paramcDA)
  {
    String str = paramdeg.can();
    paramdeg.al(paramClass);
    paramdeg.a(new cHH(paramClass, str, "new " + paramClass.getSimpleName() + "()"));
    paramdeg.a(new bol(null, "setCallBackFunc", str, new String[] { "\"" + paramString + "\"" }));

    return str;
  }
}