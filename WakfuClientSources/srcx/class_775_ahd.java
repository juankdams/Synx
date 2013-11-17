import java.util.ArrayList;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class ahd extends cGj
  implements bKh, cRu, pz
{
  private static final int dba = 1000;
  public static final String dbb = "cache";
  public static final String dbc = "memoryCache";
  public static final String dbd = "criterions";
  public static final String dbe = "events";
  public static final String dbf = "refresh";
  public static final String dbg = "cacheSourcesTotalSize";
  public static final String dbh = "sourcesTotalSize";
  public static final String dbi = "stratas";
  public static final String dbj = "log";
  public final String[] bF = { "cache", "memoryCache", "criterions", "events", "refresh", "cacheSourcesTotalSize", "sourcesTotalSize", "log", "stratas" };

  private dPx dbk = new dPx();

  private LinkedList dbl = new LinkedList();
  private LinkedList dbm = new LinkedList();
  private ArrayList dbn = new ArrayList();
  private LinkedList dbo = new LinkedList();
  private LinkedList dbp = new LinkedList();
  private ArrayList dbq = new ArrayList();

  private Xg dbr = new Xg();

  private boolean dbs = false;
  private boolean dbt = true;

  public ahd(bxU parambxU) {
    aWc.blo().a(this);
    for (cpT localcpT : cpT.values()) {
      this.dbk.c(localcpT.bcI(), new aKX(parambxU, localcpT));
    }
    baT.a(ahd.class, this);

    ??? = aWc.blo().blX();
    ArrayList localArrayList = ((bhr)???).btN();
    ??? = 0; for (int k = localArrayList.size(); ??? < k; ???++) {
      ckd localckd = (ckd)localArrayList.get(???);
      localckd.a(this);
      this.dbr.put(localckd.getId(), new KZ(parambxU, localckd, null));
    }
  }

  public void cleanUp() {
    aWc.blo().b(this);
    baT.L(ahd.class);

    bhr localbhr = aWc.blo().blX();
    ArrayList localArrayList = localbhr.btN();
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      ((ckd)localArrayList.get(i)).b(this);
    }

    i = 0; for (j = this.dbr.size(); i < j; i++) {
      ((KZ)this.dbr.hc(i)).clear();
    }
    this.dbr.clear();
  }

  public String[] getFields() {
    return this.bF;
  }

  public void alb() {
    this.dbo.addAll(this.dbl);
    this.dbp.addAll(this.dbm);
    this.dbq.addAll(this.dbn);
    this.dbs = true;

    dLE.doY().a(this, new String[] { "criterions", "events", "log" });
  }

  public void alc()
  {
    this.dbo.clear();
    this.dbp.clear();
    this.dbq.clear();

    this.dbs = false;

    dLE.doY().a(this, new String[] { "criterions", "events", "log" });
  }

  public String bX(boolean paramBoolean)
  {
    lZ locallZ = new lZ();
    LinkedList localLinkedList = this.dbs ? this.dbo : this.dbl;
    for (aSm localaSm : localLinkedList) {
      byte b = localaSm.bcI();
      Object localObject;
      if (b != -1) {
        localObject = cpT.dR(b);
        if (localObject == null) {
          bxU.an().error("Game sound group inconnu !");
        }
        else if (!aKX.a((aKX)this.dbk.bf(((cpT)localObject).bcI())))
        {
          locallZ.a(localaSm.bib()).a(" ");
          if (paramBoolean)
            locallZ.tz();
          locallZ.a(((cpT)localObject).name());
          if (paramBoolean)
            locallZ.tA(); 
        }
      } else { locallZ.a(localaSm.bib()).a(" ");
        if (paramBoolean)
          locallZ.tz();
        locallZ.a("Null");
        if (paramBoolean) {
          locallZ.tA();
        }

        if (localaSm.getMessage().startsWith("Adding"))
          localObject = bNa.gRB.bUV();
        else {
          localObject = bNa.gRz.bUV();
        }
        locallZ.a(" : ");
        if (paramBoolean) {
          locallZ.tI().am((String)localObject);
        }
        locallZ.a(localaSm.getMessage());
        if (paramBoolean)
          locallZ.tJ();
        locallZ.tH(); }
    }
    return locallZ.tP();
  }

  public String bY(boolean paramBoolean) {
    lZ locallZ = new lZ();
    ArrayList localArrayList = this.dbs ? this.dbq : this.dbn;
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      Mv localMv = (Mv)localArrayList.get(i);
      if (paramBoolean)
        locallZ.tz();
      locallZ.a(localMv.getTitle()).a(" = ");
      if (paramBoolean)
        locallZ.tA();
      locallZ.a(localMv.getValue()).tH();
    }
    return locallZ.tP();
  }

  public String bZ(boolean paramBoolean) {
    lZ locallZ = new lZ();
    LinkedList localLinkedList = this.dbs ? this.dbp : this.dbm;
    int i = 0; for (int j = localLinkedList.size(); i < j; i++) {
      aSN localaSN = (aSN)localLinkedList.get(i);

      locallZ.a(localaSN.bib()).a(" ");
      if (paramBoolean)
        locallZ.tz();
      locallZ.a(localaSN.bip()).a(" : ");
      if (paramBoolean)
        locallZ.tA();
      locallZ.a(localaSN.biq()).tH();
    }
    return locallZ.tP();
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("cache"))
      return this.dbk.getValues();
    if (paramString.equals("log"))
      return bX(true);
    if (paramString.equals("cacheSourcesTotalSize"))
      return Integer.valueOf(cjj.hII.size());
    if (paramString.equals("sourcesTotalSize")) {
      int i = 0;
      for (aJp localaJp = this.dbk.dqF(); localaJp.hasNext(); ) {
        localaJp.fl();
        i += ((aKX)localaJp.value()).sa();
      }
      return Integer.valueOf(i);
    }if (paramString.equals("memoryCache")) {
      long l = cjj.hII.cla();
      if (l < 1024L)
        return l + " o";
      if (l < 1048576L) {
        return String.format("%.2f ko", new Object[] { Float.valueOf((float)l / 1024.0F) });
      }
      return String.format("%.2f Mo", new Object[] { Float.valueOf((float)l / 1024.0F / 1024.0F) });
    }if (paramString.equals("criterions"))
      return bY(true);
    if (paramString.equals("refresh"))
      return Boolean.valueOf(this.dbt);
    if (paramString.equals("events"))
      return bZ(true);
    if (paramString.equals("stratas")) {
      return this.dbr;
    }
    return null;
  }

  public boolean asJ() {
    return this.dbt;
  }

  public void ca(boolean paramBoolean) {
    this.dbt = paramBoolean;
    dLE.doY().a(this, new String[] { "refresh" });
  }

  public void a(ckd paramckd) {
    KZ localKZ = (KZ)this.dbr.get(paramckd.getId());
    if (localKZ != null)
      localKZ.Vu();
  }

  public void U(long paramLong)
  {
    this.dbn.clear();
    this.dbn.add(new Mv("Altitude", String.valueOf(axg.aIP().aIV()), null));
    this.dbn.add(new Mv("Num players", String.valueOf(axg.aIP().aIU()), null));
    this.dbn.add(new Mv("Season", String.valueOf(axg.aIP().abK()), null));
    this.dbn.add(new Mv("Temperature", String.valueOf(axg.aIP().aIQ() + "°w"), null));
    this.dbn.add(new Mv("Time", String.valueOf(axg.aIP().aIR() * 100.0F), null));
    this.dbn.add(new Mv("Wakfu score", String.valueOf(axg.aIP().aIT() * 100.0F), null));
    this.dbn.add(new Mv("Type de zone", bib.cM((byte)axg.aIP().aIS()).bL(), null));
    dLE.doY().a(this, new String[] { "criterions" });
  }

  public void b(rP paramrP) {
    if (this.dbm.size() == 50) {
      this.dbm.removeFirst();
    }

    this.dbm.add(new aSN(asK(), paramrP.yq(), paramrP.yr(), null));
    dLE.doY().a(this, new String[] { "events" });
  }

  public void a(Cs paramCs) {
    if (this.dbl.size() == 1000)
      this.dbl.removeFirst();
    this.dbl.addLast(new aSm(asK(), ((Byte)paramCs.getFirst()).byteValue(), (String)paramCs.Lp(), null));
    dLE.doY().a(this, new String[] { "log" });
  }

  private String asK() {
    dxL localdxL = dDE.dft().VN();
    StringBuilder localStringBuilder = new StringBuilder();
    int i = localdxL.getHours();
    int j = localdxL.getMinutes();
    int k = localdxL.getSeconds();
    localStringBuilder.append("[");
    localStringBuilder.append(i < 10 ? "0" : "").append(i).append(":");
    localStringBuilder.append(j < 10 ? "0" : "").append(j).append(":");
    localStringBuilder.append(k < 10 ? "0" : "").append(k);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}