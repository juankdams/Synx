import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class dMU extends bJz
{
  private Su mdx = null;
  private static final Comparator mdy = new bIA();

  private boolean mdz = false;

  public dMU(byte paramByte) {
    super(aFy.ebI, paramByte);
  }

  private void a(ArrayList paramArrayList, Su paramSu)
  {
    Su localSu = paramSu.adL();
    if (localSu == null) {
      return;
    }
    amS localamS = localSu.a(aFy.ebH, (byte)0);
    if (localamS == null) {
      return;
    }

    dKD localdKD1 = (dKD)localamS.dB((short)0);
    dKD localdKD2 = (dKD)localamS.dB((short)1);

    for (Iterator localIterator = paramArrayList.iterator(); localIterator.hasNext(); )
    {
      apX localapX = (apX)localIterator.next();
      short s = localamS.il(localapX.oj());
      if (s != -1)
      {
        dKD localdKD3 = dKD.b(bKq.gNe, localapX.oj(), localapX.ok(), localapX.oc());
        if (a(localdKD3, s))
          localIterator.remove();
        else
          localdKD3.release(); 
      }
    }
  }

  public void bI(Su paramSu) { if ((!this.mdz) && (paramSu == this.mdx)) {
      return;
    }
    this.mdz = false;
    clean();
    this.mdx = paramSu;
    ArrayList localArrayList = new ArrayList();
    for (Iterator localIterator = paramSu.aeA().iterator(); localIterator.hasNext(); ) { localapX = (apX)localIterator.next();
      localArrayList.add(localapX);
    }
    apX localapX;
    if (localArrayList == null) {
      return;
    }

    a(localArrayList, paramSu);

    for (localIterator = localArrayList.iterator(); localIterator.hasNext(); ) { localapX = (apX)localIterator.next();
      dKD localdKD = dKD.b(bKq.gNe, localapX.oj(), localapX.ok(), localapX.oc());
      if (cH(((dSR)localapX.bsL()).vp())) {
        a(localdKD, ((dSR)localapX.bsL()).vp());
      } else {
        short s = bQI();
        a(localdKD, s);
      }
    }
  }

  public void dpH()
  {
    this.mdz = true;
  }
}