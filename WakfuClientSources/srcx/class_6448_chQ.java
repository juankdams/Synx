import java.util.concurrent.ThreadFactory;

class chQ
  implements ThreadFactory
{
  chQ(ckD paramckD, String paramString)
  {
  }

  public Thread newThread(Runnable paramRunnable)
  {
    return new Thread(paramRunnable, this.egl);
  }
}