import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class cOv extends vC
{
  private bfM kwW = null;
  private ckT aCI;
  private Su ehe;
  private static final int cPR = 0;
  private static final int kwX = 1;
  private static final int kwY = 2;
  private int cPV;
  private static final cSR kwZ = new cSR();

  public csx qb()
  {
    return new cOv();
  }

  public aiI pW()
  {
    return aiI.dfx;
  }

  public void run()
  {
    fe localfe = bSh.a(this.aCI, this.ehe);
    int i = localfe.ma();

    if (localfe.md()) {
      l(this.aCI);
    }

    if (i != 0)
      avW.aIb().a(i, 3, new Object[0]);
  }

  private void l(ckT paramckT) {
    Collection localCollection = paramckT.bgG();
    for (Su localSu : localCollection)
      if ((localSu.getType() == 1) && ((localSu instanceof byo)))
      {
        byo localbyo = (byo)localSu;

        ayn localayn = localbyo.FB();
        if (localayn != null)
        {
          bGx localbGx = new bGx(localayn.getId());
          byv.bFN().aJK().d(localbGx);
          return;
        }
      }
  }

  public String getLabel()
  {
    if (!(this.dvI instanceof Su)) {
      return qa();
    }

    switch (ciC.hHG[this.kwW.ordinal()]) {
    case 1:
      str1 = ict;
    case 2:
      str1 = ict;
    }
    String str1 = icr;

    lZ locallZ = new lZ().tz().am(str1);

    String str2 = ((dhJ)this.dvI).getName();
    switch (ciC.hHG[this.kwW.ordinal()]) {
    case 1:
      locallZ.a(bU.fH().getString("fight.error.nopathtomonster", new Object[] { str2 }));
    case 2:
      locallZ.a(bU.fH().getString("fight.error.monstertoofar", new Object[] { str2 }));
    }
    locallZ.a(bU.fH().getString("fight.join", new Object[] { str2 }));

    locallZ.tA();

    if (this.cPV != 0) {
      switch (this.cPV) {
      case 1:
        return locallZ.tH().am(ict).a(bU.fH().getString("error.playerNotSubscribed")).tP();
      case 2:
        return locallZ.tH().am(ict).a(bU.fH().getString("error.targetNotSubscribed")).tP();
      }

    }

    return locallZ.tP();
  }

  public boolean isEnabled()
  {
    if (this.cPV != 0)
      return false;
    return (super.isEnabled()) && (this.kwW == bfM.ftx);
  }

  public boolean pZ()
  {
    if ((this.kwW == null) || (this.kwW == bfM.fto))
      return false;
    byz localbyz = byv.bFN().bFO();
    Su localSu = (Su)this.dvI;
    boolean bool1 = bGP.gDv.a(new aGH[] { localbyz });
    boolean bool2 = bGP.gDx.a(new aGH[] { localbyz });
    if (((!bool1) && (this.aCI.aEt() == dTw.mpS)) || (!bool2)) {
      this.cPV = 1;
    }

    if (localbyz.c(dKm.lXS)) {
      return false;
    }
    if ((localSu instanceof bKm)) {
      bKm localbKm = (bKm)localSu;
      boolean bool3 = bGP.gDx.a(new aGH[] { localbKm });
      if (!bool3) {
        this.cPV = 2;
      }
      if (localSu.c(dKm.lXS))
        return false;
    }
    return true;
  }

  public String qa()
  {
    return "fightJoin";
  }

  public void Q(Object paramObject)
  {
    super.Q(paramObject);

    if ((paramObject instanceof dvC)) {
      paramObject = ((dvC)paramObject).daX();
    }
    if (!(paramObject instanceof Su)) {
      return;
    }
    this.ehe = ((Su)paramObject);

    this.aCI = this.ehe.aeN();

    if (this.aCI == null) {
      return;
    }
    int i = bSh.a(this.aCI, this.ehe).mb();

    this.kwW = ((bfM)kwZ.get(i));
  }

  public List EB() {
    byz localbyz = byv.bFN().bFO();

    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Su localSu = (Su)this.dvI;

    ArrayList localArrayList3 = new ArrayList();

    ckT localckT = cjS.clP().vz(localSu.aeR());
    dTw localdTw = localckT.aEt();
    for (Object localObject1 = localckT.bgG().iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (Su)((Iterator)localObject1).next();
      if (((Su)localObject2).Fx() == localSu.Fx())
        localArrayList2.add(localObject2);
      else {
        localArrayList1.add(localObject2);
      }
    }

    localObject1 = bWW.ccf().FB();
    Object localObject2 = new En(localbyz, localdTw, localbyz, (dhJ)localArrayList1.get(0), localObject1 == null ? null : ((ayn)localObject1).aKu(), localArrayList1);

    bkt localbkt = new bkt(localSu, localdTw, ((czN)localckT).cwM(), ((czN)localckT).cwN(), localArrayList2);

    localArrayList3.addAll(((En)localObject2).bDr());
    localArrayList3.addAll(localbkt.bDr());

    return localArrayList3;
  }

  public List EC() {
    byz localbyz = byv.bFN().bFO();

    Su localSu = (Su)this.dvI;
    De localDe = new De(localbyz);

    ArrayList localArrayList = new ArrayList();

    ckT localckT = cjS.clP().vz(localSu.aeR());
    dTw localdTw = localckT.aEt();
    if (Ew() == dqU.ltr)
      for (localObject1 = localckT.bgG().iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (Su)((Iterator)localObject1).next();
        bbb localbbb = new bbb(localbyz, (dhJ)localObject2, (byte)0, (byte)(((Su)localObject2).Fx() == localSu.Fx() ? 0 : 1), localdTw);
        localArrayList.addAll(localbbb.bDr());
        if ((localObject2 instanceof byo))
        {
          byo localbyo = (byo)localObject2;
          if (localDe.Mr() != agy.daq)
          {
            acy localacy = blo.bws().qc(localbyo.bFD().nn());
            if ((localacy != null) && (localacy.aoT()) && (!localacy.aoU()))
            {
              int i = localacy.aoV();
              if (i != 0)
              {
                if (i > 0)
                  localDe.a(agy.daq);
                else
                  localDe.a(agy.dap); 
              }
            }
          }
        } } 
    Object localObject1 = new cxQ(localbyz, localdTw, ((czN)localckT).cwM());
    Object localObject2 = new bbY(localbyz, localdTw);

    localArrayList.addAll(((cxQ)localObject1).bDr());
    localArrayList.addAll(((bbY)localObject2).bDr());
    localArrayList.addAll(localDe.bDr());
    return localArrayList;
  }

  protected int qc()
  {
    return coH.hXr.aw;
  }

  static
  {
    kwZ.put(1042, bfM.ftl);
    kwZ.put(1026, bfM.ftm);
    kwZ.put(1023, bfM.fto);
    kwZ.put(1024, bfM.fto);
    kwZ.put(0, bfM.ftx);
  }
}