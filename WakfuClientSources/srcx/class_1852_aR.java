import java.util.Hashtable;

class aR extends Hashtable
{
  private static final long serialVersionUID = 1L;

  private Object c(Object paramObject)
  {
    return super.get(paramObject);
  }

  public Object get(Object paramObject)
  {
    Object localObject = c(paramObject);
    if ((localObject instanceof aQS))
    {
      aQS localaQS = (aQS)localObject;
      localaQS.aSK();
      localObject = localaQS.bhq();
    }
    return localObject;
  }
}