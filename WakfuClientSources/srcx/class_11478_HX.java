import java.util.ArrayList;

class HX
  implements Runnable
{
  HX(baU parambaU)
  {
  }

  public void run()
  {
    this.bQl.setPixmap((aAR)baU.b(this.bQl).get(baU.a(this.bQl)));
    baU.a(this.bQl, (baU.a(this.bQl) + 1) % baU.b(this.bQl).size());
  }
}