import java.awt.Insets;
import java.util.HashMap;
import org.apache.log4j.Logger;

public class aKN
{
  private static Logger K = Logger.getLogger(aKN.class);

  private final HashMap eoK = new HashMap();

  private static final aKN eoL = new aKN();

  private aKN()
  {
    bct();
  }

  public static synchronized aKN bcs() {
    return eoL;
  }

  private void bct()
  {
    a(bNa.class, new axn());
    a(Or.class, new dRC());
    a(Insets.class, new MX());
    a(String.class, new aPj());
    a(cwC.class, new dPh());
    a(uz.class, new bqR());

    djx localdjx = new djx();
    a(aFD.class, localdjx);
    a(aFE.class, localdjx);
    a(aFH.class, localdjx);
    a(aFG.class, localdjx);
    a(ajf.class, localdjx);
    a(ajb.class, localdjx);
    a(bSi.class, localdjx);
    a(cFu.class, localdjx);
    a(duv.class, localdjx);
    a(CH.class, localdjx);
    a(cke.class, localdjx);
    a(cD.class, localdjx);
    a(aQA.class, localdjx);
    a(cBo.class, localdjx);
    a(Pw.class, localdjx);
    a(bpg.class, localdjx);
    a(dwA.class, localdjx);
    a(dOf.class, localdjx);
    a(bOo.class, localdjx);
    a(bGn.class, localdjx);
    a(ajY.class, localdjx);

    a(Object.class, new dvd());

    crp localcrp = new crp();
    a(Boolean.TYPE, localcrp);
    a(Integer.TYPE, localcrp);
    a(Long.TYPE, localcrp);
    a(Float.TYPE, localcrp);
    a(Double.TYPE, localcrp);
    a(Byte.TYPE, localcrp);
    a(Short.TYPE, localcrp);
    a(Boolean.class, localcrp);
    a(Integer.class, localcrp);
    a(Long.class, localcrp);
    a(Float.class, localcrp);
    a(Double.class, localcrp);
    a(Byte.class, localcrp);
    a(Short.class, localcrp);

    Xj localXj = new Xj();

    a(XJ.class, localXj);

    a(vI.class, localXj);
    a(zZ.class, localXj);
    a(bmW.class, localXj);
    a(dVA.class, localXj);
    a(boO.class, localXj);
    a(Bc.class, localXj);
    a(bQa.class, localXj);
    a(fp.class, localXj);
    a(cVk.class, localXj);
    a(anx.class, localXj);
    a(aqC.class, localXj);
    a(bpP.class, localXj);
    a(aOn.class, localXj);
    a(akx.class, localXj);
    a(dbp.class, localXj);
    a(dTZ.class, localXj);
    a(blg.class, localXj);
    a(cnr.class, localXj);
    a(ajE.class, localXj);
    a(csA.class, localXj);
    a(Zd.class, localXj);
    a(EB.class, localXj);
    a(bLt.class, localXj);
    a(VS.class, localXj);
    a(bDy.class, localXj);
    a(DY.class, localXj);
    a(aDL.class, localXj);
    a(aMB.class, localXj);
    a(adV.class, localXj);
    a(vT.class, localXj);
    a(bpv.class, localXj);
    a(bvO.class, localXj);
    a(dis.class, localXj);
    a(aIr.class, localXj);
    a(aFU.class, localXj);
    a(cCu.class, localXj);
    a(jL.class, localXj);

    a(bAu.class, new cnx());
    a(bmy.class, new cBr());
  }

  public void a(Class paramClass, Vj paramVj)
  {
    if (!this.eoK.containsKey(paramClass))
      this.eoK.put(paramClass, paramVj);
    else
      K.error("le convertisseur (template=" + paramClass.toString() + ") est déjà utilisé !");
  }

  public boolean H(Class paramClass)
  {
    if (paramClass.equals(Object.class)) {
      return false;
    }

    boolean bool = this.eoK.containsKey(paramClass);
    if (!bool) {
      for (Class localClass : this.eoK.keySet()) {
        if ((bool = paramClass.isAssignableFrom(localClass))) {
          break;
        }
      }
    }
    return bool;
  }

  public Object b(Class paramClass, String paramString)
  {
    return I(paramClass).b(paramClass, paramString);
  }

  public Vj I(Class paramClass)
  {
    Vj localVj = (Vj)this.eoK.get(paramClass);
    if (localVj == null) {
      throw new NullPointerException("On essaye de trouver un convertisseur pour le type " + paramClass.getSimpleName());
    }
    return localVj;
  }

  public bNa gJ(String paramString) {
    return (bNa)b(bNa.class, paramString);
  }

  public Or gK(String paramString) {
    return (Or)b(Or.class, paramString);
  }

  public String gL(String paramString) {
    return (String)b(String.class, paramString);
  }

  public Insets gM(String paramString) {
    return (Insets)b(Insets.class, paramString);
  }

  public uz gN(String paramString) {
    return (uz)b(uz.class, paramString);
  }

  public P gO(String paramString) {
    return (P)b(P.class, paramString);
  }

  public cwC gP(String paramString) {
    return (cwC)b(cwC.class, paramString);
  }
}