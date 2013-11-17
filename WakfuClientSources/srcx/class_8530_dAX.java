class dAX
  implements Runnable
{
  int count;

  dAX(buI parambuI, cWk paramcWk)
  {
  }

  public void run()
  {
    this.lIA.setText(String.valueOf(this.count));
    this.count += 1;
  }
}