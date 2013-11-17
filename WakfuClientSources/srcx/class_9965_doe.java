import com.ankamagames.wakfu.client.chat.console.command.EmoteCommand;
import java.util.ArrayList;

public class doe extends cC
{
  private final boolean eeN;
  private final boolean eeP;
  private final boolean eeO;
  private final boolean eeQ;
  private final String[] eeR;

  doe(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, String paramString, String[] paramArrayOfString)
  {
    super(paramInt, paramString);
    this.eeN = paramBoolean2;
    this.eeP = paramBoolean1;
    this.eeO = ((paramBoolean2) && (paramBoolean3));
    this.eeQ = paramBoolean4;
    this.eeR = paramArrayOfString;
  }

  public void cVu() {
    coq localcoq = CM.LV().LW().cqV();
    if (localcoq.cow().contains(this.RK))
      return;
    aZi localaZi = new aZi(this.RK, "", new EmoteCommand(this.aw), false);
    localaZi.setName(this.RK);
    CM.LV().LW().cqV().cov().b(localaZi);
  }

  public boolean aTk() {
    return this.eeP;
  }

  public boolean aTi() {
    return this.eeN;
  }

  public boolean aTj() {
    return this.eeO;
  }

  public String getName()
  {
    return bU.fH().b(80, this.aw, new Object[0]);
  }

  public String fJ()
  {
    return ay.bd().H(this.aw);
  }

  public boolean aTl() {
    return false;
  }
}