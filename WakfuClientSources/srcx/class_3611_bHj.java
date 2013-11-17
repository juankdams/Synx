import java.util.EnumSet;
import java.util.Iterator;

public class bHj
  implements aXV
{
  private int[] gFx;
  private int gFy;
  private boolean gFz;

  public void C(int[] paramArrayOfInt)
  {
    this.gFx = paramArrayOfInt;
  }

  public boolean a(bBc parambBc) {
    return cy(parambBc.nc());
  }

  public boolean cy(short paramShort) {
    return bBc.b(this.gFx, paramShort);
  }

  public boolean n(short[] paramArrayOfShort) {
    for (short s : paramArrayOfShort) {
      if (!cy(s))
        return false;
    }
    return true;
  }

  public int[] bOR() {
    return this.gFx;
  }

  public void a(EnumSet paramEnumSet)
  {
    this.gFy = 0;
    for (Iterator localIterator = paramEnumSet.iterator(); localIterator.hasNext(); )
      a((cPC)localIterator.next());
  }

  public void a(cPC[] paramArrayOfcPC) {
    this.gFy = 0;
    for (int i = 0; i < paramArrayOfcPC.length; i++)
      a(paramArrayOfcPC[i]);
  }

  public void a(cPC paramcPC) {
    this.gFy |= paramcPC.mask;
  }

  public void b(cPC paramcPC) {
    this.gFy &= (paramcPC.mask ^ 0xFFFFFFFF);
  }

  public boolean c(cPC paramcPC) {
    return (this.gFy & paramcPC.mask) == paramcPC.mask;
  }

  public EnumSet bOS() {
    return cPC.yM(this.gFy);
  }

  public void a(bmT parambmT)
  {
    parambmT.fFO = this.gFx;
    parambmT.fFP = this.gFy;
  }

  public void b(bmT parambmT) {
    this.gFx = parambmT.fFO;
    this.gFy = parambmT.fFP;
  }

  public void clear()
  {
    this.gFx = null;
    this.gFy = 0;
  }

  public void a(bHj parambHj) {
    this.gFx = parambHj.gFx;
    this.gFy = parambHj.gFy;
  }

  public String toString()
  {
    return "AccountInformationHandler{m_adminRights=" + this.gFx + ", m_accountFlags=" + this.gFy + '}';
  }

  public void gb(boolean paramBoolean)
  {
    this.gFz = paramBoolean;
  }

  public boolean bOT() {
    return this.gFz;
  }
}