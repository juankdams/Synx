import java.util.ArrayList;
import java.util.List;

public class dGB
  implements aFO
{
  private List lRj = new ArrayList();

  public void a(aGK paramaGK)
  {
    this.lRj.add(paramaGK);
  }

  public List bqe()
  {
    return this.lRj;
  }

  public boolean a(dGB paramdGB)
  {
    int i = this.lRj.size();
    if (i != paramdGB.lRj.size()) {
      return false;
    }
    for (int j = 0; j < i; j++) {
      aQS localaQS1 = (aQS)this.lRj.get(j);
      aQS localaQS2 = (aQS)paramdGB.lRj.get(j);
      if (!localaQS1.at(localaQS2)) {
        return false;
      }
    }
    return true;
  }
}