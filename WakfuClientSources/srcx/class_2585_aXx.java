public class aXx extends cgi
{
  public static final String TAG = "Sound";
  private int hj = -1;

  public String getTag()
  {
    return "Sound";
  }

  public void setSoundId(int paramInt)
  {
    this.hj = paramInt;
  }

  public int getSoundId()
  {
    return this.hj;
  }

  public void run()
  {
    if (this.hj != -1)
      MQ.WK().fN(this.hj);
  }
}