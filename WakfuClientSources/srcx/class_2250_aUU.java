import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import java.util.concurrent.ThreadFactory;

public final class aUU
  implements ThreadFactory
{
  public Thread newThread(Runnable paramRunnable)
  {
    return new Thread(paramRunnable, "AnmLoader #" + Anm.gU());
  }
}