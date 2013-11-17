class dBk
  implements Runnable
{
  int count;

  dBk(buI parambuI, cWk paramcWk)
  {
  }

  public void run()
  {
    this.lIP.setText(String.valueOf(this.count));
    this.count += 1;
  }
}