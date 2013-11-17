import org.apache.log4j.Logger;

public class cbZ extends bzu
{
  private static final aee aOr = new bOO(new dia());
  private long cej;

  public static cbZ cfA()
  {
    cbZ localcbZ;
    try
    {
      localcbZ = (cbZ)aOr.Mm();
      localcbZ.a(aOr);
    } catch (Exception localException) {
      localcbZ = new cbZ();
      K.error("Erreur lors d'un checkOut sur un message de type UIRejectFightInvitationRequestMessage : " + localException.getMessage());
    }
    return localcbZ;
  }

  public int getId()
  {
    return 16809;
  }

  public long ZR()
  {
    return this.cej;
  }

  public void bK(long paramLong)
  {
    this.cej = paramLong;
  }
}