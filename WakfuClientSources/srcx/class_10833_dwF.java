import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dwF
  implements agG
{
  protected static final Logger K = Logger.getLogger(dwF.class);

  private static dwF lCi = new dwF();

  private final ArrayList hqa = new ArrayList();

  public static dwF dbS() {
    return lCi;
  }

  public void kr(long paramLong)
  {
    this.hqa.add(Long.valueOf(paramLong));
  }

  public long asd()
  {
    if (this.hqa.size() > 0)
      return ((Long)this.hqa.remove(0)).longValue();
    K.error(" La list d'id unique est vide ");
    return -1L;
  }

  public void removeAll()
  {
    this.hqa.clear();
  }
}