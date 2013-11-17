import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class csx
{
  protected static final Logger K = Logger.getLogger(csx.class);
  public static final String hwB = "mru";
  protected boolean bur = true;

  protected boolean dgA = true;

  public static final String icr = bNa.gRx.bUV();
  public static final String ics = bNa.gRA.bUV();
  public static final String ict = bNa.gRz.bUV();
  public static final String icu = "9ed34b";
  public static final String icv = "f48140";
  public static final csx[] icw = new csx[0];
  protected Object dvI;

  public abstract aiI pW();

  public abstract void run();

  public abstract boolean pZ();

  public boolean isUsable()
  {
    return this.dgA;
  }

  public void setUsable(boolean paramBoolean)
  {
    this.dgA = paramBoolean;
  }

  public void Q(Object paramObject)
  {
    if ((paramObject instanceof dvC)) {
      paramObject = ((dvC)paramObject).daX();
    }
    this.dvI = paramObject;
  }

  public String getLabel()
  {
    lZ locallZ = new lZ().tz().am(isEnabled() ? icr : ict);
    locallZ.a(bU.fH().getString("desc.mru." + qa()));
    locallZ.tA();
    return locallZ.tP();
  }

  public abstract String qa();

  public String getStyle()
  {
    return "mru" + qc();
  }

  protected int qc()
  {
    return pW().eo();
  }

  public String getTooltip() {
    return getLabel();
  }

  public String Eu()
  {
    return null;
  }

  public boolean isEnabled() {
    return this.bur;
  }

  public void setEnabled(boolean paramBoolean) {
    this.bur = paramBoolean;
  }

  public Iterable ED()
  {
    return Collections.emptyList();
  }

  public abstract csx qb();

  protected final void c(dJO paramdJO)
  {
    byz localbyz = byv.bFN().bFO();
    cMb localcMb = (cMb)this.dvI;
    ArrayList localArrayList = dAz.eC(localcMb.boz());
    int i = (localcMb.bVi().isEmpty()) && (localArrayList.isEmpty()) ? 1 : 0;
    if ((i != 0) || (localcMb.V(localbyz.aeL().atB()))) {
      localcMb.b(paramdJO, localbyz);
    } else {
      aEe localaEe = new aEe(bU.fH().getString("too.far.to.interact"));
      localaEe.mm(3);
      CM.LV().a(localaEe);
    }
  }
}