import org.apache.log4j.Logger;

class dmy extends dnJ
{
  dmy(cjO paramcjO1, cjO paramcjO2)
  {
    super(null);
  }
  public void run() { setName("Worker");
    cjO.Re().info("Worker running");
    av(true);
    while (isRunning()) {
      this.lks.run();
    }
    cjO.Re().info("Worker stopped");
    cjO.a(this.hYz, null);
  }
}