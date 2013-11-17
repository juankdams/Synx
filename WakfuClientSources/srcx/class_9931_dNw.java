import org.apache.log4j.Logger;

public abstract class dNw extends drw
{
  protected final dQG meg;

  protected dNw(Qb paramQb)
  {
    super(new Ol(paramQb));

    this.meg = new dQG(ajs.diI, (bPr)this.ltX, paramQb.abQ(), true);
  }

  public void aW(gA paramgA)
  {
    if (this.ltY != null)
      ((dpN)this.ltY).b(paramgA);
  }

  public boolean av(gA paramgA)
  {
    try
    {
      if (!au(paramgA))
        return false;
      this.meg.c(paramgA);
    } catch (amq localamq) {
      K.error("Impossible d'ajouter un item à l'inventaire alors qu'on à pourtant testé le canAdd", localamq);
      return false;
    }
    aW(paramgA);
    return true;
  }

  public boolean g(gA paramgA, byte paramByte) {
    return false;
  }

  public boolean o(long paramLong, short paramShort) {
    if (!n(paramLong, paramShort))
      return false;
    this.meg.c(paramLong, (short)-paramShort);

    return true;
  }

  public boolean K(gA paramgA) {
    if (!aw(paramgA))
      return false;
    this.meg.d(paramgA);

    return true;
  }

  public gA bI(long paramLong)
  {
    return (gA)this.meg.ci(paramLong);
  }

  public gA ag(byte paramByte)
  {
    return (gA)this.meg.dB((short)paramByte);
  }

  public byte iU(long paramLong) {
    return (byte)this.meg.il(paramLong);
  }

  public boolean isFull() {
    return this.meg.isFull();
  }

  public void clear() {
    super.clear();
    this.meg.cleanup();
  }

  public boolean au(gA paramgA)
  {
    return ((Ol)this.ltX).a(this.meg, paramgA) == 0;
  }

  public boolean n(long paramLong, short paramShort)
  {
    return ((Ol)this.ltX).a(this.meg, paramLong, paramShort) == 0;
  }

  public boolean aw(gA paramgA)
  {
    return ((Ol)this.ltX).b(this.meg, paramgA) == 0;
  }

  public boolean f(gA paramgA, byte paramByte)
  {
    return ((Ol)this.ltX).a(this.meg, paramgA, (short)paramByte) == 0;
  }
}