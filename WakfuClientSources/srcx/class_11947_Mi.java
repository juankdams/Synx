import org.apache.log4j.Logger;

class Mi
  implements eA
{
  Mi(dLu paramdLu)
  {
  }

  public boolean a(short paramShort, cAe paramcAe)
  {
    byte b = paramcAe.cxa();
    if (!dLu.a(this.bZx).D(b))
      dLu.a(this.bZx).c(b, paramShort);
    else {
      dLu.i().error("Plusieurs tutorials sont mappés sur le même eventId");
    }
    return true;
  }
}