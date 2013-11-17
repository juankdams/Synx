import java.util.Iterator;

class xB
  implements Ce
{
  private final gA aUe;

  xB(gA paramgA)
  {
    this.aUe = paramgA;
  }

  public int nS() {
    return 0;
  }

  public long nT() {
    return 0L;
  }

  public Iterator iterator() {
    return this.aUe.nW();
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ItemGemEffectIterator");
    localStringBuilder.append("{m_item=").append(this.aUe);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}