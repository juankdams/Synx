import java.util.ArrayList;
import java.util.Calendar;

public class cLH extends amp
{
  public cLH(bWa parambWa)
  {
  }

  public boolean Iv()
  {
    return false;
  }

  public Or getContentMinSize(dRq paramdRq)
  {
    int i = bWa.a(this.bEe).width * bWa.b(this.bEe) + bWa.c(this.bEe) * (bWa.b(this.bEe) - 1);
    int j = bWa.a(this.bEe).height * bWa.d(this.bEe) + bWa.e(this.bEe) * (bWa.d(this.bEe) - 1);

    return new Or(i, j);
  }

  public Or getContentPreferedSize(dRq paramdRq)
  {
    return getContentMinSize(paramdRq);
  }

  public void a(dRq paramdRq)
  {
    if (bWa.f(this.bEe) == null) {
      return;
    }
    int i = 0;
    if (bWa.g(this.bEe) != null)
    {
      j = bWa.g(this.bEe).get(5);
      bWa.g(this.bEe).set(5, 1);
      i = (bWa.g(this.bEe).get(7) - bWa.g(this.bEe).getFirstDayOfWeek() + bWa.cbr()) % bWa.cbr();
      bWa.g(this.bEe).set(5, j);
    }
    int j = i;
    int k = bWa.d(this.bEe) - 1;
    for (int m = 0; m < bWa.f(this.bEe).size(); m++) {
      dRq localdRq = ((aOa)bWa.f(this.bEe).get(m)).getContainer();

      int n = (bWa.a(this.bEe).width + bWa.c(this.bEe)) * j;
      int i1 = (bWa.a(this.bEe).height + bWa.e(this.bEe)) * k;

      localdRq.setPosition(n, i1);
      localdRq.setSize(bWa.a(this.bEe).width, bWa.a(this.bEe).height);

      j++;
      if (j == bWa.b(this.bEe)) {
        j = 0;
        k--;
      }
    }
    bWa.a(this.bEe, bWa.h(this.bEe) + 1);
  }
}