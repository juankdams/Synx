import java.util.ArrayList;

public class xS
{
  public static final xS bqG = new xS();

  private static final bRB bqH = new bRB(aiX.dhv.getId());

  private final cSR bqI = new cSR();
  private final bPu bqJ = new bPu();

  private final bPu bqK = new bPu();
  private final dPx bqL = new dPx();

  private final ArrayList bqM = new ArrayList();

  public bRB dG(int paramInt)
  {
    synchronized (this.bqI) {
      bRB localbRB1 = (bRB)this.bqI.get(paramInt);
      if (localbRB1 != null) {
        return localbRB1;
      }
      aiX localaiX = Oj.cfd.gf(paramInt);
      if (localaiX == aiX.dhv) {
        return bqH;
      }
      bRB localbRB2 = new bRB(localaiX.getId());
      this.bqI.put(paramInt, localbRB2);

      return localbRB2;
    }
  }

  public aAz i(dxL paramdxL) {
    synchronized (this.bqJ)
    {
      short s = dEQ.ac(paramdxL);

      aAz localaAz1 = (aAz)this.bqJ.cx(s);
      if (localaAz1 != null) {
        return localaAz1;
      }
      aAz localaAz2 = new aAz(paramdxL);
      this.bqJ.c(s, localaAz2);

      return localaAz2;
    }
  }

  public LS j(dxL paramdxL) {
    synchronized (this.bqK)
    {
      short s = dEQ.ac(paramdxL);

      LS localLS1 = (LS)this.bqK.cx(s);
      if (localLS1 != null) {
        return localLS1;
      }
      LS localLS2 = new LS();
      this.bqK.c(s, localLS2);

      chZ.hGr.J(paramdxL);

      return localLS2;
    }
  }

  public dOS a(dxL paramdxL, byte paramByte) {
    synchronized (this.bqL) {
      dOS localdOS1 = (dOS)this.bqL.bf(paramByte);
      if (localdOS1 != null) {
        return localdOS1;
      }
      dOS localdOS2 = new dOS();
      this.bqL.c(paramByte, localdOS2);

      chZ.hGr.J(paramdxL);

      return localdOS2;
    }
  }

  public ceJ k(dxL paramdxL) {
    synchronized (this.bqM) {
      int i = 0; for (int j = this.bqM.size(); i < j; i++) {
        ceJ localceJ2 = (ceJ)this.bqM.get(i);
        if (localceJ2.VN().U(paramdxL) == 0) {
          return localceJ2;
        }
        dic localdic = localceJ2.chH();
        if (localdic != null)
        {
          if (localdic.X(paramdxL))
            return localceJ2;
        }
      }
      ceJ localceJ1 = new ceJ(paramdxL);
      this.bqM.add(localceJ1);

      return localceJ1;
    }
  }

  public void a(dic paramdic, dxL paramdxL) {
    synchronized (this.bqM) {
      int i = 0;
      int j = 0; for (int k = this.bqM.size(); j < k; j++) {
        ceJ localceJ2 = (ceJ)this.bqM.get(j);
        if (paramdic.X(localceJ2.VN())) {
          localceJ2.a(paramdic);
          i = 1;
        }
      }

      if (i == 0) {
        ceJ localceJ1 = new ceJ(paramdxL);
        localceJ1.a(paramdic);
        this.bqM.add(localceJ1);
      }
    }
  }

  public void a(cYh paramcYh, dxL paramdxL) {
    synchronized (this.bqL) {
      byte b = (byte)paramdxL.getMonth();
      dOS localdOS = (dOS)this.bqL.bf(b);
      if (localdOS == null) {
        localdOS = new dOS();
        this.bqL.c(b, localdOS);
      }
      localdOS.a(paramcYh);
    }
  }

  public void a(boi paramboi, dxL paramdxL) {
    synchronized (this.bqK)
    {
      short s = dEQ.ac(paramdxL);

      LS localLS = (LS)this.bqK.cx(s);
      if (localLS == null) {
        localLS = new LS();
        this.bqK.c(s, localLS);
      }
      localLS.a(paramboi);
    }
  }
}