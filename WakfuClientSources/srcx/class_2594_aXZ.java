import java.util.ArrayList;

public class aXZ extends bZw
{
  public static final String RH = "iconUrl";
  public static final String epR = "surface";
  public static final String RI = "description";
  public static final String aRj = "sidoaNeed";
  public static final String aRk = "buildDelay";
  public static final String aRl = "conditions";
  public static final String epS = "effects";
  public static final String epT = "ressourcesCost";
  public static final String fdJ = "evolutionName";
  public static final String[] bF = x(new String[] { "iconUrl", "surface", "description", "sidoaNeed", "buildDelay", "conditions", "effects", "ressourcesCost", "evolutionName" });
  private final aLw fdK;

  public String[] getFields()
  {
    return bF;
  }

  public aXZ(bOB parambOB)
  {
    super(parambOB);
    this.fdK = dfX.laF.ea(aDF.d(parambOB).nc());
  }

  public Object getFieldValue(String paramString)
  {
    Object localObject1 = super.getFieldValue(paramString);
    if (localObject1 != null) {
      return localObject1;
    }

    if (paramString.equals("description"))
      return bU.fH().b(123, ((bOB)this.hpX).nc(), new Object[0]);
    Object localObject2;
    Object localObject3;
    if (paramString.equals("conditions")) {
      localObject2 = new lZ();
      localObject3 = bZv.cdR().cea();

      ((bOB)this.hpX).N(new bSv(this, (lZ)localObject2));

      return ((lZ)localObject2).length() > 0 ? ((lZ)localObject2).tP() : null;
    }
    if (paramString.equals("sidoaNeed")) {
      if (this.fdK == null) {
        return Integer.valueOf(0);
      }
      localObject2 = this.fdK.bdb();
      if (localObject2 == null) {
        return Integer.valueOf(0);
      }
      localObject3 = aDF.f((cUh)localObject2);
      lZ locallZ1 = new lZ();
      if ((this.hpW != null) && (this.hpW.b(cLT.iLC))) {
        locallZ1.am(bNa.gRz.bUV());
      }
      locallZ1.v(((cUh)localObject3).cJv());
      return locallZ1.tP();
    }
    if (paramString.equals("ressourcesCost")) {
      int i = ((bOB)this.hpX).bVw();
      if (i == 0) {
        return null;
      }

      localObject3 = aDF.e((bOB)this.hpX);
      int j = dGu.b((cUh)localObject3, dfX.laF.cPy());
      String str = bU.fH().iK(j);
      lZ locallZ2 = new lZ();
      if ((this.hpW != null) && (this.hpW.b(cLT.iLF))) {
        locallZ2.am(bNa.gRz.bUV());
      }
      locallZ2.a(str);
      return locallZ2.tP();
    }
    if (paramString.equals("evolutionName")) {
      cUh localcUh1 = bnr();
      if (localcUh1 == null) {
        return null;
      }
      localObject3 = ars.dzL.aN(localcUh1.nc());
      if (localObject3 == null) {
        return null;
      }
      cUh localcUh2 = ars.dzL.aM(((dAi)localObject3).ddx());
      if (localcUh2 == null) {
        return null;
      }
      return bU.fH().b(126, localcUh2.nc(), new Object[0]);
    }
    return this.fdK.getFieldValue(paramString);
  }

  public boolean ux() {
    return (this.hpW == null) || (!this.hpW.b(cLT.iLA));
  }

  public int sA() {
    return bZv.cdR().cU(this.fdK.bdb().nc());
  }

  public String getName()
  {
    return this.fdK.getName();
  }

  public bZw uy() {
    aXZ localaXZ = new aXZ((bOB)this.hpX);
    return localaXZ;
  }

  public cUh bnr() {
    return aDF.d((bOB)this.hpX);
  }

  public bUj uz()
  {
    return bUj.hga;
  }

  public int bns() {
    return aDF.e((bOB)this.hpX).nc();
  }

  private bhP op(int paramInt) {
    if (this.hpW == null) {
      return null;
    }
    ArrayList localArrayList = this.hpW.aIy();
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      Gz localGz = (Gz)localArrayList.get(i);
      if (localGz.yE() == cLT.iLE)
      {
        bhP localbhP = (bhP)localGz;
        if (localbhP.aTy() == paramInt)
          return localbhP;
      }
    }
    return null;
  }
}