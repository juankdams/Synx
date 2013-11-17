import java.util.ArrayList;

public class dde extends cUh
{
  private final ArrayList kWo = new ArrayList();
  private final ArrayList cub = new ArrayList();
  private final ArrayList kWp = new ArrayList();
  private final cSi kWq = new cSi();
  private ctR kWr;

  public dde(short paramShort1, short paramShort2, int paramInt1, byte paramByte, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    super(paramShort1, paramShort2, paramInt1, paramByte, paramInt2, paramInt3, paramInt4, paramBoolean);
  }

  public void b(bfx parambfx) {
    this.kWo.add(parambfx);
  }

  public void a(dpI paramdpI) {
    if (paramdpI.a(PY.coH))
      this.kWp.add(paramdpI);
    else
      this.cub.add(paramdpI);
  }

  public boolean aTC()
  {
    return false;
  }

  public boolean cBI()
  {
    return !this.cub.isEmpty();
  }

  public boolean k(dGy paramdGy)
  {
    for (int i = 0; i < this.kWo.size(); i++) {
      if (!paramdGy.d(this.kWo.get(i))) {
        return false;
      }
    }
    return true;
  }

  public boolean W(dGy paramdGy) {
    for (int i = 0; i < this.cub.size(); i++) {
      if (!paramdGy.d(this.cub.get(i))) {
        return false;
      }
    }
    return true;
  }

  public boolean X(dGy paramdGy) {
    for (int i = 0; i < this.kWp.size(); i++) {
      if (!paramdGy.d(this.kWp.get(i))) {
        return false;
      }
    }
    return true;
  }

  public boolean k(cIw paramcIw) {
    for (int i = 0; i < this.kWq.size(); i++) {
      if (!paramcIw.R(this.kWq.wm(i))) {
        return false;
      }
    }
    return true;
  }

  public void zK(int paramInt) {
    this.kWq.add(paramInt);
  }

  public void a(ctR paramctR) {
    if (paramctR.size() == 0)
      this.kWr = null;
    else
      this.kWr = paramctR;
  }

  public boolean xO(int paramInt)
  {
    return (this.kWr != null) && (this.kWr.get(paramInt) != 0);
  }

  public int[] cBH()
  {
    return this.kWr == null ? bPR.eWj : this.kWr.qe();
  }

  public int xN(int paramInt)
  {
    int i = this.kWr == null ? 0 : this.kWr.get(paramInt);
    if (i == 0) {
      return bcY();
    }
    return i;
  }

  public boolean cOp() {
    return !this.kWp.isEmpty();
  }
}