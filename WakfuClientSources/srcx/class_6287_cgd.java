import com.ankamagames.wakfu.client.console.command.debug.FlyingTextCommand;

public class cgd
  implements Runnable
{
  public cgd(FlyingTextCommand paramFlyingTextCommand)
  {
  }

  public void run()
  {
    FlyingTextCommand.a(this.hDf, (FlyingTextCommand.a(this.hDf) - 10) % 100);

    int i = FlyingTextCommand.a(this.hDf);

    dUw localdUw = new dUw(0, 400, 0, 80, FlyingTextCommand.b(this.hDf, i), 100);

    dfj localdfj = new dfj(adF.c("lstw", 0, 55), String.valueOf(i), localdUw, 1000);
    localdfj.setColor(1.0F, 0.0F, 0.0F, 1.0F);
    cew localcew = byv.bFN().bFO().aeL();
    localdfj.a(localcew);
    dbI.cNt().a(localdfj);
  }
}