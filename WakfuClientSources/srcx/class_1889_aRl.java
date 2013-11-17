import org.apache.log4j.Logger;

class aRl extends Thread
{
  private boolean aKV = false;

  private aRl(VH paramVH) {  } 
  public void run() { this.aKV = true;

    while (this.aKV) {
      bjY.d(VH.b(this.eOm));
      try
      {
        Thread.sleep(VH.c(this.eOm));
      } catch (InterruptedException localInterruptedException) {
        VH.aiN().warn("Problème lors du sleep", localInterruptedException);
      }
    } }

  public void av(boolean paramBoolean)
  {
    this.aKV = paramBoolean;
  }
}