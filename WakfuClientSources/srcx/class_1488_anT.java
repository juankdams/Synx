import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class anT
{
  private static final Logger K = Logger.getLogger(anT.class);

  private static anT dsa = new anT();
  private static final boolean dsb = false;
  private static final bcm dsc = new bcm();
  private static final int dsd = 100;
  private boolean dse = false;

  private ArrayList dsf = new ArrayList(100);
  private ArrayList dsg = new ArrayList(100);
  private ArrayList dsh = new ArrayList(100);

  private ArrayList dsi = new ArrayList(100);
  private ArrayList dsj = new ArrayList(100);
  private ArrayList dsk = new ArrayList(100);
  private ArrayList dsl = new ArrayList(100);
  private ArrayList dsm = new ArrayList(100);
  private ArrayList dsn = new ArrayList(100);

  private int dso = 4;
  public static final int dsp = 0;
  public static final int dsq = 1;
  public static final int dsr = 2;
  public static final int dss = 3;
  public static final int dst = 4;
  private int dsu = 0;

  private boolean dsv = false;

  public static anT aAo()
  {
    return dsa;
  }

  public void aAp()
  {
    this.dse = true;
  }

  public boolean aAq()
  {
    return this.dso != 4;
  }

  private void a(bdj parambdj, ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt) {
    if ((!parambdj.isUnloading()) && (!parambdj.isInTreeDepthManager()))
      if (this.dso == paramInt) {
        if (!paramArrayList1.contains(parambdj)) {
          paramArrayList1.add(parambdj);
        }
      }
      else if (!paramArrayList2.contains(parambdj))
        paramArrayList2.add(parambdj);
  }

  private void a(bdj parambdj, ArrayList paramArrayList)
  {
    if ((!parambdj.isUnloading()) && (!parambdj.isATemplate()) && (!parambdj.isAddedNextInTreeDepthManager()) && 
      (!paramArrayList.contains(parambdj)))
      paramArrayList.add(parambdj);
  }

  public void aJ(bdj parambdj)
  {
    a(parambdj, this.dsg);
  }

  public void aK(bdj parambdj) {
    a(parambdj, this.dsj);
  }

  public void aL(bdj parambdj) {
    a(parambdj, this.dsm);
  }

  public void aM(bdj parambdj)
  {
    if (!parambdj.isATemplate())
    {
      if ((this.dso == 4) || ((this.dso <= 1) && (parambdj.getLastPreProcessFrame() != this.dsu)))
        a(parambdj, this.dsh, this.dsf, 1);
      else
        aJ(parambdj);
    }
  }

  public void aN(bdj parambdj)
  {
    if (!parambdj.isATemplate())
    {
      if ((this.dso == 4) || ((this.dso <= 2) && (parambdj.getLastMiddleProcessFrame() != this.dsu)))
        a(parambdj, this.dsk, this.dsi, 2);
      else
        aK(parambdj);
    }
  }

  public void aO(bdj parambdj)
  {
    if (!parambdj.isATemplate())
    {
      if ((this.dso == 4) || ((this.dso <= 3) && (parambdj.getLastPostProcessFrame() != this.dsu)))
        a(parambdj, this.dsn, this.dsl, 3);
      else
        aL(parambdj);
    }
  }

  private int a(aNL paramaNL, int paramInt)
  {
    paramaNL.setTreePosition(paramInt);

    if (paramaNL.bFw != null) {
      int i = paramaNL.bFw.size();
      for (int j = 0; j < i; j++) {
        paramInt = a((aNL)paramaNL.bFw.get(j), paramInt + 1);
      }
    }

    return paramInt;
  }

  public void aAr() {
    this.dsv = true;
  }

  private void aP(bdj parambdj) {
    if (parambdj.getElementType() == bTe.heE) {
      aNL localaNL = (aNL)parambdj;
      cpa localcpa = localaNL.getElementMap();
      if (localcpa != null)
        dsc.add(localcpa.coP());
    }
  }

  public void jm(int paramInt) {
    this.dsv = true;

    while (this.dsv) {
      this.dsv = false;
      this.dso = 0;
      this.dsu = ((this.dsu + 1) % 2147483647);

      if (this.dse) {
        a(cBQ.cxL().cxS().getMasterRootContainer(), 0);
        this.dse = false;
      }

      cmV.cnH();

      this.dso = 1;

      while (this.dsf.size() != 0) {
        i = this.dsf.size();
        Collections.sort(this.dsf, auD.dHy);
        for (j = 0; j < i; j++) {
          bdj localbdj1 = (bdj)this.dsf.get(j);
          localbdj1.setLastPreProcessFrame(this.dsu);
          localbdj1.oX(paramInt);
        }

        this.dsf.clear();

        j = this.dsh.size();
        for (int k = 0; k < j; k++) {
          this.dsf.add(this.dsh.get(k));
        }
        this.dsh.clear();
      }

      this.dso = 2;
      while (this.dsi.size() != 0) {
        i = this.dsi.size();
        Collections.sort(this.dsi, cVO.kIt);
        for (j = 0; j < i; j++) {
          bdj localbdj2 = (bdj)this.dsi.get(j);
          localbdj2.setLastMiddleProcessFrame(this.dsu);
          localbdj2.oY(paramInt);
        }

        this.dsi.clear();

        j = this.dsk.size();
        for (int m = 0; m < j; m++) {
          this.dsi.add(this.dsk.get(m));
        }
        this.dsk.clear();
      }

      this.dso = 3;
      while (this.dsl.size() != 0)
      {
        i = this.dsl.size();
        Collections.sort(this.dsl, cVO.kIt);
        for (j = 0; j < i; j++) {
          bdj localbdj3 = (bdj)this.dsl.get(j);
          localbdj3.setLastPostProcessFrame(this.dsu);
          localbdj3.oZ(paramInt);
        }

        this.dsl.clear();

        j = this.dsn.size();
        for (int n = 0; n < j; n++) {
          this.dsl.add(this.dsn.get(n));
        }
        this.dsn.clear();
      }

      this.dso = 4;

      int i = this.dsg.size();
      bdj localbdj4;
      for (int j = 0; j < i; j++) {
        localbdj4 = (bdj)this.dsg.get(j);
        this.dsf.add(localbdj4);
      }
      this.dsg.clear();

      i = this.dsj.size();
      for (j = 0; j < i; j++) {
        localbdj4 = (bdj)this.dsj.get(j);
        this.dsi.add(localbdj4);
      }
      this.dsj.clear();

      i = this.dsm.size();
      for (j = 0; j < i; j++) {
        localbdj4 = (bdj)this.dsm.get(j);
        this.dsl.add(localbdj4);
      }
      this.dsm.clear();
    }
  }

  private void aAs()
  {
    Iterator localIterator;
    if (dsc.size() > 0) {
      K.info("[Frame " + this.dsu + "] Dialog processées : ");

      for (localIterator = dsc.iterator(); localIterator.hasNext(); ) {
        String str = (String)localIterator.next();
        K.info("\t\t" + str);
      }
    }
  }
}