public class JsonTest
{

  public static void main(String[] args) {

    String result = "";
    /* 15 */     Process process = null;
    /* 16 */     List<String> processList = new java.util.ArrayList();
    /*    */     String line;

    /* 18 */     try {

      process = Runtime.getRuntime().exec( "/anaconda3/bin/python3.6 /Users/yyzmac/Documents/KalmanFilter/dp_get_trace.py --r_path /Users/yyzmac/Library/apache-tomcat-7.0.90/webapps/bluefire/indoorInfo/20190426.json --w_path /Users/yyzmac/Library/apache-tomcat-7.0.90/webapps/bluefire/indoorInfo/dp20190426.json");
      /*    */

      /* 20 */       BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
      /* 21 */       line = "";
      /* 22 */       while ((line = input.readLine()) != null) {
        /* 23 */         processList.add(line);
        /*    */       }
      /* 25 */       input.close();
      /*    */     } catch (IOException e) {
      /* 27 */       e.printStackTrace();
      /*    */     }
    /*    */
    /* 30 */     for (String s : processList)
      /*    */     {
      /* 32 */       System.out.println(s);
      /* 33 */       result = result + s;
      /*    */     }
  }
}


/* Location:              C:\develop\BlueFire-Platform\WEB-INF\classes\!\JsonTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */