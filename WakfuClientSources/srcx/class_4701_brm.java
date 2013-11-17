import org.apache.log4j.Logger;

class brm extends bor
{
  private final Long fMS;

  brm(dhJ paramdhJ)
  {
    super((byte)0, false, false, 0L);
    this.fMS = (paramdhJ == null ? null : Long.valueOf(paramdhJ.getId()));
  }

  public boolean byc()
  {
    return false;
  }

  public boolean aJu()
  {
    return false;
  }

  public byte Fx()
  {
    return -1;
  }

  public boolean byf()
  {
    return false;
  }

  public boolean byg()
  {
    return false;
  }

  public void eY(boolean paramBoolean)
  {
    K.error(String.format("[FIGHT] setTeamLeader sur un fighter absent %d - %s", new Object[] { this.fMS, bBd.rV(10) }));
  }

  public long aJq()
  {
    return 0L;
  }

  public Long byh()
  {
    return null;
  }

  public void a(Long paramLong, byte paramByte)
  {
    K.error(String.format("[FIGHT] setCurrentControllerId sur un fighter absent %d - %s", new Object[] { this.fMS, bBd.rV(10) }));
  }

  boolean a(atC paramatC)
  {
    K.error(String.format("[FIGHT] setPlayState sur un fighter absent %d - %s", new Object[] { this.fMS, bBd.rV(10) }));

    return false;
  }

  public boolean fN(long paramLong)
  {
    return false;
  }

  public boolean fO(long paramLong)
  {
    return false;
  }
}