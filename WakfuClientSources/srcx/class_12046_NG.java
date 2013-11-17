import org.apache.log4j.Logger;

public class NG extends bzu
{
  private static final aee aOr = new bOO(new dUF());
  private long cej;

  public static NG ZQ()
  {
    NG localNG;
    try
    {
      localNG = (NG)aOr.Mm();
      localNG.a(aOr);
    } catch (Exception localException) {
      localNG = new NG();
      K.error("Erreur lors d'un checkOut sur un message de type UIExchangeInvitationAcceptRequestMessage : " + localException.getMessage());
    }
    return localNG;
  }

  public int getId()
  {
    return 16808;
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