import java.util.ArrayList;

public class dfZ
  implements dor
{
  private final ArrayList laY = new ArrayList();
  private short laZ;

  public void a(cZl paramcZl)
  {
    this.laY.add(paramcZl);
    this.laZ = ((short)(this.laZ + paramcZl.cFy()));
  }

  public void cPD() {
    this.laY.clear();
    this.laZ = 0;
  }

  public ArrayList cPE() {
    return this.laY;
  }

  public boolean isEnabled() {
    int i = 0; for (int j = this.laY.size(); i < j; i++) {
      cZl localcZl = (cZl)this.laY.get(i);
      if (localcZl.isEnabled()) {
        return true;
      }
    }

    return false;
  }

  public short cFy() {
    return this.laZ;
  }

  cZl eV(byte paramByte) {
    byte b = 0;
    int i = 0; for (int j = this.laY.size(); i < j; i++) {
      cZl localcZl = (cZl)this.laY.get(i);
      b += localcZl.cFy();
      if (paramByte < b) {
        return localcZl;
      }
    }

    return null;
  }

  byte eW(byte paramByte) {
    byte b = 0;
    int i = 0; for (int j = this.laY.size(); i < j; i++) {
      cZl localcZl = (cZl)this.laY.get(i);
      if (paramByte < b + localcZl.cFy()) {
        return bCO.gn(paramByte - b);
      }
      b += localcZl.cFy();
    }

    return -1;
  }

  byte cPF() {
    int i = 0;
    int j = 0; for (int k = this.laY.size(); j < k; j++) {
      cZl localcZl = (cZl)this.laY.get(j);
      int n;
      for (int m = 0; m < localcZl.cFy(); n = (byte)(m + 1)) {
        if (localcZl.ag(m) == null) {
          return bCO.gn(m + i);
        }
      }

      i = (byte)(i + localcZl.cFy());
    }
    return -1;
  }

  byte j(gA paramgA, short paramShort) {
    int i = 0;
    byte b1 = -1;
    int j = 0; for (int k = this.laY.size(); j < k; j++) {
      cZl localcZl = (cZl)this.laY.get(j);
      int n;
      for (int m = 0; m < localcZl.cFy(); n = (byte)(m + 1)) {
        gA localgA = localcZl.ag(m);
        byte b2 = bCO.gn(m + i);

        if (localgA != null) {
          if ((localgA.b(paramgA)) && (localgA.nR() != localgA.nP()))
          {
            if (localgA.nP() + paramShort <= localgA.nR())
            {
              return b2;
            }

            b1 = b2;
          }
        } else if (b1 == -1)
        {
          b1 = b2;
        }
      }

      i = (byte)(i + localcZl.cFy());
    }

    return b1;
  }

  public boolean av(gA paramgA) {
    int i = 0; for (int j = this.laY.size(); i < j; i++) {
      if (((cZl)this.laY.get(i)).av(paramgA)) {
        return true;
      }
    }

    return false;
  }

  public boolean au(gA paramgA) {
    int i = 0; for (int j = this.laY.size(); i < j; i++) {
      if (((cZl)this.laY.get(i)).au(paramgA)) {
        return true;
      }
    }

    return false;
  }

  public boolean f(gA paramgA, byte paramByte) {
    cZl localcZl = eV(paramByte);
    byte b = eW(paramByte);

    return localcZl.f(paramgA, b);
  }

  public boolean g(gA paramgA, byte paramByte) {
    cZl localcZl = eV(paramByte);
    byte b = eW(paramByte);

    return localcZl.g(paramgA, b);
  }

  public gA bI(long paramLong)
  {
    int i = 0; for (int j = this.laY.size(); i < j; i++) {
      gA localgA = ((cZl)this.laY.get(i)).bI(paramLong);
      if (localgA != null) {
        return localgA;
      }
    }
    return null;
  }

  public gA ag(byte paramByte)
  {
    cZl localcZl = eV(paramByte);
    byte b = eW(paramByte);

    return localcZl.ag(b);
  }

  public byte iU(long paramLong) {
    int i = 0;
    int j = 0; for (int k = this.laY.size(); j < k; j++) {
      cZl localcZl = (cZl)this.laY.get(j);
      int m = localcZl.iU(paramLong);
      if (m != -1) {
        return bCO.gn(i + m);
      }
      i = (byte)(i + localcZl.cFy());
    }

    return -1;
  }

  public boolean n(long paramLong, short paramShort) {
    int i = 0; for (int j = this.laY.size(); i < j; i++) {
      if (((cZl)this.laY.get(i)).n(paramLong, paramShort)) {
        return true;
      }
    }

    return false;
  }

  public boolean aw(gA paramgA) {
    int i = 0; for (int j = this.laY.size(); i < j; i++) {
      if (((cZl)this.laY.get(i)).aw(paramgA)) {
        return true;
      }
    }

    return false;
  }

  public boolean o(long paramLong, short paramShort) {
    int i = 0; for (int j = this.laY.size(); i < j; i++) {
      if (((cZl)this.laY.get(i)).o(paramLong, paramShort)) {
        return true;
      }
    }

    return false;
  }

  public boolean K(gA paramgA) {
    int i = 0; for (int j = this.laY.size(); i < j; i++) {
      if (((cZl)this.laY.get(i)).K(paramgA)) {
        return true;
      }
    }

    return false;
  }
}