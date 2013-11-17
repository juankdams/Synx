import java.util.ArrayList;

public class bOB extends bvy
{
  private final ArrayList bRT = new ArrayList();
  private final boolean efF;
  private final int ceP;
  private final int efD;

  public bOB(short paramShort1, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, short paramShort2)
  {
    super(paramShort1, paramInt1, paramShort2);

    this.ceP = paramInt2;
    this.efD = paramInt3;
    this.efF = paramBoolean;
  }

  public int ahA() {
    return aDF.e(this).cJu();
  }

  public boolean aTC() {
    return aDF.e(this).aTC();
  }

  public int bVw() {
    return aDF.e(this).cJw();
  }

  public int bVx() {
    return aDF.e(this).cJv();
  }

  public int bVy() {
    return aDF.e(this).bVy();
  }

  public boolean aTA() {
    return this.efF;
  }

  public void dd(int paramInt1, int paramInt2) {
    this.bRT.add(new acl(paramInt1, paramInt2));
  }

  public boolean N(dGy paramdGy) {
    for (int i = 0; i < this.bRT.size(); i++) {
      if (!paramdGy.d(this.bRT.get(i))) {
        return false;
      }
    }
    return true;
  }

  public String toString() {
    return super.toString() + ", m_conditions=" + this.bRT + ", m_buyable=" + this.efF + '}';
  }

  public int getOrder()
  {
    return this.ceP;
  }

  public int aTy() {
    return this.efD;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof bOB)) {
      return false;
    }

    bOB localbOB = (bOB)paramObject;

    return nc() == localbOB.nc();
  }

  public int hashCode()
  {
    return nc();
  }
}