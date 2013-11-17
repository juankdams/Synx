import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class sS extends cGj
{
  public static final String bcb = "weatherOfDays";
  public static final String bcc = "weatherToday";
  public static final String bcd = "seasons";
  public static final String bce = "currentWeather";
  public static final String bcf = "temperatureGraph";
  public static final String bcg = "minTemperatureGraph";
  public static final String bch = "maxTemperatureGraph";
  public static final String bci = "resources";
  public static final String bcj = "displayCultures";
  public static final String bck = "displayPlants";
  public static final String bcl = "displayTrees";
  private static final bNa bcm = new bNa(1.0F, 0.8F, 0.0F, 1.0F);
  private static final bNa bcn = new bNa(0.0F, 0.8F, 1.0F, 1.0F);
  private static final bNa bco = new bNa(1.0F, 0.8F, 0.0F, 0.3F);
  private static final bNa bcp = new bNa(0.0F, 0.8F, 1.0F, 0.3F);
  private static final bNa bcq = new bNa(0.0F, 0.8F, 1.0F, 0.3F);
  private static final bNa[] bcr = { bNa.gRy };

  private static final bNa[] bcs = { bcm, bcn };

  private static final bNa[] bct = { bco, bcp };

  private ArrayList bcu = new ArrayList();
  private PV bcv = new PV();
  private ArrayList bcw = new ArrayList();

  private dwT bcx = null;
  private float bcy;
  private float bcz;
  private static final sS bcA = new sS();

  private sS() {
    this.bcw.add(new PV());
  }

  public static sS Al() {
    return bcA;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("currentWeather"))
      return this.bcv;
    if (paramString.equals("seasons"))
      return this.bcu;
    if (paramString.equals("weatherOfDays"))
      return this.bcw;
    if (paramString.equals("weatherToday")) {
      if ((this.bcw == null) || (this.bcw.size() == 0)) {
        return null;
      }
      return this.bcw.get(0);
    }if (paramString.equals("minTemperatureGraph"))
      return bU.fH().getString("weather.info.temperatureValue.short", new Object[] { Float.valueOf(this.bcy) });
    if (paramString.equals("maxTemperatureGraph"))
      return bU.fH().getString("weather.info.temperatureValue.short", new Object[] { Float.valueOf(this.bcz) });
    if (paramString.equals("temperatureGraph"))
      return this.bcx;
    if (paramString.equals("resources"))
      return Ar();
    if (paramString.equals("displayPlants"))
      return Boolean.valueOf(bvq.gfn.An());
    if (paramString.equals("displayTrees"))
      return Boolean.valueOf(bvq.gfn.Ao());
    if (paramString.equals("displayCultures")) {
      return Boolean.valueOf(bvq.gfn.Am());
    }
    return null;
  }

  public boolean Am() {
    return bvq.gfn.Am();
  }

  public void T(boolean paramBoolean) {
    bvq.gfn.T(paramBoolean);
    dLE.doY().a(this, new String[] { "displayCultures", "resources" });
  }

  public boolean An()
  {
    return bvq.gfn.An();
  }

  public void U(boolean paramBoolean) {
    bvq.gfn.U(paramBoolean);
    dLE.doY().a(this, new String[] { "displayPlants", "resources" });
  }

  public boolean Ao()
  {
    return bvq.gfn.Ao();
  }

  public void V(boolean paramBoolean) {
    bvq.gfn.V(paramBoolean);
    dLE.doY().a(this, new String[] { "displayTrees", "resources" });
  }

  public void Ap()
  {
    bvq.gfn.T(true);
    bvq.gfn.U(true);
    bvq.gfn.V(true);
  }

  public void a(cIB paramcIB) {
    this.bcv.b(paramcIB);
  }

  public PV Aq() {
    return this.bcv;
  }

  public void clear() {
    this.bcw.clear();
    this.bcu.clear();
  }

  private ArrayList Ar()
  {
    ArrayList localArrayList = new ArrayList();
    bvq.gfn.G(localArrayList);

    Collections.sort(localArrayList, mD.un());
    Collections.sort(localArrayList, cjU.clR());

    return localArrayList;
  }

  public void a(clK paramclK, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    PV localPV = new PV();
    cIB localcIB = new cIB();
    localcIB.a(paramInt1, paramInt1, paramInt2, paramInt3, paramArrayOfFloat, paramFloat1, 0, paramFloat2, paramFloat3, paramFloat4);
    localPV.a(paramclK);
    localPV.b(localcIB);
    int i = aKS.getInstance().getActualMaximum(7);
    int j = aKS.getInstance().get(7) - 1;
    localPV.gl((j + this.bcw.size()) % i);
    this.bcw.add(localPV);
  }

  private void b(clK paramclK, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    PV localPV = new PV();
    cIB localcIB = new cIB();
    localcIB.a(paramInt1, paramInt1, paramInt2, paramInt3, paramArrayOfFloat, paramFloat1, 0, paramFloat2, paramFloat3, paramFloat4);
    localPV.a(paramclK);
    localPV.b(localcIB);

    this.bcu.add(localPV);
  }

  public void a(bbi parambbi)
  {
    this.bcx = new dwT();

    this.bcy = 3.4028235E+38F;
    this.bcz = 1.4E-45F;

    int[] arrayOfInt1 = new int[parambbi.bpw()];
    int[] arrayOfInt2 = new int[parambbi.bpw()];
    int[] arrayOfInt3 = new int[parambbi.bpw()];
    int[] arrayOfInt4 = new int[parambbi.bpw() * 2];

    float[] arrayOfFloat1 = new float[parambbi.bpw()];
    float[] arrayOfFloat2 = new float[parambbi.bpw()];
    float[] arrayOfFloat3 = new float[parambbi.bpw()];
    float[] arrayOfFloat4 = new float[parambbi.bpw()];

    for (int i = 0; i < parambbi.bpw(); i++) {
      localObject1 = parambbi.oH(i);
      localObject2 = new cxr();
      switch (YV.cKc[localObject1.ordinal()]) {
      case 1:
        ((cxr)localObject2).setModulationColor(clP.hPf);
        break;
      case 2:
        ((cxr)localObject2).setModulationColor(clP.hPg);
        break;
      case 3:
        ((cxr)localObject2).setModulationColor(clP.hPh);
        break;
      case 4:
        ((cxr)localObject2).setModulationColor(clP.hPi);
      }

      this.bcx.a((cxr)localObject2);

      arrayOfFloat1[i] = (parambbi.oI(i) + parambbi.oK(i));
      arrayOfFloat2[i] = (parambbi.oJ(i) + parambbi.oK(i));

      if (arrayOfFloat1[i] < 0.0F) {
        arrayOfInt2[i] = 1;
        arrayOfInt4[(i * 2)] = 1;
      }
      if (arrayOfFloat2[i] < 0.0F) {
        arrayOfInt3[i] = 1;
        arrayOfInt4[(i * 2 + 1)] = 1;
      }

      arrayOfFloat3[i] = parambbi.b(localObject1)[0];
      arrayOfFloat4[i] = parambbi.b(localObject1)[1];

      this.bcy = Math.min(this.bcy, arrayOfFloat3[i]);
      this.bcz = Math.max(this.bcz, arrayOfFloat4[i]);
    }

    beu localbeu1 = new beu();
    localbeu1.w(arrayOfFloat1);
    localbeu1.a(bcs, arrayOfInt2);
    Object localObject1 = new beu();
    ((beu)localObject1).w(arrayOfFloat2);
    ((beu)localObject1).a(bcs, arrayOfInt3);
    Object localObject2 = new beu();
    ((beu)localObject2).w(arrayOfFloat3);
    ((beu)localObject2).a(bcr, arrayOfInt1);
    beu localbeu2 = new beu();
    localbeu2.w(arrayOfFloat4);
    localbeu2.a(bcr, arrayOfInt1);

    this.bcx.a(localbeu1);
    this.bcx.a((beu)localObject1);
    this.bcx.a((beu)localObject2);
    this.bcx.a(localbeu2);

    cKL localcKL = new cKL();
    localcKL.a(localbeu1);
    localcKL.a((beu)localObject1);
    localcKL.a(bct, arrayOfInt4);
    this.bcx.a(localcKL);

    this.bcx.ds(this.bcy - 2.0F);
    this.bcx.dt(this.bcz + 2.0F);
  }

  public void As()
  {
    dLE.doY().a(this, new String[] { "currentWeather", "weatherOfDays" });
  }

  public void b(bbi parambbi) {
    clear();

    Object localObject = null;
    for (int i = 0; i < parambbi.bpw(); i++) {
      clK localclK = parambbi.oH(i);
      if (localclK != localObject)
      {
        b(localclK, (int)parambbi.b(localclK)[0], (int)parambbi.b(localclK)[1], 0, null, 0.0F, 0.0F, 0.0F, 0.0F);

        localObject = localclK;
      }
    }
    for (i = 0; i < parambbi.bpw(); i++) {
      a(parambbi.oH(i), parambbi.oI(i), parambbi.oJ(i), parambbi.oK(i), parambbi.b(parambbi.oH(i)), parambbi.oN(i), parambbi.oO(i), parambbi.oL(i), parambbi.oM(i));
    }

    a(parambbi);

    dLE.doY().a(this, new String[] { "currentWeather", "weatherOfDays", "seasons", "temperatureGraph", "minTemperatureGraph", "maxTemperatureGraph" });
  }
}