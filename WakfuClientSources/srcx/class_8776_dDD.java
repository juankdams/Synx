import org.apache.log4j.Logger;

public class dDD extends bzu
{
  private static final aee aOr = new bOO(new dVY());
  private doh foy;
  private String fou;
  private String fov;
  private String cYx = "x@x.com";
  private boolean lLN;

  public static dDD dfr()
  {
    dDD localdDD;
    try
    {
      localdDD = (dDD)aOr.Mm();
      localdDD.a(aOr);
    } catch (Exception localException) {
      localdDD = new dDD();
      K.error("Erreur lors d'un checkOut sur un message de type UILogonRequestnMessage : " + localException.getMessage());
    }
    return localdDD;
  }

  public int getId()
  {
    return 16385;
  }

  public void hY(String paramString)
  {
    this.fou = paramString;
  }

  public void setPassword(String paramString)
  {
    this.fov = paramString;
  }

  public void a(doh paramdoh)
  {
    this.foy = paramdoh;
  }

  public void b(Boolean paramBoolean)
  {
    this.lLN = paramBoolean.booleanValue();
  }

  public doh bru()
  {
    return this.foy;
  }

  public String brr()
  {
    return this.fou;
  }

  public String getPassword()
  {
    return this.fov;
  }

  public Boolean dfs()
  {
    return Boolean.valueOf(this.lLN);
  }

  public String getEmail() {
    return this.cYx;
  }

  public void setEmail(String paramString) {
    this.cYx = paramString;
  }
}