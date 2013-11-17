import org.apache.log4j.Logger;

public abstract class bZA extends dKY
{
  private boolean hqb = false;
  protected static final Logger K = Logger.getLogger(bZA.class);

  public bZA ceg() {
    if (!sc()) {
      this.hqb = (!this.hqb);
      return this;
    }
    return new bBB(!i(null, null, null, null));
  }

  public abstract boolean sc();

  public abstract int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4);

  public boolean i(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    boolean bool;
    try
    {
      bool = a(paramObject1, paramObject2, paramObject3, paramObject4) == 0;
      if (this.hqb)
        return !bool;
    } catch (aIh localaIh) {
      bool = false;
      K.error("Exception sur critère (expected) !! User : " + paramObject1 + " Target : " + paramObject2 + " Context : " + paramObject4, localaIh);
    } catch (Exception localException) {
      bool = false;
      K.error("Exception inattendue : " + bBd.g(localException));
    }
    return bool;
  }

  public Pq aNE()
  {
    return Pq.chw;
  }

  public boolean ajF()
  {
    return this.hqb;
  }
}