import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

class aOX
  implements dqG
{
  private static final byte ewg = 10;
  private final LinkedList ewh;
  private final ArrayList aBf;

  aOX()
  {
    this.ewh = new LinkedList();
    this.aBf = new ArrayList();
  }

  public gA bn(short paramShort)
  {
    return (gA)this.ewh.get(paramShort);
  }

  public gA en(long paramLong)
  {
    int i = ep(paramLong);
    return i == -1 ? null : (gA)this.ewh.get(i);
  }

  void J(gA paramgA) {
    this.ewh.add(paramgA);
    L(paramgA);
  }

  private gA bo(short paramShort)
  {
    if (paramShort != -1) {
      gA localgA = (gA)this.ewh.remove(paramShort);
      M(localgA);
      return localgA;
    }

    return null;
  }

  gA eo(long paramLong) {
    return bo(ep(paramLong));
  }

  boolean K(gA paramgA) {
    return eo(paramgA.oj()) != null;
  }

  gA bfN() {
    if (!this.ewh.isEmpty()) {
      return bo((short)0);
    }

    return null;
  }

  void e(long paramLong, short paramShort) {
    gA localgA = en(paramLong);
    if (localgA != null) {
      localgA.l(paramShort);
      N(localgA);
    }
  }

  short ep(long paramLong) {
    int i = 0; for (int j = this.ewh.size(); i < j; i++) {
      if (((gA)this.ewh.get(i)).oj() == paramLong) {
        return (short)i;
      }
    }

    return -1;
  }

  short bfO() {
    return (short)this.ewh.size();
  }

  private void L(gA paramgA) {
    for (int i = this.aBf.size() - 1; i >= 0; i--)
      ((aSH)this.aBf.get(i)).b(paramgA);
  }

  private void M(gA paramgA)
  {
    for (int i = this.aBf.size() - 1; i >= 0; i--)
      ((aSH)this.aBf.get(i)).c(paramgA);
  }

  private void N(gA paramgA)
  {
    for (int i = this.aBf.size() - 1; i >= 0; i--)
      ((aSH)this.aBf.get(i)).d(paramgA);
  }

  private void bfP()
  {
    for (int i = this.aBf.size() - 1; i >= 0; i--)
      ((aSH)this.aBf.get(i)).mZ();
  }

  public void a(aSH paramaSH)
  {
    this.aBf.add(paramaSH);
  }

  public void b(aSH paramaSH) {
    this.aBf.remove(paramaSH);
  }

  public void removeAllListeners() {
    this.aBf.clear();
  }

  public boolean isFull() {
    return this.ewh.size() == 10;
  }

  public boolean isEmpty() {
    return this.ewh.isEmpty();
  }

  public void clear() {
    d(bpD.fJY);
    this.ewh.clear();
    bfP();
  }

  public boolean N(long paramLong) {
    return ep(paramLong) != -1;
  }

  public boolean j(gA paramgA) {
    return N(paramgA.oj());
  }

  public boolean d(dGy paramdGy) {
    int i = 0; for (int j = this.ewh.size(); i < j; i++) {
      gA localgA = (gA)this.ewh.get(i);
      if (!paramdGy.d(localgA)) {
        return false;
      }
    }
    return true;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("TemporaryInventoryModel");
    localStringBuilder.append("{m_items=").append(this.ewh == null ? "null" : Arrays.asList(new LinkedList[] { this.ewh }).toString());
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}