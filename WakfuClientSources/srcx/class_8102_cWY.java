import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class cWY
{
  private static final Logger K = Logger.getLogger(cWY.class);

  private static final bKR kJJ = new bKR();

  private final bhG kJK = new Td(this);

  private final CE kJL = new Tg(this);
  protected aYr bwL;
  private List kJM;
  protected final aoL fKc = new aoL();
  protected final cSR kJN = new cSR();
  protected final bKR kJO = new bKR();

  private boolean kJP = false;

  public void c(dWf paramdWf)
  {
    long l = paramdWf.getId();
    if (this.fKc.containsKey(l)) {
      return;
    }

    this.fKc.put(l, paramdWf);

    int i = paramdWf.pt().kDi.ordinal();
    bKR localbKR = (bKR)this.kJN.get(i);
    if (localbKR == null) {
      this.kJN.put(i, localbKR = new bKR());
    }
    localbKR.add(l);

    if (paramdWf.isLocked())
      this.kJO.add(l);
  }

  public void cKN()
  {
    this.kJP = true;
  }

  public boolean cKO() {
    return this.kJP;
  }

  public boolean cKP()
  {
    boolean bool = this.kJP;
    this.kJP = false;
    return bool;
  }

  public void b(bvD parambvD) {
    throw new UnsupportedOperationException();
  }

  public ArrayList c(bvD parambvD) {
    ArrayList localArrayList = new ArrayList();
    bKR localbKR = (bKR)this.kJN.get(parambvD.n().ordinal());
    if (localbKR == null) {
      return localArrayList;
    }

    for (bKT localbKT = localbKR.bTc(); localbKT.hasNext(); ) {
      long l = localbKT.bTd();
      if (this.kJO.N(l))
      {
        dWf localdWf = (dWf)this.fKc.get(l);
        if (a(localdWf, parambvD))
        {
          if (localdWf.a(parambvD))
            localArrayList.add(localdWf);
        }
      }
    }
    return localArrayList;
  }

  protected boolean a(dWf paramdWf, bvD parambvD) {
    dhJ localdhJ = (dhJ)parambvD.bDq();
    int i = localdhJ.cJf().bP();

    if (i == 0) {
      return false;
    }

    int j = localdhJ.cQt() == i ? 1 : 0;
    aoK localaoK = localdhJ.cJf().UI().aMP();
    dqU localdqU = localaoK.jq(localdhJ.cQt());

    switch (Tf.bDD[localdqU.ordinal()])
    {
    case 1:
      return false;
    case 2:
      int k = paramdWf.TL() <= 0 ? 1 : 0;
      return (paramdWf.TR()) && (k != 0);
    case 3:
      return j != 0 ? paramdWf.TP() : paramdWf.TQ();
    }
    throw new UnsupportedOperationException("Type d'alignement non reconnu " + localdqU);
  }

  public cHu cKQ()
  {
    return this.fKc.aBa();
  }

  public int jk(long paramLong) {
    return ((dWf)this.fKc.get(paramLong)).TL();
  }

  public int jl(long paramLong) {
    return ((dWf)this.fKc.get(paramLong)).TM();
  }

  public boolean jm(long paramLong) {
    return this.kJO.N(paramLong);
  }

  public void cKR() {
    a(kJJ, true);
  }

  public void cKS() {
    c(kJJ);
  }

  public void c(bKR parambKR) {
    a(parambKR, false);
  }

  public void a(bKR parambKR, boolean paramBoolean) {
    this.kJO.clear();

    if (paramBoolean) {
      this.fKc.b(this.kJK);
    }

    parambKR.b(this.kJL);

    if ((this.bwL != null) && (this.kJM != null))
      for (int i = 0; i < this.kJM.size(); i++)
        ((cKY)this.kJM.get(i)).e(this.bwL);
  }

  public void a(aYr paramaYr, List paramList)
  {
    this.bwL = paramaYr;
    this.kJM = paramList;
  }

  public int d(bKR parambKR) {
    int i = 0;
    for (bKT localbKT = parambKR.bTc(); localbKT.hasNext(); ) {
      i += ((dWf)this.fKc.get(localbKT.bTd())).TN();
    }
    return i;
  }

  public void a(bRZ parambRZ)
  {
    parambRZ.hbS = this.kJP;
    for (bKT localbKT = this.kJO.bTc(); localbKT.hasNext(); ) {
      dDi localdDi = new dDi();
      localdDi.lLv = localbKT.bTd();
      parambRZ.hbT.add(localdDi);
    }
  }

  public void b(bRZ parambRZ) {
    this.kJP = parambRZ.hbS;
    bKR localbKR = new bKR();
    int i = 0; for (int j = parambRZ.hbT.size(); i < j; i++) {
      localbKR.add(((dDi)parambRZ.hbT.get(i)).lLv);
    }
    c(localbKR);
  }
}