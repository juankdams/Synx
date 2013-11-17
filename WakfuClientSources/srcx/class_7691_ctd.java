import java.util.ArrayList;

public class ctd extends amp
{
  public ctd(dIl paramdIl)
  {
  }

  public boolean Iv()
  {
    return false;
  }

  public Or getContentMinSize(dRq paramdRq)
  {
    int i = dIl.a(this.icL).width * dIl.b(this.icL) + dIl.c(this.icL) * (dIl.b(this.icL) - 1);
    int j = dIl.a(this.icL).height * dIl.d(this.icL) + dIl.e(this.icL) * (dIl.d(this.icL) - 1);

    return new Or(i, j);
  }

  public Or getContentPreferedSize(dRq paramdRq)
  {
    return getContentMinSize(paramdRq);
  }

  public void a(dRq paramdRq)
  {
    if (dIl.f(this.icL) != null)
      for (int i = 0; i < dIl.f(this.icL).size(); i++) {
        axU localaxU = (axU)dIl.g(this.icL).get(i);
        Om localOm = (Om)dIl.f(this.icL).get(i);

        float f1 = localOm.getX();
        float f2 = localOm.getY();

        int j = (int)((dIl.a(this.icL).width + dIl.c(this.icL)) * f1);
        int k = (int)((dIl.a(this.icL).height + dIl.e(this.icL)) * (dIl.d(this.icL) - f2 - 1.0F));

        localaxU.setPosition(j, k);
        localaxU.setSize(dIl.a(this.icL).width, dIl.a(this.icL).height);
      }
  }
}