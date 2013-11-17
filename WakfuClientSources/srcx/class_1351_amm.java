import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class amm extends apX
{
  private final adz doN = new adz();
  private final dhJ doO;
  private cyv doP;

  public amm(dhJ paramdhJ)
  {
    this.doO = paramdhJ;
  }

  public amm(dhJ paramdhJ, dSR paramdSR, long paramLong, List paramList)
  {
    this.doO = paramdhJ;
    this.fsZ = paramdSR;
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      this.doN.hL(((Dk)((bPL)localIterator.next()).cvw()).getId());
    }
    this.bkH = paramLong;
  }

  public boolean ayU()
  {
    return true;
  }

  public byte getType()
  {
    return 2;
  }

  public boolean b(aiZ paramaiZ)
  {
    if (!super.b(paramaiZ)) {
      return false;
    }

    paramaiZ.dhP.clear();
    this.doN.g(new cJC(this, paramaiZ));

    return true;
  }

  public boolean c(aiZ paramaiZ)
  {
    if (!super.c(paramaiZ)) {
      return false;
    }

    this.doN.clear();
    for (cXi localcXi : paramaiZ.dhP) {
      this.doN.hL(localcXi.kKy);
    }
    return true;
  }

  public amm ct(boolean paramBoolean)
  {
    amm localamm = new amm(this.doO);
    a(localamm, dsE.cYX());
    return localamm;
  }

  public amm ayV()
  {
    amm localamm = new amm(this.doO);
    a(localamm, this.bkH);
    return localamm;
  }

  private void a(amm paramamm, long paramLong) {
    paramamm.bkH = paramLong;
    paramamm.fsZ = this.fsZ;
    this.doN.g(new cJD(this, paramamm));
  }

  public List ayW()
  {
    ArrayList localArrayList = new ArrayList(this.doN.size());
    this.doN.g(new cJB(this, localArrayList));

    return localArrayList;
  }

  public short nU()
  {
    if ((this.doO == null) || (this.doO.bGn() == null)) {
      return 0;
    }
    short s = 0;
    for (bPL localbPL : ayW()) {
      if (localbPL.cvu() > s) {
        s = localbPL.cvu();
        this.doP = localbPL;
      }
    }
    return s;
  }

  public long ayX()
  {
    if (this.doP == null) {
      return 0L;
    }
    return this.doP.ayX();
  }

  public float ayY()
  {
    return ble().d(nU(), ayX());
  }

  public String ayZ()
  {
    return ble().cH(ayX()) + '/' + ble().aq(nU());
  }
}