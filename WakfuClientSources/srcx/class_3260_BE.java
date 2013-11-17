import org.apache.log4j.Logger;

class BE extends Thread
{
  private boolean aKV = false;

  private BE(bhr parambhr) {  } 
  public void av(boolean paramBoolean) { this.aKV = paramBoolean; }

  public void run()
  {
    while (true) {
      if (this.aKV)
        try {
          bhr.a(this.bDI, System.currentTimeMillis());
        } catch (Throwable localThrowable) {
          bhr.an().warn("Exception dans le Thread de moteur d'ambiance.", localThrowable);
        }
      try
      {
        Thread.sleep(10L);
      }
      catch (InterruptedException localInterruptedException)
      {
      }
    }
  }
}