import java.util.List;
import java.util.concurrent.ExecutorService;

final class bAt
  implements aQy
{
  private bAt(cTy paramcTy)
  {
  }

  public void a(dVO paramdVO, axA paramaxA)
  {
    aHA.trace("callback(event={},userData={})", new Object[] { paramdVO, paramaxA });
    if (!cTy.a(this.diU).isEmpty())
    {
      bky localbky = cTy.c(this.diU).a(paramdVO, cTy.b(this.diU));
      aHA.trace("mediaListPlayerEvent={}", new Object[] { localbky });
      if (localbky != null)
        cTy.d(this.diU).submit(new ajC(this.diU, localbky, null));
    }
  }
}